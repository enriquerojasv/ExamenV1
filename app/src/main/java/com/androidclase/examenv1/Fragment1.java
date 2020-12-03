package com.androidclase.examenv1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    EditText editTextF1;
    SeekBar seekbar1;
    Button button1;

    public Fragment1() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        initViews(view);



        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = editTextF1.getText().toString();
                int textSize = seekbar1.getProgress();
                System.out.println(text + " - " + textSize);
                ((MainActivity)getActivity()).requestToChangeText2(text, textSize);
            }
        });
        return view;
    }

    private void initViews(View view) {
        editTextF1 = (EditText)view.findViewById(R.id.edit_f1);
        seekbar1 = (SeekBar)view.findViewById(R.id.seekBar_fragment1);
        button1 = (Button)view.findViewById(R.id.button1);
    }
}