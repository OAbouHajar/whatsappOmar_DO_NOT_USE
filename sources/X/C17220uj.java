package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.0uj  reason: invalid class name and case insensitive filesystem */
public class C17220uj {
    public final AnonymousClass013 A00;
    public final C18160wF A01;

    public C17220uj(AnonymousClass013 r1, C18160wF r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static Intent A00(C17220uj r1, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", r1.A05("chats", str));
        intent.addFlags(268435456);
        return intent;
    }

    public Uri.Builder A01() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        return builder;
    }

    public final Uri A02(Pair pair, String str, String str2, String str3) {
        Uri.Builder A012 = A01();
        A012.appendPath(str);
        if (!TextUtils.isEmpty(str2)) {
            A012.appendPath(str2);
        }
        A06(A012);
        if (pair != null) {
            A012.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        if (!TextUtils.isEmpty(str3)) {
            A012.encodedFragment(str3);
        }
        return A012.build();
    }

    public Uri A03(String str) {
        Uri.Builder A012 = A01();
        if (!TextUtils.isEmpty(str)) {
            A012.appendPath(str);
        }
        A012.appendQueryParameter("locale", this.A00.A07());
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A012.encodedFragment((String) null);
        }
        return A012.build();
    }

    @Deprecated
    public Uri A04(String str) {
        return A02((Pair) null, "general", str, (String) null);
    }

    @Deprecated
    public Uri A05(String str, String str2) {
        Uri.Builder A012 = A01();
        A012.appendPath("general");
        A012.appendPath(str);
        A012.appendPath(str2);
        A06(A012);
        return A012.build();
    }

    public final void A06(Uri.Builder builder) {
        AnonymousClass013 r2 = this.A00;
        builder.appendQueryParameter("lg", r2.A06());
        builder.appendQueryParameter("lc", r2.A05());
        builder.appendQueryParameter("eea", this.A01.A04() ? "1" : "0");
    }
}
