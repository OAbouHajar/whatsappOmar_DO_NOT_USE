package com.obwhatsapp.businessdirectory.viewmodel;

import X.AnonymousClass027;
import X.AnonymousClass02H;
import X.AnonymousClass5ST;
import X.C13680ns;
import X.C13690nt;
import X.C16260sj;
import X.C16980tz;
import X.C17180uf;
import X.C17210ui;
import X.C25511Kb;
import X.C25641Ko;
import X.C30801cy;

public class LocationOptionPickerViewModel extends AnonymousClass02H implements AnonymousClass5ST {
    public final AnonymousClass027 A00 = C13690nt.A0O();
    public final C17180uf A01;
    public final C17210ui A02;
    public final C25511Kb A03;
    public final C25641Ko A04;
    public final C16980tz A05;
    public final C16260sj A06;
    public final C30801cy A07 = C30801cy.A01();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        if (((android.location.LocationManager) r4.A05.A00.getSystemService("location")).isProviderEnabled("gps") == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationOptionPickerViewModel(android.app.Application r5, X.C17180uf r6, X.C17210ui r7, X.C25511Kb r8, X.C25641Ko r9, X.C16980tz r10, X.C16260sj r11) {
        /*
            r4 = this;
            r4.<init>(r5)
            X.1cy r0 = X.C30801cy.A01()
            r4.A07 = r0
            X.027 r0 = X.C13690nt.A0O()
            r4.A00 = r0
            r4.A05 = r10
            r4.A02 = r7
            r4.A06 = r11
            r4.A01 = r6
            r4.A04 = r9
            r4.A03 = r8
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            X.3lv r3 = new X.3lv
            r3.<init>(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x004d
            boolean r0 = r11.A05()
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r11.A03(r0)
            if (r0 == 0) goto L_0x004d
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            r1 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            r3.A00 = r1
            r2.add(r3)
            X.3lu r0 = new X.3lu
            r0.<init>(r4)
            r2.add(r0)
            X.027 r0 = r4.A00
            r0.A09(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel.<init>(android.app.Application, X.0uf, X.0ui, X.1Kb, X.1Ko, X.0tz, X.0sj):void");
    }

    public final void A05() {
        if (this.A06.A05()) {
            this.A03.A00();
            C13680ns.A1O(this.A07, 2);
            return;
        }
        this.A07.A09(C13680ns.A0Y());
    }

    public void AT6() {
        this.A02.A03(3, 1);
        this.A03.A03(true);
        A05();
    }

    public void AT7() {
        AT8();
    }

    public void AT8() {
        this.A02.A03(4, 1);
    }
}
