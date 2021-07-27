package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        final ArrayList<word> words=new ArrayList<word>();
        words.add(new word("Are you coming?","aanasaa?",R.raw.phrase_are_you_coming));
        words.add(new word("How are you feeling?","michaksas?",R.raw.phrase_how_are_you_feeling));
        words.add(new word("where are you going?","minto wuksus?",R.raw.phrase_where_are_you_going));
        words.add(new word("Come here.","anninem",R.raw.phrase_come_here));
        words.add(new word("Im feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        words.add(new word("Yes,I am coming.","haa'aanam",R.raw.phrase_yes_im_coming));
        words.add(new word("what is your name?","tinna oyaasena?",R.raw.phrase_what_is_your_name));
        words.add(new word("I am comming.","aanam",R.raw.phrase_im_coming));
        words.add(new word("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        words.add(new word("Lets go.","yoowutis",R.raw.phrase_lets_go));

        WordAdapter Adapter=
                new WordAdapter(this,words);
        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Phrases.this,"list item cicked",Toast.LENGTH_SHORT).show();
                word w=words.get(position);
                mediaPlayer=MediaPlayer.create(Phrases.this,w.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}