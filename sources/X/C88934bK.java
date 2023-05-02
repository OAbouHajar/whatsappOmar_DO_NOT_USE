package X;

import java.util.ArrayList;

/* renamed from: X.4bK  reason: invalid class name and case insensitive filesystem */
public final class C88934bK {
    public static final ArrayList A03;
    public final C28371Vv A00;
    public final String A01;
    public final String A02;

    static {
        String[] strArr = new String[3];
        strArr[0] = "e2ee_migration";
        strArr[1] = "regular";
        A03 = AnonymousClass3K2.A0q("rtc", strArr, 2);
    }

    public C88934bK(C28371Vv r13) {
        C28371Vv r5 = r13;
        this.A02 = (String) C32271fx.A01((C16300so) null, r5, String.class, AnonymousClass3K2.A0a(), 65536L, (Object) null, new String[]{"key"}, false);
        this.A01 = C32271fx.A05(r13, A03, new String[]{"create_ctx"});
        this.A00 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C88934bK.class != obj.getClass()) {
                return false;
            }
            C88934bK r5 = (C88934bK) obj;
            if (!C34901l3.A00(this.A01, r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass3K2.A08(this.A02, A1Z);
    }
}
