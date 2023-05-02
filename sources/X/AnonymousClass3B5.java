package X;

import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3B5  reason: invalid class name */
public class AnonymousClass3B5 {
    public static final List A00;
    public static final Map A01;

    static {
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(new C84494Kt(0, (String) null, R.string.str08ee));
        A0u.add(new C84494Kt(1, "filter_pop.png", R.string.str08ef));
        A0u.add(new C84494Kt(2, "filter_bw.png", R.string.str08ea));
        A0u.add(new C84494Kt(3, "filter_cool.png", R.string.str08ec));
        A0u.add(new C84494Kt(4, "filter_chrome.png", R.string.str08eb));
        A0u.add(new C84494Kt(5, "filter_film.png", R.string.str08ed));
        List<C84494Kt> unmodifiableList = Collections.unmodifiableList(A0u);
        A00 = unmodifiableList;
        HashMap A0x = AnonymousClass000.A0x();
        for (C84494Kt r1 : unmodifiableList) {
            A0x.put(r1.A02, r1);
        }
        A01 = Collections.unmodifiableMap(A0x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r2 >= A00.size()) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C84494Kt A00(int r2) {
        /*
            if (r2 < 0) goto L_0x000b
            java.util.List r0 = A00
            int r0 = r0.size()
            r1 = 1
            if (r2 < r0) goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            java.lang.String r0 = "Filter ID does not exist: "
            java.lang.String r0 = X.C13680ns.A0c(r2, r0)
            X.AnonymousClass00B.A0C(r0, r1)
            java.util.List r0 = A00
            java.lang.Object r0 = r0.get(r2)
            X.4Kt r0 = (X.C84494Kt) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3B5.A00(int):X.4Kt");
    }
}
