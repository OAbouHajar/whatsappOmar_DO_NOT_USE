package X;

import android.net.Uri;

/* renamed from: X.1qK  reason: invalid class name and case insensitive filesystem */
public class C38151qK implements C38101qF {
    public final Uri.Builder A00;
    public final String A01;
    public final String A02;

    public C38151qK(String str, String str2) {
        Uri parse = Uri.parse(str);
        this.A00 = parse.buildUpon();
        this.A01 = parse.getAuthority();
        this.A02 = str2;
    }

    public String A9R(C29561ap r3, boolean z2) {
        return this.A00.encodedAuthority(r3.A02).build().toString();
    }
}
