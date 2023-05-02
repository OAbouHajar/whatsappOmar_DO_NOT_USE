package com.obwhatsapp.businessdirectory.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass02H;
import X.AnonymousClass26A;
import X.AnonymousClass26B;
import X.AnonymousClass3F7;
import X.AnonymousClass3FI;
import X.AnonymousClass5P3;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C17180uf;
import X.C17210ui;
import X.C18170wG;
import X.C25641Ko;
import X.C29091a1;
import X.C29111a3;
import X.C29121a4;
import X.C29131a5;
import X.C29141a6;
import X.C30801cy;
import X.C31241dn;
import X.C71933lI;
import X.C72023lR;
import X.C72123lb;
import X.C72153le;
import X.C72173lg;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;

public class BusinessDirectoryConsumerHomeViewModel extends AnonymousClass02H implements C29091a1, C29111a3, C29121a4, C29131a5, C29141a6 {
    public C31241dn A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass028 A03;
    public final AnonymousClass026 A04;
    public final C17180uf A05;
    public final C17210ui A06;
    public final C25641Ko A07;
    public final C18170wG A08;
    public final AnonymousClass3FI A09;
    public final AnonymousClass3F7 A0A;
    public final C30801cy A0B;
    public final C30801cy A0C = C30801cy.A01();
    public final C30801cy A0D;

    public BusinessDirectoryConsumerHomeViewModel(Application application, C17180uf r6, C17210ui r7, C25641Ko r8, C18170wG r9, AnonymousClass3FI r10, AnonymousClass5P3 r11) {
        super(application);
        this.A05 = r6;
        AnonymousClass026 r3 = new AnonymousClass026();
        this.A04 = r3;
        this.A0D = C30801cy.A01();
        this.A0B = C30801cy.A01();
        this.A07 = r8;
        this.A08 = r9;
        this.A06 = r7;
        this.A01 = r6.A0A();
        AnonymousClass3F7 A6x = r11.A6x(this, this);
        this.A0A = A6x;
        this.A09 = r10;
        AnonymousClass027 r1 = r10.A01;
        this.A03 = r1;
        this.A02 = true;
        C13700nu.A0U(r1, r3, this, 12);
        C13700nu.A0U(A6x.A00, r3, this, 11);
    }

    public void A04() {
        AnonymousClass3F7 r2 = this.A0A;
        AnonymousClass26A r0 = r2.A00;
        r0.A02.removeCallbacks(r0.A09);
        r2.A05.A00();
        r2.A01 = null;
        this.A09.A04.A08 = null;
    }

