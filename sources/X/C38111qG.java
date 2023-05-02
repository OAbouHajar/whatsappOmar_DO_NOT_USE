package X;

import android.net.Uri;

/* renamed from: X.1qG  reason: invalid class name and case insensitive filesystem */
public class C38111qG implements C38101qF {
    public final Uri A00;
    public final C14710pd A01;
    public final String A02;
    public final String A03;

    public C38111qG(C14710pd r2, String str) {
        this.A01 = r2;
        this.A03 = str;
        Uri parse = Uri.parse(str);
        this.A00 = parse;
        String authority = parse.getAuthority();
        AnonymousClass00B.A06(authority);
        this.A02 = authority;
    }

    public String A9R(C29561ap r6, boolean z2) {
        Uri uri = this.A00;
        if (!"PSA".equals(uri.getQueryParameter("category")) || !this.A01.A0E(C16620tM.A02, 2037)) {
            return this.A03;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Uri.Builder encodedAuthority = buildUpon.scheme("https").encodedAuthority(r6.A02);
        StringBuilder sb = new StringBuilder("wa/static");
        sb.append(uri.getEncodedPath());
        encodedAuthority.encodedPath(sb.toString());
        return buildUpon.build().toString();
    }
}
