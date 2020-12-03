package com.androidclase.examenv1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment2 extends Fragment {

    TextView text2;

    public Fragment2() {
        // Required empty public constructor
    }


    public void tuneText(String text, int textSize){
        text2.setText(text);
        text2.setTextSize(textSize);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        text2 = (TextView)view.findViewById(R.id.fragment2_textView);
        //tuneText(, 34);

        return view;
    }
}