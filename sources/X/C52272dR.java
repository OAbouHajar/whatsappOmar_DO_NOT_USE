package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.util.Log;

/* renamed from: X.2dR  reason: invalid class name and case insensitive filesystem */
public class C52272dR extends Handler {
    public final /* synthetic */ C204310c A00;
    public final /* synthetic */ C16440t3 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52272dR(Looper looper, C204310c r2, C16440t3 r3) {
        super(looper);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        C16320sq r2;
        int i2;
        boolean z2 = true;
        if (message.what == 1) {
            C204310c r4 = this.A00;
            AnonymousClass2R6 r5 = r4.A0S;
            StringBuilder sb = new StringBuilder("app/startOutgoingCall/WHAT_START_PENDING_INTENT ");
            sb.append(r5);
            Log.i(sb.toString());
            if (r5 != null) {
                long j2 = r4.A00;
                if (j2 > 0) {
                    r5.A00 = SystemClock.elapsedRealtime() - j2;
                }
                Boolean bool = (Boolean) message.obj;
                if (bool == null) {
                    z2 = false;
                }
                AnonymousClass00B.A0B("isRejoin is null", z2);
                if (bool == null || !bool.booleanValue()) {
                    r2 = r4.A0Q;
                    i2 = 38;
                } else {
                    if (r5.A04 != null) {
                        r2 = r4.A0Q;
                        i2 = 37;
                    }
                    r4.A0S = null;
                }
                r2.Acl(new RunnableRunnableShape3S0200000_I0_1(r4, i2, r5));
                r4.A0S = null;
            }
        }
    }
}
