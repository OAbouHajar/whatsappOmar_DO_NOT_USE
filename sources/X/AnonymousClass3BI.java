package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.3BI  reason: invalid class name */
public final class AnonymousClass3BI {
    public static final Uri A04 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final ComponentName A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass3BI(ComponentName componentName) {
        this.A01 = null;
        this.A02 = null;
        C13710nw.A01(componentName);
        this.A00 = componentName;
        this.A03 = false;
    }

    public AnonymousClass3BI(String str, String str2, boolean z2) {
        C13710nw.A05(str);
        this.A01 = str;
        C13710nw.A05(str2);
        this.A02 = str2;
        this.A00 = null;
        this.A03 = z2;
    }

    public final Intent A00(Context context) {
        Bundle bundle;
        String str = this.A01;
        if (str == null) {
            return C13680ns.A09().setComponent(this.A00);
        }
        Intent intent = null;
        if (this.A03) {
            Bundle A0D = C13690nt.A0D();
            A0D.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(A04, "serviceIntentCall", (String) null, A0D);
            } catch (IllegalArgumentException e2) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", C13680ns.A0g(String.valueOf(str), "Dynamic lookup for intent failed for action: "));
            }
        }
        return intent == null ? C13700nu.A02(str).setPackage(this.A02) : intent;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3BI) {
                AnonymousClass3BI r5 = (AnonymousClass3BI) obj;
                if (!AnonymousClass45A.A00(this.A01, r5.A01) || !AnonymousClass45A.A00(this.A02, r5.A02) || !AnonymousClass45A.A00(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        objArr[2] = this.A00;
        objArr[3] = 4225;
        return AnonymousClass000.A0F(Boolean.valueOf(this.A03), objArr, 4);
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.A00;
        C13710nw.A01(componentName);
        return componentName.flattenToString();
    }
}
