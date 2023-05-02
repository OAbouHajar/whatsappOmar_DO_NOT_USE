package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.07O  reason: invalid class name */
public class AnonymousClass07O extends AnonymousClass05h {
    public /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        Bundle bundleExtra;
        AnonymousClass0YA r7 = (AnonymousClass0YA) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = r7.A02;
        if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                r7 = new AnonymousClass0YA((Intent) null, r7.A03, r7.A00, r7.A01);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r7);
        if (AnonymousClass02C.A02(2)) {
            StringBuilder sb = new StringBuilder("CreateIntent created the following intent: ");
            sb.append(intent);
            Log.v("FragmentManager", sb.toString());
        }
        return intent;
    }

    public /* bridge */ /* synthetic */ Object A02(Intent intent, int i2) {
        return new AnonymousClass0YD(i2, intent);
    }
}
