package X;

/* renamed from: X.4RH  reason: invalid class name */
public class AnonymousClass4RH {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass4RH(byte[] bArr, int i2, int i3) {
        this.A02 = bArr != null ? (byte[]) bArr.clone() : null;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WtWriteParams{offset=");
        A0r.append(this.A01);
        A0r.append(", len=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}
