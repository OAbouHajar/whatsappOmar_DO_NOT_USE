package com.AssemMods.accounts.views;

import android.content.DialogInterface;
import com.AssemMods.accounts.AccountsManager;
import com.AssemMods.accounts.Utils;

/* compiled from: lambda */
public final /* synthetic */ class AccountRow2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AccountsManager.Account f$0;

    public /* synthetic */ AccountRow2(AccountsManager.Account account) {
        this.f$0 = account;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Utils.getAccountsManager().switchToAccount(this.f$0);
    }
}
