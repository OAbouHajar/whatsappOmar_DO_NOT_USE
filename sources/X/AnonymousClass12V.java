package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.12V  reason: invalid class name */
public class AnonymousClass12V {
    public Cipher A00;
    public Cipher A01;
    public Cipher A02;
    public Cipher A03;
    public Cipher A04;
    public Cipher A05;
    public boolean A06;

    public static final InputStream A00(InputStream inputStream, AtomicLong atomicLong, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new InflaterInputStream(new C40601uO(inputStream, atomicLong, cipher));
    }

    public static final ZipInputStream A01(InputStream inputStream, AtomicLong atomicLong, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new ZipInputStream(new C40601uO(inputStream, atomicLong, cipher));
    }

    public static final CipherOutputStream A02(OutputStream outputStream, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new CipherOutputStream(outputStream, cipher);
    }

    public synchronized ZipInputStream A03(C16960tx r3, InputStream inputStream, AtomicLong atomicLong, byte[] bArr, byte[] bArr2) {
        ZipInputStream zipInputStream;
        int i2 = C40611uP.A00[r3.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported key selector ");
                        sb.append(r3);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    zipInputStream = new ZipInputStream(inputStream);
                } else if (!(bArr == null || bArr2 == null)) {
                    A05();
                    zipInputStream = A01(inputStream, atomicLong, this.A02, bArr, bArr2);
                }
            }
            if (!(bArr == null || bArr2 == null)) {
                A05();
                zipInputStream = A01(inputStream, atomicLong, this.A01, bArr, bArr2);
            }
        }
        if (!(bArr == null || bArr2 == null)) {
            A05();
            zipInputStream = A01(inputStream, atomicLong, this.A00, bArr, bArr2);
        }
        zipInputStream = new ZipInputStream(inputStream);
        return zipInputStream;
    }

    public synchronized ZipOutputStream A04(C16960tx r3, OutputStream outputStream, byte[] bArr, byte[] bArr2) {
        ZipOutputStream zipOutputStream;
        int i2 = C40611uP.A00[r3.ordinal()];
        if (i2 == 1) {
            A05();
            zipOutputStream = new ZipOutputStream(A02(outputStream, this.A03, bArr, bArr2));
        } else if (i2 == 2) {
            A05();
            zipOutputStream = new ZipOutputStream(A02(outputStream, this.A04, bArr, bArr2));
        } else if (i2 == 3) {
            A05();
            zipOutputStream = new ZipOutputStream(A02(outputStream, this.A05, bArr, bArr2));
        } else if (i2 == 4) {
            zipOutputStream = new ZipOutputStream(outputStream);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unsupported key selector ");
            sb.append(r3);
            throw new IllegalArgumentException(sb.toString());
        }
        return zipOutputStream;
    }

    public final synchronized void A05() {
        if (!this.A06) {
            this.A03 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A00 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A04 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A01 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A05 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A02 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A06 = true;
        }
    }
}
