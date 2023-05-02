package X;

import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;

/* renamed from: X.1zh  reason: invalid class name and case insensitive filesystem */
public class C43251zh {
    public int A00 = 1;
    public int A01 = 0;
    public long A02 = -1;
    public long A03 = -1;
    public AnonymousClass211 A04;
    public AnonymousClass21E A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final long A0E;
    public final C31781f1 A0F;
    public final AnonymousClass1OJ A0G;
    public final C16320sq A0H;
    public final boolean A0I;

    public C43251zh(C31781f1 r3, AnonymousClass1OJ r4, C16320sq r5, boolean z2) {
        this.A0H = r5;
        this.A0G = r4;
        this.A0F = r3;
        this.A0I = z2;
        this.A0E = SystemClock.uptimeMillis();
    }

    public synchronized int A00() {
        return this.A01;
    }

    public final void A01() {
        C31781f1 r7 = this.A0F;
        long j2 = this.A02;
        r7.A07 += j2 - this.A0E;
        long j3 = this.A03;
        if (j3 != -1) {
            r7.A08 += j2 - j3;
        }
        this.A0H.Acl(new RunnableRunnableShape10S0100000_I0_9((Object) this, 37));
    }

    public synchronized void A02() {
        this.A03 = SystemClock.uptimeMillis();
    }

    public synchronized void A03(byte b2, int i2, boolean z2) {
        synchronized (this) {
            this.A07 = Integer.valueOf(C42141xI.A00(b2, i2, z2));
            this.A0B = z2;
        }
    }

    public synchronized void A04(int i2) {
        this.A01 = i2;
    }

    public synchronized void A05(AnonymousClass211 r2) {
        this.A04 = r2;
    }

    public synchronized void A06(AnonymousClass21E r2) {
        this.A05 = r2;
    }
}
