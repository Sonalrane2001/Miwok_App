package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NumberList(View v){
        Intent i=new Intent(this,NumberList.class);
        startActivity(i);
    }
    public void FamilyMembers(View v){
        Intent i1=new Intent(this,FamilyMembers.class);
        startActivity(i1);
    }
    public void Colours(View v){
        Intent i2=new Intent(this,Colours.class);
        startActivity(i2);
    }
    public void Phrases(View v){
        Intent i3=new Intent(this,Phrases.class);
        startActivity(i3);
    }
}