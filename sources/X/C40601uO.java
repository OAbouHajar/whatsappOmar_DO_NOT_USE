package X;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

/* renamed from: X.1uO  reason: invalid class name and case insensitive filesystem */
public class C40601uO extends CipherInputStream {
    public final AtomicLong A00;

    public C40601uO(InputStream inputStream, AtomicLong atomicLong, Cipher cipher) {
        super(inputStream, cipher);
        this.A00 = atomicLong;
    }

    public int read() {
        int read = super.read();
        if (read >= 0) {
            this.A00.incrementAndGet();
        }
        return read;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = super.read(bArr, i2, i3);
        if (read > 0) {
            this.A00.addAndGet((long) read);
        }
        return read;
    }
}
