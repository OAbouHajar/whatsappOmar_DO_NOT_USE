package X;

import android.support.v4.view.MotionEventCompat;
import android.util.SparseArray;
import org.apache.commons.io.FileUtils;

/* renamed from: X.4oR  reason: invalid class name and case insensitive filesystem */
public final class C96504oR implements C55132it {
    public long A00;
    public C15060qG A01;
    public C65353Ul A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray A07 = new SparseArray();
    public final C88374aO A08 = new C88374aO();
    public final C90504eH A09 = C90504eH.A05(4096);
    public final AnonymousClass4X5 A0A = new AnonymousClass4X5(0);

    public void AHx(C15060qG r1) {
        this.A01 = r1;
    }

    public int AbN(C55142iu r24, AnonymousClass4Bt r25) {
        int A032;
        int A0F;
        C109595St r2;
        C32371gD r4;
        long j2;
        long j3;
        C15060qG r12 = this.A01;
        C90524eJ.A01(r12);
        C55142iu r10 = r24;
        long length = r10.getLength();
        AnonymousClass4Bt r11 = r25;
        if (length != -1) {
            C88374aO r22 = this.A08;
            if (!r22.A03) {
                if (!r22.A05) {
                    int min = (int) Math.min(20000, length);
                    long j4 = length - ((long) min);
                    if (r10.AF7() != j4) {
                        r11.A00 = j4;
                        return 1;
                    }
                    C90504eH r112 = r22.A06;
                    r112.A0Q(min);
                    r10.AcS();
                    C90504eH.A06(r10, r112, min);
                    int i2 = r112.A01;
                    int i3 = r112.A00 - 4;
                    while (true) {
                        if (i3 < i2) {
                            j3 = -9223372036854775807L;
                            break;
                        }
                        if (AnonymousClass3K2.A0C(r112.A02, i3) == 442) {
                            r112.A0S(i3 + 4);
                            j3 = C88374aO.A00(r112);
                            if (j3 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i3--;
                    }
                    r22.A02 = j3;
                    r22.A05 = true;
                    return 0;
                }
                if (r22.A02 != -9223372036854775807L) {
                    if (!r22.A04) {
                        int min2 = (int) Math.min(20000, length);
                        long j5 = (long) 0;
                        if (r10.AF7() != j5) {
                            r11.A00 = j5;
                            return 1;
                        }
                        C90504eH r8 = r22.A06;
                        r8.A0Q(min2);
                        r10.AcS();
                        C90504eH.A06(r10, r8, min2);
                        int i4 = r8.A01;
                        int i5 = r8.A00;
                        while (true) {
                            if (i4 >= i5 - 3) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            if (AnonymousClass3K2.A0C(r8.A02, i4) == 442) {
                                r8.A0S(i4 + 4);
                                j2 = C88374aO.A00(r8);
                                if (j2 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i4++;
                        }
                        r22.A01 = j2;
                        r22.A04 = true;
                        return 0;
                    }
                    long j6 = r22.A01;
                    if (j6 != -9223372036854775807L) {
                        AnonymousClass4X5 r5 = r22.A07;
                        r22.A00 = r5.A02(r22.A02) - r5.A02(j6);
                    }
                }
                C90504eH r3 = r22.A06;
                byte[] bArr = AnonymousClass3C1.A0A;
                r3.A0U(bArr, bArr.length);
                r22.A03 = true;
                r10.AcS();
                return 0;
            }
        }
        if (!this.A06) {
            this.A06 = true;
            C88374aO r1 = this.A08;
            long j7 = r1.A00;
            if (j7 != -9223372036854775807L) {
                C65353Ul r17 = new C65353Ul(r1.A07, j7, length);
                this.A02 = r17;
                r4 = r17.A02;
            } else {
                r4 = new C32361gC(j7, 0);
            }
            r12.AdD(r4);
        }
        C65353Ul r13 = this.A02;
        if (r13 != null && r13.A00 != null) {
            return r13.A00(r10, r11);
        }
        r10.AcS();
        long AEy = length != -1 ? length - r10.AEy() : -1;
        if (AEy == -1 || AEy >= 4) {
            C90504eH r42 = this.A09;
            if (r10.AaM(r42.A02, 0, 4, true) && (A032 = C90504eH.A03(r42, 0)) != 441) {
                if (A032 == 442) {
                    r10.AaL(r42.A02, 0, 10);
                    r42.A0S(9);
                    A0F = (r42.A0C() & 7) + 14;
                } else if (A032 == 443) {
                    C90504eH.A06(r10, r42, 2);
                    r42.A0S(0);
                    A0F = r42.A0F() + 6;
                } else if (((A032 & -256) >> 8) != 1) {
                    r10.Afx(1);
                    return 0;
                } else {
                    int i6 = A032 & MotionEventCompat.ACTION_MASK;
                    SparseArray sparseArray = this.A07;
                    C85104Nd r7 = (C85104Nd) sparseArray.get(i6);
                    if (!this.A03) {
                        if (r7 == null) {
                            if (i6 == 189) {
                                r2 = new C96904p5((String) null);
                                this.A04 = true;
                                this.A00 = r10.AF7();
                            } else if ((i6 & 224) == 192) {
                                r2 = new C96924p7((String) null);
                                this.A04 = true;
                                this.A00 = r10.AF7();
                            } else if ((i6 & 240) == 224) {
                                r2 = new C96964pB((AnonymousClass4TF) null);
                                this.A05 = true;
                                this.A00 = r10.AF7();
                            }
                            r2.A7e(this.A01, new AnonymousClass4WV(Integer.MIN_VALUE, i6, 256));
                            r7 = new C85104Nd(r2, this.A0A);
                            sparseArray.put(i6, r7);
                        }
                        if (r10.AF7() > ((!this.A04 || !this.A05) ? FileUtils.ONE_MB : this.A00 + 8192)) {
                            this.A03 = true;
                            this.A01.A8W();
                        }
                    }
                    C90504eH.A06(r10, r42, 2);
                    r42.A0S(0);
                    A0F = r42.A0F() + 6;
                    if (r7 != null) {
                        r42.A0Q(A0F);
                        r10.readFully(r42.A02, 0, A0F);
                        r42.A0S(6);
                        C90204dh r82 = r7.A04;
                        r42.A0V(r82.A03, 0, 3);
                        r82.A07(0);
                        r82.A08(8);
                        r7.A01 = r82.A0C();
                        r7.A00 = r82.A0C();
                        r42.A0V(r82.A03, 0, C90204dh.A01(r82, 6, 8));
                        r82.A07(0);
                        long j8 = 0;
                        if (r7.A01) {
                            r82.A08(4);
                            r82.A08(1);
                            long A022 = C90204dh.A02(r82, ((long) r82.A04(3)) << 30);
                            if (!r7.A02 && r7.A00) {
                                r82.A08(1);
                                r7.A05.A02(C90204dh.A02(r82, ((long) C90204dh.A01(r82, 4, 3)) << 30));
                                r7.A02 = true;
                            }
                            j8 = r7.A05.A02(A022);
                        }
                        C109595St r32 = r7.A03;
                        r32.Aa8(j8, 4);
                        r32.A6b(r42);
                        r32.Aa7();
                        r42.A0R(r42.A02.length);
                        return 0;
                    }
                }
                r10.Afx(A0F);
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 != r10) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040 A[LOOP:0: B:24:0x0038->B:26:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AdC(long r8, long r10) {
        /*
            r7 = this;
            X.4X5 r6 = r7.A0A
            long r4 = r6.A00()
            r3 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0022
            monitor-enter(r6)
            long r4 = r6.A00     // Catch:{ all -> 0x002d }
            monitor-exit(r6)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            monitor-enter(r6)
            long r1 = r6.A00     // Catch:{ all -> 0x002d }
            monitor-exit(r6)
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
        L_0x0022:
            monitor-enter(r6)
            r6.A00 = r10     // Catch:{ all -> 0x002d }
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.A01 = r0     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0030:
            monitor-exit(r6)
        L_0x0031:
            X.3Ul r0 = r7.A02
            if (r0 == 0) goto L_0x0038
            r0.A01(r10)
        L_0x0038:
            android.util.SparseArray r1 = r7.A07
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0051
            java.lang.Object r1 = r1.valueAt(r3)
            X.4Nd r1 = (X.C85104Nd) r1
            r0 = 0
            r1.A02 = r0
            X.5St r0 = r1.A03
            r0.AdB()
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96504oR.AdC(long, long):void");
    }

    public boolean Afz(C55142iu r10) {
        byte[] bArr = new byte[14];
        r10.AaL(bArr, 0, 14);
        if (442 != (AnonymousClass3K3.A0M(bArr, 1, (bArr[0] & 255) << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        r10.A4m(bArr[13] & 7);
        r10.AaL(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
