package X;

import java.io.InputStream;

/* renamed from: X.40X  reason: invalid class name */
public final class AnonymousClass40X extends InputStream {
    public final /* synthetic */ AnonymousClass59F A00;

    public AnonymousClass40X(AnonymousClass59F r1) {
        this.A00 = r1;
    }

    public int available() {
        AnonymousClass59F r1 = this.A00;
        if (!r1.A00) {
            return (int) Math.min(r1.A01.A00, (long) Integer.MAX_VALUE);
        }
        throw AnonymousClass3K3.A0e("closed");
    }

    public void close() {
        this.A00.close();
    }

    public int read() {
        AnonymousClass59F r6 = this.A00;
        if (!r6.A00) {
            C11050i7 r5 = r6.A01;
            if (r5.A00 == 0 && AnonymousClass59F.A00(r5, r6) == -1) {
                return -1;
            }
            return r5.readByte() & 255;
        }
        throw AnonymousClass3K3.A0e("closed");
    }

    public int read(byte[] bArr, int i2, int i3) {
        C18450wi.A0G(bArr, 0);
        AnonymousClass59F r5 = this.A00;
        if (!r5.A00) {
            AnonymousClass48B.A00((long) bArr.length, (long) i2, (long) i3);
            C11050i7 r6 = r5.A01;
            if (r6.A00 == 0 && AnonymousClass59F.A00(r6, r5) == -1) {
                return -1;
            }
            return r6.A02(bArr, i2, i3);
        }
        throw AnonymousClass3K3.A0e("closed");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        return AnonymousClass000.A0h(".inputStream()", A0o);
    }
}
