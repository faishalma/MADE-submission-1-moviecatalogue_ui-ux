package com.faishalma.imovies_2.ui.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.faishalma.imovies_2.R;
import com.faishalma.imovies_2.adapter.CardViewMoviesAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    private RecyclerView rv_movies;
    private ArrayList<Movies> list = new ArrayList<>();

    public MoviesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        rv_movies = view.findViewById(R.id.rv_movies);
        rv_movies.setHasFixedSize(true);

        list.addAll(MoviesData.getListData());
        showRecyclerMovie();

        return view;
    }

    private void showRecyclerMovie() {
        rv_movies.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewMoviesAdapter cardViewMoviesAdapter = new CardViewMoviesAdapter(this.getContext());
        cardViewMoviesAdapter.setListMovies(list);
        rv_movies.setAdapter(cardViewMoviesAdapter);
    }
}
