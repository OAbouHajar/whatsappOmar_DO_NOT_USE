package X;

import android.os.Handler;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4XV  reason: invalid class name */
public final class AnonymousClass4XV {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass4X7 A04;
    public AnonymousClass4X7 A05;
    public AnonymousClass4X7 A06;
    public Object A07;
    public boolean A08;
    public final Handler A09;
    public final AnonymousClass4XE A0A = new AnonymousClass4XE();
    public final C89324by A0B = new C89324by();
    public final C96224nz A0C;

    public AnonymousClass4XV(Handler handler, C96224nz r3) {
        this.A0C = r3;
        this.A09 = handler;
    }

    public AnonymousClass4X7 A00() {
        AnonymousClass4X7 r2 = this.A05;
        if (r2 == null) {
            return null;
        }
        if (r2 == this.A06) {
            this.A06 = r2.A01;
        }
        r2.A03();
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (i2 == 0) {
            this.A04 = null;
            AnonymousClass4X7 r1 = this.A05;
            this.A07 = r1.A0B;
            this.A03 = r1.A02.A04.A03;
        }
        this.A05 = this.A05.A01;
        A07();
        return this.A05;
    }

    public final C87454Wv A01(AnonymousClass4X7 r26, Timeline timeline, long j2) {
        long j3;
        AnonymousClass4X7 r11 = r26;
        C87454Wv r2 = r11.A02;
        long j4 = r11.A00;
        long j5 = r2.A00;
        long j6 = (j4 + j5) - j2;
        boolean z2 = r2.A06;
        C30271c3 r4 = r2.A04;
        Timeline timeline2 = timeline;
        if (z2) {
            int A042 = timeline2.A04(r4.A04);
            AnonymousClass4XE r8 = this.A0A;
            C89324by r13 = this.A0B;
            long j7 = 0;
            C89324by r19 = r13;
            AnonymousClass4XE r18 = r8;
            Timeline timeline3 = timeline2;
            int A032 = timeline3.A03(r18, r19, A042, this.A01, this.A08);
            if (A032 != -1) {
                int i2 = timeline2.A08(r8, A032, true).A00;
                Object obj = r8.A05;
                long j8 = r4.A03;
                if (timeline2.A0A(r13, i2, 0).A00 == A032) {
                    Pair A072 = timeline3.A07(r18, r19, i2, -9223372036854775807L, Math.max(0, j6));
                    if (A072 != null) {
                        obj = A072.first;
                        j3 = C13700nu.A01(A072.second);
                        AnonymousClass4X7 r3 = r11.A01;
                        if (r3 == null || !r3.A0B.equals(obj)) {
                            j8 = this.A02;
                            this.A02 = 1 + j8;
                        } else {
                            j8 = r3.A02.A04.A03;
                        }
                        j7 = -9223372036854775807L;
                    }
                } else {
                    j3 = 0;
                }
                timeline2.A09(r8, obj);
                int A033 = r8.A03(j3);
                return A03(timeline2, A033 == -1 ? new C30271c3(obj, j8, r8.A02(j3)) : new C30271c3(obj, A033, r8.A01(A033), j8), j7, j3);
            }
        } else {
            Object obj2 = r4.A04;
            AnonymousClass4XE r5 = this.A0A;
            timeline2.A09(r5, obj2);
            if (!r4.A00()) {
                int A034 = r5.A03(r2.A01);
                if (A034 == -1) {
                    return A04(timeline2, obj2, j5, j5, r4.A03);
                }
                C30271c3 r14 = new C30271c3(obj2, A034, r5.A01(A034), r4.A03);
                timeline2.A09(r5, r14.A04);
                return new C87454Wv(r14, 0, j5, -9223372036854775807L, -9223372036854775807L, false, false, false);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r6.A02 != -1) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C87454Wv A02(X.C87454Wv r19, com.google.android.exoplayer2.Timeline r20) {
        /*
            r18 = this;
            r3 = r19
            X.1c3 r6 = r3.A04
            boolean r2 = r6.A00()
            if (r2 != 0) goto L_0x0010
            int r1 = r6.A02
            r0 = -1
            r15 = 1
            if (r1 == r0) goto L_0x0011
        L_0x0010:
            r15 = 0
        L_0x0011:
            r1 = r18
            r5 = r20
            boolean r16 = r1.A0A(r5, r6)
            boolean r17 = r1.A0B(r5, r6, r15)
            java.lang.Object r0 = r6.A04
            X.4XE r4 = r1.A0A
            r5.A09(r4, r0)
            if (r2 == 0) goto L_0x0037
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x002b:
            long r7 = r3.A03
            long r9 = r3.A02
            long r11 = r3.A01
            X.4Wv r5 = new X.4Wv
            r5.<init>(r6, r7, r9, r11, r13, r15, r16, r17)
            return r5
        L_0x0037:
            long r13 = r3.A01
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0048
            r1 = -9223372036854775808
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002b
        L_0x0048:
            long r13 = r4.A01
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XV.A02(X.4Wv, com.google.android.exoplayer2.Timeline):X.4Wv");
    }

    public final C87454Wv A03(Timeline timeline, C30271c3 r21, long j2, long j3) {
        C30271c3 r1 = r21;
        Object obj = r1.A04;
        AnonymousClass4XE r4 = this.A0A;
        Timeline timeline2 = timeline;
        timeline2.A09(r4, obj);
        long j4 = j2;
        if (!r1.A00()) {
            return A04(timeline2, obj, j3, j4, r1.A03);
        }
        C30271c3 r13 = new C30271c3(obj, r1.A00, r1.A01, r1.A03);
        timeline2.A09(r4, r13.A04);
        return new C87454Wv(r13, 0, j4, -9223372036854775807L, -9223372036854775807L, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r7.A02 != -1) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C87454Wv A04(com.google.android.exoplayer2.Timeline r20, java.lang.Object r21, long r22, long r24, long r26) {
        /*
            r19 = this;
            r8 = r22
            r5 = r19
            X.4XE r3 = r5.A0A
            r6 = r20
            r4 = r21
            r6.A09(r3, r4)
            int r2 = r3.A02(r8)
            X.1c3 r7 = new X.1c3
            r0 = r26
            r7.<init>(r4, r0, r2)
            boolean r0 = r7.A00()
            if (r0 != 0) goto L_0x0024
            int r1 = r7.A02
            r0 = -1
            r4 = 1
            if (r1 == r0) goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            boolean r17 = r5.A0A(r6, r7)
            boolean r18 = r5.A0B(r6, r7, r4)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = -1
            if (r2 == r0) goto L_0x0062
            X.4bn r0 = r3.A03
            long[] r0 = r0.A01
            r12 = r0[r2]
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            r1 = -9223372036854775808
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            r14 = r12
        L_0x0046:
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0058
            int r0 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0058
            r2 = 0
            r5 = 1
            long r0 = r14 - r5
            long r8 = java.lang.Math.max(r2, r0)
        L_0x0058:
            X.4Wv r6 = new X.4Wv
            r10 = r24
            r16 = r4
            r6.<init>(r7, r8, r10, r12, r14, r16, r17, r18)
            return r6
        L_0x0062:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0067:
            long r14 = r3.A01
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XV.A04(com.google.android.exoplayer2.Timeline, java.lang.Object, long, long, long):X.4Wv");
    }

    public C30271c3 A05(Timeline timeline, Object obj, long j2) {
        AnonymousClass4X7 r4;
        long j3;
        int A042;
        AnonymousClass4XE r3 = this.A0A;
        Object obj2 = obj;
        int A002 = AnonymousClass4XE.A00(r3, timeline, obj);
        Object obj3 = this.A07;
        if (obj3 == null || (A042 = timeline.A04(obj3)) == -1 || timeline.A08(r3, A042, false).A00 != A002) {
            AnonymousClass4X7 r42 = this.A05;
            while (true) {
                if (r4 != null) {
                    if (r4.A0B.equals(obj)) {
                        break;
                    }
                    r42 = r4.A01;
                } else {
                    r4 = this.A05;
                    while (true) {
                        if (r4 != null) {
                            int A043 = timeline.A04(r4.A0B);
                            if (A043 != -1 && timeline.A08(r3, A043, false).A00 == A002) {
                                break;
                            }
                            r4 = r4.A01;
                        } else {
                            j3 = this.A02;
                            this.A02 = 1 + j3;
                            if (this.A05 == null) {
                                this.A07 = obj;
                                this.A03 = j3;
                            }
                        }
                    }
                }
            }
            j3 = r4.A02.A04.A03;
        } else {
            j3 = this.A03;
        }
        timeline.A09(r3, obj);
        int A032 = r3.A03(j2);
        return A032 == -1 ? new C30271c3(obj, j3, r3.A02(j2)) : new C30271c3(obj2, A032, r3.A01(A032), j3);
    }

    public void A06() {
        if (this.A00 != 0) {
            AnonymousClass4X7 r0 = this.A05;
            C90524eJ.A01(r0);
            this.A07 = r0.A0B;
            this.A03 = r0.A02.A04.A03;
            do {
                r0.A03();
                r0 = r0.A01;
            } while (r0 != null);
            this.A05 = null;
            this.A04 = null;
            this.A06 = null;
            this.A00 = 0;
            A07();
        }
    }

    public final void A07() {
        C67763cL builder = C34641kb.builder();
        for (AnonymousClass4X7 r1 = this.A05; r1 != null; r1 = r1.A01) {
            builder.add((Object) r1.A02.A04);
        }
        AnonymousClass4X7 r0 = this.A06;
        this.A09.post(new RunnableRunnableShape3S0300000_I1(this, builder, r0 == null ? null : r0.A02.A04, 0));
    }

    public boolean A08(AnonymousClass4X7 r5) {
        boolean z2 = false;
        C90524eJ.A04(AnonymousClass000.A1V(r5));
        if (!r5.equals(this.A04)) {
            this.A04 = r5;
            while (r5.A01 != null) {
                r5 = r5.A01;
                if (r5 == this.A06) {
                    this.A06 = this.A05;
                    z2 = true;
                }
                r5.A03();
                this.A00--;
            }
            AnonymousClass4X7 r2 = this.A04;
            if (null != r2.A01) {
                r2.A01 = null;
            }
            A07();
        }
        return z2;
    }

    public final boolean A09(Timeline timeline) {
        AnonymousClass4X7 r1;
        AnonymousClass4X7 r2 = this.A05;
        if (r2 == null) {
            return true;
        }
        Timeline timeline2 = timeline;
        int A042 = timeline.A04(r2.A0B);
        while (true) {
            A042 = timeline2.A03(this.A0A, this.A0B, A042, this.A01, this.A08);
            while (true) {
                r1 = r2.A01;
                if (r1 != null && !r2.A02.A06) {
                    r2 = r1;
                }
            }
            if (A042 == -1 || r1 == null || timeline.A04(r1.A0B) != A042) {
                boolean A082 = A08(r2);
                r2.A02 = A02(r2.A02, timeline);
            } else {
                r2 = r1;
            }
        }
        boolean A0822 = A08(r2);
        r2.A02 = A02(r2.A02, timeline);
        return !A0822;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r6.A02 != -1) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(com.google.android.exoplayer2.Timeline r5, X.C30271c3 r6) {
        /*
            r4 = this;
            boolean r0 = r6.A00()
            if (r0 != 0) goto L_0x000c
            int r2 = r6.A02
            r1 = -1
            r0 = 1
            if (r2 == r1) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r3 = 0
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r6.A04
            X.4XE r0 = r4.A0A
            int r2 = X.AnonymousClass4XE.A00(r0, r5, r1)
            int r1 = r5.A04(r1)
            X.4by r0 = r4.A0B
            X.4by r0 = X.AnonymousClass3K4.A0O(r0, r5, r2)
            int r0 = r0.A01
            if (r0 != r1) goto L_0x0027
            r3 = 1
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XV.A0A(com.google.android.exoplayer2.Timeline, X.1c3):boolean");
    }

    public final boolean A0B(Timeline timeline, C30271c3 r9, boolean z2) {
        Timeline timeline2 = timeline;
        int A042 = timeline.A04(r9.A04);
        AnonymousClass4XE r2 = this.A0A;
        int i2 = timeline.A08(r2, A042, false).A00;
        C89324by r3 = this.A0B;
        return !AnonymousClass3K4.A0O(r3, timeline, i2).A0A && timeline2.A03(r2, r3, A042, this.A01, this.A08) == -1 && z2;
    }
}
