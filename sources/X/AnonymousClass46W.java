package X;

import java.io.File;

/* renamed from: X.46W  reason: invalid class name */
public final class AnonymousClass46W {
    public static String A00(AnonymousClass013 r2, C38711rI r3) {
        File file;
        C16750ta r0 = r3.A02;
        if (r0 == null || (file = r0.A0F) == null) {
            return "";
        }
        int i2 = r3.A00;
        if (i2 == 0) {
            i2 = C17970vw.A03(file);
            r3.A00 = i2;
            if (i2 == 0) {
                return AnonymousClass2GQ.A03(r2, r3.A01);
            }
        }
        return C28961Zl.A04(r2, (long) i2);
    }
}
