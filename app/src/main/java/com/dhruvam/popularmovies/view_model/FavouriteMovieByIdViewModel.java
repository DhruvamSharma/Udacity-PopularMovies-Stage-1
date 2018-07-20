package com.dhruvam.popularmovies.view_model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.dhruvam.popularmovies.database.database_instance.OfflineMovieAccessDatabase;
import com.dhruvam.popularmovies.database.entity.MovieEntity;

public class FavouriteMovieByIdViewModel extends ViewModel{


    private LiveData<MovieEntity> movieEntityLiveData;

    public FavouriteMovieByIdViewModel(OfflineMovieAccessDatabase mDatabase, int mFavouriteMovieId) {

        movieEntityLiveData = mDatabase.getMovieDao().getMovieById(mFavouriteMovieId);
    }

    public LiveData<MovieEntity> getMovieById() {
        return movieEntityLiveData;
    }


}
