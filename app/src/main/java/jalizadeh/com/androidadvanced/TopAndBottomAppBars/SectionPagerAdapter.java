package jalizadeh.com.androidadvanced.TopAndBottomAppBars;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fList = new ArrayList<>();

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fList.get(i);
    }

    @Override
    public int getCount() {
        return fList.size();
    }


    public void addFragment(Fragment f){
        fList.add(f);
    }
}
