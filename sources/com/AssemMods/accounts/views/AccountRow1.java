package com.AssemMods.accounts.views;

import android.content.DialogInterface;
import com.AssemMods.accounts.AccountsManager;

/* compiled from: lambda */
public final /* synthetic */ class AccountRow1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AccountRow f$0;
    public final /* synthetic */ AccountsManager.Account f$1;

    public /* synthetic */ AccountRow1(AccountRow accountRow, AccountsManager.Account account) {
        this.f$0 = accountRow;
        this.f$1 = account;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f$0.lambda$setAccount$1$AccountRow(this.f$1, dialogInterface, i2);
    }
}
