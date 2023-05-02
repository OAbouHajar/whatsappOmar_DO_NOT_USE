package X;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3EP  reason: invalid class name */
public final class AnonymousClass3EP implements AnonymousClass5OG {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C86834Ui A03;
    public final AnonymousClass3CL A04;

    public AnonymousClass3EP(C86834Ui r1, AnonymousClass3CL r2, int i2, long j2, long j3) {
        this.A04 = r2;
        this.A00 = i2;
        this.A03 = r1;
        this.A01 = j2;
        this.A02 = j3;
    }

    public static C65943Xe A00(C15730rl r6, C15770rp r7, int i2) {
        C66113Xv r0 = r7.A0Q;
        C65943Xe r5 = r0 == null ? null : r0.A02;
        if (r5 != null && r5.A02) {
            int[] iArr = r5.A04;
            if (iArr != null) {
                int length = iArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (iArr[i3] == i2) {
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
            } else {
                int[] iArr2 = r5.A05;
                if (iArr2 != null) {
                    int length2 = iArr2.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            if (iArr2[i4] == i2) {
                                break;
                            }
                            i4++;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (r6.A00 < r5.A00) {
                return r5;
            }
        }
        return null;
    }

    public final void AOw(C14210on r22) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        AnonymousClass3CL r7 = this.A04;
        if (r7.A06()) {
            C65933Xd r8 = C89874d5.A00().A00;
            if (r8 == null || r8.A03) {
                C15730rl r9 = (C15730rl) r7.A09.get(this.A03);
                if (r9 != null) {
                    C15750rn r3 = r9.A04;
                    if (r3 instanceof C15770rp) {
                        C15770rp r32 = (C15770rp) r3;
                        long j3 = this.A01;
                        boolean z2 = true;
                        long j4 = 0;
                        boolean A1Q = AnonymousClass000.A1Q((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)));
                        int i8 = r32.A0E;
                        if (r8 != null) {
                            A1Q &= r8.A04;
                            i3 = r8.A01;
                            i4 = r8.A02;
                            i2 = r8.A00;
                            if (r32.A0Q != null && !r32.AIg()) {
                                C65943Xe A002 = A00(r9, r32, this.A00);
                                if (A002 != null) {
                                    if (!A002.A03 || j3 <= 0) {
                                        z2 = false;
                                    }
                                    i4 = A002.A00;
                                    A1Q = z2;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i2 = 0;
                            i3 = 5000;
                            i4 = 100;
                        }
                        C14210on r33 = r22;
                        if (r33.A0A()) {
                            i5 = 0;
                            i6 = 0;
                        } else {
                            if (r33.A05) {
                                i5 = 100;
                            } else {
                                Exception A003 = r33.A00();
                                if (A003 instanceof AnonymousClass43Z) {
                                    Status status = ((AnonymousClass43Z) A003).mStatus;
                                    i5 = status.A01;
                                    C15700rh r2 = status.A03;
                                    if (r2 != null) {
                                        i6 = r2.A01;
                                    }
                                } else {
                                    i5 = 101;
                                }
                            }
                            i6 = -1;
                        }
                        if (A1Q) {
                            j4 = j3;
                            j2 = System.currentTimeMillis();
                            i7 = (int) (SystemClock.elapsedRealtime() - this.A02);
                        } else {
                            j2 = 0;
                            i7 = -1;
                        }
                        C65963Xg r92 = new C65963Xg((String) null, (String) null, this.A00, i5, i6, i8, i7, j4, j2);
                        long j5 = (long) i3;
                        Handler handler = r7.A06;
                        handler.sendMessage(handler.obtainMessage(18, new C84584Lc(r92, i2, i4, j5)));
                    }
                }
            }
        }
    }
}
