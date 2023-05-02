package X;

import java.util.Arrays;

/* renamed from: X.5Ih  reason: invalid class name and case insensitive filesystem */
public class C107465Ih extends C32051fZ implements C33031hp {
    public byte[] A00;

    public C107465Ih(byte[] bArr) {
        this.A00 = C33111hx.A02(bArr);
    }

    public int A03() {
        return AnonymousClass3K3.A0J(this.A00);
    }

    public void A07(C33061hs r3, boolean z2) {
        r3.A06(this.A00, 20, z2);
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof C107465Ih)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C107465Ih) r3).A00);
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
