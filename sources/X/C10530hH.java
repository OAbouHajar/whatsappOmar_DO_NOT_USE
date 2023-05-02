package X;

import android.util.SparseArray;
import java.util.Locale;

/* renamed from: X.0hH  reason: invalid class name and case insensitive filesystem */
public class C10530hH implements Runnable {
    public final int A00;
    public final int A01;
    public final C13580mc A02;
    public final C13340ls A03;
    public final /* synthetic */ AnonymousClass0UA A04;

    public C10530hH(C13580mc r1, C13340ls r2, AnonymousClass0UA r3, int i2, int i3) {
        this.A04 = r3;
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i2;
        this.A01 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r4 != null) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(int r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r6 = -1
            r5 = 2
            r4 = 0
            if (r10 == r0) goto L_0x0037
            r7 = 0
            if (r10 != r5) goto L_0x0036
            X.0UA r5 = r8.A04     // Catch:{ RuntimeException -> 0x0021 }
            X.4SM r3 = r5.A03     // Catch:{ RuntimeException -> 0x0021 }
            X.0mc r0 = r8.A02     // Catch:{ RuntimeException -> 0x0021 }
            int r2 = r0.ACr()     // Catch:{ RuntimeException -> 0x0021 }
            int r1 = r0.ACq()     // Catch:{ RuntimeException -> 0x0021 }
            android.graphics.Bitmap$Config r0 = r5.A00     // Catch:{ RuntimeException -> 0x0021 }
            X.0ev r4 = r3.A00(r0, r2, r1)     // Catch:{ RuntimeException -> 0x0021 }
            r5 = -1
            goto L_0x0047
        L_0x0021:
            r5 = move-exception
            java.lang.Class<X.0UA> r3 = X.AnonymousClass0UA.class
            java.lang.String r2 = "Failed to create frame bitmap"
            X.0lv r1 = X.AnonymousClass0X1.A00     // Catch:{ all -> 0x0087 }
            r0 = 5
            boolean r0 = r1.AJ7(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r3.getSimpleName()     // Catch:{ all -> 0x0087 }
            r1.Ai2(r0, r2, r5)     // Catch:{ all -> 0x0087 }
        L_0x0036:
            return r7
        L_0x0037:
            X.0ls r2 = r8.A03     // Catch:{ all -> 0x0087 }
            X.0mc r0 = r8.A02     // Catch:{ all -> 0x0087 }
            int r1 = r0.ACr()     // Catch:{ all -> 0x0087 }
            int r0 = r0.ACq()     // Catch:{ all -> 0x0087 }
            X.0ev r4 = r2.AA5(r9, r1, r0)     // Catch:{ all -> 0x0087 }
        L_0x0047:
            boolean r0 = X.C09110ev.A01(r4)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0078
            X.0UA r7 = r8.A04     // Catch:{ all -> 0x0087 }
            X.0Rn r1 = r7.A02     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r4.A04()     // Catch:{ all -> 0x0087 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r1.A03(r0, r9)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0078
            java.lang.Class<X.0UA> r3 = X.AnonymousClass0UA.class
            java.lang.String r1 = "Frame %d ready."
            int r2 = r8.A00     // Catch:{ all -> 0x0087 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0087 }
            X.AnonymousClass0X1.A02(r3, r0, r1)     // Catch:{ all -> 0x0087 }
            android.util.SparseArray r1 = r7.A01     // Catch:{ all -> 0x0087 }
            monitor-enter(r1)     // Catch:{ all -> 0x0087 }
            X.0ls r0 = r8.A03     // Catch:{ all -> 0x0075 }
            r0.ARc(r4, r2, r10)     // Catch:{ all -> 0x0075 }
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            r0 = 1
            goto L_0x007b
        L_0x0075:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0078:
            r0 = 0
            if (r4 == 0) goto L_0x0080
        L_0x007b:
            r4.close()
            if (r0 != 0) goto L_0x0086
        L_0x0080:
            if (r5 == r6) goto L_0x0086
            boolean r0 = r8.A00(r9, r5)
        L_0x0086:
            return r0
        L_0x0087:
            r0 = move-exception
            if (r4 == 0) goto L_0x008d
            r4.close()
        L_0x008d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10530hH.A00(int, int):boolean");
    }

    public void run() {
        try {
            C13340ls r0 = this.A03;
            int i2 = this.A00;
            if (r0.A6d(i2)) {
                AnonymousClass0X1.A02(AnonymousClass0UA.class, Integer.valueOf(i2), "Frame %d is cached already.");
                SparseArray sparseArray = this.A04.A01;
                synchronized (sparseArray) {
                    sparseArray.remove(this.A01);
                }
                return;
            }
            if (A00(i2, 1)) {
                AnonymousClass0X1.A02(AnonymousClass0UA.class, Integer.valueOf(i2), "Prepared frame frame %d.");
            } else {
                Class<AnonymousClass0UA> cls = AnonymousClass0UA.class;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1M(objArr, i2, 0);
                C13370lv r2 = AnonymousClass0X1.A00;
                if (r2.AJ7(6)) {
                    r2.A8J(cls.getSimpleName(), String.format((Locale) null, "Could not prepare frame %d.", objArr));
                }
            }
            SparseArray sparseArray2 = this.A04.A01;
            synchronized (sparseArray2) {
                sparseArray2.remove(this.A01);
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
    }
}
