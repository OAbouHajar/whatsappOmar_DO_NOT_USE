package X;

/* renamed from: X.5Ho  reason: invalid class name */
public class AnonymousClass5Ho extends C32061fa {
    public AnonymousClass5HY A00;

    public AnonymousClass5Ho(AnonymousClass5HY r1) {
        this.A00 = r1;
    }

    public C32051fZ Agm() {
        return this.A00;
    }

    public String toString() {
        byte b2;
        byte[] A0A = this.A00.A0A();
        int length = A0A.length;
        StringBuilder A0o = AnonymousClass000.A0o();
        if (length == 1) {
            A0o.append("KeyUsage: 0x");
            b2 = A0A[0] & 255;
        } else {
            A0o.append("KeyUsage: 0x");
            b2 = (A0A[0] & 255) | ((A0A[1] & 255) << 8);
        }
        return AnonymousClass000.A0h(Integer.toHexString(b2), A0o);
    }
}
