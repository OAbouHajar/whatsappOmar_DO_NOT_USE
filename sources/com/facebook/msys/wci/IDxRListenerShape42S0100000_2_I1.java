package com.facebook.msys.wci;

import X.AnonymousClass000;
import X.AnonymousClass1SU;
import X.AnonymousClass427;
import X.C13680ns;
import X.C31581eh;
import X.C31591ei;
import X.C31621el;
import X.C35061lJ;
import X.C82974Ew;
import X.C82984Ex;
import X.C84834Mb;
import com.whatsapp.util.Log;

public class IDxRListenerShape42S0100000_2_I1 extends C31581eh {
    public Object A00;
    public final int A01;

    public IDxRListenerShape42S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(int i2, int i3) {
        int i4;
        if (6 - this.A01 != 0) {
            super.A00(i2, i3);
            return;
        }
        C31591ei r3 = (C31591ei) this.A00;
        if (i2 != 1) {
            i4 = 0;
            if (i2 != 3) {
                i4 = -1;
                StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/autoconf-verifier-request-status-unspecified; response-status ");
                A0r.append(i2);
                Log.e(C13680ns.A0i(" failure-reason ", A0r, i3));
            }
        } else {
            i4 = 1;
        }
        r3.A02(new C82984Ex(i4));
    }

