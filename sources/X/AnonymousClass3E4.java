package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.3E4  reason: invalid class name */
public final class AnonymousClass3E4 implements C48612Oe {
    public int A00;
    public final int A01;
    public final AnonymousClass5LK A02;
    public final C48612Oe A03;
    public final byte[] A04 = new byte[1];

    public AnonymousClass3E4(AnonymousClass5LK r3, C48612Oe r4, int i2) {
        C90524eJ.A03(AnonymousClass000.A1Q(i2));
        this.A03 = r4;
        this.A01 = i2;
        this.A02 = r3;
        this.A00 = i2;
    }

    public void A4k(AnonymousClass5LZ r2) {
        this.A03.A4k(r2);
    }

    public Map AFZ() {
        return this.A03.AFZ();
    }

    public Uri AGo() {
        return this.A03.AGo();
    }

    public long AZr(AnonymousClass3AL r2) {
        throw C13680ns.A0m();
    }

    public void close() {
        throw C13680ns.A0m();
    }

    public int read(byte[] bArr, int i2, int i3) {
        int i4 = this.A00;
        if (i4 == 0) {
            C48612Oe r6 = this.A03;
            byte[] bArr2 = this.A04;
            int i5 = 0;
            if (r6.read(bArr2, 0, 1) != -1) {
                int i6 = (bArr2[0] & 255) << 4;
                if (i6 != 0) {
                    byte[] bArr3 = new byte[i6];
                    int i7 = i6;
                    while (i7 > 0) {
                        int read = r6.read(bArr3, i5, i7);
                        if (read != -1) {
                            i5 += read;
                            i7 -= read;
                        }
                    }
                    while (true) {
                        if (i6 <= 0) {
                            break;
                        }
                        int i8 = i6 - 1;
                        if (bArr3[i8] == 0) {
                            i6 = i8;
                        } else {
                            AnonymousClass5LK r4 = this.A02;
                            C90504eH r62 = new C90504eH(bArr3, i6);
                            AnonymousClass3E8 r42 = (AnonymousClass3E8) r4;
                            long max = !r42.A05 ? r42.A01 : Math.max(r42.A0E.A00(), r42.A01);
                            int i9 = r62.A00 - r62.A01;
                            C32481gS r7 = r42.A02;
                            r7.Acw(r62, i9);
                            r7.Ad0((C86824Uh) null, 1, i9, 0, max);
                            r42.A05 = true;
                        }
                    }
                }
                i4 = this.A01;
                this.A00 = i4;
            }
            return -1;
        }
        int read2 = this.A03.read(bArr, i2, Math.min(i4, i3));
        if (read2 != -1) {
            this.A00 -= read2;
        }
        return read2;
    }
}
