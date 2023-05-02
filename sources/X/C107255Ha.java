package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.5Ha  reason: invalid class name and case insensitive filesystem */
public class C107255Ha extends AnonymousClass5IY {
    public C107255Ha(C33041hq r1, C32041fY r2, C32051fZ r3, C32051fZ r4, int i2) {
        super(r1, r2, r3, r4, i2);
    }

    public int A03() {
        return A01().length;
    }

    public C32051fZ A05() {
        return this;
    }

    public void A07(C33061hs r7, boolean z2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AnonymousClass5IY.A01(byteArrayOutputStream, "DER", this.A02);
        AnonymousClass5IY.A01(byteArrayOutputStream, "DER", this.A01);
        AnonymousClass5IY.A01(byteArrayOutputStream, "DER", this.A03);
        byteArrayOutputStream.write(new C107625Ix(this.A04, this.A00, true).A02("DER"));
        r7.A05(byteArrayOutputStream.toByteArray(), 32, 8, z2);
    }
}
