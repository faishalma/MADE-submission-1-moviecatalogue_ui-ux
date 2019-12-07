package com.faishalma.imovies_2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.faishalma.imovies_2.R;
import com.faishalma.imovies_2.ui.tvshow.TVShow;
import com.faishalma.imovies_2.ui.tvshow.TVShowDetailActivity;

import java.util.ArrayList;

public class CardViewTvShowAdapter extends RecyclerView.Adapter<CardViewTvShowAdapter.CardViewViewHolder> {

    private Context context;
    private ArrayList<TVShow> listTVShow;

    public CardViewTvShowAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<TVShow> getListTVShow() {
        return listTVShow;
    }

    public void setListTVShow(ArrayList<TVShow> listTVShow) {
        this.listTVShow = listTVShow;
    }

    @NonNull
    @Override
    public CardViewTvShowAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_tvshow, viewGroup, false);
        return new CardViewTvShowAdapter.CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTvShowAdapter.CardViewViewHolder cardViewViewHolder, int position) {
        TVShow tvShow = getListTVShow().get(position);
        Glide.with(context)
                .load(tvShow.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvTitle.setText(tvShow.getTitle());
        cardViewViewHolder.tvDateReleased.setText(tvShow.getDate_released());
        cardViewViewHolder.tvOriginal.setText(tvShow.getOriginal_language());
        cardViewViewHolder.tvUserRating.setText(tvShow.getRating());
    }

    @Override
    public int getItemCount() {
        return getListTVShow().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvTitle, tvDateReleased, tvOriginal, tvUserRating;

        CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            tvDateReleased = itemView.findViewById(R.id.tv_item_dateReleased);
            tvOriginal = itemView.findViewById(R.id.tv_item_originLanguange);
            tvUserRating = itemView.findViewById(R.id.tv_item_rating);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            TVShow tvShow = getListTVShow().get(position);

            tvShow.setTitle(tvShow.getTitle());
            tvShow.setOverview(tvShow.getOverview());

            Intent moveWithObjectIntent = new Intent(itemView.getContext(), TVShowDetailActivity.class);
            moveWithObjectIntent.putExtra(TVShowDetailActivity.EXTRA_TVSHOW, tvShow);
            context.startActivity(moveWithObjectIntent);
        }
    }
}