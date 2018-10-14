package jalizadeh.com.androidadvanced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jalizadeh.com.androidadvanced.Fragments_Video01.Fragments_MainActivity;

// https://www.youtube.com/watch?v=B_10GhBgt10&list=PLgCYzUzKIBE-1BsxlQTIPF7B95ey34jUF
public class Activity_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //video 01
        Button btnV01 = (Button) findViewById(R.id.btnV01);
        btnV01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Main.this, Fragments_MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
