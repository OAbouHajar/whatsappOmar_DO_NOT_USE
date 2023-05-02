package X;

import java.security.SecureRandom;

/* renamed from: X.1XM  reason: invalid class name */
public class AnonymousClass1XM {
    public final long A00;
    public final byte[] A01;

    public AnonymousClass1XM(byte[] bArr, long j2) {
        AnonymousClass00B.A0G(j2 > 0);
        this.A01 = bArr;
        this.A00 = j2;
    }

    public static boolean A00(AnonymousClass1XM r4, long j2) {
        return j2 - r4.A00 < ((long) new SecureRandom().nextInt(86400000)) + 172800000;
    }
}
