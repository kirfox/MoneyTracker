package com.example.kir.moneytracker;

import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Kir on 05.11.2017.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private final static int PAGE_EXPENSES = 0;
    private final static int PAGE_INCOMES = 1;
    private final static int PAGE_BALANCE = 2;

    private final static int PAGES_COUNT = 3;

    private String[] titles;

    public MainPagerAdapter(FragmentManager fm, Resources resources) {
        super(fm);

        titles =  resources.getStringArray(R.array.tabs_titles);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        switch (position){
            case PAGE_EXPENSES:


        }
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);


    }
}
