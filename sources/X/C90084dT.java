package X;

import java.nio.ByteBuffer;

/* renamed from: X.4dT  reason: invalid class name and case insensitive filesystem */
public class C90084dT {
    public long A00;
    public C85064My A01;
    public C85064My A02;
    public C85064My A03;
    public final int A04;
    public final AnonymousClass5RB A05;
    public final C90504eH A06 = C90504eH.A05(32);

    public C90084dT(AnonymousClass5RB r5) {
        this.A05 = r5;
        int i2 = ((C97574qD) r5).A04;
        this.A04 = i2;
        C85064My r0 = new C85064My(0, i2);
        this.A01 = r0;
        this.A02 = r0;
        this.A03 = r0;
    }

    public static C85064My A00(C85064My r8, ByteBuffer byteBuffer, int i2, long j2) {
        while (j2 >= r8.A03) {
            r8 = r8.A00;
        }
        while (i2 > 0) {
            long j3 = r8.A03;
            int min = Math.min(i2, (int) (j3 - j2));
            byteBuffer.put(r8.A01.A00, (int) (j2 - r8.A04), min);
            i2 -= min;
            j2 += (long) min;
            if (j2 == j3) {
                r8 = r8.A00;
            }
        }
        return r8;
    }

    public static C85064My A01(C85064My r9, byte[] bArr, int i2, long j2) {
        while (j2 >= r9.A03) {
            r9 = r9.A00;
        }
        int i3 = i2;
        while (i3 > 0) {
            long j3 = r9.A03;
            int min = Math.min(i3, (int) (j3 - j2));
            System.arraycopy(r9.A01.A00, (int) (j2 - r9.A04), bArr, i2 - i3, min);
            i3 -= min;
            j2 += (long) min;
            if (j2 == j3) {
                r9 = r9.A00;
            }
        }
        return r9;
    }

    public final int A02(int i2) {
        C82224By r4;
        C85064My r5 = this.A03;
        C85064My r6 = r5;
        if (!r5.A02) {
            C97574qD r3 = (C97574qD) this.A05;
            synchronized (r3) {
                r3.A00++;
                int i3 = r3.A01;
                if (i3 > 0) {
                    C82224By[] r2 = r3.A03;
                    int i4 = i3 - 1;
                    r3.A01 = i4;
                    r4 = r2[i4];
                    r2[i4] = null;
                } else {
                    r4 = new C82224By(new byte[r3.A04]);
                }
            }
            r6 = this.A03;
            C85064My r0 = new C85064My(r6.A03, this.A04);
            r5.A01 = r4;
            r5.A00 = r0;
            r5.A02 = true;
        }
        return Math.min(i2, (int) (r6.A03 - this.A00));
    }

    public void A03(long j2) {
        if (j2 != -1) {
            while (true) {
                C85064My r5 = this.A01;
                if (j2 >= r5.A03) {
                    AnonymousClass5RB r3 = this.A05;
                    C82224By r2 = r5.A01;
                    C97574qD r32 = (C97574qD) r3;
                    synchronized (r32) {
                        C82224By[] r1 = r32.A05;
                        r1[0] = r2;
                        r32.Abh(r1);
                    }
                    C85064My r22 = this.A01;
                    r22.A01 = null;
                    C85064My r0 = r22.A00;
                    r22.A00 = null;
                    this.A01 = r0;
                } else if (this.A02.A04 < r5.A04) {
                    this.A02 = r5;
                    return;
                } else {
                    return;
                }
            }
        }
    }
}
