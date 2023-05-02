package X;

import java.security.Signature;

/* renamed from: X.5zc  reason: invalid class name and case insensitive filesystem */
public class C119785zc implements AnonymousClass2J2 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass5wX A01;
    public final /* synthetic */ C119805ze A02;
    public final /* synthetic */ C117915tl A03;
    public final /* synthetic */ String A04;

    public C119785zc(AnonymousClass5wX r1, C119805ze r2, C117915tl r3, String str, long j2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = str;
        this.A03 = r3;
        this.A00 = j2;
    }

    public void AMu(int i2, CharSequence charSequence) {
        this.A01.A0I.A05(AnonymousClass000.A0h(charSequence.toString(), AnonymousClass000.A0r("authenticateBiometric/onAuthenticationError/error: ")));
        this.A02.AMu(i2, charSequence);
    }

    public void AMv() {
        this.A01.A0I.A05("authenticateBiometric/onAuthenticationFailed");
        this.A02.AMv();
    }

    public void AMx(int i2, CharSequence charSequence) {
        this.A01.A0I.A05(AnonymousClass000.A0h(charSequence.toString(), AnonymousClass000.A0r("authenticateBiometric/onAuthenticationHelp/help: ")));
        this.A02.AMx(i2, charSequence);
    }

    public void AMy(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr != null) {
            AnonymousClass5wX r4 = this.A01;
            r4.A0I.A06("authenticateBiometric/onAuthenticationSucceeded/success");
            C119805ze r3 = this.A02;
            r3.AMy(bArr);
            AnonymousClass5wX.A00(r4, r3, this.A03.A01(AnonymousClass5wR.A00(Boolean.FALSE, bArr2, "AUTH", (String) null, (byte[]) null, new Object[0], this.A00)), this.A04);
            return;
        }
        this.A01.A0I.A05("authenticateBiometric/onAuthenticationSucceeded/null signature");
        this.A02.AMv();
    }

    public /* synthetic */ void AMz(Signature signature) {
    }
}
