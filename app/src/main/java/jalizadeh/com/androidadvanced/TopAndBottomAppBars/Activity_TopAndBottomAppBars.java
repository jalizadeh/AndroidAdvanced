package jalizadeh.com.androidadvanced.TopAndBottomAppBars;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import jalizadeh.com.androidadvanced.R;

//video #3, 4, 5
public class Activity_TopAndBottomAppBars extends AppCompatActivity {

    private SectionPagerAdapter mSectionPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_and_bottom_app_bars);

        mSectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.container_v3);
        setupViewPager(viewPager);

        TabLayout tabs  = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        tabs.getTabAt(0).setIcon(R.drawable.ic_mood);
        tabs.getTabAt(1).setIcon(R.drawable.ic_people);
        tabs.getTabAt(2).setIcon(R.drawable.ic_mood_bad);



        //BottomNavigationMenu video6,7
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        //highlight the selected item
        bottomNavigationView.setSelectedItemId(R.id.ic_apps);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case (R.id.ic_android):
                        Intent intent1  = new Intent(Activity_TopAndBottomAppBars.this, Activity_One.class);
                        startActivity(intent1);
                        break;

                    case (R.id.ic_description):
                        Intent intent2  = new Intent(Activity_TopAndBottomAppBars.this, Activity_Two.class);
                        startActivity(intent2);
                        break;

                    case (R.id.ic_apps):

                        break;

                    case (R.id.ic_extension):
                        Intent intent3  = new Intent(Activity_TopAndBottomAppBars.this, Activity_Three.class);
                        startActivity(intent3);
                        break;

                    case (R.id.ic_local_cafe):
                        Intent intent4  = new Intent(Activity_TopAndBottomAppBars.this, Activity_Four.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_Tab1());
        adapter.addFragment(new Fragment_Tab2());
        adapter.addFragment(new Fragment_Tab3());

        viewPager.setAdapter(adapter);
    }


}
