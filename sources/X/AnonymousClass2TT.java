package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.2TT  reason: invalid class name */
public class AnonymousClass2TT {
    public static String A00(Context context, C16000sG r5, C16080sP r6, C16740tZ r7) {
        C28381Vw r1 = r7.A11;
        if (r1.A02) {
            return context.getString(R.string.str1ba8);
        }
        C15830rv r0 = r1.A00;
        boolean A0L = C16030sJ.A0L(r0);
        if (A0L) {
            r0 = r7.A0B();
        }
        if (r0 != null) {
            C16010sH A0A = r5.A0A(r0);
            String A0B = r6.A0B(A0A);
            if (A0B == null) {
                int i2 = 2;
                if (A0L) {
                    i2 = 1;
                }
                A0B = r6.A0G(A0A, i2, false);
                if (A0B != null) {
                    return A0B;
                }
            }
            return A0B;
        }
        return "";
    }
}
