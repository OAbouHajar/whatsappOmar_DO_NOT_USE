package X;

import java.util.ArrayList;

/* renamed from: X.4bS  reason: invalid class name and case insensitive filesystem */
public final class C89014bS {
    public static final ArrayList A06;
    public static final ArrayList A07;
    public final C28371Vv A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    static {
        String[] strArr = new String[2];
        strArr[0] = "0";
        A07 = AnonymousClass3K2.A0q("1", strArr, 1);
        String[] strArr2 = new String[2];
        strArr2[0] = "0";
        A06 = AnonymousClass3K2.A0q("1", strArr2, 1);
    }

    public C89014bS(C28371Vv r13) {
        Class<String> cls = String.class;
        Long A0a = AnonymousClass3K2.A0a();
        C28371Vv r5 = r13;
        this.A03 = (String) C32271fx.A01((C16300so) null, r5, cls, A0a, 1000L, (Object) null, new String[]{"credential-id"}, false);
        this.A01 = (String) C32271fx.A00((C16300so) null, r5, cls, A0a, 10L, (Object) null, new String[]{"country"}, false);
        this.A02 = (String) C32271fx.A00((C16300so) null, r5, cls, A0a, 100L, (Object) null, new String[]{"created"}, false);
        this.A05 = C32271fx.A05(r13, A07, new String[]{"p2p-eligible"});
        this.A04 = C32271fx.A05(r13, A06, new String[]{"p2m-eligible"});
        this.A00 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C89014bS.class != obj.getClass()) {
                return false;
            }
            C89014bS r5 = (C89014bS) obj;
            if (!C34901l3.A00(this.A05, r5.A05) || !C34901l3.A00(this.A04, r5.A04) || !this.A03.equals(r5.A03) || !C34901l3.A00(this.A01, r5.A01) || !C34901l3.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A05;
        objArr[1] = this.A04;
        objArr[2] = this.A03;
        objArr[3] = this.A01;
        return AnonymousClass000.A0F(this.A02, objArr, 4);
    }
}
