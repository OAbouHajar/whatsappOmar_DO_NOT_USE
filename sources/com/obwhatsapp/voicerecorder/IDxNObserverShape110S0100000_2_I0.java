package com.obwhatsapp.voicerecorder;

import X.AnonymousClass1ZQ;
import X.AnonymousClass2DT;
import X.C16740tZ;
import X.C42821yj;
import X.C54272h7;

public class IDxNObserverShape110S0100000_2_I0 extends C54272h7 {
    public Object A00;
    public final int A01;

    public IDxNObserverShape110S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        if (1 - this.A01 != 0) {
            super.A00();
            return;
        }
        C42821yj r1 = (C42821yj) this.A00;
        if (r1.A0a != null) {
            r1.A07.setVisibility(8);
        }
    }

    public void A01() {
        if (1 - this.A01 != 0) {
            super.A01();
            return;
        }
        C42821yj r2 = (C42821yj) this.A00;
        C16740tZ r1 = r2.A2C.A0D;
        if (r1 != null) {
            r2.A0j(r1, false);
        }
    }

    public void A02() {
        if (1 - this.A01 != 0) {
            super.A02();
            return;
        }
        C42821yj r2 = (C42821yj) this.A00;
        if (r2.A0a != null) {
            r2.A07.setVisibility(8);
        }
        if (r2.A0L.getVisibility() == 0) {
            r2.A0L.setVisibility(8);
        }
    }

    public void A03() {
        if (this.A01 != 0) {
            super.A03();
            return;
        }
        AnonymousClass2DT r1 = (AnonymousClass2DT) this.A00;
        if (r1.A0J()) {
            r1.A0F(false);
        }
    }

    public void A04() {
        if (1 - this.A01 != 0) {
            super.A04();
            return;
        }
        C42821yj r1 = (C42821yj) this.A00;
        r1.A22.invalidateOptionsMenu();
        AnonymousClass1ZQ r12 = r1.A4A;
        if (r12 != null && r12.ACn()) {
            r12.AaG();
        }
    }

    public void A05() {
        if (1 - this.A01 != 0) {
            super.A05();
        } else {
            ((C42821yj) this.A00).A22.invalidateOptionsMenu();
        }
    }
}
