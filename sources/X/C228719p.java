package X;

/* renamed from: X.19p  reason: invalid class name and case insensitive filesystem */
public final class C228719p implements C1222969a {
    public C16490t9 A00;
    public AnonymousClass174 A01;
    public AnonymousClass5vV A02;

    public C228719p(C16490t9 r2, AnonymousClass174 r3, AnonymousClass5vV r4) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r3, 3);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public void A00(AnonymousClass2St r3, Integer num, String str, String str2, int i2) {
        C18450wi.A0H(str, 2);
        C53842gO A7M = A7M();
        A7M.A0a = str;
        A7M.A08 = Integer.valueOf(i2);
        if (num != null) {
            A7M.A07 = num;
        }
        if (str2 != null) {
            A7M.A0Z = str2;
        }
        if (r3 != null && r3.A01.length() > 0) {
            A7M.A0Y = r3.toString();
        }
        this.A00.A06(A7M);
    }

    public void A01(AnonymousClass2St r3, Integer num, String str, String str2, String str3, String str4, int i2, boolean z2) {
        C53842gO A7M = A7M();
        A7M.A0a = str;
        A7M.A08 = Integer.valueOf(i2);
        if (num != null) {
            A7M.A07 = num;
        }
        if (str2 != null) {
            A7M.A0Z = str2;
        }
        if (r3 != null && r3.A01.length() > 0) {
            A7M.A0Y = r3.toString();
        }
        A7M.A06 = Boolean.valueOf(z2);
        A7M.A0V = str3;
        A7M.A0W = str4;
        this.A00.A06(A7M);
    }

    public C53842gO A7M() {
        C53842gO r1 = new C53842gO();
        r1.A0U = this.A02.A00();
        C30681cm A012 = this.A01.A01();
        r1.A0R = A012 == null ? null : A012.A03;
        return r1;
    }

    public /* bridge */ /* synthetic */ void AKI(AnonymousClass2KI r1, Integer num, Integer num2, String str, String str2) {
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
        A7M.A08 = 3;
        r2.A06(A7M);
    }

    public void AKR(C53842gO r2) {
        r2.A0U = this.A02.A00();
        C30681cm A012 = this.A01.A01();
        r2.A0R = A012 == null ? null : A012.A03;
        this.A00.A06(r2);
    }

    public /* bridge */ /* synthetic */ void AKS(Integer num, Integer num2, String str, String str2) {
        int intValue = num.intValue();
        C18450wi.A0H(str, 2);
        C53842gO A7M = A7M();
        A7M.A0a = str;
        A7M.A08 = Integer.valueOf(intValue);
        if (num2 != null) {
            A7M.A07 = num2;
        }
        if (str2 != null) {
            A7M.A0Z = str2;
        }
        this.A00.A06(A7M);
    }

    public /* bridge */ /* synthetic */ void AKT(Integer num, Integer num2, String str, String str2, boolean z2) {
        C18450wi.A0H(str, 2);
        C53842gO A7M = A7M();
        A7M.A0a = str;
        A7M.A08 = 1;
        if (num2 != null) {
            A7M.A07 = num2;
        }
        this.A00.A06(A7M);
    }

    public /* bridge */ /* synthetic */ void AKU(AnonymousClass2St r7, Integer num, Integer num2, String str, String str2) {
        A00(r7, num2, str, str2, num.intValue());
    }

    public /* bridge */ /* synthetic */ void AKV(AnonymousClass2St r10, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        A01(r10, num2, "payment_transaction_details", str2, (String) null, (String) null, num.intValue(), z3);
    }

    public void AgB() {
        this.A02.A02();
    }

    public void reset() {
        this.A02.A01();
    }
}
