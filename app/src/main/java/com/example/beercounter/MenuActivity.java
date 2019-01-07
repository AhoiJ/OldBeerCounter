package com.example.beercounter;

import android.content.Intent;
import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;


public class MenuActivity extends AppCompatActivity {

    private Button mBtLaunchMainActivity;
    private Button mBtLaunchBarActivity;
    private Button mBtLaunchSettingsActivity;
    private Button mBtLaunchStatsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mBtLaunchMainActivity = (Button) findViewById(R.id.btNormalMode);

        mBtLaunchMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchMainActivity();
            }
        });

        mBtLaunchBarActivity = (Button) findViewById(R.id.btBarMode);

        mBtLaunchBarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchBarActivity();
            }
        });

        mBtLaunchSettingsActivity = (Button) findViewById(R.id.btSettings);

        mBtLaunchSettingsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchSettingsActivity();
            }
        });

        mBtLaunchStatsActivity = (Button) findViewById(R.id.btStats);

        mBtLaunchStatsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchStatsActivity();
            }
        });

    }

    private void launchMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void launchBarActivity() {

        Intent intent = new Intent(this, BarActivity.class);
        startActivity(intent);
    }

    private void launchSettingsActivity() {

        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    private void launchStatsActivity(){

        Intent intent = new Intent(this, StatsActivity.class);
        startActivity(intent);
    }

}
