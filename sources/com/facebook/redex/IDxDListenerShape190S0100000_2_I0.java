package com.facebook.redex;

import X.AnonymousClass3K2;
import X.C004601z;
import android.view.View;
import android.view.ViewTreeObserver;

public class IDxDListenerShape190S0100000_2_I0 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape190S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static boolean A00(IDxDListenerShape190S0100000_2_I0 iDxDListenerShape190S0100000_2_I0) {
        View view = (View) iDxDListenerShape190S0100000_2_I0.A00;
        AnonymousClass3K2.A10(view, iDxDListenerShape190S0100000_2_I0);
        View findViewById = view.findViewById(16908335);
        if (findViewById != null) {
            C004601z.A0n(findViewById, "statusBar");
        }
        View findViewById2 = view.findViewById(16908336);
        if (findViewById2 == null) {
            return true;
        }
        C004601z.A0n(findViewById2, "navigationBar");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b6, code lost:
        r3 = r4.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x00ae;
                case 2: goto L_0x009f;
                case 3: goto L_0x0095;
                case 4: goto L_0x0071;
                case 5: goto L_0x0055;
                case 6: goto L_0x002d;
                case 7: goto L_0x00f5;
                case 8: goto L_0x0020;
                case 9: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A00
            com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity r1 = (com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity) r1
            android.widget.ScrollView r0 = r1.A05
            X.AnonymousClass3K2.A10(r0, r8)
            r1.A35()
        L_0x0011:
            r0 = 0
            return r0
        L_0x0013:
            java.lang.Object r1 = r8.A00
            com.obwhatsapp.registration.ChangeNumberOverview r1 = (com.obwhatsapp.registration.ChangeNumberOverview) r1
            android.widget.ScrollView r0 = r1.A02
            X.AnonymousClass3K2.A10(r0, r8)
            r1.A35()
            goto L_0x0011
        L_0x0020:
            java.lang.Object r1 = r8.A00
            com.obwhatsapp.registration.ChangeNumber r1 = (com.obwhatsapp.registration.ChangeNumber) r1
            android.widget.ScrollView r0 = r1.A06
            X.AnonymousClass3K2.A10(r0, r8)
            r1.A37()
            goto L_0x0011
        L_0x002d:
            java.lang.Object r2 = r8.A00
            X.29S r2 = (X.AnonymousClass29S) r2
            android.view.View r0 = r2.A0A
            X.AnonymousClass3K2.A10(r0, r8)
            X.4RF r1 = r2.A0c
            android.view.View r0 = r2.A0A
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r1.A00(r0)
            android.location.Location r3 = r2.A02()
            int r5 = r2.A00()
            r4 = 0
            r6 = 0
            r7 = 1
            r2.A0L(r3, r4, r5, r6, r7)
            r2.A0S(r4, r7)
            goto L_0x00f3
        L_0x0055:
            java.lang.Object r2 = r8.A00
            X.29S r2 = (X.AnonymousClass29S) r2
            android.view.View r0 = r2.A0J
            X.AnonymousClass3K2.A10(r0, r8)
            android.view.View r0 = r2.A0J
            int r0 = r0.getHeight()
            r2.A0H(r0)
            r1 = 0
            r2.A0W(r1)
            r0 = 0
            r2.A0R(r0, r1)
            goto L_0x00f3
        L_0x0071:
            java.lang.Object r1 = r8.A00
            X.291 r1 = (X.AnonymousClass291) r1
            android.view.View r0 = r1.A0M
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x00f3
            java.util.List r0 = r1.A1S
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f3
            android.view.View r0 = r1.A0M
            X.AnonymousClass3K2.A10(r0, r8)
            android.view.View r1 = r1.A0M
            int r0 = r1.getHeight()
            float r0 = (float) r0
            r1.setTranslationY(r0)
            goto L_0x00f3
        L_0x0095:
            java.lang.Object r0 = r8.A00
            X.1yj r0 = (X.C42821yj) r0
            X.1Ld r0 = r0.A40
            r0.A05()
            goto L_0x00f3
        L_0x009f:
            java.lang.Object r1 = r8.A00
            X.1VA r1 = (X.AnonymousClass1VA) r1
            android.widget.ListView r0 = r1.ADA()
            X.AnonymousClass3K2.A10(r0, r8)
            r1.A0c()
            goto L_0x00f3
        L_0x00ae:
            java.lang.Object r0 = r8.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r0
            X.266 r4 = r0.A08
            if (r4 == 0) goto L_0x00f3
            android.view.View r3 = r4.A08
            r0 = 2131365991(0x7f0a1067, float:1.8351863E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x00f3
            int[] r2 = r4.A0D
            r0.getLocationOnScreen(r2)
            int[] r1 = r4.A0C
            r3.getLocationOnScreen(r1)
            android.widget.TextView r0 = r4.A04
            float r3 = r0.getX()
            r0 = 0
            r2 = r2[r0]
            r0 = r1[r0]
            int r2 = r2 - r0
            float r1 = (float) r2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            X.AnonymousClass266.A0E = r2
            android.widget.TextView r0 = r4.A04
            r0.setX(r1)
            android.widget.TextView r1 = r4.A05
            int r0 = X.AnonymousClass266.A0E
            float r0 = (float) r0
            r1.setX(r0)
            goto L_0x00f3
        L_0x00ec:
            java.lang.Object r0 = r8.A00
            X.2fk r0 = (X.C53462fk) r0
            r0.A08()
        L_0x00f3:
            r0 = 1
            return r0
        L_0x00f5:
            boolean r0 = A00(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxDListenerShape190S0100000_2_I0.onPreDraw():boolean");
    }
}
