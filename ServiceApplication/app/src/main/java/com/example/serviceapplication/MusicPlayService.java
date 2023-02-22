package com.example.serviceapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.view.Display;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class MusicPlayService extends Service {

    MediaPlayer mPlayer;

    public MusicPlayService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(this,"Music Player Service Started",
                Toast.LENGTH_SHORT).show();

        mPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mPlayer.setLooping(true);
        mPlayer.start();

        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlayer.stop();
    }
}