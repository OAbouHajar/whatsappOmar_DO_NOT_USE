package X;

/* renamed from: X.5rM  reason: invalid class name and case insensitive filesystem */
public final class C116425rM {
    public final C28371Vv A00;

    public C116425rM(Long l2, String str, String str2, byte[] bArr) {
        C32461gQ A0S = AnonymousClass3K4.A0S("pin");
        if (C110115dX.A1C(str, false)) {
            C32461gQ.A00(A0S, "provider", str);
        }
        if (C110115dX.A1A(str2, 1, false)) {
            C32461gQ.A00(A0S, "key-type", str2);
        }
        if (C32271fx.A0B(l2, 0, false)) {
            C110115dX.A13(A0S, "key-version", l2.longValue());
        }
        C32271fx.A09(bArr, 0, 9007199254740991L);
        A0S.A01 = bArr;
        this.A00 = A0S.A01();
    }
}
