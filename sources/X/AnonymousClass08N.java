package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

/* renamed from: X.08N  reason: invalid class name */
public class AnonymousClass08N {
    public static final AnonymousClass03L A00 = new AnonymousClass03L(16);
    public static final AnonymousClass0WK A01;

    static {
        AnonymousClass0WK r0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            r0 = new AnonymousClass0EA();
        } else if (i2 >= 28) {
            r0 = new AnonymousClass0E7();
        } else if (i2 >= 26) {
            r0 = new AnonymousClass0E8();
        } else {
            if (i2 >= 24) {
                if (AnonymousClass0EB.A00()) {
                    r0 = new AnonymousClass0EB();
                }
            } else if (i2 < 21) {
                r0 = new AnonymousClass0WK();
            }
            r0 = new AnonymousClass0E9();
        }
        A01 = r0;
    }

    public static Typeface A00(Context context, Typeface typeface, int i2) {
        AnonymousClass0NO r1;
        Typeface A03;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 21) {
                AnonymousClass0WK r5 = A01;
                long A012 = AnonymousClass0WK.A01(typeface);
                if (!(A012 == 0 || (r1 = (AnonymousClass0NO) r5.A00.get(Long.valueOf(A012))) == null || (A03 = r5.A03(context, context.getResources(), r1, i2)) == null)) {
                    return A03;
                }
            }
            return Typeface.create(typeface, i2);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static String A01(Resources resources, String str, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder(resources.getResourcePackageName(i2));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(i3);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i4);
        return sb.toString();
    }
}
