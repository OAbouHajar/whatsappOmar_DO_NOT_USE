package com.AssemMods.WAclass;

import android.app.Activity;
import android.view.View;
import com.AssemMods.bomber.MessageBomber;

/* compiled from: lambda */
public final /* synthetic */ class Translator2 implements View.OnClickListener {
    public final /* synthetic */ Activity f$0;

    public /* synthetic */ Translator2(Activity activity) {
        this.f$0 = activity;
    }

    public final void onClick(View view) {
        MessageBomber.ShowBomberDialog(this.f$0);
    }
}
