package X;

import java.io.EOFException;

/* renamed from: X.4or  reason: invalid class name and case insensitive filesystem */
public final class C96764or implements C32481gS {
    public final byte[] A00 = new byte[4096];

    public void A9D(C32491gT r1) {
    }

    public /* synthetic */ void Acw(C90504eH r1, int i2) {
        r1.A0T(i2);
    }

    public void Acx(C90504eH r1, int i2, int i3) {
        r1.A0T(i2);
    }

    public int Acz(C48622Of r4, int i2, int i3, boolean z2) {
        byte[] bArr = this.A00;
        int read = r4.read(bArr, 0, Math.min(bArr.length, i2));
        if (read != -1) {
            return read;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    public void Ad0(C86824Uh r1, int i2, int i3, int i4, long j2) {
    }
}
