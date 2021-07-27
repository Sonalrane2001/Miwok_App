package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumberList extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_list);
        final ArrayList<word> words=new ArrayList<word>();
        words.add(new word("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new word("two","otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new word("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new word("five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new word("six","temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new word("nine","woe",R.drawable.number_nine,R.raw.number_nine));
        words.add(new word("ten","naaacha",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter Adapter=
                new WordAdapter(this,words);
       ListView listView=(ListView) findViewById(R.id.list);

       listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(NumberList.this,"list item cicked",Toast.LENGTH_SHORT).show();
                word w=words.get(position);
                 mediaPlayer=MediaPlayer.create(NumberList.this,w.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}