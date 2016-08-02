package com.example.android.bankingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        Button button = (Button) findViewById(R.id.button);
        button.setBackgroundColor(0xFFFFFFFF);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setBackgroundColor(0xFFFFFFFF);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setBackgroundColor(0xFFFFFFFF);
    }
}
