package com.example.android.musicalstructureproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
    }
}
