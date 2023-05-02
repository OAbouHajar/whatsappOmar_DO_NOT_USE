package X;

import android.content.Context;
import android.os.Build;
import com.obwhatsapp.R;

/* renamed from: X.4bo  reason: invalid class name and case insensitive filesystem */
public class C89234bo {
    public static final int[] A03 = (Build.VERSION.SDK_INT >= 29 ? new int[]{R.string.str15d1, R.string.str15d2, R.string.str15cf} : new int[]{R.string.str15d2, R.string.str15cf});
    public final Context A00;
    public final C15860rz A01;
    public final AnonymousClass013 A02;

    public C89234bo(Context context, C15860rz r2, AnonymousClass013 r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r4 != 2) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r4 != 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r7 = this;
            android.content.Context r6 = r7.A00
            int[] r5 = A03
            X.0rz r0 = r7.A01
            int r4 = r0.A0A()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r1 = 2
            r0 = 29
            if (r3 < r0) goto L_0x001f
            if (r4 == r2) goto L_0x0022
            r0 = 2
            if (r4 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r0 = r5[r0]
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x001f:
            if (r4 == r1) goto L_0x0022
            goto L_0x0017
        L_0x0022:
            r0 = 1
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89234bo.A00():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r5 != 2) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r5 != 2) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C14550pN r7) {
        /*
            r6 = this;
            X.0rz r0 = r6.A01
            int r5 = r0.A0A()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r1 = 2
            r0 = 29
            if (r3 < r0) goto L_0x0030
            if (r5 == r2) goto L_0x0033
            r4 = 2
            if (r5 == r1) goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            X.013 r1 = r6.A02
            int[] r0 = A03
            java.lang.String[] r3 = r1.A0U(r0)
            r2 = 2
            r0 = 2131891664(0x7f1215d0, float:1.9418054E38)
            com.obwhatsapp.SingleSelectionDialogFragment r1 = new com.obwhatsapp.SingleSelectionDialogFragment
            r1.<init>()
            android.os.Bundle r0 = com.obwhatsapp.SingleSelectionDialogFragment.A01(r3, r2, r4, r0)
            r1.A0T(r0)
            r7.Afc(r1)
            return
        L_0x0030:
            if (r5 == r1) goto L_0x0033
            goto L_0x0013
        L_0x0033:
            r4 = 1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89234bo.A01(X.0pN):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r7 != 1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(int r7) {
        /*
            r6 = this;
            X.0rz r5 = r6.A01
            int r4 = r5.A0A()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 2
            r1 = 1
            r0 = 29
            if (r3 < r0) goto L_0x0023
            if (r7 == r1) goto L_0x0025
            if (r7 == r2) goto L_0x0013
            r2 = -1
        L_0x0013:
            if (r4 == r2) goto L_0x0027
            android.content.SharedPreferences$Editor r1 = r5.A0K()
            java.lang.String r0 = "night_mode"
            X.C13680ns.A0w(r1, r0, r2)
            X.C004301w.A00(r2)
            r0 = 1
            return r0
        L_0x0023:
            if (r7 == r1) goto L_0x0013
        L_0x0025:
            r2 = 1
            goto L_0x0013
        L_0x0027:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89234bo.A02(int):boolean");
    }
}
