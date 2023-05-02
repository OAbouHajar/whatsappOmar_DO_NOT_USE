package com.AssemMods.accounts.WAclass;

import android.app.Activity;
import android.view.View;
import com.AssemMods.accounts.Utils;

/* compiled from: lambda */
public final /* synthetic */ class waclass1 implements View.OnClickListener {
    public final /* synthetic */ Activity f$0;

    public /* synthetic */ waclass1(Activity activity) {
        this.f$0 = activity;
    }

    public final void onClick(View view) {
        Utils.getAccountsManager().showAccountsList(this.f$0);
    }
}
