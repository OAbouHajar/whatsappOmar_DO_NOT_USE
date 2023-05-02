package com.obwhatsapp.wamsys;

import X.AnonymousClass000;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C13690nt;
import android.net.Uri;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

public class SecureUriParser {
    public static Uri createHierAndroidUriFromJavaUri(URI uri) {
        return AnonymousClass3K2.A0M(uri);
    }

    public static URI createHierJavaUriFromAndroidUri(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e2) {
            URI createHierJavaUriFromAndroidUriSecondTry = createHierJavaUriFromAndroidUriSecondTry(uri);
            if (createHierJavaUriFromAndroidUriSecondTry != null) {
                return createHierJavaUriFromAndroidUriSecondTry;
            }
            throw createOnParsingJavaUriFailException(str, e2);
        }
    }

    public static URI createHierJavaUriFromAndroidUriSecondTry(Uri uri) {
        try {
            URI uri2 = new URI(uri.toString());
            if (shouldSkipAuthority(uri2, uri)) {
                return uri2;
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static SecurityException createOnParsingJavaUriFailException(String str, URISyntaxException uRISyntaxException) {
        Locale locale = Locale.US;
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = str;
        A1Z[1] = uRISyntaxException.getMessage();
        return new SecurityException(String.format(locale, "Parsing url %s caused exception: %s.", A1Z));
    }

    public static Uri createOpaqueAndroidUriFromJavaUri(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedOpaquePart(uri.getRawSchemeSpecificPart()).encodedFragment(uri.getRawFragment()).build();
    }

    public static URI createOpaqueJavaUriFromAndroidUri(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment());
        } catch (URISyntaxException e2) {
            throw createOnParsingJavaUriFailException(str, e2);
        }
    }

    public static Uri parseEncodedRFC2396(String str) {
        Uri parse = Uri.parse(str);
        if (!validateScheme(parse)) {
            return parseEncodedRFC2396Reverse(str);
        }
        validateMightThrow(str, parse);
        return parse;
    }

    public static Uri parseEncodedRFC2396Reverse(String str) {
        try {
            URI uri = new URI(str);
            if (uri.isOpaque()) {
                Uri createOpaqueAndroidUriFromJavaUri = createOpaqueAndroidUriFromJavaUri(uri);
                urisMatchMightThrowOnOpaque(str, uri, createOpaqueAndroidUriFromJavaUri);
                return createOpaqueAndroidUriFromJavaUri;
            }
            Uri A0M = AnonymousClass3K2.A0M(uri);
            urisMatchMightThrowOnHier(str, uri, A0M, false);
            return A0M;
        } catch (URISyntaxException e2) {
            throw createOnParsingJavaUriFailException(str, e2);
        }
    }

    public static boolean shouldSkipAuthority(URI uri, Uri uri2) {
        String host = uri2.getHost();
        return uri.getHost() == null && host != null && host.contains("_");
    }

    public static boolean stringEquals(String str, String str2) {
        return (str == null || str.equals("")) ? str2 == null || str2.equals("") : str.equals(str2);
    }

    public static void urisMatchMightThrowOnHier(String str, URI uri, Uri uri2, boolean z2) {
        boolean stringEquals = stringEquals(uri.getScheme(), uri2.getScheme());
        boolean stringEquals2 = stringEquals(uri.getAuthority(), uri2.getAuthority());
        boolean stringEquals3 = stringEquals(uri.getPath(), uri2.getPath());
        String str2 = "";
        if (!stringEquals) {
            str2 = AnonymousClass000.A0h(AnonymousClass3K2.A0h(uri2, uri), AnonymousClass000.A0q(str2));
        }
        if (!z2 && !stringEquals2) {
            str2 = AnonymousClass000.A0h(String.format(Locale.US, "javaUri authority: \"%s\". androidUri authority: \"%s\".", new Object[]{uri.getAuthority(), uri2.getAuthority()}), AnonymousClass000.A0q(str2));
        }
        if (!stringEquals3) {
            str2 = AnonymousClass000.A0h(String.format(Locale.US, "javaUri path: \"%s\". androidUri path: \"%s\".", new Object[]{uri.getPath(), uri2.getPath()}), AnonymousClass000.A0q(str2));
        }
        if (!stringEquals || !stringEquals2 || !stringEquals3) {
            throw AnonymousClass3K3.A0j(str2, str, Locale.US, AnonymousClass3K3.A1a(uri, uri2));
        }
    }

    public static void urisMatchMightThrowOnOpaque(String str, URI uri, Uri uri2) {
        boolean stringEquals = stringEquals(uri.getScheme(), uri2.getScheme());
        boolean stringEquals2 = stringEquals(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (!stringEquals || !stringEquals2) {
            String str2 = "";
            if (!stringEquals) {
                str2 = AnonymousClass000.A0h(AnonymousClass3K2.A0h(uri2, uri), AnonymousClass000.A0q(str2));
            }
            if (!stringEquals2) {
                str2 = AnonymousClass000.A0h(String.format(Locale.US, "javaUri opaque part: \"%s\". androidUri opaque part: \"%s\".", new Object[]{uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart()}), AnonymousClass000.A0q(str2));
            }
            throw AnonymousClass3K3.A0j(str2, str, Locale.US, AnonymousClass3K3.A1a(uri, uri2));
        }
    }

    public static void validateMightThrow(String str, Uri uri) {
        if (uri.isOpaque()) {
            urisMatchMightThrowOnOpaque(str, createOpaqueJavaUriFromAndroidUri(str, uri), uri);
            return;
        }
        URI createHierJavaUriFromAndroidUri = createHierJavaUriFromAndroidUri(str, uri);
        urisMatchMightThrowOnHier(str, createHierJavaUriFromAndroidUri, uri, shouldSkipAuthority(createHierJavaUriFromAndroidUri, uri));
    }

    public static boolean validateScheme(Uri uri) {
        if (uri.getScheme() == null) {
            return true;
        }
        return uri.getScheme().matches("([a-zA-Z][a-zA-Z0-9+.-]*)?");
    }
}
