package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    public static final String TAG = MainActivity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e(TAG, "onCreate(): SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause(): SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop(): SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume(): SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart(): SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy(): SecondActivity");
    }
}