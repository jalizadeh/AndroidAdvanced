package jalizadeh.com.androidadvanced.TopAndBottomAppBars;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_Tab1());
        adapter.addFragment(new Fragment_Tab2());
        adapter.addFragment(new Fragment_Tab3());

        viewPager.setAdapter(adapter);
    }


}
