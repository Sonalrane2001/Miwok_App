package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        final  ArrayList<word> words=new ArrayList<word>();
        words.add(new word("father","apa",R.drawable.family_father,R.raw.family_father));
        words.add(new word("mother","ata",R.drawable.family_mother,R.raw.family_mother));
        words.add(new word("son","angsi",R.drawable.family_son,R.raw.family_son));
        words.add(new word("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new word("younger borther","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new word("older sister","tete",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new word("yournger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new word("gradmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new word("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));
        WordAdapter Adapter=
                new WordAdapter(this,words);
        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FamilyMembers.this,"list item cicked",Toast.LENGTH_SHORT).show();
                word w=words.get(position);
                mediaPlayer=MediaPlayer.create(FamilyMembers.this,w.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}