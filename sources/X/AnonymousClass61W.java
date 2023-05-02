package X;

import org.json.JSONObject;

/* renamed from: X.61W  reason: invalid class name */
public class AnonymousClass61W implements C1222969a {
    public C14710pd A00;
    public Integer A01;
    public final C16490t9 A02;
    public final AnonymousClass60V A03;
    public final AnonymousClass5vV A04;

    public AnonymousClass61W(C16490t9 r1, AnonymousClass60V r2, AnonymousClass5vV r3) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
    }

    public static final void A00(C53842gO r3, AnonymousClass2St r4) {
        if (r4 != null) {
            JSONObject jSONObject = r4.A01;
            if (jSONObject.has("is_payment_account_setup")) {
                r3.A01 = Boolean.valueOf(jSONObject.optBoolean("is_payment_account_setup"));
                jSONObject.remove("is_payment_account_setup");
            }
            if (jSONObject.length() > 0) {
                r3.A0Y = r4.toString();
            }
        }
    }

    public static void A01(C53842gO r1, AnonymousClass2St r2, AnonymousClass61W r3, boolean z2) {
        r1.A05 = Boolean.valueOf(z2);
        A00(r1, r2);
        r3.A02.A06(r1);
    }

    public C53842gO A02(AnonymousClass2HJ r3, int i2) {
        int i3;
        C53842gO A7M = A7M();
        A7M.A0B = Integer.valueOf(i2);
        if (r3 != null) {
            A7M.A0S = String.valueOf(r3.A00);
            A7M.A0T = r3.A08;
            i3 = 2;
        } else {
            i3 = 1;
        }
        A7M.A0C = Integer.valueOf(i3);
        A7M.A08 = C13680ns.A0a();
        return A7M;
    }

    public C53842gO A03(Integer num, Integer num2, String str, String str2) {
        return A04(num, num2, str, str2, (String) null, (String) null, false);
    }

    public C53842gO A04(Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z2) {
        C53842gO A7M = A7M();
        A7M.A0a = str;
        A7M.A06 = Boolean.valueOf(z2);
        A7M.A08 = num;
        if (this.A00.A0C(1330)) {
            A7M.A0V = str3;
            A7M.A0W = str4;
        }
        if (num2 != null) {
            A7M.A07 = num2;
        }
        if (str2 != null) {
            A7M.A0Z = str2;
        }
        return A7M;
    }

    public void A05(C30671cl r3, AnonymousClass2HJ r4, int i2) {
        C53842gO A022 = A02(r4, i2);
        C39901tF r0 = r3.A08;
        A022.A0O = r0 == null ? "" : ((C111805hR) r0).A0C;
        this.A02.A06(A022);
    }

    public void A06(AnonymousClass2HJ r3, int i2, int i3) {
        C53842gO A7M = A7M();
        A7M.A0B = Integer.valueOf(i2);
        if (r3 != null) {
            A7M.A0S = String.valueOf(r3.A00);
            A7M.A0T = r3.A08;
        }
        A7M.A0A = Integer.valueOf(i3);
        A7M.A08 = C13680ns.A0a();
        A7M.A0a = "api_event";
        AnonymousClass00B.A06(A7M);
        AKR(A7M);
    }

    public void A07(AnonymousClass2St r3, Integer num, Integer num2, String str, String str2, String str3) {
        C53842gO A032 = A03(num, num2, str2, str3);
        A032.A0X = str;
        A00(A032, r3);
        this.A02.A06(A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r3.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Integer r2 = X.C13680ns.A0Y()
            if (r4 == 0) goto L_0x000e
            int r0 = r4.hashCode()
            r1 = 2
            switch(r0) {
                case 81882: goto L_0x0011;
                case 2023329: goto L_0x001b;
                case 2212537: goto L_0x0029;
                default: goto L_0x000e;
            }
        L_0x000e:
            r3.A01 = r2
            return
        L_0x0011:
            java.lang.String r0 = "SBI"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 4
            goto L_0x0024
        L_0x001b:
            java.lang.String r0 = "AXIS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 3
        L_0x0024:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0035
        L_0x0029:
            java.lang.String r0 = "HDFC"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0035:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass61W.A08(java.lang.String):void");
    }

    public C53842gO A7M() {
        C53842gO r1 = new C53842gO();
        r1.A0U = this.A04.A00();
        r1.A0R = "IN";
        A08(this.A03.A08());
        r1.A0F = this.A01;
        return r1;
    }

    public void AKI(AnonymousClass2KI r3, Integer num, Integer num2, String str, String str2) {
        int i2;
        C111935hf r1 = new C111935hf();
        r1.A01 = num;
        r1.A08 = str;
        if (num2 != null) {
            r1.A00 = num2;
        }
        r1.A06 = str2;
        if (r3 != null) {
            r1.A05 = r3.A06;
            r1.A07 = r3.A08;
            r1.A04 = r3.A05;
            r1.A02 = Integer.valueOf(r3.A01);
            i2 = 1;
        } else {
            i2 = 2;
        }
        r1.A03 = Integer.valueOf(i2);
        this.A02.A06(r1);
    }

    public void AKK(AnonymousClass2HJ r2, int i2) {
        AKR(A02(r2, i2));
    }

    public void AKR(C53842gO r2) {
        r2.A0U = this.A04.A00();
        r2.A0R = "IN";
        this.A02.A06(r2);
    }

    public void AKS(Integer num, Integer num2, String str, String str2) {
        this.A02.A06(A03(num, num2, str, str2));
    }

    public void AKT(Integer num, Integer num2, String str, String str2, boolean z2) {
        C53842gO A032 = A03(num, num2, str, str2);
        A032.A05 = Boolean.valueOf(z2);
        this.A02.A06(A032);
    }

    public void AKU(AnonymousClass2St r11, Integer num, Integer num2, String str, String str2) {
        AKV(r11, num, num2, str, str2, (String) null, (String) null, false, false);
    }

    public void AKV(AnonymousClass2St r11, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        A01(A04(num, num2, str, str2, str3, str4, z3), r11, this, z2);
    }

    public void AgB() {
        this.A04.A02();
    }

    public void reset() {
        this.A04.A01();
    }
}
