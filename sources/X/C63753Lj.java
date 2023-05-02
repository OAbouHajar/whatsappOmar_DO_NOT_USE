package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3Lj  reason: invalid class name and case insensitive filesystem */
public class C63753Lj extends Handler {
    public final /* synthetic */ C61753Ae A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63753Lj(Looper looper, C61753Ae r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 99) {
            this.A00.A00();
            return;
        }
        throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Unknown message: "));
    }
}
