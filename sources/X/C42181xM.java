package X;

import android.net.Uri;
import com.obwhatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xM  reason: invalid class name and case insensitive filesystem */
public final class C42181xM {
    public static final List A00 = AnonymousClass1JA.A0R("facebook.com", "www.facebook.com", "m.facebook.com");
    public static final List A01 = AnonymousClass1JA.A0R("fbwat.ch", "www.fbwat.ch", "fb.watch", "www.fb.watch");
    public static final List A02 = AnonymousClass1JA.A0R("instagram.com", "www.instagram.com");
    public static final List A03 = AnonymousClass1JA.A0R("lassovideos.com", "www.lassovideos.com");
    public static final List A04 = AnonymousClass1JA.A0R("netflix.com", "www.netflix.com");
    public static final List A05 = AnonymousClass1JA.A0R("sharechat.com", "www.sharechat.com");
    public static final List A06 = AnonymousClass1JA.A0R("streamable.com", "www.streamable.com");

    public static final int A00(int i2) {
        if (i2 == 2) {
            return R.drawable.ic_pip_facebook;
        }
        if (i2 == 3) {
            return R.drawable.ic_pip_instagram;
        }
        if (i2 == 4) {
            return R.drawable.ic_pip_youtube;
        }
        if (i2 == 5) {
            return R.drawable.ic_pip_facebook;
        }
        if (i2 == 6) {
            return R.drawable.ic_pip_lasso;
        }
        if (i2 != 8) {
            return -1;
        }
        return R.drawable.ic_pip_sharechat;
    }

    public static final int A01(String str) {
        C18450wi.A0H(str, 0);
        Uri parse = Uri.parse(C30931dC.A03(str, C30931dC.A03));
        C18450wi.A0B(parse);
        if (!A03(parse, A01)) {
            List list = A00;
            if (!A03(parse, list) || !"1".equalsIgnoreCase(parse.getQueryParameter("fw"))) {
                if (A03(parse, list)) {
                    return 2;
                }
                if (A03(parse, A02)) {
                    return 3;
                }
                if (A03(parse, A06)) {
                    return 1;
                }
                String A022 = A02(parse);
                if (A022 != null && A022.length() != 0) {
                    return 4;
                }
                if (A03(parse, A03)) {
                    return 6;
                }
                if (A03(parse, A04)) {
                    return 7;
                }
                return A03(parse, A05) ? 8 : 0;
            }
        }
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (X.C008603x.A0F(r1, "shorts") == true) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(android.net.Uri r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x0031
            java.lang.String r1 = r4.getHost()
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "m.youtube.com"
            r2 = 1
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "www.youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "youtu.be"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0031
        L_0x002d:
            java.lang.String r3 = r4.getLastPathSegment()
        L_0x0031:
            return r3
        L_0x0032:
            java.lang.String r1 = r4.getPath()
            if (r1 == 0) goto L_0x004e
            java.util.Locale r0 = java.util.Locale.US
            X.C18450wi.A0D(r0)
            java.lang.String r1 = r1.toLowerCase(r0)
            X.C18450wi.A0B(r1)
            java.lang.String r0 = "shorts"
            boolean r0 = X.C008603x.A0F(r1, r0)
            if (r0 != r2) goto L_0x004e
            goto L_0x002d
        L_0x004e:
            java.lang.String r0 = "v"
            java.lang.String r3 = r4.getQueryParameter(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42181xM.A02(android.net.Uri):java.lang.String");
    }

    public static final boolean A03(Uri uri, List list) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (host.equalsIgnoreCase((String) next)) {
                return next != null;
            }
        }
        return false;
    }
}
