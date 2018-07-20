package com.example.dc.fragmentsinadroiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    private static final String TAG = "Fragment1";

    private Button buttonGoToFragment1;
    private Button buttonGoToFragment2;
    private Button buttonGoToFragment3;
    private Button buttonGoToSecondActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        buttonGoToFragment1 = view.findViewById(R.id.buttonGoToFragment1);
        buttonGoToFragment2 = view.findViewById(R.id.buttonGoToFragment2);
        buttonGoToFragment3 = view.findViewById(R.id.buttonGoToFragment3);
        buttonGoToSecondActivity = view.findViewById(R.id.buttonGoToSecondActivity);


        buttonGoToFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to fragment1", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setmViewPager(0);
            }
        });

        buttonGoToFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to fragment2", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setmViewPager(1);
            }
        });

        buttonGoToFragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to fragment3", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setmViewPager(2);
            }
        });


        buttonGoToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to SecondActivity", Toast.LENGTH_SHORT).show();
                Intent intent    = new Intent(getActivity(), Second_activity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
