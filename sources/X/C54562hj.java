package X;

import android.net.Uri;

/* renamed from: X.2hj  reason: invalid class name and case insensitive filesystem */
public class C54562hj implements C54552hi {
    public final int A00;
    public final Uri A01;
    public final C16980tz A02;
    public final C49172Rk A03;
    public final C20350zu A04;
    public final boolean A05;

    public C54562hj(Uri uri, C16980tz r2, C49172Rk r3, C20350zu r4, int i2, boolean z2) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = uri;
        this.A00 = i2;
        this.A05 = z2;
    }

    public AnonymousClass2BC A7S(boolean z2) {
        C35341ll r3;
        Uri uri = this.A01;
        String str = null;
        if ((uri != null ? uri.toString() : "").startsWith(AnonymousClass32H.A00.toString())) {
            C16980tz r32 = this.A02;
            C20350zu r2 = this.A04;
            if (uri != null) {
                str = uri.getQueryParameter("bucketId");
            }
            return new AnonymousClass32H(r32, r2, str, this.A00);
        }
        if (!z2) {
            r3 = new C35341ll();
            r3.A05 = true;
        } else {
            int i2 = this.A00;
            if (uri != null) {
                str = uri.getQueryParameter("bucketId");
            }
            boolean z3 = this.A05;
            r3 = new C35341ll();
            r3.A01 = 2;
            r3.A00 = i2;
            r3.A02 = 2;
            r3.A03 = str;
            r3.A04 = z3;
        }
        return this.A03.A00(r3);
    }
}
