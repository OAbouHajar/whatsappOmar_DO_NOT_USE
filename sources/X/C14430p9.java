package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.0p9  reason: invalid class name and case insensitive filesystem */
public final class C14430p9 extends AnonymousClass0pA {
    public final /* synthetic */ C14350p1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14430p9(Looper looper, C14350p1 r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        C14350p1.A00(message, this.A00);
    }
}
