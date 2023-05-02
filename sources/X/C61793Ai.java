package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3Ai  reason: invalid class name and case insensitive filesystem */
public final class C61793Ai {
    public final Bundle A00;

    public C61793Ai(Bundle bundle) {
        this.A00 = new Bundle(bundle);
    }

    public static String A00(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean A01(Bundle bundle) {
        String str = "gcm.n.e";
        if (!"1".equals(bundle.getString(str))) {
            if (str.startsWith("gcm.n.")) {
                str = str.replace("gcm.n.", "gcm.notification.");
            }
            if (!"1".equals(bundle.getString(str))) {
                String str2 = "gcm.n.icon";
                if (bundle.getString(str2) == null) {
                    if (str2.startsWith("gcm.n.")) {
                        str2 = str2.replace("gcm.n.", "gcm.notification.");
                    }
                    return bundle.getString(str2) != null;
                }
            }
        }
    }

    public final Bundle A02() {
        Bundle bundle = this.A00;
        Bundle bundle2 = new Bundle(bundle);
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (A0m.startsWith("google.c.") || A0m.startsWith("gcm.n.") || A0m.startsWith("gcm.notification.")) {
                bundle2.remove(A0m);
            }
        }
        return bundle2;
    }

    public final Bundle A03() {
        Bundle bundle = this.A00;
        Bundle bundle2 = new Bundle(bundle);
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (!A0m.startsWith("google.c.a.") && !A0m.equals("from")) {
                bundle2.remove(A0m);
            }
        }
        return bundle2;
    }

    public final Integer A04(String str) {
        String A06 = A06(str);
        if (TextUtils.isEmpty(A06)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A06));
        } catch (NumberFormatException unused) {
            String A002 = A00(str);
            StringBuilder A0l = C13680ns.A0l(A06, C13680ns.A06(A002) + 38);
            A0l.append("Couldn't parse value of ");
            A0l.append(A002);
            A0l.append("(");
            A0l.append(A06);
            Log.w("NotificationParams", AnonymousClass000.A0h(") into an int", A0l));
            return null;
        }
    }

    public final String A05(Resources resources, String str, String str2) {
        String[] strArr;
        String A06 = A06(str2);
        if (!TextUtils.isEmpty(A06)) {
            return A06;
        }
        String A062 = A06(String.valueOf(str2).concat("_loc_key"));
        if (!TextUtils.isEmpty(A062)) {
            int identifier = resources.getIdentifier(A062, "string", str);
            if (identifier == 0) {
                String A002 = A00(String.valueOf(str2).concat("_loc_key"));
                StringBuilder A0l = C13680ns.A0l(str2, C13680ns.A06(A002) + 49);
                A0l.append(A002);
                A0l.append(" resource not found: ");
                A0l.append(str2);
                Log.w("NotificationParams", AnonymousClass000.A0h(" Default value will be used.", A0l));
            } else {
                JSONArray A07 = A07(String.valueOf(str2).concat("_loc_args"));
                if (A07 == null) {
                    strArr = null;
                } else {
                    int length = A07.length();
                    strArr = new String[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        strArr[i2] = A07.optString(i2);
                    }
                }
                if (strArr == null) {
                    return resources.getString(identifier);
                }
                try {
                    return resources.getString(identifier, strArr);
                } catch (MissingFormatArgumentException e2) {
                    String A003 = A00(str2);
                    String arrays = Arrays.toString(strArr);
                    StringBuilder A0l2 = C13680ns.A0l(arrays, C13680ns.A06(A003) + 58);
                    A0l2.append("Missing format argument for ");
                    A0l2.append(A003);
                    A0l2.append(": ");
                    A0l2.append(arrays);
                    Log.w("NotificationParams", AnonymousClass000.A0h(" Default value will be used.", A0l2), e2);
                    return null;
                }
            }
        }
        return null;
    }

    public final String A06(String str) {
        Bundle bundle = this.A00;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final JSONArray A07(String str) {
        String A06 = A06(str);
        if (TextUtils.isEmpty(A06)) {
            return null;
        }
        try {
            return new JSONArray(A06);
        } catch (JSONException unused) {
            String A002 = A00(str);
            StringBuilder A0l = C13680ns.A0l(A06, C13680ns.A06(A002) + 50);
            A0l.append("Malformed JSON for key ");
            A0l.append(A002);
            A0l.append(": ");
            A0l.append(A06);
            Log.w("NotificationParams", AnonymousClass000.A0h(", falling back to default", A0l));
            return null;
        }
    }

    public final boolean A08(String str) {
        String A06 = A06(str);
        return "1".equals(A06) || Boolean.parseBoolean(A06);
    }
}
