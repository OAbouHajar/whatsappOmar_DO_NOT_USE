package X;

import sun.misc.Unsafe;

/* renamed from: X.3ZW  reason: invalid class name */
public final class AnonymousClass3ZW extends AnonymousClass4XX {
    public AnonymousClass3ZW(Unsafe unsafe) {
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

    public final void A07(long j2, byte b2) {
        this.A00.putByte(j2, b2);
    }

    public final void A08(Object obj, long j2, byte b2) {
        this.A00.putByte(obj, j2, b2);
    }

    public final void A09(Object obj, long j2, double d2) {
        this.A00.putDouble(obj, j2, d2);
    }

    public final void A0A(Object obj, long j2, float f2) {
        this.A00.putFloat(obj, j2, f2);
    }

    public final void A0D(Object obj, long j2, boolean z2) {
        this.A00.putBoolean(obj, j2, z2);
    }

    public final void A0E(byte[] bArr, long j2, long j3, long j4) {
        this.A00.copyMemory(bArr, C90904f2.A00 + j2, (Object) null, j3, j4);
    }

    public final boolean A0F(Object obj, long j2) {
        return this.A00.getBoolean(obj, j2);
    }
}
