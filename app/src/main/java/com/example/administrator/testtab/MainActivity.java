package com.example.administrator.testtab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private int[] colors = {0xffff0000, 0xffff00ff, 0xff00ff00, 0xff0000ff};
    private ArrayList<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 4; i++) {
            mFragments.add(SimpleFragment.newInstance(colors[i]));
        }

        CommonTabLayout mTabLayout = findViewById(R.id.tl_2);
        ViewPager       mViewPager = findViewById(R.id.viewPager);

        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        mTabLayout.linkViewPager(mViewPager);
//        mTabLayout.showMsg(0, new Random().nextInt(100) + 1);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter
    {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }
}
