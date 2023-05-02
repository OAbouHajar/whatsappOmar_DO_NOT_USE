package X;

import java.util.Arrays;

/* renamed from: X.4Uh  reason: invalid class name and case insensitive filesystem */
public final class C86824Uh {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C86824Uh(int i2, byte[] bArr, int i3, int i4) {
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = i3;
        this.A00 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86824Uh.class != obj.getClass()) {
                return false;
            }
            C86824Uh r5 = (C86824Uh) obj;
            if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00 && Arrays.equals(this.A03, r5.A03))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass3K4.A0B(this.A03, this.A01 * 31) * 31) + this.A02) * 31) + this.A00;
    }
}
