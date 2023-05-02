package X;

import com.obwhatsapp.RequestPermissionActivity;
import java.io.File;

/* renamed from: X.2kC  reason: invalid class name and case insensitive filesystem */
public class C55702kC {
    public static int A00(C19980zJ r4, C16300so r5, C14550pN r6, C14870pt r7, C16260sj r8, C16500tA r9, C38631rA r10, AnonymousClass1PD r11, C16320sq r12) {
        C14550pN r3 = r6;
        if (!RequestPermissionActivity.A0X(r6, r8)) {
            return 0;
        }
        C38631rA r62 = r10;
        C16750ta r2 = r10.A02;
        AnonymousClass00B.A06(r2);
        if (!r10.A11.A02 && !r2.A0P) {
            return 1;
        }
        File file = r2.A0F;
        if ((file == null || !file.exists()) && r2.A07 == 1) {
            return 4;
        }
        File file2 = r2.A0F;
        if (file2 == null || !file2.exists()) {
            return 2;
        }
        C18820xJ.A06(r4, r5, r3, r7, r9, r62, r11, r12);
        return 3;
    }
}
