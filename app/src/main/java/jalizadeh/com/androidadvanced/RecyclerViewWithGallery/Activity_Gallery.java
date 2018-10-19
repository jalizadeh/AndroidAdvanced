package jalizadeh.com.androidadvanced.RecyclerViewWithGallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import jalizadeh.com.androidadvanced.R;
import jalizadeh.com.androidadvanced.RecyclerView.MyRecyclerViewAdapter;

public class Activity_Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        TextView name = (TextView) findViewById(R.id.tvImageNameGallery);
        ImageView image = (ImageView) findViewById(R.id.image_gallery);

        if(getIntent().hasExtra("image_name") && getIntent().hasExtra("image_url")){
            String imageName = getIntent().getStringExtra("image_name");
            String imageUrl = getIntent().getStringExtra("image_url");

            name.setText(imageName);
            Glide.with(this)
                    .asBitmap()
                    .load(imageUrl)
                    .into(image);
        }

    }


}
