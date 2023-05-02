package X;

/* renamed from: X.5rO  reason: invalid class name and case insensitive filesystem */
public final class C116445rO {
    public final C28371Vv A00;

    public C116445rO(String str, String str2, String str3) {
        C32461gQ A0S = AnonymousClass3K4.A0S("elo");
        if (C32271fx.A0D(str, 1, 10000, false)) {
            C32461gQ.A00(A0S, "device_signature", str);
        }
        if (C32271fx.A0D(str2, 1, 10000, false)) {
            C32461gQ.A00(A0S, "wallet_signature", str2);
        }
        if (C32271fx.A0D(str3, 1, 10000, false)) {
            C32461gQ.A00(A0S, "challenge_id", str3);
        }
        this.A00 = A0S.A01();
    }
}
