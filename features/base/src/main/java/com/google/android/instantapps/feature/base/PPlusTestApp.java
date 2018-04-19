package com.google.android.instantapps.feature.base;

import android.net.Uri;

import io.sq1.pplus.app.PPLusBaseApplication;
import io.sq1.pplus.app.post.LatestPostsCollectionFragment;
import io.sq1.pplus.core.client.PPlusApiClient;
import io.sq1.pplus.core.client.Settings;
import io.sq1.pplus.core.navigation.PPlusNavigation;
import io.sq1.pplus.core.profile.NavigationProfile;
import io.sq1.pplus.core.profile.SideMenuItem;

import static io.sq1.pplus.core.profile.SideMenuItem.ItemType.ITEM_NORMAL;
import static io.sq1.pplus.core.profile.SideMenuItem.ItemType.ITEM_SECTION;

/**
 * Created by roberto on 08/05/2017.
 */

public class PPlusTestApp extends PPLusBaseApplication {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "XONKFyVxq99aQCO1jcRDu3Mvv";
    private static final String TWITTER_SECRET = "KQfml6tLRMd4laW2aVk7YGtoDfEMJdRZfsSP3kPJraJZXyF2a3";

    PPlusApiClient client;
    SideMenuItem[] items;

    @Override
    public void init() {

        //client = new PPlusApiClient(new WordpressApiClient(this, "https", "nova.square1.io"));
        client = new PPlusApiClient(this, getApiSettings());

        Uri latestUri = PPlusNavigation.uriForFragment(LatestPostsCollectionFragment.class,
                "home",
                true);

        SideMenuItem latest = new SideMenuItem("Latest", latestUri, ITEM_NORMAL);

        SideMenuItem section = new SideMenuItem("Section1", latestUri, ITEM_SECTION);

        section.addSubmenuItem(new SideMenuItem("Subsection 1", ITEM_NORMAL));
        section.addSubmenuItem(new SideMenuItem("Subsection 2", ITEM_NORMAL));
        section.addSubmenuItem(new SideMenuItem("Subsection 3", ITEM_NORMAL));

        SideMenuItem section1 = new SideMenuItem("Section2", latestUri, ITEM_SECTION);

        section1.addSubmenuItem(new SideMenuItem("Subsection 1", ITEM_NORMAL));
        section1.addSubmenuItem(new SideMenuItem("Subsection 2", ITEM_NORMAL));
        section1.addSubmenuItem(new SideMenuItem("Subsection 3", ITEM_NORMAL));


        SideMenuItem section2 = new SideMenuItem("Section3", latestUri, ITEM_SECTION);

        section2.addSubmenuItem(new SideMenuItem("Subsection 1", ITEM_NORMAL));
        section2.addSubmenuItem(new SideMenuItem("Subsection 2", ITEM_NORMAL));
        section2.addSubmenuItem(new SideMenuItem("Subsection 3", ITEM_NORMAL));


        SideMenuItem section3 = new SideMenuItem("Section4", latestUri, ITEM_SECTION);

        section3.addSubmenuItem(new SideMenuItem("Subsection 1", ITEM_NORMAL));
        section3.addSubmenuItem(new SideMenuItem("Subsection 2", ITEM_NORMAL));
        section3.addSubmenuItem(new SideMenuItem("Subsection 3", ITEM_NORMAL));

        items = new SideMenuItem[]{latest, section, section1, section2, section3};

    }

    @Override
    public PPlusApiClient getApiClient() {

        return client;
    }

    @Override
    public Settings getApiSettings() {

        return new TestAppSettings(this);
    }

    @Override
    public NavigationProfile getNavigationProfile() {

        return new NavigationProfile() {

            @Override
            public SideMenuItem[] getSideMenuItems() {

                return items;
            }
        };
    }

    @Override
    public String getTwitterKey() {

        return TWITTER_KEY;
    }

    @Override
    public String getTwitterSecret() {

        return TWITTER_SECRET;
    }
}
