package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;

/* renamed from: X.0Ud  reason: invalid class name and case insensitive filesystem */
public class C06080Ud {
    public Location A00;
    public C04630Nh A01;
    public C06080Ud A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C008003r A06;

    public C06080Ud(Context context) {
        C008003r r1;
        this.A05 = context;
        try {
            C007903q.A00(context);
            r1 = C007903q.A00.A6l();
        } catch (C11100iC unused) {
            AnonymousClass0V3.A07.A02();
            r1 = new C08750eF(this);
            this.A04 = false;
            this.A03 = false;
        }
        this.A06 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r1 <= 200) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.location.Location r7, android.location.Location r8) {
        /*
            r6 = 0
            if (r7 == 0) goto L_0x0055
            r5 = 1
            if (r8 == 0) goto L_0x004f
            long r3 = r7.getTime()
            long r0 = r8.getTime()
            long r3 = r3 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004f
            r1 = -120000(0xfffffffffffe2b40, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1Q(r0)
            float r1 = r7.getAccuracy()
            float r0 = r8.getAccuracy()
            float r1 = r1 - r0
            int r1 = (int) r1
            r3 = 1
            if (r1 <= 0) goto L_0x0038
            r3 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r2 = 1
            if (r1 > r0) goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            java.lang.String r1 = r7.getProvider()
            java.lang.String r0 = r8.getProvider()
            if (r1 != 0) goto L_0x0050
            boolean r0 = X.AnonymousClass000.A1W(r0)
        L_0x0047:
            if (r3 != 0) goto L_0x004f
            if (r4 == 0) goto L_0x0055
            if (r2 != 0) goto L_0x0055
            if (r0 == 0) goto L_0x0055
        L_0x004f:
            return r5
        L_0x0050:
            boolean r0 = r1.equals(r0)
            goto L_0x0047
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06080Ud.A00(android.location.Location, android.location.Location):boolean");
    }

    public void A01(boolean z2) {
        if (this.A02 == null) {
            this.A02 = this;
        }
        this.A04 = z2;
        if (z2 && Build.VERSION.SDK_INT >= 23) {
            Context context = this.A05;
            if (!(context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)) {
                synchronized (AnonymousClass0V3.A0I) {
                }
                return;
            }
        }
        boolean z3 = this.A04;
        C06080Ud r5 = this.A02;
        if (!z3) {
            r5.A03 = false;
            r5.A06.AhD();
        } else if (!r5.A03) {
            r5.A03 = true;
            Location location = r5.A00;
            C008003r r6 = r5.A06;
            Location ABN = r6.ABN();
            if (A00(ABN, location)) {
                location = ABN;
            }
            if (location == null || System.currentTimeMillis() - location.getTime() >= -1389934592) {
                r5.A00 = null;
            } else {
                r5.A00 = location;
                C04630Nh r0 = r5.A01;
                if (r0 != null) {
                    r0.A00.A0R.invalidate();
                }
            }
            r6.Abd(r5, C06080Ud.class.getName());
        }
    }
}
