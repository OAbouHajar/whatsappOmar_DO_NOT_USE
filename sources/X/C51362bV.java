package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2bV  reason: invalid class name and case insensitive filesystem */
public final class C51362bV extends Handler {
    public final C18990xa A00;
    public final WeakReference A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51362bV(Looper looper, C18990xa r2, WeakReference weakReference) {
        super(looper);
        AnonymousClass00B.A06(looper);
        this.A00 = r2;
        this.A01 = weakReference;
    }

    public void handleMessage(Message message) {
        Activity activity = (Activity) this.A01.get();
        if (activity == null) {
            removeMessages(1);
        } else if (message.what == 1) {
            Log.e("restore>VerifyMessageStoreHelper/timeout");
            removeMessages(1);
            if (this.A00.A00) {
                C453428a.A01(new DisplayExceptionDialogFactory$LoginFailedDialogFragment(), ((C001000l) activity).AGM());
                return;
            }
            AnonymousClass29T.A01(activity, 200);
        }
    }
}
