package com.example.anthony.tabbedactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by anthony on 12/29/16.
 */
public class ExamplePagerAdapter extends FragmentPagerAdapter {
    private Fragment[] fragments;

    public ExamplePagerAdapter(FragmentManager fm) {
        super(fm);
        fragments = new Fragment[2];
        fragments[0] = new Fragment1();
        fragments[1] = new Fragment2();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab " + position;
    }
}
