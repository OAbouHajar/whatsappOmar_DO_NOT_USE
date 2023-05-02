package X;

import android.os.Build;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.5eL  reason: invalid class name and case insensitive filesystem */
public class C110525eL extends C009404l {
    public final /* synthetic */ AnonymousClass2J2 A00;
    public final /* synthetic */ AnonymousClass5xG A01;
    public final /* synthetic */ byte[] A02;

    public C110525eL(AnonymousClass2J2 r1, AnonymousClass5xG r2, byte[] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = bArr;
    }

    public void A00() {
        this.A01.A02.A06("sign: authentication failed");
        this.A00.AMv();
    }

    public void A01(int i2, CharSequence charSequence) {
        AnonymousClass1Vo r2 = this.A01.A02;
        StringBuilder A0r = AnonymousClass000.A0r("sign: authentication error=");
        A0r.append(i2);
        A0r.append(" errString=");
        r2.A05(AnonymousClass000.A0l(A0r, i2));
        this.A00.AMu(i2, charSequence);
    }

    public void A02(int i2, CharSequence charSequence) {
        AnonymousClass1Vo r2 = this.A01.A02;
        StringBuilder A0r = AnonymousClass000.A0r("sign: authentication help=");
        A0r.append(i2);
        r2.A06(AnonymousClass000.A0e(charSequence, " errString=", A0r));
        this.A00.AMx(i2, charSequence);
    }

    public void A03(AnonymousClass0NQ r5) {
        try {
            Signature signature = r5.A00.A00;
            AnonymousClass00B.A06(signature);
            AnonymousClass2J2 r1 = this.A00;
            r1.AMz(signature);
            signature.update(this.A02);
            r1.AMy(signature.sign());
        } catch (SignatureException e2) {
            AnonymousClass1Vo r2 = this.A01.A02;
            StringBuilder A0r = AnonymousClass000.A0r("sign: api=");
            A0r.append(Build.VERSION.SDK_INT);
            A0r.append(" error: ");
            r2.A05(AnonymousClass000.A0h(e2.toString(), A0r));
            this.A00.AMy((byte[]) null);
        }
    }
}
