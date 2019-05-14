package com.prokarma.bustest.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.prokarma.bustest.App;
import com.prokarma.bustest.R;
import com.prokarma.bustest.bus.RxBus;
import com.prokarma.bustest.events.Events;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Inject
    RxBus rxBus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getmAppComponent().inject(this);
        initViews();
    }

    private void initViews() {
        findViewById(R.id.btn_intent).setOnClickListener(this);
        findViewById(R.id.btn_configuration).setOnClickListener(this);
        findViewById(R.id.btn_report).setOnClickListener(this);
        findViewById(R.id.btn_analytics).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_intent:
                rxBus.send(Events.INTENT);

                break;
            case R.id.btn_configuration:
                rxBus.send(Events.CONFIGURATION);

                break;
            case R.id.btn_report:
                rxBus.send(Events.REPORT);

                break;
            case R.id.btn_analytics:
                rxBus.send(Events.ANALYTICS);

                break;
        }
    }
}
