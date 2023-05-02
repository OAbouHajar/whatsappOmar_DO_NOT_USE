package X;

import java.util.ArrayList;

/* renamed from: X.4bU  reason: invalid class name and case insensitive filesystem */
public final class C89034bU {
    public static final ArrayList A08;
    public static final ArrayList A09;
    public static final ArrayList A0A;
    public static final ArrayList A0B;
    public static final ArrayList A0C;
    public static final ArrayList A0D;
    public final C28371Vv A00;
    public final C89014bS A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    static {
        String[] strArr = new String[2];
        strArr[0] = "0";
        A0A = AnonymousClass3K2.A0q("1", strArr, 1);
        String[] strArr2 = new String[2];
        strArr2[0] = "0";
        A0D = AnonymousClass3K2.A0q("1", strArr2, 1);
        String[] strArr3 = new String[2];
        strArr3[0] = "0";
        A09 = AnonymousClass3K2.A0q("1", strArr3, 1);
        String[] strArr4 = new String[2];
        strArr4[0] = "0";
        A08 = AnonymousClass3K2.A0q("1", strArr4, 1);
        String[] strArr5 = new String[2];
        strArr5[0] = "0";
        A0C = AnonymousClass3K2.A0q("1", strArr5, 1);
        String[] strArr6 = new String[2];
        strArr6[0] = "0";
        A0B = AnonymousClass3K2.A0q("1", strArr6, 1);
    }

    public C89034bU(C16300so r6, C28371Vv r7) {
        this.A02 = C32271fx.A06(r7, A0A, new String[]{"default-credit"});
        this.A05 = C32271fx.A06(r7, A0D, new String[]{"default-debit"});
        this.A04 = C32271fx.A05(r7, A09, new String[]{"default-credit-p2p"});
        this.A03 = C32271fx.A05(r7, A08, new String[]{"default-credit-p2m"});
        this.A07 = C32271fx.A05(r7, A0C, new String[]{"default-debit-p2p"});
        this.A06 = C32271fx.A05(r7, A0B, new String[]{"default-debit-p2m"});
        this.A01 = (C89014bS) AnonymousClass3K2.A0d(r6, r7, 15, 0);
        this.A00 = r7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C89034bU.class != obj.getClass()) {
                return false;
            }
            C89034bU r5 = (C89034bU) obj;
            if (!this.A02.equals(r5.A02) || !this.A05.equals(r5.A05) || !C34901l3.A00(this.A04, r5.A04) || !C34901l3.A00(this.A03, r5.A03) || !C34901l3.A00(this.A07, r5.A07) || !C34901l3.A00(this.A06, r5.A06) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A02;
        objArr[1] = this.A05;
        objArr[2] = this.A04;
        objArr[3] = this.A03;
        objArr[4] = this.A07;
        objArr[5] = this.A06;
        return AnonymousClass000.A0F(this.A01, objArr, 6);
    }
}
