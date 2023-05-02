package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.2ID  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ID implements Handler.Callback {
    public final /* synthetic */ C19210xw A00;
    public final /* synthetic */ C19490yW A01;

    public /* synthetic */ AnonymousClass2ID(C19210xw r1, C19490yW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean handleMessage(Message message) {
        C19210xw r3 = this.A00;
        C19490yW r2 = this.A01;
        if (message.what != 1) {
            return false;
        }
        if (r2.A00) {
            return true;
        }
        r3.A01(false);
        return true;
    }
}
