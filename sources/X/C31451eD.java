package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.1eD  reason: invalid class name and case insensitive filesystem */
public class C31451eD implements C31121dV {
    public long A00 = 0;
    public InputStream A01;
    public boolean A02 = true;
    public final long A03;
    public final ZipEntry A04;
    public final ZipFile A05;

    public C31451eD(ZipEntry zipEntry, ZipFile zipFile) {
        this.A05 = zipFile;
        this.A04 = zipEntry;
        this.A03 = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.A01 = inputStream;
        if (inputStream == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(zipEntry.getName());
            sb.append("'s InputStream is null");
            throw new IOException(sb.toString());
        }
    }

    public int AbO(ByteBuffer byteBuffer, long j2) {
        if (this.A01 != null) {
            int remaining = byteBuffer.remaining();
            long j3 = this.A03;
            long j4 = j3 - j2;
            if (j4 <= 0) {
                return -1;
            }
            int i2 = (int) j4;
            if (remaining > i2) {
                remaining = i2;
            }
            InputStream inputStream = this.A01;
            if (inputStream != null) {
                long j5 = this.A00;
                if (j2 != j5) {
                    if (j2 > j3) {
                        j2 = j3;
                    }
                    if (j2 >= j5) {
                        inputStream.skip(j2 - j5);
                    } else {
                        inputStream.close();
                        ZipFile zipFile = this.A05;
                        ZipEntry zipEntry = this.A04;
                        InputStream inputStream2 = zipFile.getInputStream(zipEntry);
                        this.A01 = inputStream2;
                        if (inputStream2 != null) {
                            inputStream2.skip(j2);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(zipEntry.getName());
                            sb.append("'s InputStream is null");
                            throw new IOException(sb.toString());
                        }
                    }
                    this.A00 = j2;
                }
                if (byteBuffer.hasArray()) {
                    this.A01.read(byteBuffer.array(), 0, remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                } else {
                    byte[] bArr = new byte[remaining];
                    this.A01.read(bArr, 0, remaining);
                    byteBuffer.put(bArr, 0, remaining);
                }
                this.A00 += (long) remaining;
                return remaining;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.A04.getName());
            sb2.append("'s InputStream is null");
            throw new IOException(sb2.toString());
        }
        throw new IOException("InputStream is null");
    }

    public void close() {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            inputStream.close();
            this.A02 = false;
        }
    }

    public boolean isOpen() {
        return this.A02;
    }

    public int read(ByteBuffer byteBuffer) {
        return AbO(byteBuffer, this.A00);
    }

    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
