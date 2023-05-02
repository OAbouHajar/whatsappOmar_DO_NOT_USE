package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0BL  reason: invalid class name */
public final class AnonymousClass0BL extends Handler {
    public final Handler.Callback A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0BL(Looper looper, Handler.Callback callback) {
        super(looper, new C06760Xq(callback));
        C18450wi.A0H(looper, 1);
        this.A00 = callback;
    }

    public final void A00(Message message) {
        C18450wi.A0H(message, 0);
        if (C18450wi.A0R(Looper.myLooper(), getLooper())) {
            this.A00.handleMessage(message);
        } else {
            sendMessageAtFrontOfQueue(message);
        }
    }
}
