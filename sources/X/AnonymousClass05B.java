package X;

import android.content.Context;

/* renamed from: X.05B  reason: invalid class name */
public class AnonymousClass05B extends C004902d {
    public boolean A00 = true;
    public final C06120Ui A01;
    public final long[] A02;
    public final long[] A03;

    public AnonymousClass05B(Context context) {
        this.A01 = C06120Ui.A00(context);
        this.A02 = new long[8];
        this.A03 = new long[8];
    }

    public static void A00(AnonymousClass04Z r4, long[] jArr, int i2) {
        r4.mobileBytesTx += jArr[i2 | 3];
        r4.mobileBytesRx += jArr[i2 | 2];
        r4.wifiBytesTx += jArr[i2 | 1];
        r4.wifiBytesRx += jArr[i2];
    }

    public /* bridge */ /* synthetic */ C005102f A01() {
        return new AnonymousClass04Z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A02(X.C005102f r12) {
        /*
            r11 = this;
            X.04Z r12 = (X.AnonymousClass04Z) r12
            r10 = r11
            monitor-enter(r10)
            boolean r0 = r11.A00     // Catch:{ all -> 0x0052 }
            r8 = 0
            if (r0 == 0) goto L_0x004f
            X.0Ui r9 = r11.A01     // Catch:{ all -> 0x0052 }
            long[] r7 = r11.A02     // Catch:{ all -> 0x0052 }
            boolean r0 = r9.A02(r7)     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004f
            long[] r6 = r11.A03     // Catch:{ all -> 0x0052 }
            r5 = 0
        L_0x0016:
            int r0 = r7.length     // Catch:{ all -> 0x0052 }
            if (r5 >= r0) goto L_0x002d
            r3 = r7[r5]     // Catch:{ all -> 0x0052 }
            r1 = r6[r5]     // Catch:{ all -> 0x0052 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0028
            java.util.Arrays.toString(r6)     // Catch:{ all -> 0x0052 }
            java.util.Arrays.toString(r7)     // Catch:{ all -> 0x0052 }
            goto L_0x002b
        L_0x0028:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x002b:
            r0 = 0
            goto L_0x0031
        L_0x002d:
            java.lang.System.arraycopy(r7, r8, r6, r8, r0)     // Catch:{ all -> 0x0052 }
            r0 = 1
        L_0x0031:
            r11.A00 = r0     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004f
            boolean r2 = r9.A01()     // Catch:{ all -> 0x0052 }
            r0 = 0
            r12.mobileBytesTx = r0     // Catch:{ all -> 0x0052 }
            r12.mobileBytesRx = r0     // Catch:{ all -> 0x0052 }
            r12.wifiBytesTx = r0     // Catch:{ all -> 0x0052 }
            r12.wifiBytesRx = r0     // Catch:{ all -> 0x0052 }
            A00(r12, r7, r8)     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x004c
            r0 = 4
            A00(r12, r7, r0)     // Catch:{ all -> 0x0052 }
        L_0x004c:
            monitor-exit(r10)
            r0 = 1
            return r0
        L_0x004f:
            monitor-exit(r10)
            r0 = 0
            return r0
        L_0x0052:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05B.A02(X.02f):boolean");
    }
}
