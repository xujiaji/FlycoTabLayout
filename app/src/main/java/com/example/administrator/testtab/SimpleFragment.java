package com.example.administrator.testtab;

import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;
import java.util.List;

public class SimpleFragment extends Fragment
{
    @ColorInt
    private int color;
    private String[] mTitles = {"小明", "Interesting", "Hello", "小红"};
    private List<TabFragment> mFragments = new ArrayList<>();

    public static SimpleFragment newInstance(@ColorInt int color)
    {
        SimpleFragment s = new SimpleFragment();
        s.color = color;
        for(String title : s.mTitles)
        {
            s.mFragments.add(TabFragment.newInstance(title));
        }
        return s;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_simple, null);
        v.findViewById(R.id.layout).setBackgroundColor(color);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        SlidingTabLayout mSlidingTabLayout = view.findViewById(R.id.tl_2);
        ViewPager mViewPager = view.findViewById(R.id.viewPager);
        mViewPager.setAdapter(new MyPagerAdapter(getChildFragmentManager()));
        mSlidingTabLayout.setViewPager(mViewPager);
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
            int a = position % mTitles.length;
            return mTitles[a];
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }
}
