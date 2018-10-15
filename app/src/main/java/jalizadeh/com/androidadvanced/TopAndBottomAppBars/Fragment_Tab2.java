package jalizadeh.com.androidadvanced.TopAndBottomAppBars;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import jalizadeh.com.androidadvanced.R;
import jalizadeh.com.androidadvanced.TopAndBottomAppBars.Classes.Card;
import jalizadeh.com.androidadvanced.TopAndBottomAppBars.Classes.CustomListAdapter;

public class Fragment_Tab2 extends Fragment {
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2_top_and_bottom_app_bars, container, false);

        listView = (ListView)  view.findViewById(R.id.listView);

        //creating a list of pictures
        ArrayList<Card> cardList = new ArrayList<>();
        cardList.add(new Card("drawable://" + R.drawable.pic1, "Picrure 1"));
        cardList.add(new Card("drawable://" + R.drawable.pic2, "Picrure 2"));
        cardList.add(new Card("drawable://" + R.drawable.pic3, "Picrure 3"));
        cardList.add(new Card("drawable://" + R.drawable.pic4, "Picrure 4"));
        cardList.add(new Card("drawable://" + R.drawable.pic1, "Picrure 1"));
        cardList.add(new Card("drawable://" + R.drawable.pic2, "Picrure 2"));
        cardList.add(new Card("drawable://" + R.drawable.pic3, "Picrure 3"));
        cardList.add(new Card("drawable://" + R.drawable.pic4, "Picrure 4"));
        cardList.add(new Card("drawable://" + R.drawable.pic1, "Picrure 1"));
        cardList.add(new Card("drawable://" + R.drawable.pic2, "Picrure 2"));
        cardList.add(new Card("drawable://" + R.drawable.pic3, "Picrure 3"));
        cardList.add(new Card("drawable://" + R.drawable.pic4, "Picrure 4"));
        cardList.add(new Card("drawable://" + R.drawable.pic1, "Picrure 1"));
        cardList.add(new Card("drawable://" + R.drawable.pic2, "Picrure 2"));
        cardList.add(new Card("drawable://" + R.drawable.pic3, "Picrure 3"));
        cardList.add(new Card("drawable://" + R.drawable.pic4, "Picrure 4"));


        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.template_cardview, cardList);
        listView.setAdapter(adapter);


        return view;



    }
}
