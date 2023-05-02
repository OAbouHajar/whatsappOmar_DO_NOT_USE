package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.2ba  reason: invalid class name and case insensitive filesystem */
public class C51382ba {
    public static void A00(Context context, Intent intent) {
        intent.setPackage(context.getPackageName());
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(context.getPackageName(), "FakeClass"));
        intent.putExtra("authentication_token", C42341xd.A00(context.getApplicationContext(), 0, intent2, 0));
    }
}
