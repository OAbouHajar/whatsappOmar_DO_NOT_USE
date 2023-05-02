package X;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: X.0Ap  reason: invalid class name and case insensitive filesystem */
public class C02260Ap extends MediaDataSource {
    public long A00;
    public final /* synthetic */ C02720Eo A01;
    public final /* synthetic */ C007703o A02;

    public C02260Ap(C02720Eo r1, C007703o r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void close() {
    }

    public long getSize() {
        return -1;
    }

    public int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (j2 < 0) {
            return -1;
        }
        try {
            long j3 = this.A00;
            if (j3 != j2) {
                if (j3 >= 0 && j2 >= j3 + ((long) this.A01.A03.available())) {
                    return -1;
                }
                this.A01.A01(j2);
                this.A00 = j2;
            }
            C02720Eo r2 = this.A01;
            DataInputStream dataInputStream = r2.A03;
            if (i3 > dataInputStream.available()) {
                i3 = dataInputStream.available();
            }
            int read = r2.read(bArr, i2, i3);
            if (read >= 0) {
                this.A00 += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.A00 = -1;
        return -1;
    }
}
