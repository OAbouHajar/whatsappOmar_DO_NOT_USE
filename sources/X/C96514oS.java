package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4oS  reason: invalid class name and case insensitive filesystem */
public final class C96514oS implements C55132it {
    public int A00;
    public int A01;
    public int A02;
    public C15060qG A03;
    public C65343Uk A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final SparseArray A08;
    public final SparseBooleanArray A09;
    public final SparseBooleanArray A0A;
    public final SparseIntArray A0B;
    public final AnonymousClass4OR A0C;
    public final AnonymousClass5LJ A0D = new C97024pH(0);
    public final C90504eH A0E;
    public final List A0F;

    public C96514oS() {
        AnonymousClass4X5 r1 = new AnonymousClass4X5(0);
        this.A0F = Collections.singletonList(r1);
        this.A0E = new C90504eH(new byte[9400], 0);
        this.A09 = new SparseBooleanArray();
        this.A0A = new SparseBooleanArray();
        this.A08 = new SparseArray();
        this.A0B = new SparseIntArray();
        this.A0C = new AnonymousClass4OR();
        this.A01 = -1;
        this.A09.clear();
        SparseArray sparseArray = this.A08;
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new C97034pI(new C96994pE(this)));
    }

    public void AHx(C15060qG r1) {
        this.A03 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e8, code lost:
        if (r1 == false) goto L_0x01ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r15, X.AnonymousClass4Bt r16) {
        /*
            r14 = this;
            long r12 = r15.getLength()
            boolean r0 = r14.A07
            r4 = -1
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x012c
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r6 = r16
            if (r0 == 0) goto L_0x00da
            X.4OR r4 = r14.A0C
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x00da
            int r5 = r14.A01
            if (r5 <= 0) goto L_0x00cc
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0067
            r0 = 112800(0x1b8a0, float:1.58066E-40)
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r0, r12)
            int r2 = (int) r0
            long r0 = (long) r2
            long r12 = r12 - r0
            long r7 = r15.AF7()
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0159
            X.4eH r10 = r4.A06
            r10.A0Q(r2)
            r15.AcS()
            X.C90504eH.A06(r15, r10, r2)
            int r9 = r10.A01
            int r8 = r10.A00
        L_0x0042:
            int r8 = r8 + -1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 < r9) goto L_0x0061
            byte[] r0 = r10.A02
            byte r1 = r0[r8]
            r0 = 71
            if (r1 != r0) goto L_0x0042
            long r1 = X.AnonymousClass452.A00(r10, r8, r5)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
        L_0x005b:
            r4.A02 = r1
            r4.A05 = r3
        L_0x005f:
            r5 = 0
        L_0x0060:
            return r5
        L_0x0061:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x005b
        L_0x0067:
            long r0 = r4.A02
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x00cc
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x00b7
            r0 = 112800(0x1b8a0, float:1.58066E-40)
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r0, r12)
            int r9 = (int) r0
            long r7 = r15.AF7()
            long r12 = (long) r2
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0159
            X.4eH r8 = r4.A06
            r8.A0Q(r9)
            r15.AcS()
            X.C90504eH.A06(r15, r8, r9)
            int r7 = r8.A01
            int r6 = r8.A00
        L_0x0097:
            if (r7 >= r6) goto L_0x00b1
            byte[] r0 = r8.A02
            byte r1 = r0[r7]
            r0 = 71
            if (r1 != r0) goto L_0x00ae
            long r1 = X.AnonymousClass452.A00(r8, r7, r5)
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00ae
        L_0x00a9:
            r4.A01 = r1
            r4.A04 = r3
            goto L_0x005f
        L_0x00ae:
            int r7 = r7 + 1
            goto L_0x0097
        L_0x00b1:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00a9
        L_0x00b7:
            long r0 = r4.A01
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00cc
            X.4X5 r2 = r4.A07
            long r5 = r2.A02(r0)
            long r0 = r4.A02
            long r0 = r2.A02(r0)
            long r0 = r0 - r5
            r4.A00 = r0
        L_0x00cc:
            X.4eH r2 = r4.A06
            byte[] r1 = X.AnonymousClass3C1.A0A
            int r0 = r1.length
            r2.A0U(r1, r0)
            r4.A03 = r3
            r15.AcS()
            goto L_0x005f
        L_0x00da:
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x00ff
            r14.A05 = r3
            X.4OR r1 = r14.A0C
            long r10 = r1.A00
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0115
            X.4X5 r8 = r1.A07
            int r9 = r14.A01
            X.3Uk r7 = new X.3Uk
            r7.<init>(r8, r9, r10, r12)
            r14.A04 = r7
            X.0qG r5 = r14.A03
            X.4on r4 = r7.A02
        L_0x00fc:
            r5.AdD(r4)
        L_0x00ff:
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x011f
            r14.A06 = r2
            r0 = 0
            r14.AdC(r0, r0)
            long r7 = r15.AF7()
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x011f
            r6.A00 = r0
            return r3
        L_0x0115:
            X.0qG r5 = r14.A03
            r0 = 0
            X.1gC r4 = new X.1gC
            r4.<init>(r10, r0)
            goto L_0x00fc
        L_0x011f:
            X.3Uk r1 = r14.A04
            if (r1 == 0) goto L_0x012c
            X.4aN r0 = r1.A00
            if (r0 == 0) goto L_0x012c
            int r5 = r1.A00(r15, r6)
            return r5
        L_0x012c:
            X.4eH r6 = r14.A0E
            byte[] r4 = r6.A02
            int r5 = r6.A01
            int r0 = 9400 - r5
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 >= r1) goto L_0x0143
            int r0 = r6.A00
            int r0 = r0 - r5
            if (r0 <= 0) goto L_0x0140
            java.lang.System.arraycopy(r4, r5, r4, r2, r0)
        L_0x0140:
            r6.A0U(r4, r0)
        L_0x0143:
            int r8 = r6.A00
            int r9 = r6.A01
            int r0 = r8 - r9
            if (r0 >= r1) goto L_0x015d
            int r0 = 9400 - r8
            int r0 = r15.read(r4, r8, r0)
            r5 = -1
            if (r0 == r5) goto L_0x0060
            int r8 = r8 + r0
            r6.A0R(r8)
            goto L_0x0143
        L_0x0159:
            r6.A00 = r12
            r5 = 1
            return r5
        L_0x015d:
            byte[] r5 = r6.A02
            r4 = r9
        L_0x0160:
            if (r4 >= r8) goto L_0x016b
            byte r1 = r5[r4]
            r0 = 71
            if (r1 == r0) goto L_0x016b
            int r4 = r4 + 1
            goto L_0x0160
        L_0x016b:
            r6.A0S(r4)
            int r7 = r4 + 188
            if (r7 <= r8) goto L_0x01fa
            int r0 = r14.A00
            int r4 = r4 - r9
            int r0 = r0 + r4
            r14.A00 = r0
        L_0x0178:
            int r8 = r6.A00
            if (r7 > r8) goto L_0x01f9
            int r1 = r6.A07()
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01f6
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            boolean r5 = X.AnonymousClass000.A1O(r0)
            r0 = 2096896(0x1fff00, float:2.938377E-39)
            r0 = r0 & r1
            int r9 = r0 >> 8
            r0 = r1 & 32
            boolean r11 = X.AnonymousClass000.A1O(r0)
            r0 = r1 & 16
            if (r0 == 0) goto L_0x01f6
            android.util.SparseArray r0 = r14.A08
            java.lang.Object r4 = r0.get(r9)
            X.5SN r4 = (X.AnonymousClass5SN) r4
            if (r4 == 0) goto L_0x01f6
            r1 = r1 & 15
            android.util.SparseIntArray r10 = r14.A0B
            int r0 = r1 + -1
            int r0 = r10.get(r9, r0)
            r10.put(r9, r1)
            if (r0 == r1) goto L_0x01f6
            int r0 = r0 + 1
            r0 = r0 & 15
            if (r1 == r0) goto L_0x01be
            r4.AdB()
        L_0x01be:
            if (r11 == 0) goto L_0x01d3
            int r10 = r6.A0C()
            int r0 = r6.A0C()
            r1 = r0 & 64
            r0 = 0
            if (r1 == 0) goto L_0x01ce
            r0 = 2
        L_0x01ce:
            r5 = r5 | r0
            int r10 = r10 - r3
            r6.A0T(r10)
        L_0x01d3:
            boolean r1 = r14.A07
            if (r1 != 0) goto L_0x01df
            android.util.SparseBooleanArray r0 = r14.A0A
            boolean r0 = r0.get(r9, r2)
            if (r0 != 0) goto L_0x01ea
        L_0x01df:
            r6.A0R(r7)
            r4.A6c(r6, r5)
            r6.A0R(r8)
            if (r1 != 0) goto L_0x01f6
        L_0x01ea:
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x01f6
            r4 = -1
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01f6
            r14.A06 = r3
        L_0x01f6:
            r6.A0S(r7)
        L_0x01f9:
            return r2
        L_0x01fa:
            r14.A00 = r2
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96514oS.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        C65343Uk r0;
        long j4;
        List list = this.A0F;
        int size = list.size();
        int i2 = 0;
        while (true) {
            long j5 = j3;
            if (i2 < size) {
                Object obj = list.get(i2);
                AnonymousClass4X5 r6 = (AnonymousClass4X5) obj;
                if (r6.A00() != -9223372036854775807L) {
                    if (r6.A00() != 0) {
                        synchronized (obj) {
                            j4 = r6.A00;
                        }
                        if (j4 == j3) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    i2++;
                }
                synchronized (obj) {
                    r6.A00 = j5;
                    r6.A01 = -9223372036854775807L;
                }
                i2++;
            } else {
                if (!(j3 == 0 || (r0 = this.A04) == null)) {
                    r0.A01(j5);
                }
                this.A0E.A0Q(0);
                this.A0B.clear();
                int i3 = 0;
                while (true) {
                    SparseArray sparseArray = this.A08;
                    if (i3 < sparseArray.size()) {
                        ((AnonymousClass5SN) sparseArray.valueAt(i3)).AdB();
                        i3++;
                    } else {
                        this.A00 = 0;
                        return;
                    }
                }
            }
        }
    }

    public boolean Afz(C55142iu r7) {
        byte[] bArr = this.A0E.A02;
        r7.AaL(bArr, 0, 940);
        int i2 = 0;
        do {
            int i3 = 0;
            while (bArr[(i3 * 188) + i2] == 71) {
                i3++;
                if (i3 >= 5) {
                    r7.Afx(i2);
                    return true;
                }
            }
            i2++;
        } while (i2 < 188);
        return false;
    }
}
