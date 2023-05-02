package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4qJ  reason: invalid class name and case insensitive filesystem */
public final class C97634qJ implements C48612Oe {
    public long A00;
    public Uri A01 = Uri.EMPTY;
    public Map A02 = Collections.emptyMap();
    public final C48612Oe A03;

    public C97634qJ(C48612Oe r2) {
        this.A03 = r2;
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

    public long AZr(AnonymousClass3AL r5) {
        this.A01 = r5.A04;
        this.A02 = Collections.emptyMap();
        C48612Oe r3 = this.A03;
        long AZr = r3.AZr(r5);
        this.A01 = r3.AGo();
        this.A02 = r3.AFZ();
        return AZr;
    }

    public void close() {
        this.A03.close();
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = this.A03.read(bArr, i2, i3);
        if (read != -1) {
            this.A00 += (long) read;
        }
        return read;
    }
}
