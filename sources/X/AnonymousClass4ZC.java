package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.4ZC  reason: invalid class name */
public final class AnonymousClass4ZC {
    public static final C84214Jr A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName(DefaultCrypto.UTF_8);
    public static final Charset A03 = Charset.forName("ISO-8859-1");
    public static final byte[] A04;

    static {
        byte[] bArr = new byte[0];
        A04 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C84214Jr r2 = new C84214Jr(bArr);
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
        } catch (AnonymousClass40H e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Object A00(Object obj, Object obj2) {
        C67293bJ r3 = (C67293bJ) ((C109905Uc) obj);
        C67133b3 A002 = C67293bJ.A00(r3);
        C67133b3.A00(A002);
        C67293bJ r1 = A002.A00;
        AnonymousClass3K4.A0Q(r1).Aj9(r1, r3);
        C109905Uc r4 = (C109905Uc) obj2;
        if (A002.AjR().getClass().isInstance(r4)) {
            C67133b3.A00(A002);
            C67293bJ r12 = A002.A00;
            AnonymousClass3K4.A0Q(r12).Aj9(r12, (C67293bJ) ((C98484sU) r4));
            return A002.AjK();
        }
        throw AnonymousClass000.A0T("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
