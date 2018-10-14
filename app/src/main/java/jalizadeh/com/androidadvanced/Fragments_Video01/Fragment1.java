package jalizadeh.com.androidadvanced.Fragments_Video01;

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

import jalizadeh.com.androidadvanced.R;

public class Fragment1  extends Fragment {
    private Button btnF1;
    private Button btnF2;
    private Button btnF3;
    private Button btnGoToSecondActivity;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragments_video01_fragment01_layout, container, false);

        btnF1 = (Button) view.findViewById(R.id.btnF1);
        btnF2 = (Button) view.findViewById(R.id.btnF2);
        btnF3 = (Button) view.findViewById(R.id.btnF3);
        btnGoToSecondActivity = (Button) view.findViewById(R.id.btnGoToSecondActivity);

        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to fragment 1", Toast.LENGTH_SHORT).show();

                ((Fragments_MainActivity)getActivity()).setViewPager(0);
            }
        });


        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to fragment 2", Toast.LENGTH_SHORT).show();

                ((Fragments_MainActivity)getActivity()).setViewPager(1);
            }
        });



        btnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to fragment 3", Toast.LENGTH_SHORT).show();

                ((Fragments_MainActivity)getActivity()).setViewPager(2);
            }
        });



        btnGoToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to 2nd activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Fragments_SecondActivity.class);
                startActivity(intent);

            }
        });


        return  view;
    }
}
