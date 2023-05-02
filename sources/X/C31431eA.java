package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.1eA  reason: invalid class name and case insensitive filesystem */
public class C31431eA implements C31121dV {
    public File A00;
    public FileInputStream A01;
    public FileChannel A02;

    public C31431eA(File file) {
        this.A00 = file;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.A01 = fileInputStream;
        this.A02 = fileInputStream.getChannel();
    }

    public int AbO(ByteBuffer byteBuffer, long j2) {
        return this.A02.read(byteBuffer, j2);
    }

    public void close() {
        this.A01.close();
    }

    public boolean isOpen() {
        return this.A02.isOpen();
    }

    public int read(ByteBuffer byteBuffer) {
        return this.A02.read(byteBuffer);
    }

    public int write(ByteBuffer byteBuffer) {
        return this.A02.write(byteBuffer);
    }
}
