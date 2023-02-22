package com.example.broadcastpowerreciver;

import static android.content.Intent.*;

import static com.example.broadcastpowerreciver.MainActivity.ACTION_CUSTOM_BROADCAST;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyPowerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String intentAction = intent.getAction();
        String toastMessage = "Unknown Intent Action";

        if (intentAction != null) {
            switch (intentAction){

                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "Power connected";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Power disconnected";
                    break;
                case ACTION_CUSTOM_BROADCAST:
                    toastMessage = "Custom Broadcast Received";
                    break;
            }

            Toast.makeText(context, toastMessage,Toast.LENGTH_SHORT ).show();
        }
    }
}