package X;

import java.util.ArrayList;

/* renamed from: X.53d  reason: invalid class name and case insensitive filesystem */
public final class C1038953d implements AnonymousClass5NA {
    public static final ArrayList A06;
    public final C28371Vv A00;
    public final AnonymousClass4V4 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    static {
        String[] strArr = new String[2];
        strArr[0] = "merge";
        A06 = AnonymousClass3K2.A0q("replace", strArr, 1);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [int, boolean] */
    public C1038953d(C16300so r13, C28371Vv r14) {
        C28371Vv r5 = r14;
        C28371Vv.A06(r14, "state");
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        Class<String> cls = String.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C32271fx.A01((C16300so) null, r5, cls, A0X, A0Y, "resource", strArr, A1C);
        String[] strArr2 = new String[1];
        strArr2[A1C] = "id";
        this.A03 = (String) C32271fx.A01((C16300so) null, r5, cls, A0X, A0Y, (Object) null, strArr2, A1C);
        this.A05 = AnonymousClass3K2.A0j(r14, A1C);
        String[] strArr3 = new String[1];
        strArr3[A1C] = "catch";
        this.A02 = (String) C32271fx.A00((C16300so) null, r5, cls, A0X, A0Y, (Object) null, strArr3, A1C);
        ArrayList arrayList = A06;
        String[] strArr4 = new String[1];
        strArr4[A1C] = "merge";
        this.A04 = C32271fx.A05(r14, arrayList, strArr4);
        this.A01 = (AnonymousClass4V4) AnonymousClass3K2.A0d(r13, r14, 27, A1C);
        this.A00 = r14;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1038953d.class != obj.getClass()) {
                return false;
            }
            C1038953d r5 = (C1038953d) obj;
            if (!C34901l3.A00(this.A04, r5.A04) || !this.A03.equals(r5.A03) || !C34901l3.A00(this.A05, r5.A05) || !C34901l3.A00(this.A02, r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        objArr[2] = this.A05;
        objArr[3] = this.A02;
        return AnonymousClass000.A0F(this.A01, objArr, 4);
    }
}
