package com.aleksandr.aleksandrov.project.test.android.sunset;

import android.support.v4.app.Fragment;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SunsetFragment.newInstance();
    }
}