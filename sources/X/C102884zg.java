package X;

import java.io.DataOutputStream;

/* renamed from: X.4zg  reason: invalid class name and case insensitive filesystem */
public class C102884zg implements AnonymousClass5TN {
    public final AnonymousClass5TN A00;
    public final DataOutputStream A01;

    public C102884zg(AnonymousClass5TN r1, DataOutputStream dataOutputStream) {
        this.A00 = r1;
        this.A01 = dataOutputStream;
    }

    public boolean AHg() {
        return this.A00.AHg();
    }

    public void AbR(byte[] bArr) {
        this.A00.AbR(bArr);
        this.A01.write(bArr);
    }

    public long Abo() {
        return this.A00.Abo();
    }

    public void AeN(long j2) {
        AbR(new byte[((int) (j2 - this.A00.position()))]);
    }

    public void close() {
        this.A00.close();
        this.A01.close();
    }

    public long position() {
        return this.A00.position();
    }

    public byte readByte() {
        byte readByte = this.A00.readByte();
        this.A01.write(readByte);
        return readByte;
    }

    public int readInt() {
        int readInt = this.A00.readInt();
        this.A01.writeInt(readInt);
        return readInt;
    }

    public long readLong() {
        long readLong = this.A00.readLong();
        this.A01.writeLong(readLong);
        return readLong;
    }

    public short readShort() {
        short readShort = this.A00.readShort();
        this.A01.writeShort(readShort);
        return readShort;
    }
}
