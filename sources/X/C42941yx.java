package X;

import com.whatsapp.util.Log;

/* renamed from: X.1yx  reason: invalid class name and case insensitive filesystem */
public class C42941yx {
    public static void A00(C16750ta r3, C16730tY r4, byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            C43061zH A7u = new C101754xp(C31831f6.A01(r4.A10, r4.A08)).A7u(bArr);
            r3.A0U = bArr;
            r3.A0Q = A7u.A00;
            r3.A0S = A7u.A02;
            r3.A0T = A7u.A01;
            return;
        }
        StringBuilder sb = new StringBuilder("MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length=");
        sb.append(length);
        sb.append("; message.key=");
        sb.append(r4.A11);
        Log.w(sb.toString());
        throw new AnonymousClass23S(16);
    }

    public static boolean A01(C16740tZ r3) {
        return (A02(r3) && r3.A10(1)) || r3.A08 == 3;
    }

    public static boolean A02(C16740tZ r4) {
        if (!(r4 instanceof C38631rA)) {
            return false;
        }
        C16750ta r2 = ((C16730tY) r4).A02;
        return r4.A08 == 7 && r2 != null && r2.A01 > 0;
    }
}
