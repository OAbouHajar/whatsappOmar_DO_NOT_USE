package com.google.i18n.phonenumbers;

import X.AnonymousClass3HS;
import X.C26071Mf;
import X.C798041j;
import X.C801442s;

public class IDxLeniencyShape8S0000000_2_I1 extends C801442s {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxLeniencyShape8S0000000_2_I1(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000c;
                case 1: goto L_0x0010;
                case 2: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = "EXACT_GROUPING"
            r0 = 4
        L_0x0008:
            r2.<init>(r1, r0)
            return
        L_0x000c:
            java.lang.String r1 = "POSSIBLE"
            r0 = 0
            goto L_0x0008
        L_0x0010:
            java.lang.String r1 = "WHATS_APP"
            r0 = 2
            goto L_0x0008
        L_0x0014:
            java.lang.String r1 = "STRICT_GROUPING"
            r0 = 3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.IDxLeniencyShape8S0000000_2_I1.<init>(int):void");
    }

    public boolean A00(C26071Mf r6, AnonymousClass3HS r7, String str) {
        if (1 - this.A00 != 0) {
            return super.A00(r6, r7, str);
        }
        C801442s r4 = C801442s.A01;
        if (r4.A00(r6, r7, str)) {
            return true;
        }
        if (r7.hasNationalNumber) {
            String valueOf = String.valueOf(r7.nationalNumber_);
            if (valueOf.startsWith("8") && r7.hasCountryCode && r7.countryCode_ == 7 && r7.hasCountryCodeSource && r7.countryCodeSource_ == C798041j.FROM_DEFAULT_COUNTRY) {
                long parseLong = Long.parseLong(valueOf.substring(1));
                r7.hasNationalNumber = true;
                r7.nationalNumber_ = parseLong;
                C798041j r0 = C798041j.FROM_NUMBER_WITHOUT_PLUS_SIGN;
                r7.hasCountryCodeSource = true;
                r7.countryCodeSource_ = r0;
                return r4.A00(r6, r7, str);
            }
        }
        if (!r7.hasItalianLeadingZero || !r7.italianLeadingZero_) {
            return false;
        }
        r7.hasItalianLeadingZero = false;
        r7.italianLeadingZero_ = false;
        return r4.A00(r6, r7, str);
    }
}
