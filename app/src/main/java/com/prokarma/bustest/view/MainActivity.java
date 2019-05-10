package com.prokarma.bustest.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.prokarma.bustest.App;
import com.prokarma.bustest.R;
import com.prokarma.bustest.bus.PlayerResponseBus;
import com.prokarma.bustest.model.DataItem;
import com.prokarma.bustest.viewmodel.MainActivityViewModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    ViewModelProvider.Factory viewModelFactory;
    @Inject
    PlayerResponseBus playerResponseBus;

    MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getmAppComponent().inject(this);
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainActivityViewModel.class);
        playerResponseBus.getPlayers().subscribe(new Observer<List<DataItem>>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "onSubscribe: ");
            }

            @Override
            public void onNext(List<DataItem> dataItems) {
                Log.d(TAG, "onNext: ");
                Log.d(TAG, "onNext: " + dataItems.toString());
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: ");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.fetchData();
    }
}
