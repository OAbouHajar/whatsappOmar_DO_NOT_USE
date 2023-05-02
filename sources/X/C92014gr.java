package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4gr  reason: invalid class name and case insensitive filesystem */
public final class C92014gr implements Handler.Callback, C108265Nh {
    public final Handler A00;
    public final /* synthetic */ C65473Ux A01;

    public C92014gr(AnonymousClass5T3 r3, C65473Ux r4) {
        this.A01 = r4;
        Looper myLooper = Looper.myLooper();
        C90524eJ.A01(myLooper);
        Handler handler = new Handler(myLooper, this);
        this.A00 = handler;
        r3.AeC(handler, this);
    }

    public final void A00(long j2) {
        C65473Ux r3 = this.A01;
        if (this != r3.A0N) {
            return;
        }
        if (j2 == Long.MAX_VALUE) {
            r3.A0o = true;
            return;
        }
        try {
            r3.A0O(j2);
            r3.A0Z();
            r3.A0K.A06++;
            r3.A0W();
            r3.A0N(j2);
        } catch (C804643y e2) {
            r3.A0G = e2;
        }
    }

    public void ARd(AnonymousClass5T3 r7, long j2, long j3) {
        if (AnonymousClass3C1.A01 < 30) {
            Handler handler = this.A00;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j2 >> 32), (int) j2));
            return;
        }
        A00(j2);
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        A00(AnonymousClass3K3.A0Q(message.arg1, message.arg2));
        return true;
    }
}
