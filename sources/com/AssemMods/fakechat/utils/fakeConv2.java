package com.AssemMods.fakechat.utils;

import android.content.DialogInterface;

/* compiled from: lambda */
public final /* synthetic */ class fakeConv2 implements DialogInterface.OnClickListener {
    public static final /* synthetic */ fakeConv2 INSTANCE = new fakeConv2();

    private /* synthetic */ fakeConv2() {
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }
}
