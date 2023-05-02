package com.facebook.redex;

import X.AnonymousClass2DF;
import X.AnonymousClass2JH;
import android.widget.PopupWindow;
import com.obwhatsapp.R;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;

public class IDxDListenerShape266S0100000_2_I0 implements PopupWindow.OnDismissListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape266S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onDismiss() {
        ReactionsTrayViewModel reactionsTrayViewModel;
        if (this.A01 != 0) {
            ((TextStatusComposerActivity) this.A00).A0A.setImageResource(R.drawable.ic_emoji_solid);
            return;
        }
        AnonymousClass2DF r2 = (AnonymousClass2DF) this.A00;
        AnonymousClass2JH ABw = r2.A0G.ABw();
        if (r2.A0G.AJX() && ABw != null && !ABw.A02 && (reactionsTrayViewModel = r2.A0j) != null) {
            reactionsTrayViewModel.A05(0);
        }
    }
}
