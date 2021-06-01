package com.example.Miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.miwok.R;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","lutti"));
        words.add(new Word("two","ottiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}