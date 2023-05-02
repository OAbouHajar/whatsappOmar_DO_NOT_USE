package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4XE  reason: invalid class name */
public final class AnonymousClass4XE {
    public int A00;
    public long A01;
    public long A02;
    public C89224bn A03 = C89224bn.A03;
    public Object A04;
    public Object A05;

    public static int A00(AnonymousClass4XE r0, Timeline timeline, Object obj) {
        return timeline.A09(r0, obj).A00;
    }

    public int A01(int i2) {
        int[] iArr;
        AnonymousClass4UD r4 = this.A03.A02[i2];
        int i3 = -1;
        do {
            i3++;
            iArr = r4.A00;
            if (i3 >= iArr.length || iArr[i3] == 0 || iArr[i3] == 1) {
                return i3;
            }
            i3++;
            iArr = r4.A00;
            break;
        } while (iArr[i3] == 1);
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(long r11) {
        /*
            r10 = this;
            X.4bn r6 = r10.A03
            long r1 = r10.A01
            r9 = -1
            r7 = -9223372036854775808
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0018
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
        L_0x0018:
            return r9
        L_0x0019:
            r5 = 0
        L_0x001a:
            long[] r4 = r6.A01
            int r3 = r4.length
            if (r5 >= r3) goto L_0x002e
            r1 = r4[r5]
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            r1 = r4[r5]
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002e
            int r5 = r5 + 1
            goto L_0x001a
        L_0x002e:
            if (r5 >= r3) goto L_0x0018
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XE.A02(long):int");
    }

    public int A03(long j2) {
        int i2;
        C89224bn r0 = this.A03;
        long j3 = this.A01;
        long[] jArr = r0.A01;
        int length = jArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return -1;
            }
            if (j2 == Long.MIN_VALUE) {
                return length;
            }
            long j4 = jArr[length];
            if (j4 != Long.MIN_VALUE) {
                i2 = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
            } else if (j3 != -9223372036854775807L) {
                i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            } else {
                continue;
            }
            if (i2 >= 0) {
                return length;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass4XE.class.equals(obj.getClass())) {
                return false;
            }
            AnonymousClass4XE r7 = (AnonymousClass4XE) obj;
            if (!AnonymousClass3C1.A0F(this.A04, r7.A04) || !AnonymousClass3C1.A0F(this.A05, r7.A05) || this.A00 != r7.A00 || this.A01 != r7.A01 || this.A02 != r7.A02 || !AnonymousClass3C1.A0F(this.A03, r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0C = (217 + AnonymousClass000.A0C(this.A04)) * 31;
        Object obj = this.A05;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return AnonymousClass3K2.A06(this.A03, AnonymousClass3K3.A0E(AnonymousClass3K3.A0E((((A0C + i2) * 31) + this.A00) * 31, this.A01), this.A02));
    }
}
