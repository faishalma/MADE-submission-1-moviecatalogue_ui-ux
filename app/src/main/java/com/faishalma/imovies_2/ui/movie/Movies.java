package com.faishalma.imovies_2.ui.movie;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable {
    public static final Creator<Movies> CREATOR = new Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies(source);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
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

    public Movies() {

    }

    protected Movies(Parcel in) {
        this.title = in.readString();
        this.date_released = in.readString();
        this.rating = in.readString();
        this.original_language = in.readString();
        this.runtime = in.readString();
        this.photo = in.readString();
        this.genre = in.readString();
        this.overview = in.readString();
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.date_released);
        dest.writeString(this.rating);
        dest.writeString(this.original_language);
        dest.writeString(this.runtime);
        dest.writeString(this.photo);
        dest.writeString(this.genre);
        dest.writeString(this.overview);
    }

}
