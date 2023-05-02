package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.5HZ  reason: invalid class name */
public class AnonymousClass5HZ extends AnonymousClass5IY {
    public AnonymousClass5HZ(C32391gH r1) {
        super(r1);
    }

    public int A03() {
        return A01().length;
    }

    public void A07(C33061hs r7, boolean z2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AnonymousClass5IY.A01(byteArrayOutputStream, "DL", this.A02);
        AnonymousClass5IY.A01(byteArrayOutputStream, "DL", this.A01);
        AnonymousClass5IY.A01(byteArrayOutputStream, "DL", this.A03);
        byteArrayOutputStream.write(new C107615Iw(this.A04, this.A00, true).A02("DL"));
        r7.A05(byteArrayOutputStream.toByteArray(), 32, 8, z2);
    }
}
