package X;

import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.0Eo  reason: invalid class name and case insensitive filesystem */
public class C02720Eo extends AnonymousClass0JA {
    public C02720Eo(InputStream inputStream) {
        super(inputStream, ByteOrder.BIG_ENDIAN);
        if (inputStream.markSupported()) {
            this.A03.mark(Integer.MAX_VALUE);
            return;
        }
        throw AnonymousClass000.A0T("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }

    public C02720Eo(byte[] bArr) {
        super(bArr);
        this.A03.mark(Integer.MAX_VALUE);
    }

    public void A01(long j2) {
        long j3 = (long) this.A00;
        if (j3 > j2) {
            this.A00 = 0;
            this.A03.reset();
        } else {
            j2 -= j3;
        }
        A00((int) j2);
    }
}
