package com.obwhatsapp.search.views.itemviews;

import X.AnonymousClass2DT;
import X.AnonymousClass2Q5;
import X.C19610yi;
import X.C28961Zl;
import X.C38701rH;
import X.C49142Rh;
import X.C94844lZ;
import android.widget.SeekBar;

public class IDxObserverShape98S0100000_2_I0 extends C94844lZ {
    public Object A00;
    public final int A01;

    public IDxObserverShape98S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(int i2) {
        if (this.A01 != 0) {
            C49142Rh r0 = (C49142Rh) this.A00;
            r0.A08.setDescription(C28961Zl.A04(r0.A05, (long) i2));
            return;
        }
        AnonymousClass2Q5 r3 = (AnonymousClass2Q5) this.A00;
        r3.setDuration(C28961Zl.A04(r3.A0K, (long) i2));
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (this.A01 != 0) {
            super.onProgressChanged(seekBar, i2, z2);
            return;
        }
        AnonymousClass2Q5 r0 = (AnonymousClass2Q5) this.A00;
        AnonymousClass2DT.A01(r0.getFMessage(), r0.A09.A07.getProgress());
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        AnonymousClass2DT A002;
        if (this.A01 != 0) {
            super.onStopTrackingTouch(seekBar);
            return;
        }
        AnonymousClass2Q5 r1 = (AnonymousClass2Q5) this.A00;
        C38701rH fMessage = r1.getFMessage();
        AnonymousClass2DT.A01(fMessage, r1.A09.A07.getProgress());
        C19610yi r12 = r1.A07.A03;
        if (r12.A0D(fMessage) && (A002 = r12.A00()) != null) {
            A002.A08++;
        }
    }
}
