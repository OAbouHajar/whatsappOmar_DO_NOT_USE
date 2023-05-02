package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.1uh  reason: invalid class name and case insensitive filesystem */
public class C40791uh extends OutputStream {
    public boolean A00;
    public final File A01;
    public final File A02;
    public final FileOutputStream A03;

    public C40791uh(AnonymousClass1XH r3, File file) {
        File A002 = r3.A00("");
        this.A02 = A002;
        this.A01 = file;
        this.A03 = new FileOutputStream(A002);
    }

    public synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A03.close();
            File file = this.A01;
            file.delete();
            if (!this.A02.renameTo(file)) {
                throw new IOException("File.renameTo failed");
            }
        }
    }

    public void flush() {
        this.A03.flush();
    }

    public void write(int i2) {
        this.A03.write(i2);
    }

    public void write(byte[] bArr) {
        this.A03.write(bArr);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.A03.write(bArr, i2, i3);
    }
}
