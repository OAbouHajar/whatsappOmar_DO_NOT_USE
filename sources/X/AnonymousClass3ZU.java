package X;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.3ZU  reason: invalid class name */
public final class AnonymousClass3ZU extends AnonymousClass4XX {
    public AnonymousClass3ZU(Unsafe unsafe) {
        super(unsafe);
    }

    public final void A07(long j2, byte b2) {
        Memory.pokeByte((int) (j2 & -1), b2);
    }

    public final void A0E(byte[] bArr, long j2, long j3, long j4) {
        Memory.pokeByteArray((int) (j3 & -1), bArr, (int) j2, (int) j4);
    }
}
