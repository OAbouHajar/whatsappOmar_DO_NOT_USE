package X;

import com.obwhatsapp.authentication.FingerprintBottomSheet;
import java.security.Signature;

/* renamed from: X.5zd  reason: invalid class name and case insensitive filesystem */
public class C119795zd implements AnonymousClass2J2 {
    public final /* synthetic */ AnonymousClass2J2 A00;
    public final /* synthetic */ C111575gb A01;

    public C119795zd(AnonymousClass2J2 r1, C111575gb r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AMu(int i2, CharSequence charSequence) {
        this.A00.AMu(i2, charSequence);
    }

    public void AMv() {
        this.A00.AMv();
    }

    public void AMx(int i2, CharSequence charSequence) {
        this.A00.AMx(i2, charSequence);
    }

    public void AMy(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01.A02;
        fingerprintBottomSheet.A1H(false);
        fingerprintBottomSheet.A03.setEnabled(false);
        fingerprintBottomSheet.A02.setEnabled(false);
        this.A00.AMy(bArr);
    }

    public /* synthetic */ void AMz(Signature signature) {
    }
}
