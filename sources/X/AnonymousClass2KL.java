package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.2KL  reason: invalid class name */
public class AnonymousClass2KL extends Handler {
    public final C19210xw A00;
    public final C19490yW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2KL(Looper looper, C19210xw r2, C19490yW r3) {
        super(looper);
        AnonymousClass00B.A06(looper);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        if (!this.A01.A00) {
            this.A00.A01(true);
        }
    }
}
