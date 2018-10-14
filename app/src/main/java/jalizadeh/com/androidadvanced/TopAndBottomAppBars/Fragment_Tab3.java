package jalizadeh.com.androidadvanced.TopAndBottomAppBars;

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

public class Fragment_Tab3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3_top_and_bottom_app_bars, container, false);

        Button btnTest = (Button) view.findViewById(R.id.btnTest_v3);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Testing Button Tab 3", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}
