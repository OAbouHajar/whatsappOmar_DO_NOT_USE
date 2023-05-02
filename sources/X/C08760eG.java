package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0eG  reason: invalid class name and case insensitive filesystem */
public abstract class C08760eG implements C13460m4 {
    public static final C06220Uu A02 = new C06220Uu(32);
    public int A00;
    public final AtomicLong A01 = new AtomicLong(0);

    public C08760eG(int i2) {
        this.A00 = i2;
    }

    public static AnonymousClass0OV A00(InputStream inputStream, boolean z2) {
        C06220Uu r6 = A02;
        AnonymousClass0OV r7 = (AnonymousClass0OV) r6.A00();
        if (r7 == null) {
            r7 = new AnonymousClass0OV(new byte[131072], 0);
        }
        byte[] bArr = r7.A02;
        byte[] bArr2 = bArr;
        int i2 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, i2, bArr.length - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
                int length = bArr.length;
                if (i2 >= length) {
                    byte[] bArr3 = new byte[(length << 1)];
                    System.arraycopy(bArr, 0, bArr3, 0, length);
                    bArr = bArr3;
                }
            } catch (IOException e2) {
                if (!z2 || i2 == 0) {
                    r6.A02(r7);
                    if (z2) {
                        AnonymousClass0V3.A0J.A02();
                        return null;
                    }
                    throw e2;
                }
            }
        }
        if (bArr2 != bArr) {
            r6.A02(r7);
            return new AnonymousClass0OV(bArr, i2);
        }
        r7.A00 = i2;
        return r7;
    }

    public static void A01(AnonymousClass0OV r2) {
        if (r2.A02.length == 131072) {
            r2.A01 = null;
            A02.A02(r2);
        }
    }
}
