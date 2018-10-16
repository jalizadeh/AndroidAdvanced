package jalizadeh.com.androidadvanced.RetrofitJSON;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import jalizadeh.com.androidadvanced.R;
import jalizadeh.com.androidadvanced.RetrofitJSON.Model.Children.Children;
import jalizadeh.com.androidadvanced.RetrofitJSON.Model.Feed;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Activity_Retrofit extends AppCompatActivity {

    private static final String TAG = "Activity_Retrofit";

    private static final String BASE_URL = "https://www.reddit.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ativity__retrofit);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitAPI redditAPI = retrofit.create(RetrofitAPI.class);
        Call<Feed> call = redditAPI.getData();


        call.enqueue(new Callback<Feed>() {
            @Override
            public void onResponse(Call<Feed> call, Response<Feed> response) {
                Log.d(TAG, "onResponse: Server Response: " + response.toString());
                Log.d(TAG, "onResponse: Recieved Information: " + response.body().toString());

                ArrayList<Children> children = response.body().getData().getChildren();
                for(Children c : children){
                    Log.d(TAG, "onResponse: \n" +
                            "kind: " + c.getKind() + "\n" +
                            "ID: " + c.getData().getId()  + "\n" +
                            "contest_mode: " + c.getData().getContest_mode() + "\n" +
                            "subreddit: " + c.getData().getSubreddit()  + "\n" +
                            "author: " + c.getData().getAuthor()  + "\n" +
                            "title: " + c.getData().getTitle()  + "\n" +
                            "-------------------------------------------------------------------------\n\n");
                }

            }

            @Override
            public void onFailure(Call<Feed> call, Throwable t) {
                Log.d(TAG, "onFailure: ERROR" + t.getMessage());
                Toast.makeText(Activity_Retrofit.this,"ERROR" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
