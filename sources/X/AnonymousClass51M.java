package X;

import java.lang.ref.WeakReference;

/* renamed from: X.51M  reason: invalid class name */
public final class AnonymousClass51M implements C19550yc {
    public final C17190ug A00;
    public final WeakReference A01;

    public AnonymousClass51M(C17190ug r2, WeakReference weakReference) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
        this.A01 = weakReference;
    }

    public final void A00(String str, boolean z2) {
        String str2 = str;
        C18450wi.A0H(str2, 1);
        C17190ug r8 = this.A00;
        String A02 = r8.A02();
        C18450wi.A0B(A02);
        C35081lL[] r4 = new C35081lL[2];
        r4[0] = new C35081lL("approve", String.valueOf(z2));
        C35081lL.A02("id", str2, r4, 1);
        C28371Vv r5 = new C28371Vv("device_logout", r4);
        C35081lL[] r42 = new C35081lL[5];
        C35081lL.A02("xmlns", "w:account_defence", r42, 0);
        C35081lL.A02("id", A02, r42, 1);
        C35081lL.A02("type", "set", r42, 2);
        r42[3] = new C35081lL("smax_id", 87);
        r42[4] = C35081lL.A00();
        r8.A0A(this, new C28371Vv(r5, "iq", r42), A02, 354, 20000);
    }

    public void APb(String str) {
        AnonymousClass5RQ r1 = (AnonymousClass5RQ) this.A01.get();
        if (r1 != null) {
            r1.AQR(-1);
        }
    }

    public void AQe(C28371Vv r4, String str) {
        C18450wi.A0H(r4, 1);
        C28371Vv A0J = r4.A0J("error");
        int i2 = -2;
        if (A0J != null) {
            i2 = A0J.A0A("code", -2);
        }
        AnonymousClass5RQ r0 = (AnonymousClass5RQ) this.A01.get();
        if (r0 != null) {
            r0.AQR(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r2.A0N("success", "true");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 1
            X.C18450wi.A0H(r4, r0)
            java.lang.String r0 = "device_logout"
            X.1Vv r2 = r4.A0J(r0)
            java.lang.String r1 = "true"
            if (r2 == 0) goto L_0x0039
            java.lang.String r0 = "success"
            java.lang.String r0 = r2.A0N(r0, r1)
            if (r0 == 0) goto L_0x0039
            boolean r2 = r0.equals(r1)
        L_0x001a:
            java.lang.ref.WeakReference r0 = r3.A01
            java.lang.Object r1 = r0.get()
            X.5RQ r1 = (X.AnonymousClass5RQ) r1
            if (r2 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x0031
            com.facebook.redex.IDxRCallbackShape457S0100000_2_I1 r1 = (com.facebook.redex.IDxRCallbackShape457S0100000_2_I1) r1
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "DeviceConfirmationRegAlertDialogFragment/ Successfully sent Do Not Allow IQ"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0031:
            return
        L_0x0032:
            if (r1 == 0) goto L_0x0031
            r0 = -2
            r1.AQR(r0)
            return
        L_0x0039:
            r2 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51M.AYG(X.1Vv, java.lang.String):void");
    }
}
