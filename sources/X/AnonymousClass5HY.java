package X;

/* renamed from: X.5HY  reason: invalid class name */
public class AnonymousClass5HY extends C107515Im {
    public AnonymousClass5HY(byte[] bArr) {
        super(bArr, 0);
    }

    public AnonymousClass5HY(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    public static AnonymousClass5HY A00(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass5HY)) {
            return (AnonymousClass5HY) obj;
        }
        if (obj instanceof AnonymousClass5HX) {
            C107515Im r3 = (C107515Im) obj;
            return new AnonymousClass5HY(r3.A01, r3.A00);
        } else if (obj instanceof byte[]) {
            try {
                return (AnonymousClass5HY) C32051fZ.A02((byte[]) obj);
            } catch (Exception e2) {
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("encoding error in getInstance: ")));
            }
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("illegal object in getInstance: ")));
        }
    }

    public static AnonymousClass5HY A01(C107525In r5) {
        C32051fZ A00 = C107525In.A00(r5);
        if (A00 instanceof AnonymousClass5HY) {
            return A00(A00);
        }
        byte[] bArr = C107405Ib.A01(A00).A00;
        int length = bArr.length;
        if (length >= 1) {
            byte b2 = bArr[0];
            int i2 = length - 1;
            byte[] bArr2 = new byte[i2];
            if (i2 != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, i2);
            }
            return new AnonymousClass5HY(bArr2, b2);
        }
        throw AnonymousClass000.A0T("truncated BIT STRING detected");
    }

    public int A03() {
        int length = this.A01.length;
        return C32551gZ.A00(length + 1) + 1 + length + 1;
    }

    public C32051fZ A05() {
        return this;
    }

    public boolean A08() {
        return false;
    }
}
