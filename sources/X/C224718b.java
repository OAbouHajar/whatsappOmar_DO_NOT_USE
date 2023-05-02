package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: X.18b  reason: invalid class name and case insensitive filesystem */
public class C224718b {
    public static final Random A02 = new Random();
    public static volatile SecureRandom A03;
    public final C16040sK A00;
    public final C16440t3 A01;

    public C224718b(C16040sK r1, C16440t3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static String A00(C16040sK r0, C16440t3 r1, boolean z2) {
        byte[] A012 = A01(r0, r1, z2);
        if (A012 != null) {
            return C004101u.A04(A012);
        }
        throw new IllegalStateException("message id could not be created");
    }

    public static byte[] A01(C16040sK r7, C16440t3 r8, boolean z2) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            long A002 = r8.A00();
            byte[] bArr = new byte[8];
            for (int i2 = 7; i2 >= 0; i2--) {
                bArr[i2] = (byte) ((int) A002);
                A002 >>= 8;
            }
            instance.update(bArr);
            r7.A0B();
            AnonymousClass1ZT r0 = r7.A05;
            AnonymousClass00B.A06(r0);
            instance.update(r0.getRawString().getBytes());
            byte[] bArr2 = new byte[16];
            if (z2) {
                if (A03 == null) {
                    synchronized (C224718b.class) {
                        if (A03 == null) {
                            A03 = new SecureRandom();
                        }
                    }
                }
                A03.nextBytes(bArr2);
            } else {
                A02.nextBytes(bArr2);
            }
            instance.update(bArr2);
            return instance.digest();
        } catch (NoSuchAlgorithmException e2) {
            Log.w("unable to provide message id hash due to missing md5 algorithm", e2);
            return null;
        }
    }

    public C28381Vw A02(C15830rv r4, boolean z2) {
        return new C28381Vw(r4, A00(this.A00, this.A01, false), z2);
    }
}
