package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;

/* renamed from: X.3AP  reason: invalid class name */
public class AnonymousClass3AP {
    public static final AnonymousClass3AP A00 = new AnonymousClass3AP();

    public int A00(Context context, int i2) {
        int A002 = C15040qE.A00(context, i2);
        if (A002 != 1 || !C15040qE.A03(context)) {
            return A002;
        }
        return 18;
    }

    public Intent A01(Context context, String str, int i2) {
        if (i2 == 1 || i2 == 2) {
            if (context == null || !C89794cv.A01(context)) {
                StringBuilder A0r = AnonymousClass000.A0r("gcore_");
                A0r.append(12451000);
                A0r.append("-");
                if (!TextUtils.isEmpty(str)) {
                    A0r.append(str);
                }
                A0r.append("-");
                if (context != null) {
                    A0r.append(context.getPackageName());
                }
                A0r.append("-");
                if (context != null) {
                    try {
                        C15570rR A002 = C15560rQ.A00(context);
                        A0r.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String obj = A0r.toString();
                Intent A02 = C13700nu.A02("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(obj)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", obj);
                }
                A02.setData(appendQueryParameter.build());
                A02.setPackage("com.android.vending");
                A02.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                return A02;
            }
            Intent A022 = C13700nu.A02("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            A022.setPackage(SearchActionVerificationClientUtil.ANDROID_WEAR_PACKAGE);
            return A022;
        } else if (i2 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent A023 = C13700nu.A02("android.settings.APPLICATION_DETAILS_SETTINGS");
            A023.setData(fromParts);
            return A023;
        }
    }
}
