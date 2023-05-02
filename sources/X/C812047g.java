package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.47g  reason: invalid class name and case insensitive filesystem */
public class C812047g {
    public static String A00(Uri uri, AnonymousClass4J1 r4) {
        Set<String> set;
        if (!TextUtils.isEmpty(uri.getQuery())) {
            try {
                set = uri.getQueryParameterNames();
            } catch (UnsupportedOperationException unused) {
                set = null;
            }
            if (set != null && !set.isEmpty()) {
                StringBuilder A0o = AnonymousClass000.A0o();
                Collections.unmodifiableList(r4.A00);
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass000.A0m(it);
                    if (A0o.length() > 0) {
                        A0o.append('&');
                    }
                    A0o.append(A0m);
                    A0o.append("=--sanitized--");
                }
                return A0o.toString();
            }
        }
        return null;
    }
}
