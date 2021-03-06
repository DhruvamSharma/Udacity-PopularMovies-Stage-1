package com.dhruvam.popularmovies.view_model;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.dhruvam.popularmovies.database.database_instance.OfflineMovieAccessDatabase;

public class OfflineMovieByIdViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private OfflineMovieAccessDatabase mDatabase;
    private int mFavouriteMovieId;

    public OfflineMovieByIdViewModelFactory(OfflineMovieAccessDatabase mDatabase, int mFavouriteMovieId) {
        this.mDatabase = mDatabase;
        this.mFavouriteMovieId = mFavouriteMovieId;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new OfflineMovieByIdViewModel(mDatabase, mFavouriteMovieId);
    }
}
