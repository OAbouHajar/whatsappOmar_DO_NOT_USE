package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.2nj  reason: invalid class name and case insensitive filesystem */
public class C56482nj extends HandlerThread {
    public int A00 = 0;
    public long A01 = -1;
    public Handler A02;
    public C30211bx A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final int A06;
    public final Handler A07;
    public final C16300so A08;
    public final C16440t3 A09;
    public final C16980tz A0A;
    public final C14710pd A0B;
    public final File A0C;
    public final WeakReference A0D;

    public C56482nj(C16300so r4, C16440t3 r5, C16980tz r6, C14710pd r7, AnonymousClass34y r8, File file) {
        super("VoiceStatusPlayerThread");
        this.A0A = r6;
        this.A0B = r7;
        this.A08 = r4;
        this.A09 = r5;
        this.A0C = file;
        this.A0D = C13690nt.A0h(r8);
        this.A07 = AnonymousClass000.A0L();
        this.A06 = 16;
    }

    public final int A00() {
        C30211bx r0 = this.A03;
        if (r0 != null) {
            this.A00 = Math.max(this.A00, r0.A02());
        }
        int i2 = this.A00;
        long j2 = this.A01;
        return j2 != -1 ? (int) (((long) i2) + (SystemClock.elapsedRealtime() - j2)) : i2;
    }

    public final void A01() {
        long j2 = this.A01;
        if (j2 != -1) {
            this.A00 = (int) (((long) this.A00) + (SystemClock.elapsedRealtime() - j2));
            this.A01 = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r3.A05 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r3 = this;
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0009
            boolean r0 = r3.A05
            r1 = 1
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            X.1bx r0 = r3.A03
            if (r0 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x002f
            int r1 = r3.A00()     // Catch:{ IOException -> 0x001f }
            X.1bx r0 = r3.A03     // Catch:{ IOException -> 0x001f }
            r0.A0A(r1)     // Catch:{ IOException -> 0x001f }
            X.1bx r0 = r3.A03     // Catch:{ IOException -> 0x001f }
            r0.A07()     // Catch:{ IOException -> 0x001f }
            return
        L_0x001f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            android.os.Handler r2 = r3.A07
            r1 = 6
            com.facebook.redex.RunnableRunnableShape20S0100000_I1_3 r0 = new com.facebook.redex.RunnableRunnableShape20S0100000_I1_3
            r0.<init>(r3, r1)
            r2.post(r0)
            return
        L_0x002f:
            r0.A04()
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56482nj.A02():void");
    }
}
