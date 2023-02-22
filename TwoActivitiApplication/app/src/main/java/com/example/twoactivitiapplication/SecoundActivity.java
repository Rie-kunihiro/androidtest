package com.example.twoactivitiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {


    public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";
    TextView mTextviewSecound;
    EditText mEditTextSecound;
    Button mButtonReply;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        mTextviewSecound = findViewById(R.id.textView_secound);
        mEditTextSecound = findViewById(R.id.edittext_secound);
        mButtonReply = findViewById(R.id.button_secound);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        mTextviewSecound.setText(message);
    }

    public void sendReply(View view) {

        String reply = mEditTextSecound.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}