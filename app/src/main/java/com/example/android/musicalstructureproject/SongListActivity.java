package com.example.android.musicalstructureproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        TextView exampleOneTxtVw = (TextView) findViewById(R.id.examle_one_textview);

        exampleOneTxtVw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongListActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }

        });

        TextView nowPlayingTxtVw = (TextView) findViewById(R.id.textview_now_playing_navigation);
        TextView songDetailsTxtVw = (TextView) findViewById(R.id.textview_song_details_navigation);

        nowPlayingTxtVw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongListActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }

        });

        songDetailsTxtVw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongListActivity.this, SongDetailActivity.class);
                startActivity(i);
            }

        });

        Button explanationBtn = (Button) findViewById(R.id.button_explanation);
        explanationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SongListActivity.this, "SONG LIBRARY - \nShows a list of all music from the users phone library. Use MediaStore API to get all the songs from the user's phone.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
