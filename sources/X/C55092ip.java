package X;

import android.os.Looper;
import android.util.Log;
import java.io.EOFException;

/* renamed from: X.2ip  reason: invalid class name and case insensitive filesystem */
public class C55092ip implements C32481gS {
    public int A00;
    public int A01 = 1000;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public C32491gT A08;
    public C32491gT A09;
    public C32491gT A0A;
    public C32491gT A0B;
    public C55102iq A0C;
    public C15100qK A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H = true;
    public boolean A0I = true;
    public int[] A0J = new int[1000];
    public int[] A0K = new int[1000];
    public int[] A0L = new int[1000];
    public long[] A0M = new long[1000];
    public long[] A0N = new long[1000];
    public C32491gT[] A0O = new C32491gT[1000];
    public C86824Uh[] A0P = new C86824Uh[1000];
    public final Looper A0Q;
    public final AnonymousClass4JT A0R;
    public final AnonymousClass5TW A0S;
    public final C90084dT A0T;
    public final AnonymousClass4JZ A0U = new AnonymousClass4JZ();

    public C55092ip(Looper looper, AnonymousClass4JT r4, AnonymousClass5TW r5, AnonymousClass5RB r6) {
        this.A0Q = looper;
        this.A0S = r5;
        this.A0R = r4;
        this.A0T = new C90084dT(r6);
    }

