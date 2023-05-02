package X;

import org.json.JSONObject;

/* renamed from: X.61V  reason: invalid class name */
public class AnonymousClass61V implements C1222969a {
    public final C16490t9 A00;
    public final AnonymousClass5vV A01;

    public AnonymousClass61V(C16490t9 r1, AnonymousClass5vV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C53842gO A7M() {
        C53842gO r1 = new C53842gO();
        r1.A0U = this.A01.A00();
        r1.A0R = "BR";
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
        this.A00.A06(r1);
    }

    public void AKK(AnonymousClass2HJ r4, int i2) {
        int i3;
        C16490t9 r2 = this.A00;
        C53842gO A7M = A7M();
        A7M.A0B = Integer.valueOf(i2);
        if (r4 != null) {
            A7M.A0S = String.valueOf(r4.A00);
            A7M.A0T = r4.A08;
            i3 = 2;
        } else {
            i3 = 1;
        }
        A7M.A0C = Integer.valueOf(i3);
        A7M.A08 = C13680ns.A0a();
        r2.A06(A7M);
    }

    public void AKR(C53842gO r2) {
        r2.A0U = this.A01.A00();
        r2.A0R = "BR";
        this.A00.A06(r2);
    }

    public void AKS(Integer num, Integer num2, String str, String str2) {
        C53842gO A7M = A7M();
        A7M.A0a = str;
        A7M.A08 = num;
        if (num2 != null) {
            A7M.A07 = num2;
        }
        if (str2 != null) {
            A7M.A0Z = str2;
        }
        this.A00.A06(A7M);
    }

    public void AKT(Integer num, Integer num2, String str, String str2, boolean z2) {
        AKS(num, num2, str, (String) null);
    }

    public void AKU(AnonymousClass2St r5, Integer num, Integer num2, String str, String str2) {
        C53842gO A7M = A7M();
        A7M.A0a = str;
        A7M.A08 = num;
        if (num2 != null) {
            A7M.A07 = num2;
        }
        if (str2 != null) {
            A7M.A0Z = str2;
        }
        if (r5 != null) {
            JSONObject jSONObject = r5.A01;
            if (jSONObject.has("is_payment_account_setup")) {
                A7M.A01 = Boolean.valueOf(jSONObject.optBoolean("is_payment_account_setup"));
                jSONObject.remove("is_payment_account_setup");
            }
            if (jSONObject.length() > 0) {
                A7M.A0Y = r5.toString();
            }
        }
        this.A00.A06(A7M);
    }

    public void AKV(AnonymousClass2St r2, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        AKU(r2, num, num2, "payment_transaction_details", str2);
    }

    public void AgB() {
    }

    public void reset() {
        this.A01.A01();
    }
}
