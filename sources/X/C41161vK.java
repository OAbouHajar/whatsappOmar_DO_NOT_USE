package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.1vK  reason: invalid class name and case insensitive filesystem */
public class C41161vK extends C41091vD {
    public final C14710pd A00;

    public C41161vK(C14710pd r1) {
        this.A00 = r1;
    }

    public void A02(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i2);
            bundle.putString("app_badge_packageName", "com.obwhatsapp");
            try {
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            } catch (Exception e2) {
                Log.e("cannot update badge", e2);
            }
        }
    }
}
