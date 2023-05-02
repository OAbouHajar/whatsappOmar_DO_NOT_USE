package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.1BU  reason: invalid class name */
public final class AnonymousClass1BU {
    public C35541m6 A00;
    public final C14710pd A01;

    public AnonymousClass1BU(C14710pd r2) {
        C18450wi.A0H(r2, 1);
        this.A01 = r2;
    }

    public final C35541m6 A00(Bundle bundle) {
        C18450wi.A0H(bundle, 0);
        return bundle.getBoolean("persisted_status_distribution_key", false) ? this.A00 : (C35541m6) bundle.getParcelable("status_distribution");
    }

    public final void A01(Intent intent, C35541m6 r4) {
        if (A03(r4)) {
            intent.putExtra("status_distribution", r4);
            return;
        }
        this.A00 = r4;
        intent.putExtra("persisted_status_distribution_key", true);
    }

    public final void A02(Bundle bundle, C35541m6 r4) {
        C18450wi.A0H(bundle, 0);
        if (A03(r4)) {
            bundle.putParcelable("status_distribution", r4);
            return;
        }
        this.A00 = r4;
        bundle.putBoolean("persisted_status_distribution_key", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.A03(r1, 2467);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C35541m6 r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L_0x0025
            X.0pd r2 = r4.A01
            X.0tM r1 = X.C16620tM.A01
            r0 = 2469(0x9a5, float:3.46E-42)
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2467(0x9a3, float:3.457E-42)
            int r2 = r2.A03(r1, r0)
            java.util.List r0 = r5.A01
            int r1 = r0.size()
            java.util.List r0 = r5.A02
            int r0 = r0.size()
            int r1 = r1 + r0
            if (r1 <= r2) goto L_0x0025
            r3 = 0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BU.A03(X.1m6):boolean");
    }
}
