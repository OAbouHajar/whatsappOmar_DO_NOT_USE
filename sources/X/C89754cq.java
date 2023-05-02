package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.charset.Charset;

/* renamed from: X.4cq  reason: invalid class name and case insensitive filesystem */
public final class C89754cq {
    public static final Object A00 = C13690nt.A0Y();
    public static final Charset A01 = Charset.forName("ISO-8859-1");
    public static final Charset A02 = Charset.forName(DefaultCrypto.UTF_8);

    public static boolean A00(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                while (i3 < length2 && objArr2[i3] == null) {
                    i3++;
                }
                boolean A1P = AnonymousClass3K3.A1P(i2, length);
                boolean A1P2 = AnonymousClass3K3.A1P(i3, length2);
                if (!A1P) {
                    if (A1P != A1P2 || !objArr[i2].equals(objArr2[i3])) {
                        break;
                    }
                    i2++;
                    i3++;
                } else if (A1P2) {
                    return true;
                }
            } else {
                i2++;
            }
        }
        return false;
    }
}
