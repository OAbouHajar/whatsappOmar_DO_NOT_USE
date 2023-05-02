package com.AssemMods.fakechat.utils;

import android.content.DialogInterface;

/* compiled from: lambda */
public final /* synthetic */ class fakeConv1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Conversations f$0;

    public /* synthetic */ fakeConv1(Conversations conversations) {
        this.f$0 = conversations;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f$0.lambda$confirmDeleteMessage$0$Conversations(dialogInterface, i2);
    }
}
