package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.2Oj  reason: invalid class name and case insensitive filesystem */
public class C48662Oj {
    public static String A00(Context context, C16080sP r6, C216114t r7, C38731rK r8, C48642Oh r9) {
        int i2;
        int i3;
        synchronized (r9) {
            i2 = r9.A02;
        }
        if (!r9.A08() && i2 != 9) {
            if (i2 == 4) {
                boolean A00 = C14730pf.A00();
                i3 = R.string.str0b9f;
                if (A00) {
                    i3 = R.string.str0b9c;
                }
            } else {
                if (i2 == 5) {
                    C15830rv r1 = r8.A11.A00;
                    if (C16030sJ.A0L(r1) || C16030sJ.A0Q(r1)) {
                        r1 = r8.A0B();
                    }
                    if (r1 != null) {
                        return context.getString(R.string.str17ac, new Object[]{r6.A08(r7.A01(r1))});
                    }
                } else if (i2 != 8) {
                    if (i2 == 0) {
                        return null;
                    }
                }
                i3 = R.string.str0bad;
            }
            return context.getString(i3);
        }
        i3 = R.string.str1863;
        return context.getString(i3);
    }
}
