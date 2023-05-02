package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0Xq  reason: invalid class name and case insensitive filesystem */
public final class C06760Xq implements Handler.Callback {
    public final Handler.Callback A00;

    public C06760Xq(Handler.Callback callback) {
        this.A00 = callback;
    }

    public boolean handleMessage(Message message) {
        String str;
        C18450wi.A0H(message, 0);
        Object obj = message.obj;
        if (obj instanceof C04600Ne) {
            C18450wi.A0M(obj, "null cannot be cast to non-null type com.bloks.foa.core.surface.MessageParam");
            str = ((C04600Ne) obj).A00;
            if (str != null) {
                C99324tq.A00.A01(str);
            }
        } else {
            str = null;
        }
        try {
            return this.A00.handleMessage(message);
        } finally {
            if (str != null) {
                C99324tq.A00.A00();
            }
        }
    }
}
