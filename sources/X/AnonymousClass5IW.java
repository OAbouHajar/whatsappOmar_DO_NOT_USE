package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.5IW  reason: invalid class name */
public abstract class AnonymousClass5IW extends C32051fZ {
    public final int A00;
    public final boolean A01;
    public final byte[] A02;

    public AnonymousClass5IW(byte[] bArr, int i2, boolean z2) {
        this.A01 = z2;
        this.A00 = i2;
        this.A02 = C33111hx.A02(bArr);
    }

    public static AnonymousClass5IW A00(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass5IW)) {
            return (AnonymousClass5IW) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A00(C32051fZ.A02((byte[]) obj));
            } catch (IOException e2) {
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Failed to construct object from byte[]: ")));
            }
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("unknown object in getInstance: ")));
        }
    }

    public int A03() {
        int A012 = C32551gZ.A01(this.A00);
        int length = this.A02.length;
        return A012 + C32551gZ.A00(length) + length;
    }

    public boolean A08() {
        return this.A01;
    }

    public boolean A09(C32051fZ r4) {
        if (!(r4 instanceof AnonymousClass5IW)) {
            return false;
        }
        AnonymousClass5IW r42 = (AnonymousClass5IW) r4;
        return this.A01 == r42.A01 && this.A00 == r42.A00 && Arrays.equals(this.A02, r42.A02);
    }

    public int hashCode() {
        return (this.A01 ^ this.A00) ^ C33111hx.A00(this.A02) ? 1 : 0;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.A01) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.A00));
        stringBuffer.append("]");
        byte[] bArr = this.A02;
        if (bArr != null) {
            stringBuffer.append(" #");
            str = C90584eP.A00(bArr);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
