package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3Lk  reason: invalid class name and case insensitive filesystem */
public class C63763Lk extends Handler {
    public final /* synthetic */ C57522rJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63763Lk(Looper looper, C57522rJ r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C57522rJ r0 = this.A00;
        C31201dg r3 = r0.A03;
        C14940q2 r2 = new C14940q2();
        C14990q7 r1 = r0.A06;
        r2.A03(r1, 0);
        C29701b3.A01(r1, r3, r2.A01(), (C14930q1) message.obj);
    }
}
