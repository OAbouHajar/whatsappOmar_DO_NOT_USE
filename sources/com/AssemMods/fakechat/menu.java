package com.AssemMods.fakechat;

import android.view.MenuItem;
import com.obwhatsapp.yo.yo;

/* compiled from: lambda */
public final /* synthetic */ class menu implements MenuItem.OnMenuItemClickListener {
    public static final /* synthetic */ menu INSTANCE = new menu();

    private /* synthetic */ menu() {
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return yo.fakechat(menuItem);
    }
}