    public final int A00(int i2, int i3, long j2, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long[] jArr = this.A0N;
            if (jArr[i2] > j2) {
                break;
            }
            if (!z2 || (this.A0J[i2] & 1) != 0) {
                i4 = i5;
                if (jArr[i2] == j2) {
                    break;
                }
            }
            i2++;
            if (i2 == this.A01) {
                i2 = 0;
            }
        }
        return i4;
    }

    public final long A01(int i2) {
        int i3;
        long j2 = this.A05;
        long j3 = Long.MIN_VALUE;
        if (i2 != 0) {
            int i4 = this.A04 + (i2 - 1);
            int i5 = this.A01;
            if (i4 >= i5) {
                i4 -= i5;
            }
            for (int i6 = 0; i6 < i2; i6++) {
                j3 = Math.max(j3, this.A0N[i3]);
                if ((this.A0J[i3] & 1) != 0) {
                    break;
                }
                i3--;
                if (i3 == -1) {
                    i3 = i5 - 1;
                }
            }
        }
        this.A05 = Math.max(j2, j3);
        int i7 = this.A02 - i2;
        this.A02 = i7;
        this.A00 += i2;
        int i8 = this.A04 + i2;
        this.A04 = i8;
        int i9 = this.A01;
        if (i8 >= i9) {
            i8 -= i9;
            this.A04 = i8;
        }
        int i10 = this.A03 - i2;
        this.A03 = i10;
        if (i10 < 0) {
            this.A03 = 0;
        }
        if (i7 != 0) {
            return this.A0M[i8];
        }
        if (i8 != 0) {
            i9 = i8;
        }
        int i11 = i9 - 1;
        return this.A0M[i11] + ((long) this.A0K[i11]);
    }

    public final void A02() {
        long A012;
        C90084dT r3 = this.A0T;
        synchronized (this) {
            int i2 = this.A02;
            A012 = i2 == 0 ? -1 : A01(i2);
        }
        r3.A03(A012);
    }

    public final void A03(C32491gT r7, AnonymousClass4G5 r8) {
        boolean z2;
        AnonymousClass57J r4;
        C32491gT r0 = this.A08;
        if (r0 == null) {
            z2 = true;
            r4 = null;
        } else {
            z2 = false;
            r4 = r0.A0K;
        }
        this.A08 = r7;
        AnonymousClass57J r3 = r7.A0K;
        AnonymousClass5TW r2 = this.A0S;
        if (r2 != null) {
            Class cls = r3 != null ? C96404oH.class : null;
            C32471gR r02 = new C32471gR(r7);
            r02.A0L = cls;
            r7 = new C32491gT(r02);
        }
        r8.A00 = r7;
        r8.A01 = this.A0C;
        if (r2 == null) {
            return;
        }
        if (z2 || !AnonymousClass3C1.A0F(r4, r3)) {
            C96374oE r1 = r3 == null ? null : new C96374oE(new AnonymousClass405(new AnonymousClass43Y()));
            this.A0C = r1;
            r8.A01 = r1;
        }
    }

    public void A04(boolean z2) {
        C90084dT r5 = this.A0T;
        C85064My r6 = r5.A01;
        if (r6.A02) {
            C85064My r0 = r5.A03;
            int i2 = (r0.A02 ? 1 : 0) + (((int) (r0.A04 - r6.A04)) / r5.A04);
            C82224By[] r3 = new C82224By[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                r3[i3] = r6.A01;
                r6.A01 = null;
                C85064My r02 = r6.A00;
                r6.A00 = null;
                r6 = r02;
            }
            r5.A05.Abh(r3);
        }
        C85064My r03 = new C85064My(0, r5.A04);
        r5.A01 = r03;
        r5.A02 = r03;
        r5.A03 = r03;
        r5.A00 = 0;
        r5.A05.Ah4();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0I = true;
        this.A07 = Long.MIN_VALUE;
        this.A05 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A0E = false;
        this.A0A = null;
        if (z2) {
            this.A09 = null;
            this.A0B = null;
            this.A0H = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A05(long r11, boolean r13) {
        /*
            r10 = this;
            r4 = r10
            monitor-enter(r4)
            r3 = 0
            r10.A03 = r3     // Catch:{ all -> 0x0038 }
            X.4dT r1 = r10.A0T     // Catch:{ all -> 0x0038 }
            X.4My r0 = r1.A01     // Catch:{ all -> 0x0038 }
            r1.A02 = r0     // Catch:{ all -> 0x0038 }
            int r5 = r10.A04     // Catch:{ all -> 0x003a }
            int r0 = r10.A01     // Catch:{ all -> 0x003a }
            if (r5 < r0) goto L_0x0012
            int r5 = r5 - r0
        L_0x0012:
            int r6 = r10.A02     // Catch:{ all -> 0x003a }
            if (r3 == r6) goto L_0x0027
            long[] r0 = r10.A0N     // Catch:{ all -> 0x003a }
            r1 = r0[r5]     // Catch:{ all -> 0x003a }
            r7 = r11
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            long r0 = r10.A06     // Catch:{ all -> 0x003a }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0029
            if (r13 != 0) goto L_0x0029
        L_0x0027:
            monitor-exit(r4)
            return r3
        L_0x0029:
            r9 = 1
            int r1 = r4.A00(r5, r6, r7, r9)     // Catch:{ all -> 0x003a }
            r0 = -1
            if (r1 == r0) goto L_0x0027
            r10.A07 = r11     // Catch:{ all -> 0x003a }
            int r3 = r3 + r1
            r10.A03 = r3     // Catch:{ all -> 0x003a }
            monitor-exit(r4)
            return r9
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55092ip.A05(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A06(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r3 = r4.A03     // Catch:{ all -> 0x0036 }
            int r1 = r4.A02     // Catch:{ all -> 0x0036 }
            r0 = 0
            if (r3 == r1) goto L_0x0009
            r0 = 1
        L_0x0009:
            r2 = 1
            if (r0 != 0) goto L_0x001b
            if (r5 != 0) goto L_0x0034
            boolean r0 = r4.A0E     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            X.1gT r1 = r4.A0B     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0033
            X.1gT r0 = r4.A08     // Catch:{ all -> 0x0036 }
            if (r1 == r0) goto L_0x0033
            goto L_0x0034
        L_0x001b:
            int r1 = r4.A04     // Catch:{ all -> 0x0036 }
            int r1 = r1 + r3
            int r0 = r4.A01     // Catch:{ all -> 0x0036 }
            if (r1 < r0) goto L_0x0023
            int r1 = r1 - r0
        L_0x0023:
            X.1gT[] r0 = r4.A0O     // Catch:{ all -> 0x0036 }
            r1 = r0[r1]     // Catch:{ all -> 0x0036 }
            X.1gT r0 = r4.A08     // Catch:{ all -> 0x0036 }
            if (r1 != r0) goto L_0x0034
            X.2iq r1 = r4.A0C     // Catch:{ all -> 0x0036 }
            r0 = 1
            if (r1 == 0) goto L_0x0031
            r0 = 0
        L_0x0031:
            monitor-exit(r4)
            return r0
        L_0x0033:
            r2 = 0
        L_0x0034:
            monitor-exit(r4)
            return r2
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55092ip.A06(boolean):boolean");
    }

    public final void A9D(C32491gT r5) {
        boolean z2;
        this.A09 = r5;
        synchronized (this) {
            this.A0H = false;
            if (AnonymousClass3C1.A0F(r5, this.A0B)) {
                z2 = false;
            } else {
                if (AnonymousClass3C1.A0F(r5, this.A0A)) {
                    r5 = this.A0A;
                }
                this.A0B = r5;
                this.A0G = C90834eu.A06(r5.A0T, r5.A0O);
                this.A0F = false;
                z2 = true;
            }
        }
        C15100qK r0 = this.A0D;
        if (r0 != null && z2) {
            C15050qF r02 = (C15050qF) r0;
            r02.A0O.post(r02.A0Z);
        }
    }

    public /* synthetic */ void Acw(C90504eH r2, int i2) {
        Acx(r2, i2, 0);
    }

    public final void Acx(C90504eH r9, int i2, int i3) {
        C90084dT r6 = this.A0T;
        while (i2 > 0) {
            int A022 = r6.A02(i2);
            C85064My r3 = r6.A03;
            r9.A0V(r3.A01.A00, (int) (r6.A00 - r3.A04), A022);
            i2 -= A022;
            long j2 = r6.A00 + ((long) A022);
            r6.A00 = j2;
            C85064My r5 = r6.A03;
            if (j2 == r5.A03) {
                r6.A03 = r5.A00;
            }
        }
    }

    public final int Acz(C48622Of r9, int i2, int i3, boolean z2) {
        C90084dT r7 = this.A0T;
        int A022 = r7.A02(i2);
        C85064My r3 = r7.A03;
        int read = r9.read(r3.A01.A00, (int) (r7.A00 - r3.A04), A022);
        if (read != -1) {
            long j2 = r7.A00 + ((long) read);
            r7.A00 = j2;
            C85064My r32 = r7.A03;
            if (j2 != r32.A03) {
                return read;
            }
            r7.A03 = r32.A00;
            return read;
        } else if (z2) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void Ad0(C86824Uh r14, int i2, int i3, int i4, long j2) {
        int i5 = i2 & 1;
        boolean z2 = false;
        if (i5 != 0) {
            z2 = true;
        }
        if (this.A0I) {
            if (z2) {
                this.A0I = false;
            } else {
                return;
            }
        }
        long j3 = 0 + j2;
        if (this.A0G) {
            if (j3 < this.A07) {
                return;
            }
            if (i5 == 0) {
                if (!this.A0F) {
                    StringBuilder sb = new StringBuilder("Overriding unexpected non-sync sample for format: ");
                    sb.append(this.A0B);
                    Log.w("SampleQueue", sb.toString());
                    this.A0F = true;
                }
                i2 |= 1;
            }
        }
        long j4 = (this.A0T.A00 - ((long) i3)) - ((long) i4);
        synchronized (this) {
            int i6 = this.A02;
            if (i6 > 0) {
                int i7 = this.A04 + (i6 - 1);
                int i8 = this.A01;
                if (i7 >= i8) {
                    i7 -= i8;
                }
                boolean z3 = false;
                if (this.A0M[i7] + ((long) this.A0K[i7]) <= j4) {
                    z3 = true;
                }
                C90524eJ.A03(z3);
            }
            boolean z4 = false;
            if ((536870912 & i2) != 0) {
                z4 = true;
            }
            this.A0E = z4;
            this.A06 = Math.max(this.A06, j3);
            int i9 = this.A02;
            int i10 = this.A04;
            int i11 = i10 + i9;
            int i12 = this.A01;
            if (i11 >= i12) {
                i11 -= i12;
            }
            this.A0N[i11] = j3;
            long[] jArr = this.A0M;
            jArr[i11] = j4;
            this.A0K[i11] = i3;
            this.A0J[i11] = i2;
            this.A0P[i11] = r14;
            C32491gT[] r1 = this.A0O;
            C32491gT r4 = this.A0B;
            r1[i11] = r4;
            this.A0L[i11] = 0;
            this.A0A = r4;
            int i13 = i9 + 1;
            this.A02 = i13;
            if (i13 == i12) {
                int i14 = i12 + 1000;
                int[] iArr = new int[i14];
                long[] jArr2 = new long[i14];
                long[] jArr3 = new long[i14];
                int[] iArr2 = new int[i14];
                int[] iArr3 = new int[i14];
                C86824Uh[] r2 = new C86824Uh[i14];
                C32491gT[] r12 = new C32491gT[i14];
                int i15 = i12 - i10;
                System.arraycopy(jArr, i10, jArr2, 0, i15);
                System.arraycopy(this.A0N, this.A04, jArr3, 0, i15);
                System.arraycopy(this.A0J, this.A04, iArr2, 0, i15);
                System.arraycopy(this.A0K, this.A04, iArr3, 0, i15);
                System.arraycopy(this.A0P, this.A04, r2, 0, i15);
                System.arraycopy(this.A0O, this.A04, r12, 0, i15);
                System.arraycopy(this.A0L, this.A04, iArr, 0, i15);
                int i16 = this.A04;
                System.arraycopy(this.A0M, 0, jArr2, i15, i16);
                System.arraycopy(this.A0N, 0, jArr3, i15, i16);
                System.arraycopy(this.A0J, 0, iArr2, i15, i16);
                System.arraycopy(this.A0K, 0, iArr3, i15, i16);
                System.arraycopy(this.A0P, 0, r2, i15, i16);
                System.arraycopy(this.A0O, 0, r12, i15, i16);
                System.arraycopy(this.A0L, 0, iArr, i15, i16);
                this.A0M = jArr2;
                this.A0N = jArr3;
                this.A0J = iArr2;
                this.A0K = iArr3;
                this.A0P = r2;
                this.A0O = r12;
                this.A0L = iArr;
                this.A04 = 0;
                this.A01 = i14;
            }
        }
    }
}
