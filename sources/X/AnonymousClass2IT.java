package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.2IT  reason: invalid class name */
public class AnonymousClass2IT extends Handler {
    public final /* synthetic */ AnonymousClass15O A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IT(Looper looper, AnonymousClass15O r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        this.A00.A00();
    }
}
