package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass023;
import X.AnonymousClass1K6;
import X.AnonymousClass1Z6;
import X.AnonymousClass5xE;
import X.AnonymousClass5xI;
import X.AnonymousClass5yZ;
import X.AnonymousClass629;
import X.C110115dX;
import X.C115495pq;
import X.C119215wj;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C16830ti;
import X.C16880tn;
import X.C18450wi;
import X.C35251lc;
import X.C797441c;
import android.content.DialogInterface;

public class IDxObserverShape117S0100000_3_I0 implements AnonymousClass023 {
    public Object A00;
    public final int A01;

    public IDxObserverShape117S0100000_3_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AOH(Object obj) {
        Object obj2;
        String string;
        if (this.A01 != 0) {
            AnonymousClass1Z6 r3 = (AnonymousClass1Z6) this.A00;
            DialogInterface dialogInterface = (DialogInterface) obj;
            if (r3 != null) {
                AnonymousClass1K6.A0A(r3.A00.A00.A02, new IDxEWrapperShape176S0100000_3_I1(r3, 0));
            }
            dialogInterface.dismiss();
            return;
        }
        AnonymousClass629 r5 = (AnonymousClass629) this.A00;
        AnonymousClass5xI r12 = (AnonymousClass5xI) obj;
        if (r12 != null && (obj2 = r12.A01) != null) {
            C119215wj r32 = (C119215wj) obj2;
            Boolean bool = r32.A04;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            int i2 = r12.A00;
            if (i2 == 0) {
                if (!booleanValue) {
                    r5.Ac4();
                }
                C16830ti r4 = r32.A03;
                AnonymousClass00B.A06(r4);
                C16880tn r0 = r4.A00;
                AnonymousClass00B.A06(r0);
                C35251lc r33 = r0.A01;
                AnonymousClass00B.A06(r33);
                String str = r33.A07;
                C797441c r2 = C797441c.NONE;
                r5.A0D = str;
                r5.A03.A00 = r4;
                r5.A01(r2, r5.A07.A00(r5.A01, r4));
                r5.A0B = r33.A04(r5.A0H, r33.A05.A03);
            } else if (i2 == 1) {
                if (!booleanValue) {
                    r5.Ac4();
                }
                AnonymousClass5yZ r10 = r32.A01;
                AnonymousClass00B.A06(r10);
                C14530pL r7 = r5.A01;
                String string2 = r7.getString(r10.A01);
                C14530pL r9 = r5.A01;
                String str2 = r5.A0C;
                String AFP = r5.A02.AFP();
                C18450wi.A0H(r9, 0);
                if (C110115dX.A01(r10.A02, C115495pq.A00) == 1) {
                    int i3 = r10.A00;
                    Object[] A1Z = C13690nt.A1Z();
                    A1Z[0] = AFP;
                    string = C13680ns.A0d(r9, str2, A1Z, 1, i3);
                } else {
                    string = r9.getString(r10.A00);
                }
                C18450wi.A0B(string);
                AnonymousClass5xE.A01(r7, new IDxDListenerShape160S0100000_3_I1(r5, 21), string2, string).show();
            } else if (!booleanValue) {
                r5.Afu();
            }
        }
    }
}
