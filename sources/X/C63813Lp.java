package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.3Lp  reason: invalid class name and case insensitive filesystem */
public final class C63813Lp extends Handler {
    public final /* synthetic */ DeepLinkActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63813Lp(Looper looper, DeepLinkActivity deepLinkActivity) {
        super(looper);
        this.A00 = deepLinkActivity;
        AnonymousClass00B.A06(looper);
    }

    public void handleMessage(Message message) {
        int i2 = message.arg1;
        if (i2 != 0) {
            this.A00.Afr(0, i2);
        }
    }
}
