package com.google.android.instantapps.feature.base;

import android.content.Context;

import io.sq1.pplus.core.client.Settings;

/**
 * Created by roberto on 08/05/2017.
 */

public class TestAppSettings extends Settings {

    public TestAppSettings(Context context) {
        /*super(context, R.string.api_key,
                R.string.host,
                R.string.rsz_key,
                R.string.rsz_secret, false);*/

        super(context, "ki8ecczfwutz1kdqlmfbihlkcu9a9jdm",
                "buzz.ie",
                "buzz",
                "secret-0e232c5bd286323b10cad3d9239d24117fcb333e",
                true);
    }

    @Override
    public int getColorForTag(String domain, String tag) {

        return 0;
    }
}
