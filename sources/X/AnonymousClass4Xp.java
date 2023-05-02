package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.4Xp  reason: invalid class name */
public abstract class AnonymousClass4Xp {
    public static Uri A00(C35571m9 r2, int i2) {
        String str;
        StringBuilder A0r = AnonymousClass000.A0r("https://");
        if (i2 != 0) {
            if (i2 == 1) {
                A0r.append("www.instagram.com/");
                str = r2.A02;
            }
            return Uri.parse(A0r.toString());
        }
        A0r.append("www.facebook.com/");
        str = r2.A03;
        A0r.append(str);
        return Uri.parse(A0r.toString());
    }

    public static void A01(Context context, Uri uri, C19980zJ r14, AnonymousClass1KR r15, C35661mI r16, C35571m9 r17, Integer num, String str, int i2, boolean z2, boolean z3) {
        Integer num2;
        Integer valueOf = Integer.valueOf(r17.A01);
        int i3 = i2;
        Integer A00 = i2 == 0 ? AnonymousClass1KR.A00(valueOf) : null;
        int i4 = 1;
        if (i3 == 1) {
            num2 = AnonymousClass1KR.A00(valueOf);
        } else {
            num2 = null;
            if (i2 == 0) {
                i4 = 0;
            }
        }
        r15.A04((Integer) null, A00, num2, num, Integer.valueOf(i4), str, 15, true, z3);
        if (z2) {
            r15.A01(r16, 11);
        }
        r14.A06(context, C13690nt.A0B(uri));
    }
}
