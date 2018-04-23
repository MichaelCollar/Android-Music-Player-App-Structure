package com.example.android.everlastinghits;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link ViewPagerAdapter} is a {@link FragmentPagerAdapter} that provides the layout for
 * each category.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    // Context of the app
    private Context context;

    // Constructor - creating a new {@link ViewPagerAdapter} object.
    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    // Return the {@link Fragment} that will be displayed for the given page number.
    @Override
    public Fragment getItem(int pageNumber) {
        if (pageNumber == 0) {
            return new SeventiesFragment();
        } else if (pageNumber == 1) {
            return new EightiesFragment();
        } else if (pageNumber == 2) {
            return new NinetiesFragment();
        } else {
            return new TwoThousandsFragment();
        }
    }

    // Return the total number of pages.
    @Override
    public int getCount() {
        return 4;
    }

    // Return title of the given page
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.seventies);
        } else if (position == 1) {
            return context.getString(R.string.eighties);
        } else if (position == 2) {
            return context.getString(R.string.nineties);
        } else {
            return context.getString(R.string.twothousands);
        }
    }
}