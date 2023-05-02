package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.4ZB  reason: invalid class name */
public final class AnonymousClass4ZB {
    public static final C84194Jp A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A04;

    static {
        byte[] bArr = new byte[0];
        A04 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C84194Jp r2 = new C84194Jp(bArr);
        try {
            int i2 = r2.A00 + r2.A01;
            r2.A00 = i2;
            if (i2 > 0) {
                r2.A01 = i2;
                r2.A00 = i2 - i2;
            } else {
                r2.A01 = 0;
            }
            A00 = r2;
        } catch (AnonymousClass40G e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Object A00(Object obj, Object obj2) {
        AnonymousClass3Z1 r3 = (AnonymousClass3Z1) ((AnonymousClass5UZ) obj);
        AnonymousClass3ZM r2 = (AnonymousClass3ZM) r3.A07(5);
        r2.A00();
        AnonymousClass3Z1 r1 = r2.A00;
        AnonymousClass3K3.A0Y(r1).AjF(r1, r3);
        AnonymousClass5UZ r4 = (AnonymousClass5UZ) obj2;
        if (r2.AjA().getClass().isInstance(r4)) {
            r2.A00();
            AnonymousClass3Z1 r12 = r2.A00;
            AnonymousClass3K3.A0Y(r12).AjF(r12, (AnonymousClass3Z1) ((C98284rO) r4));
            return r2.AjB();
        }
        throw AnonymousClass000.A0T("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
