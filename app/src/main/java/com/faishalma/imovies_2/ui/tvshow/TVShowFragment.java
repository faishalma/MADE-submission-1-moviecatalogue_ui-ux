package com.faishalma.imovies_2.ui.tvshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.faishalma.imovies_2.R;
import com.faishalma.imovies_2.adapter.CardViewTvShowAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TVShowFragment extends Fragment {

    private RecyclerView rv_tvshow;
    private ArrayList<TVShow> list = new ArrayList<>();

    public TVShowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tvshow, container, false);
        rv_tvshow = view.findViewById(R.id.rv_tvshow);
        rv_tvshow.setHasFixedSize(true);

        list.addAll(TVShowData.getListData());
        showRecyclerMovie();

        return view;

    }

    private void showRecyclerMovie() {
        rv_tvshow.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewTvShowAdapter cardViewTvShowAdapter = new CardViewTvShowAdapter(this.getContext());
        cardViewTvShowAdapter.setListTVShow(list);
        rv_tvshow.setAdapter(cardViewTvShowAdapter);
    }

}
