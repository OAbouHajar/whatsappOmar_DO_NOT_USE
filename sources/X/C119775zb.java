package X;

import java.security.Signature;

/* renamed from: X.5zb  reason: invalid class name and case insensitive filesystem */
public class C119775zb implements AnonymousClass2J2 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C118385ub A01;
    public final /* synthetic */ C119795zd A02;

    public C119775zb(C118385ub r1, C119795zd r2, long j2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j2;
    }

    public void AMu(int i2, CharSequence charSequence) {
        this.A01.A03.A05(AnonymousClass000.A0h(charSequence.toString(), AnonymousClass000.A0r("sendWithBiometric/onAuthenticationError/error: ")));
        this.A02.AMu(i2, charSequence);
    }

    public void AMv() {
        this.A01.A03.A05("sendWithBiometric/onAuthenticationFailed");
        this.A02.AMv();
    }

    public void AMx(int i2, CharSequence charSequence) {
        this.A01.A03.A05(AnonymousClass000.A0h(charSequence.toString(), AnonymousClass000.A0r("sendWithBiometric/onAuthenticationHelp/help: ")));
        this.A02.AMx(i2, charSequence);
    }

    public void AMy(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr != null) {
            C118385ub r2 = this.A01;
            r2.A03.A06("sendWithBiometric/onAuthenticationSucceeded/success");
            this.A02.AMy(AnonymousClass5wR.A00(Boolean.FALSE, bArr2, r2.A05, (String) null, (byte[]) null, new Object[0], this.A00));
            return;
        }
        this.A01.A03.A05("sendWithBiometric/onAuthenticationSucceeded/null signature");
        this.A02.AMv();
    }

    public /* synthetic */ void AMz(Signature signature) {
    }
}
