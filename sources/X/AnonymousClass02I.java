package X;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Adler32;
import java.util.zip.Checksum;

/* renamed from: X.02I  reason: invalid class name */
public class AnonymousClass02I {
    public static final long A07 = new Adler32().getValue();
    public int A00;
    public int A01 = 0;
    public final int A02;
    public final AnonymousClass1CK A03;
    public final RandomAccessFile A04;
    public final ByteBuffer A05;
    public final Checksum A06;

    public AnonymousClass02I(AnonymousClass1CK r4, RandomAccessFile randomAccessFile, int i2, int i3) {
        this.A04 = randomAccessFile;
        this.A02 = i2;
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        this.A05 = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.A06 = new Adler32();
        this.A00 = 0;
        this.A03 = r4;
    }

    public final long A00() {
        Checksum checksum = this.A06;
        ByteBuffer byteBuffer = this.A05;
        checksum.update(byteBuffer.array(), this.A00, byteBuffer.position() - this.A00);
        this.A00 = byteBuffer.position();
        return checksum.getValue();
    }

    public final ByteBuffer A01() {
        ByteBuffer asReadOnlyBuffer = this.A05.asReadOnlyBuffer();
        asReadOnlyBuffer.flip();
        return asReadOnlyBuffer;
    }

    public void A02() {
        this.A05.clear();
        this.A01 = 0;
        this.A06.reset();
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r6.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r6 = this;
            java.io.RandomAccessFile r5 = r6.A04
            if (r5 == 0) goto L_0x0036
            java.nio.ByteBuffer r4 = r6.A05
            int r0 = r4.position()
            int r1 = r6.A01
            if (r0 == r1) goto L_0x0036
            int r0 = r6.A02
            int r0 = r0 + r1
            long r0 = (long) r0
            r6.A06(r0)
            byte[] r3 = r4.array()     // Catch:{ IOException -> 0x0026 }
            int r2 = r6.A01     // Catch:{ IOException -> 0x0026 }
            int r1 = r4.position()     // Catch:{ IOException -> 0x0026 }
            int r0 = r6.A01     // Catch:{ IOException -> 0x0026 }
            int r1 = r1 - r0
            r5.write(r3, r2, r1)     // Catch:{ IOException -> 0x0026 }
            goto L_0x0030
        L_0x0026:
            r1 = move-exception
            X.1CK r0 = r6.A03
            r0.A07()
            r0.A09()
            throw r1
        L_0x0030:
            int r0 = r4.position()
            r6.A01 = r0
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02I.A03():void");
    }

    public void A04(int i2) {
        AnonymousClass1CK r0;
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            A06((long) this.A02);
            try {
                ByteBuffer byteBuffer = this.A05;
                randomAccessFile.readFully(byteBuffer.array(), 0, i2);
                byteBuffer.position(i2);
                this.A01 = i2;
                this.A06.reset();
                this.A00 = 0;
            } catch (EOFException e2) {
                e = e2;
                r0 = this.A03;
                r0.A04();
                r0.A09();
                throw e;
            } catch (IOException e3) {
                e = e3;
                r0 = this.A03;
                r0.A06();
                r0.A09();
                throw e;
            }
        } else {
            throw new IOException("File not available");
        }
    }

    public final void A05(long j2) {
        if (j2 < 0 || j2 > 4294967295L) {
            throw new IllegalArgumentException("Value is not an unsigned integer");
        }
        this.A05.putInt((int) j2);
    }

    public final void A06(long j2) {
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(j2);
            } catch (IOException e2) {
                AnonymousClass1CK r0 = this.A03;
                r0.A05();
                r0.A09();
                throw e2;
            }
        } else {
            throw new IOException("File not available");
        }
    }
}
