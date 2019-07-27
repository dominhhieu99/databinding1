package com.example.databinding.fragment;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomePagerFragment extends FragmentPagerAdapter {


    public HomePagerFragment(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MyWalletFragment();
            case 1:
                return new InsightFragment();
            case 2:
                return new InsightFragment();
            default:
                return new MyWalletFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "My Wallet";
            case 1:
                return "Insight";
            default:
                return "Tool";
        }
    }

}
