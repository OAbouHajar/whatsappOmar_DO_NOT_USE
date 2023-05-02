package com.obwhatsapp.community;

import X.AnonymousClass006;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass11A;
import X.AnonymousClass127;
import X.AnonymousClass13V;
import X.AnonymousClass18R;
import X.AnonymousClass1L3;
import X.AnonymousClass2TA;
import X.C14870pt;
import X.C15860rz;
import X.C16150sX;
import X.C16440t3;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17140ub;
import X.C17200uh;
import X.C49132Rg;
import X.C50682aH;
import X.C50712aK;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_CommunityFragment extends WaFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A01();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0V = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r3.A01()
            r3.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.community.Hilt_CommunityFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A01();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            CommunityFragment communityFragment = (CommunityFragment) this;
            C17050uS r1 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r3 = r1.A0b;
            communityFragment.A00 = (C17070uU) r3.ABg.get();
            communityFragment.A01 = (C17080uV) r3.APK.get();
            communityFragment.A0A = (C16440t3) r3.AP2.get();
            communityFragment.A02 = (C14870pt) r3.AB3.get();
            communityFragment.A08 = (C17200uh) r3.A52.get();
            communityFragment.A07 = (C17140ub) r3.A4y.get();
            communityFragment.A04 = (AnonymousClass127) r3.A3z.get();
            communityFragment.A05 = (AnonymousClass1L3) r3.A4N.get();
            communityFragment.A0B = (C15860rz) r3.AQh.get();
            communityFragment.A0C = (AnonymousClass11A) r3.A5U.get();
            communityFragment.A03 = (AnonymousClass13V) r3.A35.get();
            communityFragment.A0D = (AnonymousClass18R) r3.ABZ.get();
            C49132Rg r12 = r1.A0Y;
            communityFragment.A00 = (C50682aH) r12.A0d.get();
            communityFragment.A01 = (C50712aK) r12.A0e.get();
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
