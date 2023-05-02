package com.obwhatsapp.payments.pin.actions;

import X.AnonymousClass000;
import X.AnonymousClass1Vo;
import X.AnonymousClass2HJ;
import X.AnonymousClass5wV;
import X.AnonymousClass68X;
import X.C112075hu;
import X.C117915tl;
import X.C14870pt;
import X.C18340wX;
import android.content.Context;

public class IDxHCallbackShape0S1200000_3_I1 extends C112075hu {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxHCallbackShape0S1200000_3_I1(Context context, C14870pt r2, C18340wX r3, AnonymousClass68X r4, AnonymousClass5wV r5, C117915tl r6, String str, int i2) {
        super(context, r2, r3, r4);
        this.A03 = i2;
        this.A00 = r5;
        this.A02 = str;
        this.A01 = r6;
    }

    public void A06(AnonymousClass2HJ r4) {
        int i2 = this.A03;
        AnonymousClass5wV r2 = (AnonymousClass5wV) this.A00;
        AnonymousClass1Vo r1 = r2.A08;
        if (i2 != 0) {
            if (r4 == null) {
                r1.A07("deleteFingerprint success");
                r2.A09.A03();
                return;
            }
            r1.A07(AnonymousClass000.A0g("deleteFingerprint error: ", r4));
            int i3 = r4.A00;
            if (i3 == 1441) {
                r2.A09.A04(this.A02);
                r2.A0A.A02(r4.A02);
                return;
            } else if (!(i3 == 1440 || i3 == 445)) {
                if (i3 == 1448) {
                    r2.A09.A04(this.A02);
                    r2.A07.A03(r4, ((C117915tl) this.A01).A00.A05, "PIN");
                    return;
                }
                return;
            }
        } else if (r4 == null) {
            r1.A07("setFingerprintFromPin success");
        } else {
            r1.A07(AnonymousClass000.A0g("setFingerprintFromPin error: ", r4));
            r2.A09.A03();
            int i4 = r4.A00;
            if (i4 != 1441) {
                if (i4 != 1448) {
                    return;
                }
                r2.A07.A03(r4, ((C117915tl) this.A01).A00.A05, "PIN");
                return;
            }
            r2.A0A.A02(r4.A02);
            return;
        }
        r2.A09.A04(this.A02);
    }
}
