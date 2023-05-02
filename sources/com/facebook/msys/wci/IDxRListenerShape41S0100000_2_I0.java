package com.facebook.msys.wci;

import X.AnonymousClass000;
import X.AnonymousClass1SU;
import X.AnonymousClass423;
import X.C13680ns;
import X.C31581eh;
import X.C31591ei;
import X.C31621el;
import X.C31631em;
import X.C31641en;
import X.C46582Ez;
import X.C47112Hq;
import android.util.Base64;
import com.whatsapp.util.Log;

public class IDxRListenerShape41S0100000_2_I0 extends C31581eh {
    public Object A00;
    public final int A01;

    public IDxRListenerShape41S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A06(String str, String str2, String str3, int i2, int i3, long j2) {
        int i4;
        int i5;
        String str4 = str2;
        String str5 = str3;
        int i6 = i2;
        int i7 = i3;
        long j3 = j2;
        if (this.A01 != 0) {
            super.A06(str, str4, str5, i6, i7, j3);
            return;
        }
        C31591ei r2 = (C31591ei) this.A00;
        if (i6 != 1) {
            i4 = 0;
            if (i6 != 3) {
                i4 = -1;
                StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/reg-onboard-abprop-request-status-unspecified; response-status ");
                A0r.append(i6);
                Log.e(C13680ns.A0i(" failure-reason ", A0r, i7));
            }
        } else {
            i4 = 1;
        }
        if (i7 != 6) {
            i5 = 1;
            if (i7 != 33) {
                i5 = -1;
            }
        } else {
            i5 = 0;
        }
        r2.A02(new C46582Ez(str4, str5, i4, i5, j3));
    }

    public void A07(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, long j3, long j4, long j5, boolean z2, boolean z3) {
        int i9 = i6;
        int i10 = i5;
        int i11 = i4;
        int i12 = i3;
        int i13 = i2;
        String str9 = str8;
        String str10 = str7;
        String str11 = str6;
        boolean z4 = z3;
        boolean z5 = z2;
        long j6 = j5;
        long j7 = j4;
        long j8 = j3;
        long j9 = j2;
        String str12 = str3;
        String str13 = str2;
        String str14 = str;
        String str15 = str4;
        if (1 - this.A01 != 0) {
            int i14 = i10;
            int i15 = i9;
            String str16 = str14;
            String str17 = str13;
            String str18 = str12;
            String str19 = str15;
            int i16 = i13;
            int i17 = i12;
            super.A07(str16, str17, str18, str19, str5, str11, str10, str9, i16, i17, i11, i14, i15, i7, i8, j9, j8, j7, j6, z5, z4);
            return;
        }
        C31591ei r11 = (C31591ei) this.A00;
        C31631em A012 = AnonymousClass1SU.A01(i13, i12);
        if (A012 == C31631em.ERROR_UNSPECIFIED) {
            StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/verify-code-status-unspecified; response-status ");
            A0r.append(i13);
            Log.e(C13680ns.A0i(" failure-reason ", A0r, i12));
        }
        C31641en r8 = new C31641en(A012);
        r8.A08 = str14;
        boolean z6 = true;
        r8.A0E = AnonymousClass000.A1R(i11, 1);
        if (i10 != 1) {
            z6 = false;
        }
        r8.A0D = z6;
        r8.A0C = z5;
        r8.A09 = String.valueOf(j9);
        r8.A0B = str13;
        r8.A0A = str12;
        r8.A04 = j8;
        r8.A00 = i9;
        r8.A02 = j7;
        r8.A03 = j6;
        r8.A05 = new C31621el(str11, str10, str9, z4);
        if (str4 != null) {
            r8.A0F = Base64.decode(str15, 0);
        }
        r11.A02(r8);
    }

    public void A08(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, int i4, int i5, int i6, int i7, long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z4) {
        AnonymousClass423 r0;
        int i8 = i6;
        int i9 = i5;
        int i10 = i4;
        int i11 = i3;
        int i12 = i2;
        boolean z5 = z3;
        long j6 = j4;
        long j7 = j3;
        long j8 = j2;
        String str9 = str2;
        String str10 = str;
        String str11 = str3;
        String str12 = str5;
        if (2 - this.A01 != 0) {
            String str13 = str6;
            long j9 = j5;
            String str14 = str4;
            int i13 = i7;
            int i14 = i10;
            int i15 = i9;
            long j10 = j8;
            long j11 = j7;
            long j12 = j6;
            String str15 = str9;
            String str16 = str12;
            int i16 = i12;
            int i17 = i11;
            String str17 = str10;
            super.A08(str17, str15, str11, str14, str16, str13, str7, str8, i16, i17, i14, i15, i8, i13, j10, j11, j12, j9, z2, z5, z4);
            return;
        }
        C31591ei r8 = (C31591ei) this.A00;
        if (i12 == 1 || i12 == 2) {
            r0 = AnonymousClass423.YES;
        } else {
            if (i12 == 3) {
                if (i11 == 1) {
                    r0 = AnonymousClass423.FAIL_INCORRECT;
                } else if (i11 == 2) {
                    r0 = AnonymousClass423.FAIL_BLOCKED;
                } else if (i11 == 6) {
                    r0 = AnonymousClass423.FAIL_TEMPORARILY_UNAVAILABLE;
                } else if (i11 == 11) {
                    r0 = AnonymousClass423.FAIL_TOO_MANY_GUESSES;
                } else if (i11 == 22) {
                    r0 = AnonymousClass423.FAIL_STALE;
                } else if (i11 == 28) {
                    r0 = AnonymousClass423.FAIL_RESET_TOO_SOON;
                } else if (i11 == 19) {
                    r0 = AnonymousClass423.FAIL_MISMATCH;
                } else if (i11 == 20) {
                    r0 = AnonymousClass423.FAIL_GUESSED_TOO_FAST;
                }
            }
            r0 = AnonymousClass423.ERROR_UNSPECIFIED;
        }
        if (r0 == AnonymousClass423.ERROR_UNSPECIFIED) {
            StringBuilder A0r = AnonymousClass000.A0r("wamsys/registration/security-status-unspecified; response-status ");
            A0r.append(i12);
            Log.e(C13680ns.A0i(" failure-reason ", A0r, i11));
        }
        C47112Hq r13 = new C47112Hq(r0);
        r13.A05 = str10;
        boolean z6 = true;
        r13.A09 = AnonymousClass000.A1R(i10, 1);
        if (i9 != 1) {
            z6 = false;
        }
        r13.A08 = z6;
        r13.A04 = String.valueOf(i8);
        r13.A00 = j8;
        r13.A07 = str9;
        r13.A06 = str11;
        r13.A02 = j7;
        r13.A01 = j6;
        r13.A0A = z5;
        if (str5 != null) {
            r13.A0B = Base64.decode(str12, 0);
        }
        r8.A02(r13);
    }
}