    public final List A05() {
        ArrayList A0u = AnonymousClass000.A0u();
        if (!this.A05.A08()) {
            A0u.add(new C72153le(true));
        } else {
            A0u.add(new C72123lb(true));
        }
        A0u.add(new C71933lI());
        return A0u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r8 = this;
            X.3F7 r0 = r8.A0A
            X.26A r2 = r0.A00
            X.26B r0 = r2.A01
            int r1 = r2.A00
            if (r0 == 0) goto L_0x005d
            r0 = 2
            if (r1 == r0) goto L_0x0012
            if (r1 == 0) goto L_0x0012
            r0 = 7
            if (r1 != r0) goto L_0x005d
        L_0x0012:
            java.util.List r0 = r8.A05()
            r8.A08(r0)
            X.3FI r5 = r8.A09
            boolean r4 = r8.A02
            X.26B r0 = r2.A01
            r5.A00 = r0
            r2 = 1
            if (r4 != 0) goto L_0x005e
            java.util.Map r6 = r5.A09
            java.lang.Object r1 = X.AnonymousClass000.A0Y(r6, r2)
            X.4HK r1 = (X.AnonymousClass4HK) r1
            if (r1 == 0) goto L_0x005e
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x005e
            int r1 = r1.A00
            r0 = 2
            if (r1 == r0) goto L_0x005e
            r5.A02()
        L_0x003a:
            X.0pd r7 = r5.A08
            r0 = 1890(0x762, float:2.648E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r0 = r7.A0E(r3, r0)
            if (r0 == 0) goto L_0x005d
            r2 = 0
            if (r4 != 0) goto L_0x0074
            java.lang.Object r1 = X.AnonymousClass000.A0Y(r6, r2)
            X.4HK r1 = (X.AnonymousClass4HK) r1
            if (r1 == 0) goto L_0x0074
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x0074
            int r1 = r1.A00
            r0 = 2
            if (r1 == r0) goto L_0x0074
            r5.A02()
        L_0x005d:
            return
        L_0x005e:
            java.util.Map r6 = r5.A09
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.4HK r0 = new X.4HK
            r0.<init>()
            r6.put(r1, r0)
            X.2Z2 r1 = r5.A04
            X.26B r0 = r5.A00
            r1.A05(r0)
            goto L_0x003a
        L_0x0074:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4 = 0
            X.4HK r0 = new X.4HK
            r0.<init>()
            r6.put(r1, r0)
            X.26B r0 = r5.A00
            boolean r0 = X.AnonymousClass3FI.A00(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 1895(0x767, float:2.655E-42)
            int r3 = r7.A03(r3, r0)
            X.2Z2 r2 = r5.A04
            X.26B r1 = r5.A00
            X.4HF r0 = new X.4HF
            r0.<init>(r3, r4)
            r2.A03(r0, r4, r1, r4)
            return
        L_0x009c:
            r5.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel.A06():void");
    }

    public final void A07() {
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(new C72023lR(this, 2));
        A08(A0u);
        this.A06.A0A(AnonymousClass3F7.A00(this.A0A), 28, 2);
    }

    public final void A08(List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        if (this.A05.A0A()) {
            A0u.add(new C72173lg(this));
        }
        ArrayList A0u2 = AnonymousClass000.A0u();
        AnonymousClass26A r1 = this.A0A.A00;
        if (r1.A01() != null && r1.A00 == 4) {
            A0u2.addAll(this.A09.A01());
        }
        A0u.addAll(A0u2);
        A0u.addAll(list);
        this.A04.A09(A0u);
    }

    public void AMP() {
        C13680ns.A1P(this.A0B, 3);
    }

    public void AOG() {
        this.A0A.A03();
        C30801cy r2 = this.A0C;
        AnonymousClass26B A002 = this.A07.A00();
        if (A002 == null) {
            A002 = this.A08.A00();
        }
        r2.A0B(C13690nt.A0I(7, A002));
    }

    public void AOT(int i2) {
        C30801cy r2;
        int i3;
        if (i2 == 0 || i2 == 7 || i2 == 6) {
            this.A06.A0A(AnonymousClass3F7.A00(this.A0A), 29, 0);
            r2 = this.A0C;
            i3 = 8;
        } else if (i2 == 3) {
            this.A06.A0A(AnonymousClass3F7.A00(this.A0A), 29, 3);
            r2 = this.A0C;
            i3 = 5;
        } else {
            return;
        }
        Integer valueOf = Integer.valueOf(i3);
        AnonymousClass26B A002 = this.A07.A00();
        if (A002 == null) {
            A002 = this.A08.A00();
        }
        r2.A09(C13690nt.A0I(valueOf, A002));
    }

    public void AOV() {
    }

    public void ASA(int i2) {
        A07();
    }

    public void AT5() {
        C13680ns.A1O(this.A0D, 10);
    }

    public void ATA() {
        C13680ns.A1P(this.A0B, 0);
        this.A06.A0A(AnonymousClass3F7.A00(this.A0A), 34, 0);
    }

    public void ATn() {
        AOG();
    }

    public void AWa() {
        AnonymousClass3F7 r2 = this.A0A;
        r2.A02 = true;
        r2.A06();
        C13680ns.A1P(this.A0B, 1);
        this.A06.A0A(AnonymousClass3F7.A00(r2), 31, 0);
    }

    public void AWb() {
        A06();
    }

    public void AWr() {
        C13680ns.A1P(this.A0D, 8);
    }
}
