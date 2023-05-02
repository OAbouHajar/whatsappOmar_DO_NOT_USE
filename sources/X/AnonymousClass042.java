package X;

import android.support.v4.view.MotionEventCompat;
import java.util.Set;

/* renamed from: X.042  reason: invalid class name */
public final class AnonymousClass042 {
    public static final AnonymousClass042 A08 = new AnonymousClass042((AnonymousClass041) null, (Set) null, (C54392hN) null, MotionEventCompat.ACTION_MASK, 0, 0, false, false, false, false);
    public final long A00;
    public final long A01;
    public final AnonymousClass041 A02;
    public final Set A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass042() {
        this((AnonymousClass041) null, (Set) null, (C54392hN) null, MotionEventCompat.ACTION_MASK, 0, 0, false, false, false, false);
    }

    public AnonymousClass042(AnonymousClass041 r2, Set set, long j2, long j3, boolean z2, boolean z3, boolean z4, boolean z5) {
        C18450wi.A0H(r2, 1);
        this.A02 = r2;
        this.A05 = z2;
        this.A06 = z3;
        this.A04 = z4;
        this.A07 = z5;
        this.A01 = j2;
        this.A00 = j3;
        this.A03 = set;
    }

    public /* synthetic */ AnonymousClass042(AnonymousClass041 r3, Set set, C54392hN r5, int i2, long j2, long j3, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(AnonymousClass041.NOT_REQUIRED, AnonymousClass1F9.A00(), -1, -1, false, false, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass042(X.AnonymousClass042 r12) {
        /*
            r11 = this;
            r0 = 1
            X.C18450wi.A0H(r12, r0)
            boolean r7 = r12.A05
            boolean r8 = r12.A06
            X.041 r1 = r12.A02
            boolean r9 = r12.A04
            boolean r10 = r12.A07
            java.util.Set r2 = r12.A03
            long r3 = r12.A01
            long r5 = r12.A00
            r0 = r11
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass042.<init>(X.042):void");
    }

    public final boolean A00() {
        return this.A06;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass042.class.equals(obj.getClass())) {
            return false;
        }
        AnonymousClass042 r7 = (AnonymousClass042) obj;
        if (this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A07 == r7.A07 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A02 == r7.A02) {
            return C18450wi.A0R(this.A03, r7.A03);
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.A01;
        long j3 = this.A00;
        return (((((((((((((this.A02.hashCode() * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.A03.hashCode();
    }
}
