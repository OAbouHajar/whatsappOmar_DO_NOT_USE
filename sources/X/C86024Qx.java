package X;

/* renamed from: X.4Qx  reason: invalid class name and case insensitive filesystem */
public class C86024Qx {
    public short A00;
    public byte[] A01;

    public C86024Qx(byte[] bArr, short s2) {
        this.A00 = s2;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WtExtension{extensionType=");
        A0r.append(this.A00);
        A0r.append(", extensionData=");
        A0r.append(C32311g7.A03(this.A01));
        return AnonymousClass000.A0k(A0r);
    }
}
