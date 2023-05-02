package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.0BH  reason: invalid class name */
public final class AnonymousClass0BH extends Handler {
    public WeakReference A00;

    public AnonymousClass0BH(DialogInterface dialogInterface) {
        this.A00 = new WeakReference(dialogInterface);
    }

    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == -3 || i2 == -2 || i2 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.A00.get(), i2);
        } else if (i2 == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
