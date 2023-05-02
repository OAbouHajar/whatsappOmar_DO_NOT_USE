package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1qD  reason: invalid class name and case insensitive filesystem */
public class C38081qD extends Handler {
    public final /* synthetic */ C19040xf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38081qD(Looper looper, C19040xf r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 0) {
            this.A00.A09();
        }
    }
}
