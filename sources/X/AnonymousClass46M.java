package X;

import android.content.Context;
import android.content.res.Resources;
import com.obwhatsapp.R;
import java.util.Iterator;

/* renamed from: X.46M  reason: invalid class name */
public class AnonymousClass46M {
    public static String A00(Context context, AnonymousClass4MJ r6) {
        Iterator A0y = AnonymousClass000.A0y(r6.A01);
        int i2 = 0;
        while (A0y.hasNext()) {
            if (AnonymousClass000.A0D(AnonymousClass000.A0z(A0y).getValue()) == 419) {
                i2++;
            }
        }
        if (i2 <= 0) {
            return null;
        }
        Resources resources = context.getResources();
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1M(A1b, i2, 0);
        return resources.getQuantityString(R.plurals.plurals0094, i2, A1b);
    }
}
