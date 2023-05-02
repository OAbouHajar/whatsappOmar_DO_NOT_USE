package X;

import java.util.ArrayList;

/* renamed from: X.53W  reason: invalid class name */
public final class AnonymousClass53W implements AnonymousClass5N8 {
    public static final ArrayList A06;
    public final C28371Vv A00;
    public final C89014bS A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    static {
        String[] strArr = new String[3];
        strArr[0] = "FAILED";
        strArr[1] = "PENDING";
        A06 = AnonymousClass3K2.A0q("VERIFIED", strArr, 2);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [int, boolean] */
    public AnonymousClass53W(C16300so r14, C28371Vv r15) {
        C28371Vv r6 = r15;
        C28371Vv.A06(r15, "payout");
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        Class<String> cls = String.class;
        C32271fx.A01((C16300so) null, r6, cls, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), "bank", strArr, A1C);
        String[] strArr2 = new String[1];
        strArr2[A1C] = "account-number";
        Long A0a = AnonymousClass3K2.A0a();
        this.A02 = (String) C32271fx.A00((C16300so) null, r6, cls, A0a, 100L, (Object) null, strArr2, A1C);
        String[] strArr3 = new String[1];
        strArr3[A1C] = "bank-name";
        this.A03 = (String) C32271fx.A01((C16300so) null, r6, cls, A0a, 100L, (Object) null, strArr3, A1C);
        String[] strArr4 = new String[1];
        strArr4[A1C] = "code";
        this.A04 = (String) C32271fx.A00((C16300so) null, r6, cls, A0a, 100L, (Object) null, strArr4, A1C);
        ArrayList arrayList = A06;
        String[] strArr5 = new String[1];
        strArr5[A1C] = "verification-status";
        this.A05 = C32271fx.A06(r15, arrayList, strArr5);
        this.A01 = (C89014bS) AnonymousClass3K2.A0d(r14, r15, 47, A1C);
        this.A00 = r15;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass53W.class != obj.getClass()) {
                return false;
            }
            AnonymousClass53W r5 = (AnonymousClass53W) obj;
            if (!this.A05.equals(r5.A05) || !C34901l3.A00(this.A02, r5.A02) || !this.A03.equals(r5.A03) || !C34901l3.A00(this.A04, r5.A04) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A05;
        objArr[1] = this.A02;
        objArr[2] = this.A03;
        objArr[3] = this.A04;
        return AnonymousClass000.A0F(this.A01, objArr, 4);
    }
}
