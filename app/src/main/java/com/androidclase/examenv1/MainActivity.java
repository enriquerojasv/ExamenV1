package com.androidclase.examenv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Fragment1 frg1;
    Fragment2 frg2;
    Fragment3 frg3;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frg1 = new Fragment1();
        frg2 = new Fragment2();
        frg3 = new Fragment3();

        FragmentManager manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_1, frg1, "Frag1");
        transaction.add(R.id.fragment_2, frg2, "Frag2");
        transaction.add(R.id.fragment_3, frg3, "Frag3");
        transaction.commit();
    }

    public void requestToChangeText2(String text, int textSize) {

        frg2.tuneText(text, textSize);

    }
}