package com.prokarma.bustest.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.prokarma.bustest.App;
import com.prokarma.bustest.R;
import com.prokarma.bustest.bus.RxBus;
import com.prokarma.bustest.events.Events;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.prokarma.bustest.events.Events.ANALYTICS;
import static com.prokarma.bustest.events.Events.CONFIGURATION;
import static com.prokarma.bustest.events.Events.INTENT;
import static com.prokarma.bustest.events.Events.REPORT;

public class ExampleFragment extends Fragment {
    @Inject
    RxBus rxBus;
    private TextView tvDisplay;
    private CompositeDisposable disposable;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        ((App) context.getApplicationContext()).getmAppComponent().inject(this);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.example_fragment, container, false);
        tvDisplay = view.findViewById(R.id.tv_display);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        disposable = new CompositeDisposable();
        disposable.add(rxBus.getObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(@Events Integer events) throws Exception {
                        tvDisplay.setText(String.format("%s", events));
                        switch (events){
                            case INTENT:
                                break;
                            case CONFIGURATION:
                                break;
                            case REPORT:
                                break;
                            case ANALYTICS:
                                break;
                        }

                    }
                }));

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        disposable.dispose();
    }
}
