package com.obwhatsapp.payments.ui;

import X.AnonymousClass01J;
import X.AnonymousClass108;
import X.AnonymousClass173;
import X.AnonymousClass17O;
import X.AnonymousClass29T;
import X.AnonymousClass5vX;
import X.AnonymousClass5wV;
import X.AnonymousClass5x7;
import X.AnonymousClass5xG;
import X.AnonymousClass60U;
import X.C110105dW;
import X.C110115dX;
import X.C110675ee;
import X.C111375g5;
import X.C112645ip;
import X.C112865jq;
import X.C118205uJ;
import X.C118335uW;
import X.C118605ux;
import X.C118915vc;
import X.C118955vg;
import X.C119285wq;
import X.C119315wt;
import X.C1200860g;
import X.C14530pL;
import X.C16150sX;
import X.C16460t6;
import X.C17190ug;
import X.C18090w8;
import X.C18320wV;
import X.C49132Rg;
import android.os.Build;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilPaymentCardDetailsActivity extends C112865jq {
    public AnonymousClass173 A00;
    public C17190ug A01;
    public AnonymousClass60U A02;
    public AnonymousClass5x7 A03;
    public C1200860g A04;
    public C119315wt A05;
    public AnonymousClass17O A06;
    public C18090w8 A07;
    public C119285wq A08;
    public AnonymousClass5xG A09;
    public AnonymousClass5wV A0A;
    public C118915vc A0B;
    public AnonymousClass5vX A0C;
    public C118955vg A0D;
    public C110675ee A0E;
    public C118205uJ A0F;
    public boolean A0G;

    public BrazilPaymentCardDetailsActivity() {
        this(0);
    }

    public BrazilPaymentCardDetailsActivity(int i2) {
        this.A0G = false;
        C110105dW.A0t(this, 19);
    }

    public void A1q() {
        if (!this.A0G) {
            this.A0G = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r2 = A0C2.A1s;
            AnonymousClass01J r4 = r2.ARB;
            AnonymousClass01J A022 = C111375g5.A02(r2, this, r4);
            C14530pL.A0b(A0C2, r2, this, C110105dW.A0F(r2));
            C111375g5.A03(r2, this, A022, r4);
            this.A0C = C110115dX.A0V(r2);
            this.A01 = (C16460t6) r2.A5k.get();
            this.A05 = C110115dX.A0O(r2);
            this.A06 = C110115dX.A0P(r2);
            this.A09 = (C118335uW) r2.AGB.get();
            this.A02 = C110115dX.A0J(r2);
            this.A04 = (AnonymousClass108) r2.AHh.get();
            this.A08 = (C18320wV) r2.AIA.get();
            this.A03 = C110115dX.A0M(r2);
            this.A07 = C16150sX.A0z(r2);
            this.A01 = C16150sX.A0t(r2);
            this.A0A = (AnonymousClass5wV) r2.AHi.get();
            this.A03 = (AnonymousClass5x7) r2.A2I.get();
            this.A02 = (AnonymousClass60U) r2.A2G.get();
            this.A0C = (AnonymousClass5vX) r2.A2J.get();
            this.A07 = C16150sX.A10(r2);
            this.A0B = (C118915vc) r2.AHj.get();
            this.A00 = C110115dX.A0D(r2);
            this.A05 = (C119315wt) r2.A2Y.get();
            this.A08 = (C119285wq) r2.AIH.get();
            this.A09 = (AnonymousClass5xG) r2.AHX.get();
            this.A06 = (AnonymousClass17O) r2.AHe.get();
            this.A0F = (C118205uJ) r2.A2a.get();
            this.A0D = (C118955vg) r2.A2T.get();
            this.A04 = A0C2.A0N();
        }
    }

    public void A37() {
        AnonymousClass29T.A01(this, 201);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A38(X.C30671cl r9, boolean r10) {
        /*
            r8 = this;
            super.A38(r9, r10)
            if (r10 == 0) goto L_0x0028
            r0 = 2131365120(0x7f0a0d00, float:1.8350096E38)
            X.C13690nt.A1I(r8, r0)
            X.5dy r1 = new X.5dy
            r1.<init>(r8)
            r8.A0B = r1
            X.1cl r0 = r8.A08
            X.1lr r0 = (X.C35391lr) r0
            r1.setCard(r0)
            r0 = 2131365115(0x7f0a0cfb, float:1.8350086E38)
            android.view.View r2 = r8.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.5dy r1 = r8.A0B
            r0 = 0
            r2.addView(r1, r0)
        L_0x0028:
            X.1tF r4 = r9.A08
            X.1tE r4 = (X.C39891tE) r4
            if (r4 == 0) goto L_0x0107
            X.5dy r0 = r8.A0B
            if (r0 == 0) goto L_0x00c5
            X.5vX r5 = r8.A0C
            X.1cl r3 = r8.A08
            r0 = 2131362597(0x7f0a0325, float:1.834498E38)
            android.widget.ImageView r2 = X.C110115dX.A04(r8, r0)
            android.content.Context r0 = r8.getBaseContext()
            X.5de r1 = new X.5de
            r1.<init>(r0)
            r0 = 1
            r5.A00(r1, r2, r3, r0)
            X.5dy r0 = r8.A0B
            r1 = 8
            r0.setCardNameTextViewVisibility(r1)
            X.5dy r0 = r8.A0B
            r0.setCardNetworkIconVisibility(r1)
            X.5dy r2 = r8.A0B
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131099894(0x7f0600f6, float:1.7812154E38)
            int r0 = r1.getColor(r0)
            r2.setCardNumberTextColor(r0)
            java.lang.String r5 = r4.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00c5
            X.5dy r6 = r8.A0B     // Catch:{ Exception -> 0x00b7 }
            r0 = 0
            char r1 = r5.charAt(r0)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r7 = "Unknown color"
            r0 = 48
            if (r1 != r0) goto L_0x00b2
            r2 = 1
            char r1 = r5.charAt(r2)     // Catch:{ Exception -> 0x00b7 }
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L_0x008c
            char r1 = r5.charAt(r2)     // Catch:{ Exception -> 0x00b7 }
            r0 = 88
            if (r1 != r0) goto L_0x00b2
        L_0x008c:
            r0 = 2
            java.lang.String r1 = r5.substring(r0)     // Catch:{ Exception -> 0x00b7 }
            r0 = 16
            long r2 = java.lang.Long.parseLong(r1, r0)     // Catch:{ Exception -> 0x00b7 }
            int r1 = r5.length()     // Catch:{ Exception -> 0x00b7 }
            r0 = 8
            if (r1 != r0) goto L_0x00a4
            r0 = -16777216(0xffffffffff000000, double:NaN)
            long r2 = r2 | r0
            goto L_0x00ad
        L_0x00a4:
            r0 = 10
            if (r1 == r0) goto L_0x00ad
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r7)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00b6
        L_0x00ad:
            int r0 = (int) r2     // Catch:{ Exception -> 0x00b7 }
            r6.setCardNumberTextColor(r0)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c5
        L_0x00b2:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r7)     // Catch:{ Exception -> 0x00b7 }
        L_0x00b6:
            throw r0     // Catch:{ Exception -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = "PAY: Could not apply label color: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00c5:
            java.lang.String r1 = r4.A0I
            int r0 = r1.hashCode()
            switch(r0) {
                case -1757659853: goto L_0x0190;
                case -591252731: goto L_0x018d;
                case 1124965819: goto L_0x017c;
                case 1925346054: goto L_0x010b;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            r1 = 0
            com.facebook.redex.IDxIFactoryShape26S0100000_3_I1 r0 = new com.facebook.redex.IDxIFactoryShape26S0100000_3_I1
            r0.<init>(r8, r1)
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r0, (X.C001500q) r8)
            java.lang.Class<X.5nG> r0 = X.C114185nG.class
            X.01n r0 = r1.A01(r0)
            X.5ee r0 = (X.C110675ee) r0
            r8.A0E = r0
            X.027 r1 = r0.A03
            r0 = 5
            X.C110105dW.A0x(r8, r1, r0)
            X.5ee r0 = r8.A0E
            X.027 r1 = r0.A00
            r0 = 6
            X.C110105dW.A0x(r8, r1, r0)
            X.5ee r1 = r8.A0E
            boolean r0 = r1 instanceof X.C114195nH
            if (r0 == 0) goto L_0x0108
            X.5nH r1 = (X.C114195nH) r1
            X.027 r1 = r1.A03
        L_0x00fb:
            r0 = 4
            X.C110105dW.A0x(r8, r1, r0)
            X.5ee r0 = r8.A0E
            X.027 r1 = r0.A02
            r0 = 7
            X.C110105dW.A0x(r8, r1, r0)
        L_0x0107:
            return
        L_0x0108:
            X.027 r1 = r1.A01
            goto L_0x00fb
        L_0x010b:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            java.lang.String r1 = r4.A0M
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0140
            r0 = 4
            r8.A3B(r0)
            X.5e9 r0 = r8.A0A
            if (r0 == 0) goto L_0x00ce
            X.0pd r1 = r8.A0C
            r0 = 1927(0x787, float:2.7E-42)
            boolean r1 = r1.A0C(r0)
            X.5e9 r3 = r8.A0A
            X.1cl r0 = r8.A08
            java.lang.String r2 = r0.A0A
            boolean r1 = X.AnonymousClass000.A1O(r1)
            com.facebook.redex.IDxCListenerShape9S1100000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape9S1100000_3_I1
            r0.<init>(r1, r2, r8)
            r3.setAlertButtonClickListener(r0)
            goto L_0x00ce
        L_0x0140:
            boolean r0 = r4.A0a
            if (r0 != 0) goto L_0x014c
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x014c
            r8.A3A()
            goto L_0x00ce
        L_0x014c:
            java.lang.Long r0 = r4.A09
            if (r0 == 0) goto L_0x00ce
            X.0t3 r0 = r8.A05
            long r2 = r0.A00()
            java.lang.Long r0 = r4.A09
            long r0 = r0.longValue()
            int r1 = X.C42681yF.A00(r2, r0)
            r0 = 30
            if (r1 > r0) goto L_0x00ce
            r0 = 2
            r8.A3B(r0)
            java.lang.Long r0 = X.AnonymousClass3K2.A0Z()
            r4.A09 = r0
            X.0wS r0 = r8.A0C
            X.1xv r2 = r0.A01()
            X.1cl r1 = r8.A08
            r0 = 0
            r2.A02(r0, r1)
            goto L_0x00ce
        L_0x017c:
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            r0 = 3
            r8.A3B(r0)
            X.5e9 r1 = r8.A0A
            r0 = 88
            goto L_0x01a0
        L_0x018d:
            java.lang.String r0 = "EXPIRED"
            goto L_0x0192
        L_0x0190:
            java.lang.String r0 = "VOIDED"
        L_0x0192:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            r0 = 0
            r8.A3B(r0)
            X.5e9 r1 = r8.A0A
            r0 = 87
        L_0x01a0:
            if (r1 == 0) goto L_0x00ce
            com.facebook.redex.IDxCListenerShape135S0100000_3_I1 r0 = X.C110115dX.A06(r8, r0)
            r1.setAlertButtonClickListener(r0)
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity.A38(X.1cl, boolean):void");
    }

    public void A39(boolean z2) {
        String A0f = C110105dW.A0f(this.A01, this.A05);
        PinBottomSheetDialogFragment A002 = C118605ux.A00();
        FingerprintBottomSheet A092 = Build.VERSION.SDK_INT >= 23 ? C110115dX.A09() : null;
        C112645ip r8 = new C112645ip(this.A01, this.A05, this.A06, this.A09, A0f, this.A08.A0A);
        C110675ee r1 = this.A0E;
        if (r1 != null) {
            r1.A06(this, A092, r8, A002, A0f, "REMOVEMETHOD", "FB");
        }
    }
}
