package com.prokarma.bustest.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.prokarma.bustest.bus.PlayerResponseBus;
import com.prokarma.bustest.model.PlayerResponse;
import com.prokarma.bustest.repo.remote.NBAService;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class MainActivityViewModel extends ViewModel {
    private static final String TAG = "MainActivityViewModel";

    private NBAService service;
    private PlayerResponseBus playerResponseBus;

    @Inject
    MainActivityViewModel(NBAService service, PlayerResponseBus playerResponseBus) {
        this.service = service;
        this.playerResponseBus=playerResponseBus;
    }

    public void fetchData() {
        service.getPlayers(100)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<PlayerResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d(TAG, "onSubscribe: ");
                    }

                    @Override
                    public void onNext(PlayerResponse playerResponse) {
                        Log.d(TAG, "onNext: ");
                        Log.d(TAG, "onNext: " + playerResponse.toString());
                        playerResponseBus.setPlayerResponse(playerResponse);

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: ");
                        Log.d(TAG, "onError: " + e.getMessage());

                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete: ");

                    }
                });
    }

}
