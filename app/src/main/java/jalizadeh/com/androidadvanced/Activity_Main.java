package jalizadeh.com.androidadvanced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jalizadeh.com.androidadvanced.Fragments_Video01.Fragments_MainActivity;
import jalizadeh.com.androidadvanced.TopAndBottomAppBars.Activity_TopAndBottomAppBars;

// https://www.youtube.com/watch?v=B_10GhBgt10&list=PLgCYzUzKIBE-1BsxlQTIPF7B95ey34jUF
public class Activity_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //video 02
        Button btnV01 = (Button) findViewById(R.id.btnV01);
        btnV01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Main.this, Fragments_MainActivity.class);
                startActivity(intent);
            }
        });



        //video 3,4,5
        Button btnV02 = (Button) findViewById(R.id.btnV02);
        btnV02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Main.this, Activity_TopAndBottomAppBars.class);
                startActivity(intent);
            }
        });

    }
}
