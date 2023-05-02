package com.facebook.redex;

import X.AnonymousClass2HJ;
import X.AnonymousClass5wR;
import X.AnonymousClass5wV;
import X.AnonymousClass5xG;
import X.AnonymousClass68X;
import X.C110105dW;
import X.C115125pB;
import X.C117915tl;
import X.C1222268t;
import X.C35081lL;
import android.util.Pair;
import com.obwhatsapp.payments.pin.actions.IDxHCallbackShape0S1200000_3_I1;
import java.security.PublicKey;

public class IDxTCallbackShape44S0300000_3_I1 implements C1222268t {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxTCallbackShape44S0300000_3_I1(AnonymousClass68X r1, AnonymousClass5wV r2, C117915tl r3, int i2) {
        this.A03 = i2;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r1;
    }

    public void AQW(AnonymousClass2HJ r2) {
        ((AnonymousClass68X) this.A01).AWL(r2);
    }

    public void AYC(String str) {
        String str2 = str;
        if (this.A03 != 0) {
            AnonymousClass5wV r11 = (AnonymousClass5wV) this.A00;
            C117915tl r12 = (C117915tl) this.A02;
            String A022 = r11.A09.A02(2);
            AnonymousClass5wR r1 = r11.A01;
            IDxHCallbackShape0S1200000_3_I1 iDxHCallbackShape0S1200000_3_I1 = new IDxHCallbackShape0S1200000_3_I1(r11.A04.A00, r11.A02, r11.A05, (AnonymousClass68X) this.A01, r11, r12, A022, 1);
            byte[] A002 = AnonymousClass5wR.A00(Boolean.TRUE, str2, "DELETEBIO", (String) null, (byte[]) null, new Object[0], C110105dW.A03(r1.A01));
            C35081lL[] r3 = new C35081lL[1];
            C35081lL.A02("action", "delete-payment-bio", r3, 0);
            C117915tl.A00(r12, r1, iDxHCallbackShape0S1200000_3_I1, A002, r3);
            return;
        }
        AnonymousClass5wV r10 = (AnonymousClass5wV) this.A00;
        C117915tl r112 = (C117915tl) this.A02;
        AnonymousClass68X r9 = (AnonymousClass68X) this.A01;
        AnonymousClass5xG r32 = r10.A09;
        try {
            Pair pair = new Pair(r32.A02(2), C115125pB.A00());
            Object obj = pair.second;
            if (obj != null) {
                r10.A08.A07("[Set Touch ID] success");
                AnonymousClass5wR r0 = r10.A01;
                byte[] encoded = ((PublicKey) obj).getEncoded();
                IDxHCallbackShape0S1200000_3_I1 iDxHCallbackShape0S1200000_3_I12 = new IDxHCallbackShape0S1200000_3_I1(r10.A04.A00, r10.A02, r10.A05, r9, r10, r112, (String) pair.first, 0);
                byte[] A003 = AnonymousClass5wR.A00(Boolean.TRUE, str2, "SETBIO", (String) null, encoded, new Object[0], C110105dW.A03(r0.A01));
                C35081lL[] r33 = new C35081lL[1];
                C35081lL.A02("action", "set-payment-bio", r33, 0);
                C117915tl.A00(r112, r0, iDxHCallbackShape0S1200000_3_I12, A003, r33);
                return;
            }
            r10.A08.A07("[Set Touch ID] failure");
        } catch (RuntimeException e2) {
            r32.A02(0);
            throw e2;
        }
    }
}
