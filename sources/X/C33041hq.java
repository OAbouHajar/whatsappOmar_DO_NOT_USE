package X;

import java.math.BigInteger;

/* renamed from: X.1hq  reason: invalid class name and case insensitive filesystem */
public class C33041hq extends C32051fZ {
    public final int A00;
    public final byte[] A01;

    public C33041hq(long j2) {
        this.A01 = BigInteger.valueOf(j2).toByteArray();
        this.A00 = 0;
    }

    public C33041hq(BigInteger bigInteger) {
        this.A01 = bigInteger.toByteArray();
        this.A00 = 0;
    }

    public C33041hq(byte[] bArr, boolean z2) {
        int length = bArr.length;
        if (length == 0 || (length != 1 && bArr[0] == (bArr[1] >> 7) && !C89714cm.A01("org.spongycastle.asn1.allow_unsafe_integer"))) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.A01 = z2 ? C33111hx.A02(bArr) : bArr;
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
    }

    public static C33041hq A00(Object obj) {
        if (obj == null || (obj instanceof C33041hq)) {
            return (C33041hq) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C33041hq) C32051fZ.A02((byte[]) obj);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("encoding error in getInstance: ");
                sb.append(e2.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static C33041hq A01(C107525In r1, boolean z2) {
        C32051fZ Agm = r1.A01.Agm();
        return (z2 || (Agm instanceof C33041hq)) ? A00(Agm) : new C33041hq(C107405Ib.A01(Agm).A00, true);
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
            throw new ArithmeticException("ASN.1 Integer out of int range");
        }
    }

    public boolean A0B(BigInteger bigInteger) {
        if (bigInteger != null) {
            byte[] bArr = this.A01;
            int i2 = this.A00;
            int length = bArr.length;
            int max = Math.max(i2, length - 4);
            byte b2 = -1 & bArr[max];
            while (true) {
                max++;
                if (max >= length) {
                    break;
                }
                b2 = (b2 << 8) | (bArr[max] & 255);
            }
            return b2 == bigInteger.intValue() && new BigInteger(bArr).equals(bigInteger);
        }
    }

    public int hashCode() {
        return C33111hx.A00(this.A01);
    }

    public String toString() {
        return new BigInteger(this.A01).toString();
    }
}
