package X;

import android.app.Activity;
import com.obwhatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.4xX  reason: invalid class name and case insensitive filesystem */
public class C101574xX implements AnonymousClass5SV {
    public final /* synthetic */ DeepLinkActivity A00;
    public final /* synthetic */ WeakReference A01;

    public C101574xX(DeepLinkActivity deepLinkActivity, WeakReference weakReference) {
        this.A00 = deepLinkActivity;
        this.A01 = weakReference;
    }

    public void AVZ() {
    }

    public void AYb(AnonymousClass284 r3) {
        String str;
        if (r3 != null) {
            int i2 = r3.A00;
            if (i2 == 0) {
                str = "Conversation/createSyncContactTaskCallback/onSyncCompleted/NETWORK_UNAVAILABLE/";
            } else if (i2 == 4) {
                str = "Conversation/createSyncContactTaskCallback/onSyncCompleted/SYNC_REQUEST_FAILED/";
            }
            Log.w(str);
        }
        Activity activity = (Activity) this.A01.get();
        if (activity != null && !AnonymousClass29T.A03(activity)) {
            activity.finish();
        }
    }

    public void AYc() {
    }
}
