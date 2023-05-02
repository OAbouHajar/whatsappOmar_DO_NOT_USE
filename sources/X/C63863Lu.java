package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3Lu  reason: invalid class name and case insensitive filesystem */
public final class C63863Lu extends Handler {
    public final C15960sC A00;
    public final WeakReference A01;

    public C63863Lu(DeleteAccountConfirmation deleteAccountConfirmation, C15960sC r3) {
        super(Looper.getMainLooper());
        this.A00 = r3;
        this.A01 = C13690nt.A0h(deleteAccountConfirmation);
    }

    public void handleMessage(Message message) {
        Activity activity = (Activity) this.A01.get();
        if (activity == null) {
            Log.w("delete account confirmation was garbage collected with messages still enqueued");
        } else if (message.what == 0) {
            Log.i("deleteacctconfirm/timeout/expired");
            AnonymousClass29T.A00(activity, 1);
            if (this.A00.A00() != 0) {
                Log.w("deleteacctconfirm/dialog-delete-failed");
                AnonymousClass29T.A01(activity, 3);
            }
        }
    }
}
