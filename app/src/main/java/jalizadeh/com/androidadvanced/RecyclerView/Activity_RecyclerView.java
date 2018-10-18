package jalizadeh.com.androidadvanced.RecyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import jalizadeh.com.androidadvanced.R;

public class Activity_RecyclerView extends AppCompatActivity {
    private static final String TAG = "Activity_RecyclerView";


    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/apple/129/money-mouth-face_1f911.png");
        mNames.add("Apple");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/google/146/money-mouth-face_1f911.png");
        mNames.add("Google");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/microsoft/153/money-mouth-face_1f911.png");
        mNames.add("Microsoft");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/samsung/148/money-mouth-face_1f911.png");
        mNames.add("Samsung");


        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/whatsapp/116/money-mouth-face_1f911.png");
        mNames.add("Whatsapp");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/twitter/154/money-mouth-face_1f911.png");
        mNames.add("Twitter");


        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/facebook/138/money-mouth-face_1f911.png");
        mNames.add("Facebook");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/emojione/151/money-mouth-face_1f911.png");
        mNames.add("Emoji One");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/emojidex/112/money-mouth-face_1f911.png");
        mNames.add("Emojidex");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/lg/57/money-mouth-face_1f911.png");
        mNames.add("LG");

        mImageUrls.add("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/htc/122/money-mouth-face_1f911.png");
        mNames.add("HTC");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter( mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}