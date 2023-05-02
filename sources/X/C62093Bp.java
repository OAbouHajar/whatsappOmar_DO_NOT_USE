package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.obwhatsapp.R;
import java.util.Locale;

/* renamed from: X.3Bp  reason: invalid class name and case insensitive filesystem */
public final class C62093Bp {
    public static Locale A00;
    public static final AnonymousClass00O A01 = new AnonymousClass00O();

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C15560rQ.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String A01(Context context, int i2) {
        int i3;
        String str;
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i2 == 1) {
            i3 = R.string.str1c29;
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 5) {
                    str = "common_google_play_services_invalid_account_text";
                } else if (i2 == 7) {
                    str = "common_google_play_services_network_error_text";
                } else if (i2 == 9) {
                    i3 = R.string.str1c2e;
                } else if (i2 != 20) {
                    switch (i2) {
                        case 16:
                            str = "common_google_play_services_api_unavailable_text";
                            break;
                        case 17:
                            str = "common_google_play_services_sign_in_failed_text";
                            break;
                        case 18:
                            i3 = R.string.str1c32;
                            break;
                        default:
                            i3 = R.string.str1c2d;
                            break;
                    }
                } else {
                    str = "common_google_play_services_restricted_profile_text";
                }
                Resources resources2 = context.getResources();
                String A03 = A03(context, str);
                if (A03 == null) {
                    A03 = resources2.getString(R.string.str1c2d);
                }
                return String.format(resources2.getConfiguration().locale, A03, new Object[]{A002});
            }
            i3 = R.string.str1c26;
        } else if (C89794cv.A01(context)) {
            return resources.getString(R.string.str1c33);
        } else {
            i3 = R.string.str1c30;
        }
        return C13700nu.A0F(resources, A002, new Object[1], 0, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return A03(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        android.util.Log.e("GoogleApiAvailability", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r1 = r4.getResources()
            r3 = 0
            java.lang.String r2 = "GoogleApiAvailability"
            switch(r5) {
                case 1: goto L_0x0029;
                case 2: goto L_0x002d;
                case 3: goto L_0x0031;
                case 4: goto L_0x0019;
                case 5: goto L_0x0039;
                case 6: goto L_0x0019;
                case 7: goto L_0x0041;
                case 8: goto L_0x001a;
                case 9: goto L_0x001d;
                case 10: goto L_0x0020;
                case 11: goto L_0x0023;
                case 12: goto L_0x000a;
                case 13: goto L_0x000a;
                case 14: goto L_0x000a;
                case 15: goto L_0x000a;
                case 16: goto L_0x0026;
                case 17: goto L_0x0049;
                case 18: goto L_0x0019;
                case 19: goto L_0x000a;
                case 20: goto L_0x0051;
                default: goto L_0x000a;
            }
        L_0x000a:
            r0 = 33
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Unexpected error code "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r5)
        L_0x0016:
            android.util.Log.e(r2, r0)
        L_0x0019:
            return r3
        L_0x001a:
            java.lang.String r0 = "Internal error occurred. Please see logs for detailed information"
            goto L_0x0016
        L_0x001d:
            java.lang.String r0 = "Google Play services is invalid. Cannot recover."
            goto L_0x0016
        L_0x0020:
            java.lang.String r0 = "Developer error occurred. Please see logs for detailed information"
            goto L_0x0016
        L_0x0023:
            java.lang.String r0 = "The application is not licensed to the user."
            goto L_0x0016
        L_0x0026:
            java.lang.String r0 = "One of the API components you attempted to connect to is not available."
            goto L_0x0016
        L_0x0029:
            r0 = 2131893290(0x7f121c2a, float:1.9421352E38)
            goto L_0x0034
        L_0x002d:
            r0 = 2131893297(0x7f121c31, float:1.9421367E38)
            goto L_0x0034
        L_0x0031:
            r0 = 2131893287(0x7f121c27, float:1.9421346E38)
        L_0x0034:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0039:
            java.lang.String r0 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_invalid_account_title"
            goto L_0x0058
        L_0x0041:
            java.lang.String r0 = "Network error occurred. Please retry request later."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_network_error_title"
            goto L_0x0058
        L_0x0049:
            java.lang.String r0 = "The specified account could not be signed in."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_sign_in_failed_title"
            goto L_0x0058
        L_0x0051:
            java.lang.String r0 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_restricted_profile_title"
        L_0x0058:
            java.lang.String r0 = A03(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62093Bp.A02(android.content.Context, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r5, java.lang.String r6) {
        /*
            X.00O r3 = A01
            monitor-enter(r3)
            android.content.res.Configuration r4 = X.C13700nu.A03(r5)     // Catch:{ all -> 0x007f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007f }
            r0 = 24
            if (r1 < r0) goto L_0x0032
            android.os.LocaleList r0 = X.C04080Lc.A00(r4)     // Catch:{ all -> 0x007f }
            X.06e r0 = X.C012606e.A00(r0)     // Catch:{ all -> 0x007f }
        L_0x0015:
            r1 = 0
            X.06f r0 = r0.A00     // Catch:{ all -> 0x007f }
            java.util.Locale r1 = r0.A9b(r1)     // Catch:{ all -> 0x007f }
            java.util.Locale r0 = A00     // Catch:{ all -> 0x007f }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0029
            r3.clear()     // Catch:{ all -> 0x007f }
            A00 = r1     // Catch:{ all -> 0x007f }
        L_0x0029:
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x007f }
            if (r4 != 0) goto L_0x0064
            goto L_0x003f
        L_0x0032:
            r0 = 1
            java.util.Locale[] r2 = new java.util.Locale[r0]     // Catch:{ all -> 0x007f }
            r1 = 0
            java.util.Locale r0 = r4.locale     // Catch:{ all -> 0x007f }
            r2[r1] = r0     // Catch:{ all -> 0x007f }
            X.06e r0 = X.C012606e.A02(r2)     // Catch:{ all -> 0x007f }
            goto L_0x0015
        L_0x003f:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004a }
            java.lang.String r0 = "com.google.android.gms"
            android.content.res.Resources r2 = r1.getResourcesForApplication(r0)     // Catch:{ NameNotFoundException -> 0x004a }
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r4 = 0
            if (r2 == 0) goto L_0x0064
            java.lang.String r1 = "string"
            java.lang.String r0 = "com.google.android.gms"
            int r0 = r2.getIdentifier(r6, r1, r0)     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0066
            java.lang.String r1 = "GoogleApiAvailability"
            java.lang.String r0 = "Missing resource: "
            java.lang.String r0 = X.C13680ns.A0g(r6, r0)     // Catch:{ all -> 0x007f }
        L_0x0061:
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x007f }
        L_0x0064:
            monitor-exit(r3)     // Catch:{ all -> 0x007f }
            goto L_0x0079
        L_0x0066:
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x007f }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = "GoogleApiAvailability"
            java.lang.String r0 = "Got empty resource: "
            java.lang.String r0 = X.C13680ns.A0g(r6, r0)     // Catch:{ all -> 0x007f }
            goto L_0x0061
        L_0x0079:
            return r4
        L_0x007a:
            r3.put(r6, r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r3)     // Catch:{ all -> 0x007f }
            return r1
        L_0x007f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62093Bp.A03(android.content.Context, java.lang.String):java.lang.String");
    }
}
