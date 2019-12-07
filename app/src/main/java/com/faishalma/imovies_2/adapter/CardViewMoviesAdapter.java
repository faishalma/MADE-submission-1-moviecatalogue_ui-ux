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
import com.faishalma.imovies_2.ui.movie.MovieDetailActivity;
import com.faishalma.imovies_2.ui.movie.Movies;

import java.util.ArrayList;

public class CardViewMoviesAdapter extends RecyclerView.Adapter<CardViewMoviesAdapter.CardViewViewHolder> {

    private Context context;
    private ArrayList<Movies> listMovies;

    public CardViewMoviesAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Movies> getListMovies() {
        return listMovies;
    }

    public void setListMovies(ArrayList<Movies> listMovies) {
        this.listMovies = listMovies;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_movies, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewMoviesAdapter.CardViewViewHolder cardViewViewHolder, int position) {
        Movies movie = getListMovies().get(position);
        Glide.with(context)
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvTitle.setText(movie.getTitle());
        cardViewViewHolder.tvDateReleased.setText(movie.getDate_released());
        cardViewViewHolder.tvOriginal.setText(movie.getOriginal_language());
        cardViewViewHolder.tvUserRating.setText(movie.getRating());
    }

    @Override
    public int getItemCount() {
        return getListMovies().size();
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
            Movies movies = getListMovies().get(position);

            movies.setTitle(movies.getTitle());
            movies.setOverview(movies.getOverview());

            Intent moveWithObjectIntent = new Intent(itemView.getContext(), MovieDetailActivity.class);
            moveWithObjectIntent.putExtra(MovieDetailActivity.EXTRA_MOVIE, movies);
            context.startActivity(moveWithObjectIntent);
        }
    }
}