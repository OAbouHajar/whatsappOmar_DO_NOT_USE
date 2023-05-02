package X;

import android.support.v4.view.MotionEventCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;

/* renamed from: X.37w  reason: invalid class name and case insensitive filesystem */
public class C611737w extends OutputStream {
    public int A00;
    public boolean A01;
    public byte[] A02 = new byte[1];
    public final C83634Hl A03;
    public final OutputStream A04;
    public final Cipher A05;
    public final Mac A06;
    public final byte[] A07;

    public C611737w(C43061zH r4, OutputStream outputStream, long j2) {
        this.A04 = outputStream;
        this.A03 = new C83634Hl(j2);
        byte[] bArr = r4.A01;
        this.A05 = C61873At.A01(bArr, r4.A00, 2);
        this.A06 = C61873At.A02(bArr, r4.A02);
        this.A07 = new byte[10];
        this.A01 = false;
    }

    public void close() {
        this.A04.close();
    }

    public void write(int i2) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) (i2 & MotionEventCompat.ACTION_MASK);
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        if (i3 > 0) {
            C83634Hl r6 = this.A03;
            long j2 = r6.A01;
            if (((long) (i2 + i3)) <= j2) {
                long j3 = r6.A00;
                long j4 = j2 - 10;
                if (j3 < j4) {
                    int min = (int) Math.min(j3 > j4 ? 0 : j4 - j3, (long) i3);
                    r6.A00 = j3 + ((long) min);
                    this.A06.update(bArr, i2, min);
                    byte[] update = this.A05.update(bArr, i2, min);
                    if (update != null && update.length > 0) {
                        this.A04.write(update);
                    }
                    if (i3 > min) {
                        i2 += min;
                        i3 -= min;
                    } else {
                        return;
                    }
                } else if (j3 >= j2) {
                    throw new IOException("Passed in total length is already read");
                }
                int i4 = this.A00;
                int i5 = i3 - (10 - i4);
                if (i5 > 0) {
                    i3 -= i5;
                }
                r6.A00 += (long) i3;
                byte[] bArr2 = this.A07;
                System.arraycopy(bArr, i2, bArr2, i4, i3);
                int i6 = this.A00 + i3;
                this.A00 = i6;
                if (i6 >= 10) {
                    System.arraycopy(bArr2, 0, new byte[10], 0, 10);
                    byte[] bArr3 = new byte[10];
                    System.arraycopy(this.A06.doFinal(), 0, bArr3, 0, 10);
                    try {
                        if (MessageDigest.isEqual(bArr2, bArr3)) {
                            this.A04.write(this.A05.doFinal());
                            this.A01 = true;
                            return;
                        }
                        return;
                    } catch (IllegalBlockSizeException e2) {
                        Log.w((Throwable) e2);
                        throw new IOException("Bad block size!");
                    } catch (BadPaddingException e3) {
                        Log.w((Throwable) e3);
                        throw new IOException("Bad padding!");
                    }
                } else {
                    return;
                }
            }
        }
        throw new IOException("Incorrect parameters passed in to read from");
    }
}
