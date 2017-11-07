package com.example.kir.moneytracker;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
    public Fragment getItem(int position) {

        switch (position){
            case PAGE_EXPENSES:
                return ItemsFragment.createItemsFragment(ItemsFragment.TYPE_EXPENSE);

            case PAGE_INCOMES:
                return ItemsFragment.createItemsFragment(ItemsFragment.TYPE_INCOME);

            case PAGE_BALANCE:
                Fragment fragment = new BalanceFragment();
                Bundle bundle = new Bundle();
                bundle.putInt(BalanceFragment.KEY_TYPE, BalanceFragment.TYPE_BALANCE);

                fragment.setArguments(bundle);
                return fragment;

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return PAGES_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];


    }


}
