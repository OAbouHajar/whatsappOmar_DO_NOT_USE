package X;

import android.content.SharedPreferences;

/* renamed from: X.12L  reason: invalid class name */
public class AnonymousClass12L {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass01V A09;
    public final AnonymousClass01D A0A;

    public AnonymousClass12L(AnonymousClass01V r3, AnonymousClass01D r4) {
        this.A09 = r3;
        this.A0A = r4;
        this.A02 = false;
    }

    public String A00(String str) {
        A01();
        boolean A0C = C004101u.A0C(this.A09);
        A01();
        String str2 = this.A00;
        boolean z2 = this.A05;
        boolean z3 = this.A06;
        boolean z4 = this.A03;
        boolean z5 = this.A04;
        boolean z6 = this.A01;
        if ("register-phone".equals(str2)) {
            return A0C ? "register-phone-rtd" : z2 ? "register-phone-no_number" : !z3 ? "register-phone-invalid" : str;
        }
        if ("verify-sms".equals(str2) || "verify-second-sms".equals(str2)) {
            return A0C ? "verify-sms-rtd" : !z4 ? !z5 ? !z6 ? "verify-second-sms".equals(str2) ? str2 : "verify-sms-normal" : str : "verify-sms-no_routes_voice" : z5 ? "verify-sms-no_routes_both" : "verify-sms-no_routes_sms";
        }
        String str3 = "verify-tma";
        if (!str3.equals(str2)) {
            str3 = "verify-tmg";
            return str3.equals(str2) ? str3 : str;
        }
    }

    public final synchronized void A01() {
        if (!this.A02) {
            AnonymousClass01D r3 = this.A0A;
            this.A01 = ((SharedPreferences) ((C15860rz) r3.get()).A01.get()).getBoolean("pref_fail_too_many", false);
            this.A03 = ((SharedPreferences) ((C15860rz) r3.get()).A01.get()).getBoolean("pref_no_route_sms", false);
            this.A04 = ((SharedPreferences) ((C15860rz) r3.get()).A01.get()).getBoolean("pref_no_route_voice", false);
            this.A07 = ((SharedPreferences) ((C15860rz) r3.get()).A01.get()).getBoolean("pref_fail_too_many_attempts", false);
            this.A08 = ((SharedPreferences) ((C15860rz) r3.get()).A01.get()).getBoolean("pref_fail_too_many_guesses", false);
            this.A02 = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r11) {
        /*
            r10 = this;
            r10.A00 = r11
            r10.A01()
            java.lang.String r2 = "verify-tmg"
            boolean r0 = r11.equals(r2)
            r8 = 0
            r9 = 1
            java.lang.String r1 = "verify-tma"
            if (r0 == 0) goto L_0x0048
            r10.A08 = r9
            r10.A07 = r8
            X.01D r0 = r10.A0A
            java.lang.Object r4 = r0.get()
            X.0rz r4 = (X.C15860rz) r4
            boolean r5 = r10.A01
            boolean r6 = r10.A03
            boolean r7 = r10.A04
        L_0x0025:
            r4.A1U(r5, r6, r7, r8, r9)
        L_0x0028:
            java.lang.String r0 = "verify-sms"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "verify-second-sms"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0040
        L_0x003a:
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x0041
            r10.A00 = r2
        L_0x0040:
            return
        L_0x0041:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0040
            r10.A00 = r1
            return
        L_0x0048:
            boolean r0 = r11.equals(r1)
            if (r0 == 0) goto L_0x0028
            r10.A08 = r8
            r10.A07 = r9
            X.01D r0 = r10.A0A
            java.lang.Object r4 = r0.get()
            X.0rz r4 = (X.C15860rz) r4
            boolean r5 = r10.A01
            boolean r6 = r10.A03
            boolean r7 = r10.A04
            r8 = 1
            r9 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12L.A02(java.lang.String):void");
    }

    public void A03(String str) {
        A01();
        switch (str.hashCode()) {
            case -1976127222:
                if (str.equals("noRouteVoice")) {
                    this.A04 = true;
                    break;
                }
                break;
            case -1893373339:
                if (str.equals("validNumber")) {
                    this.A06 = true;
                    break;
                }
                break;
            case -1777505757:
                if (str.equals("notEmptyNumber")) {
                    this.A05 = false;
                    break;
                }
                break;
            case -1522953003:
                if (str.equals("failTooMany")) {
                    this.A01 = true;
                    break;
                }
                break;
            case -416647790:
                if (str.equals("notValidNumber")) {
                    this.A06 = false;
                    break;
                }
                break;
            case 1040735990:
                if (str.equals("emptyNumber")) {
                    this.A05 = true;
                    break;
                }
                break;
            case 1164419889:
                if (str.equals("noRouteSms")) {
                    this.A03 = true;
                    break;
                }
                break;
        }
        ((C15860rz) this.A0A.get()).A1U(this.A01, this.A03, this.A04, this.A07, this.A08);
    }
}
