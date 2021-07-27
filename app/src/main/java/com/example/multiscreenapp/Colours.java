package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Colours extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);
        final ArrayList<word> words=new ArrayList<word>();
        words.add(new word("red","wetetii",R.drawable.color_red,R.raw.color_red));
        words.add(new word("mustand yellow","chiwiita",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new word("dusty yellow","topiisa",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new word("green","chokokkii",R.drawable.color_green,R.raw.color_green));
        words.add(new word("browm","takaakki",R.drawable.color_brown,R.raw.color_brown));
        words.add(new word("gray","topoppi",R.drawable.color_gray,R.raw.color_gray));
        words.add(new word("black","kululli",R.drawable.color_black,R.raw.color_black));
        words.add(new word("whight","kelelli",R.drawable.color_white,R.raw.color_white));

        WordAdapter Adapter=
                new WordAdapter(this,words);
        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Colours.this,"list item cicked",Toast.LENGTH_SHORT).show();
                word w=words.get(position);
                mediaPlayer=MediaPlayer.create(Colours.this,w.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}