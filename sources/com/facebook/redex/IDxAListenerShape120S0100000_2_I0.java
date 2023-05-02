package com.facebook.redex;

import X.AnonymousClass2Rf;
import X.AnonymousClass3K2;
import X.C006202q;
import X.C15960sC;
import X.C16150sX;
import X.C16260sj;
import X.C49132Rg;
import android.content.Context;
import com.obwhatsapp.profile.CapturePhoto;

public class IDxAListenerShape120S0100000_2_I0 implements C006202q {
    public Object A00;
    public final int A01;

    public IDxAListenerShape120S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AP6(Context context) {
        if (67 - this.A01 != 0) {
            AnonymousClass3K2.A12(this);
            return;
        }
        CapturePhoto capturePhoto = (CapturePhoto) this.A00;
        if (!capturePhoto.A05) {
            capturePhoto.A05 = true;
            C16150sX r1 = ((C49132Rg) ((AnonymousClass2Rf) capturePhoto.generatedComponent())).A1s;
            capturePhoto.A00 = C16150sX.A02(r1);
            capturePhoto.A02 = C16150sX.A0Z(r1);
            capturePhoto.A01 = (C16260sj) r1.AQe.get();
            capturePhoto.A03 = C16150sX.A0k(r1);
            capturePhoto.A04 = (C15960sC) r1.AKz.get();
        }
    }
}
