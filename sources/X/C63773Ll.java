package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3Ll  reason: invalid class name and case insensitive filesystem */
public class C63773Ll extends Handler {
    public final /* synthetic */ AnonymousClass3BH A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63773Ll(Looper looper, AnonymousClass3BH r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        AnonymousClass5RN r0 = this.A00.A02;
        if (r0 != null) {
            r0.ANC();
            sendEmptyMessageDelayed(0, (long) AnonymousClass3BH.A0W);
        }
    }
}
