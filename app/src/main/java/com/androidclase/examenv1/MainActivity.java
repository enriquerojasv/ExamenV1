package com.androidclase.examenv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void requestToChangeText2(String text, int textSize) {
        System.out.println("activity" + text + textSize);

        //Fragment2 frag2 = (Fragment2) findViewById(R.id.fragment_2);
    }
}