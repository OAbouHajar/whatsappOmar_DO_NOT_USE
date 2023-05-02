package X;

import java.util.ArrayList;

/* renamed from: X.5w8  reason: invalid class name */
public final class AnonymousClass5w8 {
    public static final ArrayList A01;
    public final C28371Vv A00;

    static {
        String[] strArr = new String[11];
        strArr[0] = "ASPRESENTED";
        strArr[1] = "BIMONTHLY";
        strArr[2] = "DAILY";
        strArr[3] = "FORTNIGHTLY";
        strArr[4] = "HALFYEARLY";
        strArr[5] = "MONTHLY";
        strArr[6] = "ONETIME";
        strArr[7] = "QUARTERLY";
        strArr[8] = "UNKNOWN";
        strArr[9] = "WEEKLY";
        A01 = AnonymousClass3K2.A0q("YEARLY", strArr, 10);
    }

    public AnonymousClass5w8(String str) {
        C32461gQ A0S = AnonymousClass3K4.A0S("smax:any");
        A0S.A0A(str, "frequency-rule", A01);
        this.A00 = A0S.A01();
    }
}
