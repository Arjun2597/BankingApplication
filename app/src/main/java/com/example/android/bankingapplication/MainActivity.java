package com.example.android.bankingapplication;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // adding underline to button
        Button button = (Button) findViewById(R.id.forgotPin);
        button.setPaintFlags(button.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        Button login = (Button) findViewById(R.id.login);

        assert login != null;
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginInent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginInent);
            }
        });
    }
}
