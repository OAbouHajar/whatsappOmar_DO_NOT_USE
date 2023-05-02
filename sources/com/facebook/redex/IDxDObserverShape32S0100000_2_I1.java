package com.facebook.redex;

import X.AnonymousClass01X;
import X.AnonymousClass078;
import X.C57592rQ;
import com.obwhatsapp.community.CommunityHomeActivity;

public class IDxDObserverShape32S0100000_2_I1 extends AnonymousClass078 {
    public Object A00;
    public final int A01;

    public IDxDObserverShape32S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        switch (this.A01) {
            case 1:
                ((AnonymousClass01X) this.A00).A01();
                return;
            case 2:
                CommunityHomeActivity communityHomeActivity = (CommunityHomeActivity) this.A00;
                communityHomeActivity.A09.A0a(0);
                communityHomeActivity.A0q.A01.unregisterObserver(this);
                return;
            default:
                super.A00();
                return;
        }
    }

    public void A01(int i2, int i3) {
        if (this.A01 != 0) {
            super.A01(i2, i3);
        } else {
            C57592rQ.A00((C57592rQ) this.A00, i2, i3);
        }
    }

    public void A02(int i2, int i3) {
        if (this.A01 != 0) {
            super.A02(i2, i3);
        } else {
            C57592rQ.A00((C57592rQ) this.A00, i2, i3);
        }
    }

    public void A03(int i2, int i3) {
        if (this.A01 != 0) {
            super.A03(i2, i3);
        } else {
            C57592rQ.A00((C57592rQ) this.A00, i2, i3);
        }
    }

    public void A04(int i2, int i3, int i4) {
        if (this.A01 != 0) {
            super.A04(i2, i3, 1);
            return;
        }
        C57592rQ r0 = (C57592rQ) this.A00;
        C57592rQ.A00(r0, i2, 1);
        C57592rQ.A00(r0, i3, 1);
    }
}
