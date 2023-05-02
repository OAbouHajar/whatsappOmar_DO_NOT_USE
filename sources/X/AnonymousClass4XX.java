package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.4XX  reason: invalid class name */
public abstract class AnonymousClass4XX {
    public Unsafe A00;

    public AnonymousClass4XX(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public static byte A00(Object obj, long j2) {
        int i2;
        boolean z2 = C90904f2.A08;
        long j3 = -4 & j2;
        AnonymousClass4XX r0 = C90904f2.A02;
        if (z2) {
            i2 = r0.A04(obj, j3);
            j2 ^= -1;
        } else {
            i2 = r0.A00.getInt(obj, j3);
        }
        return (byte) (i2 >>> ((int) ((j2 & 3) << 3)));
    }

    public byte A01(Object obj, long j2) {
        boolean z2 = this instanceof AnonymousClass3ZV;
        return A00(obj, j2);
    }

    public double A02(Object obj, long j2) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j2));
    }

    public float A03(Object obj, long j2) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j2));
    }

    public final int A04(Object obj, long j2) {
        return this.A00.getInt(obj, j2);
    }

    public final long A05(Object obj, long j2) {
        return this.A00.getLong(obj, j2);
    }

    public final long A06(Field field) {
        return this.A00.objectFieldOffset(field);
    }

    public abstract void A07(long j2, byte b2);

    public void A08(Object obj, long j2, byte b2) {
        if (C90904f2.A08) {
            C90904f2.A05(obj, j2, b2);
        } else {
            C90904f2.A06(obj, j2, b2);
        }
    }

    public void A09(Object obj, long j2, double d2) {
        A0C(obj, j2, Double.doubleToLongBits(d2));
    }

    public void A0A(Object obj, long j2, float f2) {
        A0B(obj, j2, Float.floatToIntBits(f2));
    }

    public final void A0B(Object obj, long j2, int i2) {
        this.A00.putInt(obj, j2, i2);
    }

    public final void A0C(Object obj, long j2, long j3) {
        this.A00.putLong(obj, j2, j3);
    }

    public void A0D(Object obj, long j2, boolean z2) {
        boolean z3 = C90904f2.A08;
        byte b2 = z2 ? (byte) 1 : 0;
        if (z3) {
            C90904f2.A05(obj, j2, b2);
        } else {
            C90904f2.A06(obj, j2, b2);
        }
    }

    public abstract void A0E(byte[] bArr, long j2, long j3, long j4);

    public boolean A0F(Object obj, long j2) {
        boolean z2 = this instanceof AnonymousClass3ZV;
        return AnonymousClass000.A1O(A00(obj, j2));
    }
}
