package com.OM7753.res;

import android.app.Activity;
import android.view.MenuItem;
import com.OM7753.GOLD;

/* compiled from: lambda */
public final /* synthetic */ class tra implements MenuItem.OnMenuItemClickListener {
    Activity activity;

    public /* synthetic */ tra(Activity activity2) {
        this.activity = activity2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return GOLD.d_tra(this.activity);
    }
}
