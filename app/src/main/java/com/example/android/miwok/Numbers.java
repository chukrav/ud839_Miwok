package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String [] words = new String[10];
        ArrayList<String> words = new ArrayList<>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

//        Log.v("NumbersActivity", "The word[0] is: " + words.get(0));
//        Log.v("NumbersActivity", "The word[5] is: " + words.get(5));

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView word = new TextView(this);
//        word.setText(words.get(0));
//        rootView.addView(word);


        for (int i = 0; i < words.size(); i++) {
            TextView word = new TextView(this);
            word.setText(words.get(i));
            rootView.addView(word);
        }
    }
}
