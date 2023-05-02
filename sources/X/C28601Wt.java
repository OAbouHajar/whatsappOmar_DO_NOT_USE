package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.1Wt  reason: invalid class name and case insensitive filesystem */
public final class C28601Wt {
    public static final C47852Kx A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A04;

    static {
        byte[] bArr = new byte[0];
        A04 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C47852Kx r0 = new C47852Kx(bArr, 0, 0);
        try {
            r0.A04(0);
            A00 = r0;
        } catch (C29791bD e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
