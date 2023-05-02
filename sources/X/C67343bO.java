package X;

import sun.misc.Unsafe;

/* renamed from: X.3bO  reason: invalid class name and case insensitive filesystem */
public final class C67343bO extends AnonymousClass4XS {
    public C67343bO(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte A01(Object obj, long j2) {
        return this.A00.getByte(obj, j2);
    }

    public final double A02(Object obj, long j2) {
        return this.A00.getDouble(obj, j2);
    }

    public final float A03(Object obj, long j2) {
        return this.A00.getFloat(obj, j2);
    }

    public final void A06(Object obj, long j2, byte b2) {
        this.A00.putByte(obj, j2, b2);
    }

    public final void A07(Object obj, long j2, double d2) {
        this.A00.putDouble(obj, j2, d2);
    }

    public final void A08(Object obj, long j2, float f2) {
        this.A00.putFloat(obj, j2, f2);
    }

    public final void A0B(Object obj, long j2, boolean z2) {
        this.A00.putBoolean(obj, j2, z2);
    }

    public final boolean A0C(Object obj, long j2) {
        return this.A00.getBoolean(obj, j2);
    }
}
