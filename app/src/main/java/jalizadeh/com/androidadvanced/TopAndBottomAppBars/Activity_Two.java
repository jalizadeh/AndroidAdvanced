package jalizadeh.com.androidadvanced.TopAndBottomAppBars;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import jalizadeh.com.androidadvanced.R;

public class Activity_Two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        //BottomNavigationMenu video6,7
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        //highlight the selected item
        bottomNavigationView.setSelectedItemId(R.id.ic_description);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case (R.id.ic_android):
                        Intent intent1  = new Intent(Activity_Two.this, Activity_One.class);
                        startActivity(intent1);
                        break;

                    case (R.id.ic_description):
                        break;

                    case (R.id.ic_apps):
                        Intent intent0  = new Intent(Activity_Two.this, Activity_TopAndBottomAppBars.class);
                        startActivity(intent0);
                        break;

                    case (R.id.ic_extension):
                        Intent intent3  = new Intent(Activity_Two.this, Activity_Three.class);
                        startActivity(intent3);
                        break;

                    case (R.id.ic_local_cafe):
                        Intent intent4  = new Intent(Activity_Two.this, Activity_Four.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }
}
