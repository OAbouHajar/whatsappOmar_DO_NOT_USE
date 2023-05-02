package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: X.3d0  reason: invalid class name and case insensitive filesystem */
public final class C68173d0 extends AnonymousClass45S {
    public boolean A00;
    public final int A01;
    public final ByteBuffer A02 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    public final MessageDigest A03;

    public C68173d0(MessageDigest messageDigest, int i2) {
        this.A03 = messageDigest;
        this.A01 = i2;
    }
}
