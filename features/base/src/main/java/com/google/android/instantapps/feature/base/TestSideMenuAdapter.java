package com.google.android.instantapps.feature.base;

import io.sq1.pplus.app.BaseMainActivity;
import io.sq1.pplus.app.adapter.SideMenuItemAdapter;

/**
 * Created by Daniel on 15/8/17.
 */

public class TestSideMenuAdapter extends SideMenuItemAdapter {

    public TestSideMenuAdapter(BaseMainActivity activity) {

        super(activity);
    }

    @Override
    public boolean isTopLogoEnabled() {

        return true;
    }
}
