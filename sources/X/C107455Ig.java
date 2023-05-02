package X;

import java.util.Arrays;

/* renamed from: X.5Ig  reason: invalid class name and case insensitive filesystem */
public class C107455Ig extends C32051fZ implements C33031hp {
    public final byte[] A00;

    public C107455Ig(byte[] bArr) {
        this.A00 = bArr;
    }

    public int A03() {
        return AnonymousClass3K3.A0J(this.A00);
    }

    public void A07(C33061hs r3, boolean z2) {
        r3.A06(this.A00, 18, z2);
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof C107455Ig)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C107455Ig) r3).A00);
    }

    public String AGJ() {
        return C32941ha.A02(this.A00);
    }

    public int hashCode() {
        return C33111hx.A00(this.A00);
    }

    public String toString() {
        return C32941ha.A02(this.A00);
    }
}
