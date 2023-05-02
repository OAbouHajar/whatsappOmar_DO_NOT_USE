package com.facebook.redex;

import X.AnonymousClass01X;
import X.AnonymousClass031;
import X.AnonymousClass05M;
import X.AnonymousClass0A2;
import X.AnonymousClass0Fb;
import X.AnonymousClass0Fq;
import X.AnonymousClass0JL;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;

public class IDxDCompatShape21S0100000_I1 extends AnonymousClass05M {
    public Object A00;
    public final int A01;

    public IDxDCompatShape21S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean A03(View view, int i2, Bundle bundle) {
        if (this.A01 == 0) {
            return ((AnonymousClass0Fq) this.A00).A00.A03(view, i2, bundle);
        }
        if (i2 == 1048576) {
            AnonymousClass0A2 r1 = (AnonymousClass0A2) this.A00;
            if (r1.A0B) {
                r1.A03(AnonymousClass0JL.ACCESSIBILITY_ACTION);
                return true;
            }
        }
        return super.A03(view, i2, bundle);
    }

    public void A06(View view, AnonymousClass031 r5) {
        Preference A0E;
        boolean z2;
        if (this.A01 != 0) {
            super.A06(view, r5);
            if (((AnonymousClass0A2) this.A00).A0B) {
                r5.A01.addAction(AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START);
                z2 = true;
            } else {
                z2 = false;
            }
            r5.A0K(z2);
            return;
        }
        AnonymousClass0Fq r1 = (AnonymousClass0Fq) this.A00;
        r1.A00.A06(view, r5);
        RecyclerView recyclerView = r1.A02;
        int A002 = RecyclerView.A00(view);
        AnonymousClass01X r12 = recyclerView.A0N;
        if ((r12 instanceof AnonymousClass0Fb) && (A0E = ((AnonymousClass0Fb) r12).A0E(A002)) != null) {
            A0E.A0G(r5);
        }
    }
}
