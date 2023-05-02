package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.5Il  reason: invalid class name and case insensitive filesystem */
public class C107505Il extends C32051fZ implements C33031hp {
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] A00;

    public C107505Il(byte[] bArr) {
        this.A00 = C33111hx.A02(bArr);
    }

    public int A03() {
        return AnonymousClass3K3.A0J(this.A00);
    }

    public void A07(C33061hs r3, boolean z2) {
        r3.A06(this.A00, 28, z2);
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof C107505Il)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C107505Il) r3).A00);
    }

    public String AGJ() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] A012 = A01();
            for (int i2 = 0; i2 != A012.length; i2++) {
                char[] cArr = A01;
                stringBuffer.append(cArr[(A012[i2] >>> 4) & 15]);
                stringBuffer.append(cArr[A012[i2] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new AnonymousClass44B("internal error encoding UniversalString");
        }
    }

    public int hashCode() {
        return C33111hx.A00(this.A00);
    }

    public String toString() {
        return AGJ();
    }
}
