package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.1vJ  reason: invalid class name and case insensitive filesystem */
public final class C41151vJ extends C41091vD {
    public void A02(Context context, int i2) {
        if (AnonymousClass01R.A00(context, "com.huawei.android.launcher") > 63006) {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", yo.bIc());
            bundle.putInt("badgenumber", i2);
            try {
                context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("Unexpected exception, launcher version = ");
                sb.append(AnonymousClass01R.A00(context, "com.huawei.android.launcher"));
                Log.e(sb.toString(), e2);
            }
        }
    }
}
