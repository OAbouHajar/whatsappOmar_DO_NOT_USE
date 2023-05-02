package com.AssemMods.WAclass;

import android.app.Activity;
import android.content.DialogInterface;

/* compiled from: lambda */
public final /* synthetic */ class Translator1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity f$0;

    public /* synthetic */ Translator1(Activity activity) {
        this.f$0 = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Conversation.lambda$initTranslator$0(this.f$0, dialogInterface, i2);
    }
}
