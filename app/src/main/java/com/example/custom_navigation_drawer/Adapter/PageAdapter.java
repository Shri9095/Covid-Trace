package com.example.custom_navigation_drawer.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.custom_navigation_drawer.CategoryFragment;
import com.example.custom_navigation_drawer.ProfileFragment;
import com.example.custom_navigation_drawer.SettingFragment;

public class PageAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
