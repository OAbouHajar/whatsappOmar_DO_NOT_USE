package X;

import java.util.ArrayList;

/* renamed from: X.4bT  reason: invalid class name and case insensitive filesystem */
public final class C89024bT {
    public static final ArrayList A08;
    public static final ArrayList A09;
    public static final ArrayList A0A;
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
        A09 = AnonymousClass3K2.A0q("1", strArr2, 1);
        String[] strArr3 = new String[2];
        strArr3[0] = "0";
        A08 = AnonymousClass3K2.A0q("1", strArr3, 1);
    }

    public C89024bT(C16300so r13, C28371Vv r14) {
        C28371Vv r5 = r14;
        C28371Vv.A06(r14, "merchant");
        Class<String> cls = String.class;
        Long A0a = AnonymousClass3K2.A0a();
        this.A06 = (String) C32271fx.A01((C16300so) null, r5, cls, A0a, 100L, (Object) null, new String[]{"merchant-id"}, false);
        this.A02 = (String) C32271fx.A00((C16300so) null, r5, cls, A0a, 200L, (Object) null, new String[]{"business-name"}, false);
        this.A07 = (String) C32271fx.A00((C16300so) null, r5, cls, A0a, 20L, (Object) null, new String[]{"support-phone-number"}, false);
        this.A05 = C32271fx.A06(r14, A0A, new String[]{"can-sell"});
        this.A04 = C32271fx.A06(r14, A09, new String[]{"can-payout"});
        this.A03 = C32271fx.A06(r14, A08, new String[]{"can-add-payout"});
        this.A01 = (C89014bS) AnonymousClass3K2.A0d(r13, r14, 46, 0);
        this.A00 = r14;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C89024bT.class != obj.getClass()) {
                return false;
            }
            C89024bT r5 = (C89024bT) obj;
            if (!this.A05.equals(r5.A05) || !this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A06.equals(r5.A06) || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A07, r5.A07) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A05;
        objArr[1] = this.A04;
        objArr[2] = this.A03;
        objArr[3] = this.A06;
        objArr[4] = this.A02;
        objArr[5] = this.A07;
        return AnonymousClass000.A0F(this.A01, objArr, 6);
    }
}
