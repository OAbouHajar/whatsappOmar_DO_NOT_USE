package X;

import android.net.Uri;
import java.net.URI;
import java.util.Locale;

/* renamed from: X.4dk  reason: invalid class name and case insensitive filesystem */
public final class C90214dk {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        if (r1.contains("_") != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d4, code lost:
        if (r1.contains("_") == false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri A00(java.lang.String r11) {
        /*
            android.net.Uri r2 = android.net.Uri.parse(r11)
            java.lang.String r0 = r2.getScheme()
            if (r0 != 0) goto L_0x000e
            r0 = 1
        L_0x000b:
            if (r0 != 0) goto L_0x0049
            goto L_0x0019
        L_0x000e:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "([a-zA-Z][a-zA-Z0-9+.-]*)?"
            boolean r0 = r1.matches(r0)
            goto L_0x000b
        L_0x0019:
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0064 }
            r3.<init>(r11)     // Catch:{ URISyntaxException -> 0x0064 }
            boolean r0 = r3.isOpaque()
            if (r0 == 0) goto L_0x00d7
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = r3.getScheme()
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = r3.getRawSchemeSpecificPart()
            android.net.Uri$Builder r1 = r1.encodedOpaquePart(r0)
            java.lang.String r0 = r3.getRawFragment()
            android.net.Uri$Builder r0 = r1.encodedFragment(r0)
            android.net.Uri r2 = r0.build()
            A01(r11, r3, r2)
            return r2
        L_0x0049:
            boolean r0 = r2.isOpaque()
            if (r0 == 0) goto L_0x0081
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x0064 }
            java.lang.String r3 = r2.getSchemeSpecificPart()     // Catch:{ URISyntaxException -> 0x0064 }
            java.lang.String r1 = r2.getFragment()     // Catch:{ URISyntaxException -> 0x0064 }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0064 }
            r0.<init>(r4, r3, r1)     // Catch:{ URISyntaxException -> 0x0064 }
            A01(r11, r0, r2)
            return r2
        L_0x0064:
            r4 = move-exception
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = X.C13690nt.A1Z()
            r0 = 0
            r2[r0] = r11
            r1 = 1
            java.lang.String r0 = r4.getMessage()
            r2[r1] = r0
            java.lang.String r0 = "Parsing url %s caused exception: %s."
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        L_0x0081:
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.lang.String r5 = r2.getUserInfo()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.lang.String r6 = r2.getHost()     // Catch:{ URISyntaxException -> 0x00a3 }
            int r7 = r2.getPort()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.lang.String r8 = r2.getPath()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.lang.String r9 = r2.getQuery()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.lang.String r10 = r2.getFragment()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00a3 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ URISyntaxException -> 0x00a3 }
            goto L_0x00c1
        L_0x00a3:
            r4 = move-exception
            java.lang.String r0 = r2.toString()     // Catch:{ URISyntaxException -> 0x00e0 }
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00e0 }
            r3.<init>(r0)     // Catch:{ URISyntaxException -> 0x00e0 }
            java.lang.String r1 = r2.getHost()     // Catch:{ URISyntaxException -> 0x00e0 }
            java.lang.String r0 = r3.getHost()     // Catch:{ URISyntaxException -> 0x00e0 }
            if (r0 != 0) goto L_0x00e0
            if (r1 == 0) goto L_0x00e0
            java.lang.String r0 = "_"
            boolean r0 = r1.contains(r0)     // Catch:{ URISyntaxException -> 0x00e0 }
            if (r0 == 0) goto L_0x00e0
        L_0x00c1:
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = r3.getHost()
            if (r0 != 0) goto L_0x00db
            if (r1 == 0) goto L_0x00db
            java.lang.String r0 = "_"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00dc
            goto L_0x00db
        L_0x00d7:
            android.net.Uri r2 = X.AnonymousClass3K2.A0M(r3)
        L_0x00db:
            r0 = 0
        L_0x00dc:
            A02(r11, r3, r2, r0)
            return r2
        L_0x00e0:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = X.C13690nt.A1Z()
            r0 = 0
            r2[r0] = r11
            r1 = 1
            java.lang.String r0 = r4.getMessage()
            r2[r1] = r0
            java.lang.String r0 = "Parsing url %s caused exception: %s."
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90214dk.A00(java.lang.String):android.net.Uri");
    }

    public static void A01(String str, URI uri, Uri uri2) {
        boolean A03 = A03(uri.getScheme(), uri2.getScheme());
        boolean A032 = A03(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (!A03 || !A032) {
            String str2 = "";
            if (!A03) {
                str2 = AnonymousClass000.A0h(AnonymousClass3K2.A0h(uri2, uri), AnonymousClass000.A0q(str2));
            }
            if (!A032) {
                str2 = AnonymousClass000.A0h(String.format(Locale.US, "javaUri opaque part: \"%s\". androidUri opaque part: \"%s\".", new Object[]{uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart()}), AnonymousClass000.A0q(str2));
            }
            throw AnonymousClass3K3.A0j(str2, str, Locale.US, AnonymousClass3K3.A1a(uri, uri2));
        }
    }

    public static void A02(String str, URI uri, Uri uri2, boolean z2) {
        boolean A03 = A03(uri.getScheme(), uri2.getScheme());
        boolean A032 = A03(uri.getAuthority(), uri2.getAuthority());
        boolean A033 = A03(uri.getPath(), uri2.getPath());
        String str2 = "";
        if (!A03) {
            str2 = AnonymousClass000.A0h(AnonymousClass3K2.A0h(uri2, uri), AnonymousClass000.A0q(str2));
        }
        if (!z2 && !A032) {
            str2 = AnonymousClass000.A0h(String.format(Locale.US, "javaUri authority: \"%s\". androidUri authority: \"%s\".", new Object[]{uri.getAuthority(), uri2.getAuthority()}), AnonymousClass000.A0q(str2));
        }
        if (!A033) {
            str2 = AnonymousClass000.A0h(String.format(Locale.US, "javaUri path: \"%s\". androidUri path: \"%s\".", new Object[]{uri.getPath(), uri2.getPath()}), AnonymousClass000.A0q(str2));
        }
        if (!A03 || !A032 || !A033) {
            throw AnonymousClass3K3.A0j(str2, str, Locale.US, AnonymousClass3K3.A1a(uri, uri2));
        }
    }

    public static boolean A03(String str, String str2) {
        return (str == null || str.equals("")) ? str2 == null || str2.equals("") : str.equals(str2);
    }
}
