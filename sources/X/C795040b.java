package X;

import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: X.40b  reason: invalid class name and case insensitive filesystem */
public class C795040b extends OutputStream {
    public final /* synthetic */ C615939n A00;
    public final /* synthetic */ RandomAccessFile A01;

    public C795040b(C615939n r1, RandomAccessFile randomAccessFile) {
        this.A00 = r1;
        this.A01 = randomAccessFile;
    }

    public void write(int i2) {
        this.A01.write(i2);
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.A01.write(bArr, i2, i3);
    }
}
