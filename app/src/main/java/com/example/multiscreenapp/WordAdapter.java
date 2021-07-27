package com.example.multiscreenapp;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {
    public WordAdapter(Activity context, ArrayList<word> words)
    {
        super(context,0,words);
    }
    @NonNull

    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemView=convertView;
       if(listItemView==null)
       {
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }
       word currentWord=getItem(position);
        TextView miwokTextView =(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        TextView defaultTextView=(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        ImageView imageview =(ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            imageview.setImageResource(currentWord.getmImageResource());
            imageview.setVisibility(View.VISIBLE);
        }
        else {
            imageview.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
