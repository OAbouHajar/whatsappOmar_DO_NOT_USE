package com.obwhatsapp.calling.controls.viewmodel;

import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.AnonymousClass2OJ;
import X.AnonymousClass3AY;
import X.AnonymousClass46B;
import X.C13690nt;
import X.C14710pd;
import X.C15860rz;
import X.C30341cC;
import X.C32001fU;
import X.C448926b;
import X.C49562Tu;
import X.C49872Wg;
import java.util.Iterator;

public class BottomSheetViewModel extends C49562Tu {
    public C49872Wg A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass027 A03 = C13690nt.A0O();
    public final AnonymousClass027 A04 = C13690nt.A0O();
    public final AnonymousClass027 A05 = C13690nt.A0O();
    public final AnonymousClass027 A06 = C13690nt.A0O();
    public final C448926b A07;
    public final AnonymousClass01V A08;
    public final C15860rz A09;
    public final C14710pd A0A;
    public final AnonymousClass2OJ A0B;
    public final AnonymousClass2OJ A0C;
    public final boolean A0D;

    public BottomSheetViewModel(C448926b r3, AnonymousClass01V r4, C15860rz r5, C14710pd r6, boolean z2) {
        Boolean bool = Boolean.FALSE;
        this.A0B = new AnonymousClass2OJ(bool);
        this.A0C = new AnonymousClass2OJ(bool);
        this.A0A = r6;
        this.A07 = r3;
        this.A08 = r4;
        this.A09 = r5;
        this.A0D = z2;
        r3.A02(this);
        A06(r3.A04());
    }

    public void A04() {
        this.A07.A03(this);
    }

    public final boolean A07(AnonymousClass3AY r7) {
        C15860rz r5 = this.A09;
        C14710pd r4 = this.A0A;
        Iterator it = r7.A01.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((C32001fU) it.next()).A01 == 1) {
                i2++;
            }
        }
        return C30341cC.A0N(r5, r4, i2, this.A0D);
    }

    public final boolean A08(AnonymousClass3AY r4, boolean z2) {
        C49872Wg r0 = this.A00;
        if (r0 == null || r0.A00 != 2) {
            if (!AnonymousClass46B.A00(r4, z2) || !r4.A0C) {
                return !r4.A0B && !this.A01;
            }
            return true;
        }
    }
}
