package X;

import android.os.Build;
import java.util.Date;

/* renamed from: X.0xR  reason: invalid class name and case insensitive filesystem */
public class C18900xR {
    public Date A00;
    public boolean A01;
    public final C16040sK A02;
    public final C15860rz A03;

    public C18900xR(C16040sK r1, C15860rz r2) {
        this.A02 = r1;
        this.A03 = r2;
    }

    public static boolean A00() {
        return "chromium".equals(Build.MANUFACTURER) && "chromium".equals(Build.BRAND);
    }

    public Date A01() {
        return new Date(Long.valueOf("1689829200000").longValue());
    }

    public boolean A02() {
        if (this.A01) {
            return true;
        }
        boolean after = new Date().after(A01());
        this.A01 = after;
        return after;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r4.after(new java.util.Date(A01().getTime() + 31536000000L));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r5 = this;
            java.util.Date r0 = r5.A00
            r3 = 1
            if (r0 != 0) goto L_0x0035
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            r1 = 1673803129000(0x185b670e0a8, double:8.269686239405E-312)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            boolean r0 = r4.before(r0)
            if (r0 != 0) goto L_0x0033
            java.util.Date r0 = r5.A01()
            long r2 = r0.getTime()
            r0 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            long r2 = r2 + r0
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            boolean r3 = r4.after(r0)
            if (r3 == 0) goto L_0x0035
        L_0x0033:
            r5.A00 = r4
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18900xR.A03():boolean");
    }
}
