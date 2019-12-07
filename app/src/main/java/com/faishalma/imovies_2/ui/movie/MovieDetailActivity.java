package com.faishalma.imovies_2.ui.movie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.faishalma.imovies_2.R;

public class MovieDetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";
    TextView tvTitle, tvGenre, tvDateReleased, tvLanguage, tvRating, tvRuntime, tvOverview;
    ImageView imagePoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        tvTitle = findViewById(R.id.tv_item_title);
        tvGenre = findViewById(R.id.tv_item_genre);
        tvDateReleased = findViewById(R.id.tv_item_dateReleased);
        tvLanguage = findViewById(R.id.tv_item_language);
        tvRating = findViewById(R.id.tv_item_rating);
        tvRuntime = findViewById(R.id.tv_item_runtime);
        tvOverview = findViewById(R.id.tv_item_overview);
        imagePoster = findViewById(R.id.img_item_photo);

        Movies movies = getIntent().getParcelableExtra(EXTRA_MOVIE);

        tvTitle.setText(movies.getTitle());
        tvGenre.setText(movies.getGenre());
        tvDateReleased.setText(movies.getDate_released());
        tvLanguage.setText(movies.getOriginal_language());
        tvRating.setText(movies.getRating());
        tvRuntime.setText(movies.getRuntime());
        tvOverview.setText(movies.getOverview());

        Glide.with(this)
                .load(movies.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(imagePoster);

    }
}
