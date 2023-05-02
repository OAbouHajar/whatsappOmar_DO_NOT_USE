package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.5IZ  reason: invalid class name */
public class AnonymousClass5IZ extends C32051fZ {
    public static AnonymousClass5IZ[] A02 = new AnonymousClass5IZ[12];
    public final int A00;
    public final byte[] A01;

    public AnonymousClass5IZ(int i2) {
        if (i2 >= 0) {
            this.A01 = BigInteger.valueOf((long) i2).toByteArray();
            this.A00 = 0;
            return;
        }
        throw AnonymousClass000.A0T("enumerated must be non-negative");
    }

    public AnonymousClass5IZ(byte[] bArr) {
        String str;
        int length = bArr.length;
        if (length == 0 || (length != 1 && bArr[0] == (bArr[1] >> 7) && !C89714cm.A01("org.spongycastle.asn1.allow_unsafe_integer"))) {
            str = "malformed enumerated";
        } else if ((bArr[0] & 128) == 0) {
            this.A01 = C33111hx.A02(bArr);
            int i2 = length - 1;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                if (bArr[i3] != (bArr[i4] >> 7)) {
                    break;
                }
                i3 = i4;
            }
            this.A00 = i3;
            return;
        } else {
            str = "enumerated must be non-negative";
        }
        throw AnonymousClass000.A0T(str);
    }

    public static AnonymousClass5IZ A00(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass5IZ)) {
            return (AnonymousClass5IZ) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (AnonymousClass5IZ) C32051fZ.A02((byte[]) obj);
            } catch (Exception e2) {
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("encoding error in getInstance: ")));
            }
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("illegal object in getInstance: ")));
        }
    }

    public int A03() {
        return AnonymousClass3K3.A0J(this.A01);
    }

    public void A07(C33061hs r3, boolean z2) {
        r3.A06(this.A01, 10, z2);
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof AnonymousClass5IZ)) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass5IZ) r3).A01);
    }

    public int A0A() {
        byte[] bArr = this.A01;
        int length = bArr.length;
        int i2 = this.A00;
        if (length - i2 <= 4) {
            int max = Math.max(i2, length - 4);
            byte b2 = -1 & bArr[max];
            while (true) {
                max++;
                if (max >= length) {
                    return b2;
                }
                b2 = (b2 << 8) | (bArr[max] & 255);
            }
        } else {
            throw new ArithmeticException("ASN.1 Enumerated out of int range");
        }
    }

    public int hashCode() {
        return C33111hx.A00(this.A01);
    }
}
