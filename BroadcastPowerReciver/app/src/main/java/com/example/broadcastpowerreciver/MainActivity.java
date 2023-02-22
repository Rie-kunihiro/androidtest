package com.example.broadcastpowerreciver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String ACTION_CUSTOM_BROADCAST =
            BuildConfig.APPLICATION_ID + ".ACTION_CUSTOM_BROADCAST";

    MyPowerReceiver mPowerReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPowerReceiver = new MyPowerReceiver();

        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);

        this.registerReceiver(mPowerReceiver, filter);


        LocalBroadcastManager.getInstance(this)
                .registerReceiver(mPowerReceiver,
                        new IntentFilter(ACTION_CUSTOM_BROADCAST));


    }

    @Override
    protected void onDestroy() {
        this.unregisterReceiver(mPowerReceiver);
        LocalBroadcastManager.getInstance(this)
                .unregisterReceiver(mPowerReceiver);
        super.onDestroy();
    }

    public void sendCustomBroadcast(View view) {
        Intent customBroadcastIntent = new Intent(ACTION_CUSTOM_BROADCAST);

        LocalBroadcastManager.getInstance(this)
                .sendBroadcast(customBroadcastIntent);

    }

}