package X;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.07P  reason: invalid class name */
public final class AnonymousClass07P extends AnonymousClass05h {
    public /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0NM A01(Context context, Object obj) {
        int length;
        String[] strArr = (String[]) obj;
        if (strArr == null || (length = strArr.length) == 0) {
            return new AnonymousClass0NM(Collections.emptyMap());
        }
        AnonymousClass00N r5 = new AnonymousClass00N();
        int i2 = 0;
        boolean z2 = true;
        do {
            String str = strArr[i2];
            boolean z3 = false;
            if (AnonymousClass00T.A01(context, str) == 0) {
                z3 = true;
            }
            r5.put(str, Boolean.valueOf(z3));
            if (!z3) {
                z2 = false;
            }
            i2++;
        } while (i2 < length);
        if (z2) {
            return new AnonymousClass0NM(r5);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object A02(Intent intent, int i2) {
        if (i2 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                HashMap hashMap = new HashMap();
                int length = stringArrayExtra.length;
                for (int i3 = 0; i3 < length; i3++) {
                    String str = stringArrayExtra[i3];
                    boolean z2 = false;
                    if (intArrayExtra[i3] == 0) {
                        z2 = true;
                    }
                    hashMap.put(str, Boolean.valueOf(z2));
                }
                return hashMap;
            }
        }
        return Collections.emptyMap();
    }
}
