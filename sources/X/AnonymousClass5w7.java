package X;

import java.util.ArrayList;

/* renamed from: X.5w7  reason: invalid class name */
public final class AnonymousClass5w7 {
    public static final ArrayList A01;
    public final C28371Vv A00;

    static {
        String[] strArr = new String[3];
        strArr[0] = "EXACT";
        strArr[1] = "MAX";
        A01 = AnonymousClass3K2.A0q("UNKNOWN", strArr, 2);
    }

    public AnonymousClass5w7(String str) {
        C32461gQ A0S = AnonymousClass3K4.A0S("smax:any");
        A0S.A0A(str, "amount-rule", A01);
        this.A00 = A0S.A01();
    }
}
