package X;

import android.graphics.BitmapFactory;
import android.util.Base64;
import java.util.Arrays;

/* renamed from: X.0tm  reason: invalid class name and case insensitive filesystem */
public class C16870tm {
    public Float A00;
    public boolean A01;
    public boolean A02;
    public byte[] A03;
    public final C16740tZ A04;

    public C16870tm(C16740tZ r3) {
        if (A00(r3.A10)) {
            this.A04 = r3;
            return;
        }
        throw new IllegalStateException("this message should not have a thumbnail");
    }

    public static boolean A00(byte b2) {
        return b2 == 1 || b2 == 3 || b2 == 13 || b2 == 9 || b2 == 5 || b2 == 16 || b2 == 23 || b2 == 37 || b2 == 24 || b2 == 44 || b2 == 20 || b2 == 25 || b2 == 26 || b2 == 28 || b2 == 29 || b2 == 30 || b2 == 42 || b2 == 43 || b2 == 45 || b2 == 52 || b2 == 54 || b2 == 55 || b2 == 57 || b2 == 62 || b2 == 63;
    }

    public synchronized void A01(byte[] bArr) {
        if (!this.A01) {
            this.A03 = bArr;
            this.A01 = true;
        }
    }

    public synchronized void A02(byte[] bArr) {
        A03(bArr, false);
    }

    public synchronized void A03(byte[] bArr, boolean z2) {
        C16750ta r4;
        float f2;
        int i2;
        C16740tZ r5 = this.A04;
        if ((r5 instanceof C16730tY) && (r4 = ((C16730tY) r5).A02) != null) {
            if (bArr != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i3 = options.outWidth;
                if (i3 > 0 && (i2 = options.outHeight) > 0) {
                    f2 = ((float) i2) / ((float) i3);
                    r4.A00 = f2;
                }
            }
            f2 = -1.0f;
            r4.A00 = f2;
        }
        if (z2) {
            r5.A0v(bArr);
            this.A02 = false;
        } else {
            r5.A0v((byte[]) null);
            this.A02 = true;
        }
        this.A00 = null;
        this.A01 = true;
        this.A03 = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A04() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.A01     // Catch:{ all -> 0x0056 }
            r3 = 1
            if (r0 == 0) goto L_0x000b
            byte[] r0 = r4.A03     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0052
        L_0x000b:
            X.0tZ r2 = r4.A04     // Catch:{ all -> 0x0056 }
            int r0 = r2.A03()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r2.A0I()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r2.A0I()     // Catch:{ all -> 0x0056 }
            int r0 = r0.length()     // Catch:{ all -> 0x0056 }
            if (r0 <= 0) goto L_0x0024
            goto L_0x0052
        L_0x0024:
            byte[] r0 = r2.A11()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0032
            byte[] r0 = r2.A11()     // Catch:{ all -> 0x0056 }
            int r0 = r0.length     // Catch:{ all -> 0x0056 }
            if (r0 <= 0) goto L_0x0032
            goto L_0x0052
        L_0x0032:
            boolean r0 = r2 instanceof X.C30901d9     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x003f
            X.1d9 r2 = (X.C30901d9) r2     // Catch:{ all -> 0x0056 }
            int r1 = r2.A02     // Catch:{ all -> 0x0056 }
            r0 = 2
            if (r1 != r0) goto L_0x0051
            goto L_0x0052
        L_0x003f:
            boolean r0 = r2 instanceof X.C16730tY     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0054
            X.0tY r2 = (X.C16730tY) r2     // Catch:{ all -> 0x0056 }
            X.0ta r0 = r2.A02     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0051
            float r1 = r0.A00     // Catch:{ all -> 0x0056 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            monitor-exit(r4)
            return r3
        L_0x0054:
            monitor-exit(r4)
            return r1
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16870tm.A04():boolean");
    }

    public synchronized boolean A05() {
        return this.A01;
    }

    public byte[] A06() {
        byte[] A11;
        String A0I;
        C16740tZ r3 = this.A04;
        if (r3.A03() == 0 && (A0I = r3.A0I()) != null && A0I.length() > 0) {
            try {
                return Base64.decode(r3.A0I(), 0);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (r3.A03() != 1 || (A11 = r3.A11()) == null || A11.length <= 0) {
            return null;
        } else {
            return A11;
        }
    }

    public synchronized byte[] A07() {
        if (this.A01) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("thumbnail not loaded, key=");
            sb.append(this.A04.A11);
            throw new IllegalStateException(sb.toString());
        }
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r2 = 0
            if (r4 == 0) goto L_0x0029
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x0029
            X.0tm r4 = (X.C16870tm) r4
            X.0tZ r0 = r3.A04
            X.1Vw r1 = r0.A11
            X.0tZ r0 = r4.A04
            X.1Vw r0 = r0.A11
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            byte[] r1 = r3.A03
            byte[] r0 = r4.A03
            if (r1 != 0) goto L_0x002a
            if (r0 == 0) goto L_0x0031
        L_0x0029:
            return r2
        L_0x002a:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0031
            return r2
        L_0x0031:
            java.lang.Float r1 = r3.A00
            java.lang.Float r0 = r4.A00
            boolean r0 = X.C34901l3.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16870tm.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04.A11, this.A03, this.A00});
    }
}
