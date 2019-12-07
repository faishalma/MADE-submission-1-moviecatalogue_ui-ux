package com.faishalma.imovies_2.ui.tvshow;

import android.os.Parcel;
import android.os.Parcelable;

public class TVShow implements Parcelable {

    public static final Creator<TVShow> CREATOR = new Creator<TVShow>() {
        @Override
        public TVShow createFromParcel(Parcel in) {
            return new TVShow(in);
        }

        @Override
        public TVShow[] newArray(int size) {
            return new TVShow[size];
        }
    };

    private String title;
    private String date_released;
    private String rating;
    private String original_language;
    private String runtime;
    private String photo;
    private String genre;
    private String overview;

    public TVShow() {

    }

    protected TVShow(Parcel in) {
        this.title = in.readString();
        this.date_released = in.readString();
        this.rating = in.readString();
        this.original_language = in.readString();
        this.runtime = in.readString();
        this.photo = in.readString();
        this.genre = in.readString();
        this.overview = in.readString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate_released() {
        return date_released;
    }

    public void setDate_released(String date_released) {
        this.date_released = date_released;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(date_released);
        dest.writeString(rating);
        dest.writeString(original_language);
        dest.writeString(runtime);
        dest.writeString(photo);
        dest.writeString(genre);
        dest.writeString(overview);
    }

}
