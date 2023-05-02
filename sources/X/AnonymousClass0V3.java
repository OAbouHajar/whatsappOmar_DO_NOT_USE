package X;

import java.util.Random;

/* renamed from: X.0V3  reason: invalid class name */
public class AnonymousClass0V3 {
    public static final AnonymousClass0V3 A06 = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A07 = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A08 = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A09 = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A0A = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A0B = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A0C;
    public static final AnonymousClass0V3 A0D;
    public static final AnonymousClass0V3 A0E;
    public static final AnonymousClass0V3 A0F = new AnonymousClass0V3(false);
    public static final AnonymousClass0V3 A0G;
    public static final AnonymousClass0V3 A0H;
    public static final AnonymousClass0V3 A0I = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A0J = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A0K = new AnonymousClass0V3(true);
    public static final AnonymousClass0V3 A0L;
    public static final AnonymousClass0V3 A0M;
    public static final AnonymousClass0V3 A0N = new AnonymousClass0V3(false);
    public static final AnonymousClass0V3 A0O;
    public static final Random A0P = new Random();
    public static final AnonymousClass0V3[] A0Q;
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public long[] A04;
    public final boolean A05;

    static {
        AnonymousClass0V3 r10 = new AnonymousClass0V3(false);
        A0C = r10;
        AnonymousClass0V3 r9 = new AnonymousClass0V3(false);
        A0E = r9;
        AnonymousClass0V3 r8 = new AnonymousClass0V3(true);
        A0M = r8;
        AnonymousClass0V3 r7 = new AnonymousClass0V3(true);
        A0L = r7;
        AnonymousClass0V3 r6 = new AnonymousClass0V3(true);
        A0O = r6;
        AnonymousClass0V3 r5 = new AnonymousClass0V3(false);
        A0G = r5;
        AnonymousClass0V3 r4 = new AnonymousClass0V3(false);
        A0H = r4;
        AnonymousClass0V3 r2 = new AnonymousClass0V3(false);
        A0D = r2;
        AnonymousClass0V3[] r1 = new AnonymousClass0V3[8];
        r1[0] = r10;
        r1[1] = r9;
        r1[2] = r8;
        r1[3] = r7;
        AnonymousClass000.A18(r6, r5, r4, r2, r1);
        A0Q = r1;
    }

    public AnonymousClass0V3(boolean z2) {
        A00(this);
        this.A05 = z2;
    }

    public static void A00(AnonymousClass0V3 r2) {
        r2.A01 = Long.MIN_VALUE;
        r2.A02 = Long.MAX_VALUE;
        r2.A03 = 0;
    }

    public static void A01(AnonymousClass0V3 r2, long j2) {
        r2.A04(System.nanoTime() - j2);
    }

    public void A02() {
        synchronized (this) {
        }
    }

    public void A03() {
        if (this.A05) {
            synchronized (this) {
                A00(this);
                this.A00 = 0;
            }
            return;
        }
        A00(this);
        this.A00 = 0;
    }

    public void A04(long j2) {
        if (this.A05) {
            synchronized (this) {
                A05(j2);
            }
            return;
        }
        A05(j2);
    }

    public final void A05(long j2) {
        long[] jArr = this.A04;
        if (jArr == null) {
            jArr = new long[256];
            this.A04 = jArr;
        }
        long j3 = this.A01;
        if (j3 <= j2) {
            j3 = j2;
        }
        this.A01 = j3;
        long j4 = this.A02;
        if (j4 >= j2) {
            j4 = j2;
        }
        this.A02 = j4;
        this.A03 += j2;
        int i2 = this.A00;
        if (i2 < 256) {
            jArr[i2] = j2;
        } else {
            int nextInt = A0P.nextInt(i2 + 1);
            if (nextInt < 256) {
                jArr[nextInt] = j2;
            }
        }
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 == 256) {
            A03();
        }
    }
}
