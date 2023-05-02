package X;

import java.io.File;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.18g  reason: invalid class name and case insensitive filesystem */
public class C225218g {
    public static final long A07 = TimeUnit.DAYS.toMillis(5);
    public final C16440t3 A00;
    public final C16980tz A01;
    public final C225118f A02;
    public final C225418i A03;
    public final C17420v3 A04;
    public final Semaphore A05 = new Semaphore(1);
    public volatile File A06 = null;

    public C225218g(C16440t3 r3, C16980tz r4, C225118f r5, C225418i r6, C17420v3 r7) {
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
    }

    public void A00(File file) {
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e2) {
                this.A04.A8d(e2.getMessage());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r0 = r3.listFiles(new com.facebook.redex.IDxFFilterShape3S1000000_2_I0(r5, 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File[] A01(java.lang.String r5) {
        /*
            r4 = this;
            X.0tz r0 = r4.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getCacheDir()
            java.lang.String r0 = "qpl"
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r0)
            boolean r0 = r3.exists()
            r2 = 0
            if (r0 == 0) goto L_0x0022
            r1 = 1
            com.facebook.redex.IDxFFilterShape3S1000000_2_I0 r0 = new com.facebook.redex.IDxFFilterShape3S1000000_2_I0
            r0.<init>(r5, r1)
            java.io.File[] r0 = r3.listFiles(r0)
            if (r0 != 0) goto L_0x0024
        L_0x0022:
            java.io.File[] r0 = new java.io.File[r2]
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C225218g.A01(java.lang.String):java.io.File[]");
    }
}