    public void A01(int i2, int i3) {
        if (2 - this.A01 != 0) {
            super.A01(i2, i3);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/send-funnel-log/status/");
        A0r.append(i2);
        Log.i(C13680ns.A0i("/failureReason/", A0r, i3));
        ((C31591ei) this.A00).A02((Object) null);
    }

    public void A02(long j2, long j3, int i2, int i3, int i4) {
        if (4 - this.A01 != 0) {
            super.A02(j2, j3, i2, i3, i4);
            return;
        }
        C31591ei r3 = (C31591ei) this.A00;
        AnonymousClass427 A002 = AnonymousClass1SU.A00(i2, i3);
        if (A002 == AnonymousClass427.ERROR_UNSPECIFIED) {
            StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/request-code-status-standalone-unspecified; response-status ");
            A0r.append(i2);
            Log.e(C13680ns.A0i(" failure-reason ", A0r, i3));
        }
        C35061lJ r1 = new C35061lJ(A002);
        r1.A03 = i3;
        r1.A0E = String.valueOf(j2);
        r1.A0F = String.valueOf(j3);
        r1.A01 = i4;
        r3.A02(r1);
    }

    public void A03(String str, int i2, int i3, int i4, int i5, long j2, boolean z2) {
        if (this.A01 != 0) {
            super.A03(str, i2, i3, i4, i5, j2, z2);
            return;
        }
        C31591ei r4 = (C31591ei) this.A00;
        int i6 = 1;
        if (i2 == 1) {
            i6 = 2;
        } else if (i2 != 2) {
            i6 = -1;
            if (i2 == 3) {
                if (i3 == 6) {
                    i6 = 13;
                } else if (i3 == 23) {
                    i6 = 10;
                } else if (i3 == 32) {
                    i6 = 14;
                } else if (i3 == 8) {
                    i6 = 12;
                } else if (i3 == 9) {
                    i6 = 11;
                }
            }
            StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/send-device-confirmation-status-unspecified; response-status ");
            A0r.append(i2);
            Log.e(C13680ns.A0i(" failure-reason ", A0r, i3));
        }
        r4.A02(new C84834Mb(str, String.valueOf(j2), i6, AnonymousClass000.A1R(i4, 1)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r8 != 32) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r6, int r7, int r8, int r9, long r10, boolean r12) {
        /*
            r5 = this;
            int r0 = r5.A01
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x000a
            super.A04(r6, r7, r8, r9, r10, r12)
            return
        L_0x000a:
            java.lang.Object r2 = r5.A00
            X.1ei r2 = (X.C31591ei) r2
            r4 = 1
            if (r7 == r4) goto L_0x004c
            r0 = 3
            if (r7 != r0) goto L_0x0023
            if (r8 == r4) goto L_0x0049
            r0 = 6
            if (r8 == r0) goto L_0x0046
            r0 = 23
            if (r8 == r0) goto L_0x0043
            r0 = 32
            r3 = 13
            if (r8 == r0) goto L_0x0036
        L_0x0023:
            r3 = -1
            java.lang.String r0 = "wamsys/registration/fetch-device-confirmation-status-unspecified; response-status "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = " failure-reason "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r8)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            boolean r1 = X.AnonymousClass000.A1R(r9, r4)
            X.4Mc r0 = new X.4Mc
            r0.<init>(r6, r3, r1, r12)
            r2.A02(r0)
            return
        L_0x0043:
            r3 = 11
            goto L_0x0036
        L_0x0046:
            r3 = 12
            goto L_0x0036
        L_0x0049:
            r3 = 10
            goto L_0x0036
        L_0x004c:
            r3 = 1
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.wci.IDxRListenerShape42S0100000_2_I1.A04(java.lang.String, int, int, int, long, boolean):void");
    }

    public void A05(String str, String str2, int i2, int i3) {
        if (5 - this.A01 != 0) {
            super.A05(str, str2, i2, i3);
            return;
        }
        C31591ei r2 = (C31591ei) this.A00;
        if (!(i2 == 2 || i2 == 3)) {
            StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/autoconf-request-status-unspecified; response-status ");
            A0r.append(i2);
            Log.e(C13680ns.A0i(" failure-reason ", A0r, i3));
        }
        C82974Ew r0 = new C82974Ew();
        r0.A00 = str;
        r2.A02(r0);
    }

    public void A09(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, int i3, int i4, int i5, int i6, int i7, long j2, long j3, long j4, long j5, long j6, long j7, boolean z2, boolean z3) {
        int i8 = i3;
        int i9 = i2;
        String str12 = str10;
        String str13 = str9;
        String str14 = str8;
        String str15 = str7;
        String str16 = str6;
        String str17 = str5;
        String str18 = str4;
        String str19 = str3;
        long j8 = j7;
        int i10 = i5;
        long j9 = j6;
        long j10 = j5;
        long j11 = j4;
        long j12 = j3;
        long j13 = j2;
        String str20 = str2;
        boolean z4 = z3;
        int i11 = i7;
        int i12 = i6;
        int i13 = i4;
        String str21 = str;
        if (3 - this.A01 != 0) {
            String str22 = str18;
            String str23 = str17;
            String str24 = str16;
            String str25 = str15;
            String str26 = str14;
            String str27 = str13;
            String str28 = str12;
            String str29 = str21;
            String str30 = str20;
            String str31 = str19;
            super.A09(str29, str30, str31, str22, str23, str24, str25, str26, str27, str28, str11, i9, i8, i13, i10, i12, i11, j13, j12, j11, j10, j9, j8, z2, z4);
            return;
        }
        C31591ei r4 = (C31591ei) this.A00;
        AnonymousClass427 A002 = AnonymousClass1SU.A00(i9, i8);
        if (A002 == AnonymousClass427.ERROR_UNSPECIFIED) {
            StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/request-code-status-unspecified; response-status ");
            A0r.append(i9);
            Log.e(C13680ns.A0i(" failure-reason ", A0r, i8));
        }
        C35061lJ r3 = new C35061lJ(A002);
        r3.A03 = i8;
        r3.A0B = str21;
        boolean z5 = false;
        r3.A0L = AnonymousClass000.A1R(i13, 1);
        if (i10 == 1) {
            z5 = true;
        }
        r3.A0K = z5;
        r3.A0E = String.valueOf(j13);
        r3.A09 = str20;
        r3.A0D = str19;
        r3.A0F = String.valueOf(j12);
        r3.A0G = String.valueOf(j11);
        r3.A0H = String.valueOf(j10);
        r3.A0J = str18;
        r3.A0I = str17;
        r3.A04 = j9;
        r3.A01 = i12;
        r3.A08 = str16;
        r3.A0A = String.valueOf(j8);
        r3.A05 = new C31621el(str15, str14, str13, z4);
        r3.A00 = i11;
        r3.A07 = str12;
        r4.A02(r3);
    }
}
