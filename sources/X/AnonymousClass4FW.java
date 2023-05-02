package X;

/* renamed from: X.4FW  reason: invalid class name */
public final class AnonymousClass4FW {
    public final C28371Vv A00;

    public AnonymousClass4FW(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C32461gQ A0S = AnonymousClass3K4.A0S("smax:any");
        C32461gQ.A00(A0S, "version", "1");
        C32461gQ.A00(A0S, "algorithm", "rsa2048");
        C32461gQ A0S2 = AnonymousClass3K4.A0S("encrypted_key");
        C32271fx.A09(bArr, 1, 2048);
        A0S2.A01 = bArr;
        AnonymousClass3K4.A0s(A0S2, A0S);
        C32461gQ A0S3 = AnonymousClass3K4.A0S("nonce");
        C32271fx.A09(bArr2, 1, 128);
        A0S3.A01 = bArr2;
        AnonymousClass3K4.A0s(A0S3, A0S);
        C32461gQ A0S4 = AnonymousClass3K4.A0S("encrypted_data");
        C32271fx.A09(bArr3, 1, 8192);
        A0S4.A01 = bArr3;
        AnonymousClass3K4.A0s(A0S4, A0S);
        C32461gQ A0S5 = AnonymousClass3K4.A0S("auth_tag");
        C32271fx.A09(bArr4, 1, 128);
        A0S5.A01 = bArr4;
        AnonymousClass3K4.A0s(A0S5, A0S);
        this.A00 = A0S.A01();
    }
}
