package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0TP;
import X.AnonymousClass0WD;
import X.C12720kr;
import X.C14930q1;
import X.C14950q3;
import X.C14960q4;
import X.C14980q6;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

public class IDxEListenerShape97S0200000_I1 implements C12720kr {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxEListenerShape97S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(IDxEListenerShape97S0200000_I1 iDxEListenerShape97S0200000_I1) {
        AnonymousClass0WD r3 = (AnonymousClass0WD) iDxEListenerShape97S0200000_I1.A00;
        Context A002 = r3.A08.A00();
        View view = (View) iDxEListenerShape97S0200000_I1.A01;
        view.setVisibility(8);
        try {
            WindowManager windowManager = (WindowManager) A002.getSystemService("window");
            if (windowManager != null) {
                windowManager.removeView(view);
                WeakReference weakReference = AnonymousClass0TP.A00;
                if (weakReference.get() == view) {
                    weakReference.clear();
                }
                C12720kr r0 = r3.A06;
                if (r0 != null) {
                    r0.APv();
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0V("Window manager required but not found.");
        } catch (IllegalArgumentException unused) {
        }
    }

    public static final void A01(IDxEListenerShape97S0200000_I1 iDxEListenerShape97S0200000_I1) {
        A03((C14960q4) iDxEListenerShape97S0200000_I1.A01, (C14930q1) iDxEListenerShape97S0200000_I1.A00);
    }

    public static /* synthetic */ void A03(C14960q4 r1, C14930q1 r2) {
        if (r2 != null) {
            C14980q6.A00(r1, C14950q3.A01, r2);
        }
    }

    public void APv() {
        if (this.A02 != 0) {
            A01(this);
        } else {
            A00(this);
        }
    }
}
