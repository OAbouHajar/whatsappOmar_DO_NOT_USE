package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0Xr  reason: invalid class name and case insensitive filesystem */
public class C06770Xr implements Handler.Callback {
    public final /* synthetic */ C09010el A00;

    public /* synthetic */ C06770Xr(C09010el r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        if (!C62003Bg.A03()) {
            AnonymousClass0BL A002 = this.A00.A04;
            A002.A00(A002.obtainMessage(message.what, message.obj));
            return true;
        }
        int i2 = message.what;
        if (i2 == 1) {
            this.A00.A0B((C03110Hg) message.obj);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            this.A00.A0A((C03100Hf) message.obj);
            return true;
        }
    }
}
