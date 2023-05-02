package X;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.3As  reason: invalid class name and case insensitive filesystem */
public class C61863As {
    public static String A00(String str) {
        try {
            String host = new URL(str).getHost();
            C18450wi.A0H(str, 0);
            Uri parse = Uri.parse(C30931dC.A03(str, C30931dC.A03));
            C18450wi.A0B(parse);
            boolean z2 = true;
            if (!C42181xM.A03(parse, C42181xM.A01)) {
                if (!C42181xM.A03(parse, C42181xM.A00) || !"1".equalsIgnoreCase(parse.getQueryParameter("fw"))) {
                    z2 = false;
                }
            }
            if (!z2) {
                return host;
            }
            StringBuilder A0q = AnonymousClass000.A0q(host);
            A0q.append("/watch");
            return A0q.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        if (r1 != null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.C16740tZ r5, X.C25791Ld r6, boolean r7) {
        /*
            r2 = 0
            if (r7 == 0) goto L_0x0059
            X.1uH r0 = r5.A0N
            r3 = 1
            if (r0 == 0) goto L_0x000d
            int r0 = r0.A01
            if (r0 != r3) goto L_0x000d
        L_0x000c:
            return r3
        L_0x000d:
            X.1cv r4 = r5.A0U
            if (r4 == 0) goto L_0x0059
            java.lang.String r1 = r4.A04
            if (r1 != 0) goto L_0x0019
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x0059
        L_0x0019:
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x0059
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x0059
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x002f
            X.1Vw r0 = r5.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x000c
            boolean r0 = r5.A1D
            if (r0 != 0) goto L_0x000c
        L_0x002f:
            boolean r0 = r5 instanceof X.C30581cc
            if (r0 == 0) goto L_0x0059
            X.25S r0 = r6.A04
            X.0sb r0 = r0.A02
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = X.C004101u.A02(r1)
        L_0x003d:
            X.1jH r0 = r0.A05()
            java.io.File r0 = r0.A0Q
            X.C16180sb.A04(r0, r2)
            X.AnonymousClass00B.A06(r1)
            java.io.File r0 = X.C16180sb.A00(r0, r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000c
            return r2
        L_0x0054:
            java.lang.String r1 = r4.A06
            if (r1 == 0) goto L_0x0059
            goto L_0x003d
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61863As.A01(X.0tZ, X.1Ld, boolean):boolean");
    }

    public static boolean A02(String str) {
        return !TextUtils.isEmpty(str) && !TextUtils.isEmpty(C51792cH.A00(Uri.parse(str)));
    }
}
