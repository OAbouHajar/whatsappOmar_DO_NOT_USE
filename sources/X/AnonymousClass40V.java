package X;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.40V  reason: invalid class name */
public class AnonymousClass40V extends InputStream {
    public final /* synthetic */ C615939n A00;
    public final /* synthetic */ RandomAccessFile A01;

    public AnonymousClass40V(C615939n r1, RandomAccessFile randomAccessFile) {
        this.A00 = r1;
        this.A01 = randomAccessFile;
    }

    public int read() {
        return this.A01.read();
    }

    public int read(byte[] bArr) {
        return this.A01.read(bArr);
    }

    public int read(byte[] bArr, int i2, int i3) {
        return this.A01.read(bArr, i2, i3);
    }
}
