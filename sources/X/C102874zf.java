package X;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.4zf  reason: invalid class name and case insensitive filesystem */
public class C102874zf implements AnonymousClass5TN {
    public long A00 = 0;
    public final long A01;
    public final DataInputStream A02;

    public C102874zf(File file) {
        this.A01 = file.length();
        this.A02 = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    }

    public boolean AHg() {
        return this.A00 < this.A01;
    }

    public void AbR(byte[] bArr) {
        this.A02.read(bArr);
        this.A00 += (long) bArr.length;
    }

    public long Abo() {
        return this.A01 - this.A00;
    }

    public void AeN(long j2) {
        AbR(new byte[((int) (j2 - this.A00))]);
    }

    public void close() {
        this.A02.close();
    }

    public long position() {
        return this.A00;
    }

    public byte readByte() {
        byte readByte = this.A02.readByte();
        this.A00++;
        return readByte;
    }

    public int readInt() {
        int readInt = this.A02.readInt();
        this.A00 += 4;
        return readInt;
    }

    public long readLong() {
        this.A00 += 8;
        return this.A02.readLong();
    }

    public short readShort() {
        short readShort = this.A02.readShort();
        this.A00 += 2;
        return readShort;
    }
}
