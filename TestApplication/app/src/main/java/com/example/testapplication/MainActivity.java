package com.example.testapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart(): MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume(): MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause(): MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop(): MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart(): MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy(): MainActivity");
    }

    public void launchSecondActivity(View view) {
        Intent inten = new Intent(this, MainActivity2.class);
        startActivity(inten);
    }
}