package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.obwhatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3C4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeepLinkActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass3C4(DeepLinkActivity deepLinkActivity, String str) {
        this.A00 = deepLinkActivity;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Intent intent;
        DeepLinkActivity deepLinkActivity = this.A00;
        String str = this.A01;
        try {
            PackageManager packageManager = deepLinkActivity.getPackageManager();
            if (!(packageManager == null || packageManager.getPackageInfo("com.obwhatsapp.w4b", 0) == null)) {
                intent = C13680ns.A0A(str);
                deepLinkActivity.A00.A06(deepLinkActivity, intent);
                deepLinkActivity.finish();
                deepLinkActivity.overridePendingTransition(0, 0);
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException e2) {
            Log.e("Failed to get package info", e2);
        }
        intent = deepLinkActivity.A0j.A00("smb_linking_back2wa");
        deepLinkActivity.A00.A06(deepLinkActivity, intent);
        deepLinkActivity.finish();
        deepLinkActivity.overridePendingTransition(0, 0);
    }
}
