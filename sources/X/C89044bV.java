package X;

import java.util.ArrayList;

/* renamed from: X.4bV  reason: invalid class name and case insensitive filesystem */
public final class C89044bV {
    public static final ArrayList A09;
    public static final ArrayList A0A;
    public static final ArrayList A0B;
    public static final ArrayList A0C;
    public final C28371Vv A00;
    public final C89034bU A01;
    public final C89064bX A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    static {
        String[] strArr = new String[2];
        strArr[0] = "0";
        A0C = AnonymousClass3K2.A0q("1", strArr, 1);
        String[] strArr2 = new String[3];
        strArr2[0] = "combo";
        strArr2[1] = "credit";
        A0B = AnonymousClass3K2.A0q("debit", strArr2, 2);
        String[] strArr3 = new String[5];
        strArr3[0] = "AMEX";
        strArr3[1] = "DISCOVER";
        strArr3[2] = "MAESTRO";
        strArr3[3] = "MASTERCARD";
        A0A = AnonymousClass3K2.A0q("VISA", strArr3, 4);
        String[] strArr4 = new String[4];
        strArr4[0] = "ACTIVE";
        strArr4[1] = "EXPIRED";
        strArr4[2] = "SUSPENDED";
        A09 = AnonymousClass3K2.A0q("VOIDED", strArr4, 3);
    }

    public C89044bV(C16300so r21, C28371Vv r22) {
        C28371Vv r5 = r22;
        C28371Vv.A06(r5, "card");
        Class<String> cls = String.class;
        this.A04 = (String) C32271fx.A01((C16300so) null, r5, cls, 4L, 4, (Object) null, new String[]{"last4"}, false);
        C28371Vv r13 = r5;
        Class<String> cls2 = cls;
        this.A06 = (String) C32271fx.A01((C16300so) null, r13, cls2, AnonymousClass3K2.A0Z(), 1000L, (Object) null, new String[]{"time-last-added"}, false);
        this.A08 = C32271fx.A06(r5, A0C, new String[]{"verified"});
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        this.A07 = (String) C32271fx.A01((C16300so) null, r13, cls2, A0X, A0Y, (Object) null, new String[]{"type"}, false);
        this.A05 = (String) C32271fx.A01((C16300so) null, r13, cls2, A0X, A0Y, (Object) null, new String[]{"network-type"}, false);
        this.A03 = C32271fx.A05(r5, A09, new String[]{"display-state"});
        C16300so r2 = r21;
        this.A01 = (C89034bU) AnonymousClass3K2.A0d(r2, r5, 11, 0);
        this.A02 = (C89064bX) AnonymousClass3K2.A0d(r2, r5, 10, 0);
        this.A00 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C89044bV.class != obj.getClass()) {
                return false;
            }
            C89044bV r5 = (C89044bV) obj;
            if (!this.A08.equals(r5.A08) || !this.A07.equals(r5.A07) || !this.A05.equals(r5.A05) || !C34901l3.A00(this.A03, r5.A03) || !this.A04.equals(r5.A04) || !this.A06.equals(r5.A06) || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A08;
        objArr[1] = this.A07;
        objArr[2] = this.A05;
        objArr[3] = this.A03;
        objArr[4] = this.A04;
        objArr[5] = this.A06;
        objArr[6] = this.A01;
        return AnonymousClass000.A0F(this.A02, objArr, 7);
    }
}
