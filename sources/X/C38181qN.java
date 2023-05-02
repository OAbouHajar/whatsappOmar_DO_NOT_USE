package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.1qN  reason: invalid class name and case insensitive filesystem */
public class C38181qN extends C38191qO {
    public final String A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r5 != null) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C38181qN(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4)
            if (r2 != 0) goto L_0x0008
            r0 = 0
            if (r5 == 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.AnonymousClass00B.A0G(r0)
            r1.A00 = r5
            r1.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38181qN.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public String A9R(C29561ap r4, boolean z2) {
        Uri.Builder A012;
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            Uri.Builder buildUpon = Uri.parse(new Uri.Builder().scheme("https").encodedAuthority(r4.A02).encodedPath(str).build().toString()).buildUpon();
            int i2 = 1;
            if (r4.A00 == 0) {
                i2 = 0;
            }
            A012 = buildUpon.appendQueryParameter("direct_ip", String.valueOf(i2));
            if (z2) {
                A012.appendQueryParameter("auth", r4.A01);
            }
            String str2 = this.A03;
            if (!TextUtils.isEmpty(str2)) {
                A012.appendQueryParameter("hash", str2);
            }
        } else {
            A012 = A01(r4);
        }
        String str3 = r4.A03;
        if (str3 != null) {
            C38191qO.A00(A012, "_nc_cat", str3);
        }
        String str4 = this.A01;
        if (str4 != null) {
            A012.appendQueryParameter("mode", str4);
        }
        return A012.build().toString();
    }
}
