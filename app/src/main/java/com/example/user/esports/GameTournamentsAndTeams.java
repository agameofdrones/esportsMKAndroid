package com.example.user.esports;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class GameTournamentsAndTeams extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_tournaments_and_teams);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void goToTeams(View view)
    {
        Intent intent = new Intent(GameTournamentsAndTeams.this, TeamsInGame.class);
        startActivity(intent);
    }
    public void goToTournaments(View view)
    {
        Intent intent = new Intent(GameTournamentsAndTeams.this, TournamentsInGame.class);
        startActivity(intent);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
