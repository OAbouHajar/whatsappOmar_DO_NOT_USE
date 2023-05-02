package com.obwhatsapp.permissions;

import X.C15860rz;
import X.C16440t3;
import X.C16490t9;
import X.C18450wi;
import X.C74433qX;
import android.content.DialogInterface;

public final class NotificationPermissionBottomSheet extends Hilt_NotificationPermissionBottomSheet {
    public C16440t3 A00;
    public C15860rz A01;
    public C16490t9 A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005c, code lost:
        if (r1 != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r6, android.view.View r7) {
        /*
            r5 = this;
            r4 = 0
            X.C18450wi.A0H(r7, r4)
            super.A18(r6, r7)
            r0 = 2131365286(0x7f0a0da6, float:1.8350433E38)
            android.view.View r2 = r7.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r7.getContext()
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r2.setTextColor(r0)
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167183(0x7f0707cf, float:1.7948632E38)
            float r0 = r1.getDimension(r0)
            r2.setTextSize(r4, r0)
            r0 = 2131366502(0x7f0a1266, float:1.83529E38)
            android.view.View r2 = X.C004601z.A0E(r7, r0)
            X.C18450wi.A0B(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r0 = r2.getContext()
            X.C18450wi.A0B(r0)
            boolean r0 = X.C16260sj.A01(r0)
            if (r0 == 0) goto L_0x005e
            X.0rz r0 = r5.A01
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            X.01D r0 = r0.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            boolean r1 = r0.getBoolean(r1, r4)
            r0 = 2131888014(0x7f12078e, float:1.9410651E38)
            if (r1 == 0) goto L_0x0061
        L_0x005e:
            r0 = 2131890637(0x7f1211cd, float:1.9415971E38)
        L_0x0061:
            r2.setText(r0)
            r1 = 20
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            r0 = 2131362567(0x7f0a0307, float:1.8344918E38)
            android.view.View r2 = X.C004601z.A0E(r7, r0)
            X.C18450wi.A0B(r2)
            r1 = 19
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            X.0rz r1 = r5.A01
            X.0t3 r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            long r2 = r0.A00()
            X.01D r0 = r1.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "notification_nag_last_shown_time_key"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            X.0rz r3 = r5.A01
            X.01D r0 = r3.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r2 = "notification_nag_count_key"
            int r0 = r0.getInt(r2, r4)
            int r1 = r0 + 1
            X.01D r0 = r3.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            r0.apply()
            r5.A1N(r4)
            return
        L_0x00ca:
            java.lang.String r0 = "time"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.permissions.NotificationPermissionBottomSheet.A18(android.os.Bundle, android.view.View):void");
    }

    public final void A1N(int i2) {
        C74433qX r1 = new C74433qX();
        r1.A00 = Integer.valueOf(i2);
        C16490t9 r0 = this.A02;
        if (r0 != null) {
            r0.A06(r1);
        } else {
            C18450wi.A0O("wamRuntime");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1N(1);
        A1D();
    }
}
