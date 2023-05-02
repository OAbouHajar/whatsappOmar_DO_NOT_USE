package X;

/* renamed from: X.5rL  reason: invalid class name and case insensitive filesystem */
public final class C116415rL {
    public final C28371Vv A00;

    public C116415rL(AnonymousClass2BJ r11, String str, String str2) {
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "br-get-merchant-status");
        if (C110105dW.A1V(str, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", str);
        }
        if (C32271fx.A0D(str2, 11, 14, false)) {
            C32461gQ.A00(A0Y, "tax-id", str2);
        }
        this.A00 = C110105dW.A0S(A0Y, A0X, r11);
    }
}
