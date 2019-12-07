package com.faishalma.imovies_2.ui.tvshow;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.faishalma.imovies_2.R;

public class TVShowDetailActivity extends AppCompatActivity {

    public static final String EXTRA_TVSHOW = "extra_tvshow";
    TextView tvTitle, tvGenre, tvDateReleased, tvLanguage, tvRating, tvRuntime, tvOverview;
    ImageView imagePoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshow_detail);

        tvTitle = findViewById(R.id.tv_item_title);
        tvGenre = findViewById(R.id.tv_item_genre);
        tvDateReleased = findViewById(R.id.tv_item_dateReleased);
        tvLanguage = findViewById(R.id.tv_item_language);
        tvRating = findViewById(R.id.tv_item_rating);
        tvRuntime = findViewById(R.id.tv_item_runtime);
        tvOverview = findViewById(R.id.tv_item_overview);
        imagePoster = findViewById(R.id.img_item_photo);

        TVShow tvShow = getIntent().getParcelableExtra(EXTRA_TVSHOW);

        tvTitle.setText(tvShow.getTitle());
        tvGenre.setText(tvShow.getGenre());
        tvDateReleased.setText(tvShow.getDate_released());
        tvLanguage.setText(tvShow.getOriginal_language());
        tvRating.setText(tvShow.getRating());
        tvRuntime.setText(tvShow.getRuntime());
        tvOverview.setText(tvShow.getOverview());

        Glide.with(this)
                .load(tvShow.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(imagePoster);

    }
}
