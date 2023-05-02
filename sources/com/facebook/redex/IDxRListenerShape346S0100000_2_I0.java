package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1N7;
import X.AnonymousClass5QC;
import X.C51202bB;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediaview.MediaViewFragment;

public class IDxRListenerShape346S0100000_2_I0 implements AnonymousClass5QC {
    public Object A00;
    public final int A01;

    public IDxRListenerShape346S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AWQ(String str, int i2) {
        C51202bB r2;
        if (this.A01 != 0) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
            AnonymousClass1N7 r0 = mediaViewFragment.A1Q;
            if (i2 == 2) {
                r0.A01(2);
                C51202bB r1 = mediaViewFragment.A1P;
                if (r1 != null) {
                    AnonymousClass00B.A06(str);
                    r1.A02(str, 3, false, false);
                    return;
                }
                return;
            }
            r0.A01(3);
            return;
        }
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
        if (!mediaComposerActivity.AIm() && i2 == 2 && (r2 = mediaComposerActivity.A11) != null) {
            r2.A02(str, 3, false, false);
        }
    }
}
