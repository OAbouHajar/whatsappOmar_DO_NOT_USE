package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4ci  reason: invalid class name and case insensitive filesystem */
public class C89674ci {
    public static final boolean A00 = AnonymousClass3K3.A1P(Build.VERSION.SDK_INT, 23);

    public static String A00(Context context, C34151jm r4) {
        String str = r4.A07;
        return TextUtils.isEmpty(str) ? context.getString(R.string.str169e) : context.getString(R.string.str169f, AnonymousClass000.A1a(str));
    }

    public static List A01(HashSet hashSet, List list) {
        C37781pj[] r3;
        if (hashSet == null || list == null) {
            return C13690nt.A0i(0);
        }
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C34151jm r4 = (C34151jm) it.next();
            AnonymousClass1XO r0 = r4.A04;
            if (r0 != null && (r3 = r0.A09) != null) {
                int length = r3.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (hashSet.contains(r3[i2])) {
                        A0u.add(r4);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return A0u;
    }
}
