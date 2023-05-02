package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1ga  reason: invalid class name and case insensitive filesystem */
public abstract class C32561ga extends C32571gb {
    public static final Logger A01 = Logger.getLogger(C32561ga.class.getName());
    public static final boolean A02 = C90904f2.A06;
    public C98344rU A00;

    public static int A00(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) != 0) {
            return (i2 & -268435456) == 0 ? 4 : 5;
        }
        return 3;
    }

    public static int A01(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        int i2 = 2;
        if ((-34359738368L & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int A02(AnonymousClass556 r1, int i2) {
        int A002 = A00(i2 << 3);
        int A022 = r1.A02();
        return A002 + A00(A022) + A022;
    }

    @Deprecated
    public static int A03(AnonymousClass5UZ r4, C32591gd r5, int i2) {
        int A002 = A00(i2 << 3) << 1;
        C98284rO r42 = (C98284rO) r4;
        AnonymousClass3Z1 r2 = (AnonymousClass3Z1) r42;
        int i3 = r2.zzjq;
        if (i3 == -1) {
            i3 = r5.AjN(r42);
            r2.zzjq = i3;
        }
        return A002 + i3;
    }

    public abstract void A06();

    public abstract void A07(byte b2);

    public abstract void A08(int i2);

    public abstract void A09(int i2);

    public abstract void A0A(int i2, String str);

    public abstract void A0B(long j2);

    public abstract void A0C(long j2);

    public final void A0D(AnonymousClass442 r7, String str) {
        A01.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", r7);
        byte[] bytes = str.getBytes(AnonymousClass4ZB.A03);
        try {
            int length = bytes.length;
            A08(length);
            A05(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40Q((Throwable) e2);
        } catch (AnonymousClass40Q e3) {
            throw e3;
        }
    }

    public abstract void A0E(byte[] bArr, int i2, int i3);
}
