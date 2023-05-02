package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.DialogInterface;

/* compiled from: lambda */
public final /* synthetic */ class p_reset implements DialogInterface.OnClickListener {
    public static final /* synthetic */ p_reset INSTANCE = new p_reset();

    private /* synthetic */ p_reset() {
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        SecPrivacy.r(dialogInterface, i2);
    }
}
