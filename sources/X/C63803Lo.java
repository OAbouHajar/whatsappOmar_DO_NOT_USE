package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3Lo  reason: invalid class name and case insensitive filesystem */
public class C63803Lo extends Handler {
    public final /* synthetic */ C42821yj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63803Lo(C42821yj r2) {
        super(Looper.getMainLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C42821yj r2 = this.A00;
        if (!((C14530pL) r2.A22).A0A.A00) {
            r2.A3C.A08();
            if (r2.A4h) {
                r2.A3C.A0E(false);
            }
            r2.A4k = false;
            r2.A4h = true;
        }
    }
}
