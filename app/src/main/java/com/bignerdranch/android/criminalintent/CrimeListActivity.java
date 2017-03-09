package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by fvg0902 on 6/03/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
