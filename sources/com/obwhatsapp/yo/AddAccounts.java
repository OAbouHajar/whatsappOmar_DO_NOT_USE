package com.obwhatsapp.yo;

import android.view.MenuItem;
import com.AssemMods.accounts.Utils;

/* compiled from: lambda */
public final /* synthetic */ class AddAccounts implements MenuItem.OnMenuItemClickListener {
    public static final /* synthetic */ AddAccounts INSTANCE = new AddAccounts();

    private /* synthetic */ AddAccounts() {
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return Utils.getAccountsManager().addSwitchAccount(yo.Homeac);
    }
}
