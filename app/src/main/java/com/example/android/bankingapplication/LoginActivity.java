package com.example.android.bankingapplication;/*
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        Button checking = (Button) findViewById(R.id.checkings);

        assert checking != null;
        checking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountIntent = new Intent(LoginActivity.this, AccountActivity.class);
                startActivity(accountIntent);
            }
        });


        Button profile = (Button) findViewById(R.id.profile);

        assert profile != null;
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(LoginActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });


    }
}
