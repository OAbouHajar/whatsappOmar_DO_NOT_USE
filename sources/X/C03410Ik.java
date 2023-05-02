package X;

import android.os.Looper;

/* renamed from: X.0Ik  reason: invalid class name and case insensitive filesystem */
public class C03410Ik extends C10670hV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass0IX A04;
    public final /* synthetic */ AnonymousClass0WN A05;

    public C03410Ik(AnonymousClass0IX r1, AnonymousClass0WN r2, int i2, int i3, int i4, int i5) {
        this.A04 = r1;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i5;
        this.A05 = r2;
    }

    public void A00() {
        AnonymousClass0WN r2 = this.A05;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            r2.A0B = 0;
            if (r2.A07 == null && r2.A08 == null) {
                r2.A02();
                return;
            }
            return;
        }
        AnonymousClass0X2.A02.post(r2.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r2 != null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            X.0IX r0 = r6.A04
            int r5 = r6.A01
            int r4 = r6.A02
            int r3 = r6.A03
            X.0WN r2 = r0.A0E(r5, r4, r3)
            X.0WN r0 = X.C13460m4.A00
            if (r2 == r0) goto L_0x0024
            r0 = 0
            if (r2 == 0) goto L_0x0019
        L_0x0013:
            r2.A02 = r5
            r2.A03 = r4
            r2.A04 = r3
        L_0x0019:
            X.0Ij r1 = new X.0Ij
            r1.<init>(r6, r2, r0)
            android.os.Handler r0 = X.AnonymousClass0X2.A02
            r0.post(r1)
            return
        L_0x0024:
            int r1 = r2.A01
            int r0 = r2.A00
            X.0WN r2 = new X.0WN
            r2.<init>(r1, r0)
            android.graphics.Bitmap r1 = X.AnonymousClass0WN.A0F
            monitor-enter(r2)
            android.graphics.Bitmap r0 = r2.A05     // Catch:{ all -> 0x003c }
            if (r0 == r1) goto L_0x0037
            r2.A03()     // Catch:{ all -> 0x003c }
        L_0x0037:
            r2.A05 = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            r0 = 1
            goto L_0x0013
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410Ik.run():void");
    }
}
