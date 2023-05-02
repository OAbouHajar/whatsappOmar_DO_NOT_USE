package X;

/* renamed from: X.4Fl  reason: invalid class name and case insensitive filesystem */
public final class C83124Fl {
    public final C28371Vv A00;

    public C83124Fl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C32461gQ A0S = AnonymousClass3K4.A0S("account");
        if (C32271fx.A0D(str, 1, 1000, false)) {
            C32461gQ.A00(A0S, "vpa", str);
        }
        if (C32271fx.A0D(str2, 1, 1000, false)) {
            C32461gQ.A00(A0S, "vpa-id", str2);
        }
        if (C32271fx.A0D(str3, 1, 200, false)) {
            C32461gQ.A00(A0S, "credential-id", str3);
        }
        if (C32271fx.A0D(str4, 1, 1000, false)) {
            C32461gQ.A00(A0S, "device-id", str4);
        }
        if (C32271fx.A0D(str5, 1, 1000, false)) {
            C32461gQ.A00(A0S, "mpin", str5);
        }
        if (C32271fx.A0D(str6, 0, 35, false)) {
            C32461gQ.A00(A0S, "seq-no", str6);
        }
        String str8 = str7;
        if (C32271fx.A0D(str8, 0, 9007199254740991L, false)) {
            C32461gQ.A00(A0S, "upi-bank-info", str8);
        }
        this.A00 = A0S.A01();
    }
}
