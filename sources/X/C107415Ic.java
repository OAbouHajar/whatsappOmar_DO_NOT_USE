package X;

import java.util.Arrays;

/* renamed from: X.5Ic  reason: invalid class name and case insensitive filesystem */
public class C107415Ic extends C32051fZ implements C33031hp {
    public final byte[] A00;

    public C107415Ic(byte[] bArr) {
        this.A00 = C33111hx.A02(bArr);
    }

    public int A03() {
        return AnonymousClass3K3.A0J(this.A00);
    }

    public void A07(C33061hs r3, boolean z2) {
        r3.A06(this.A00, 25, z2);
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof C107415Ic)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C107415Ic) r3).A00);
    }

    public String AGJ() {
        return C32941ha.A02(this.A00);
    }

    public int hashCode() {
        return C33111hx.A00(this.A00);
    }
}
