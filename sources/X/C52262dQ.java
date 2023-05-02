package X;

import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.util.Log;

/* renamed from: X.2dQ  reason: invalid class name and case insensitive filesystem */
public class C52262dQ extends C52242dN {
    public final /* synthetic */ C23111An A00;
    public final /* synthetic */ C204310c A01;
    public final /* synthetic */ C216514x A02;
    public final /* synthetic */ C16440t3 A03;

    public C52262dQ(C23111An r1, C204310c r2, C216514x r3, C16440t3 r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A02(String str, boolean z2) {
        C16320sq r2;
        int i2;
        AnonymousClass00B.A01();
        C204310c r5 = this.A01;
        AnonymousClass2R6 r4 = r5.A0S;
        StringBuilder sb = new StringBuilder("app/startOutgoingCall/onCreateOutgoingConnection ");
        sb.append(str);
        sb.append(", pendingCallCommand: ");
        sb.append(r4);
        Log.i(sb.toString());
        if (r4 == null || !str.equals(r4.A05)) {
            this.A02.A0A(str);
            return;
        }
        long j2 = r5.A00;
        if (j2 > 0) {
            r4.A00 = SystemClock.elapsedRealtime() - j2;
        } else {
            AnonymousClass00B.A08("selfManagedConnectionNewCallTs is not set");
        }
        if (!z2) {
            r2 = r5.A0Q;
            i2 = 38;
        } else {
            if (r4.A04 != null) {
                r2 = r5.A0Q;
                i2 = 37;
            }
            r5.A0S = null;
            r5.A01.removeMessages(1);
        }
        r2.Acl(new RunnableRunnableShape3S0200000_I0_1(r5, i2, r4));
        r5.A0S = null;
        r5.A01.removeMessages(1);
    }
}
