package com.example.user.esports;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goToGameSpecific(View view)
    {
        Intent intent = new Intent(MainActivity.this, GameTournamentsAndTeams.class);
        startActivity(intent);
    }


}
