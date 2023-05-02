package com.AssemMods.accounts.views;

import android.view.View;
import com.AssemMods.accounts.AccountsManager;

/* compiled from: lambda */
public final /* synthetic */ class AccountRow3 implements View.OnClickListener {
    public final /* synthetic */ AccountRow f$0;
    public final /* synthetic */ AccountsManager.Account f$1;

    public /* synthetic */ AccountRow3(AccountRow accountRow, AccountsManager.Account account) {
        this.f$0 = accountRow;
        this.f$1 = account;
    }

    public final void onClick(View view) {
        this.f$0.lambda$setAccount$2$AccountRow(this.f$1, view);
    }
}
