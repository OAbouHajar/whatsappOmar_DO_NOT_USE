package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.whatsapp.util.Log;

/* renamed from: X.1Vl  reason: invalid class name */
public class AnonymousClass1Vl implements AnonymousClass1Vm {
    public BroadcastReceiver A00;
    public Handler A01;
    public final C18260wP A02;
    public final C19310yE A03;
    public final AnonymousClass1H9 A04;
    public final C16980tz A05;
    public final C19090xk A06;

    public AnonymousClass1Vl(C18260wP r1, C19310yE r2, AnonymousClass1H9 r3, C16980tz r4, C19090xk r5) {
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (X.C18260wP.A01() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r7) {
        /*
            r6 = this;
            X.0yE r0 = r6.A03
            android.net.NetworkInfo r2 = r0.A01()
            java.lang.String r0 = "xmpp/handler/network/active "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " isRetry="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 1
            if (r2 == 0) goto L_0x0050
            boolean r4 = r2.isConnected()
            int r1 = r2.getType()
            r0 = 0
            if (r1 != r5) goto L_0x002f
            r0 = 1
        L_0x002f:
            if (r4 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x003a
            boolean r0 = X.C18260wP.A01()
            r3 = 1
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            X.1H9 r0 = r6.A04
            r0.A00()
            X.0xk r2 = r6.A06
            if (r4 == 0) goto L_0x004e
            if (r3 != 0) goto L_0x004e
        L_0x0046:
            long r0 = (long) r1
            r2.A09(r0, r5)
            r2.A0F(r3, r7)
            return
        L_0x004e:
            r5 = 0
            goto L_0x0046
        L_0x0050:
            r1 = -1
            r4 = 0
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vl.A00(boolean):void");
    }

    public long ABO() {
        NetworkInfo A012 = this.A03.A01();
        if (A012 != null) {
            return (long) A012.getType();
        }
        return -1;
    }

    public void AcG() {
        Handler handler = this.A01;
        AnonymousClass00B.A06(handler);
        handler.post(new RunnableRunnableShape11S0100000_I0_10((Object) this, 24));
    }

    public void Ag6(Handler handler) {
        this.A01 = handler;
        Context context = this.A05.A00;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        IDxBReceiverShape7S0100000_2_I0 iDxBReceiverShape7S0100000_2_I0 = new IDxBReceiverShape7S0100000_2_I0(this, 16);
        this.A00 = iDxBReceiverShape7S0100000_2_I0;
        if (context.registerReceiver(iDxBReceiverShape7S0100000_2_I0, intentFilter, (String) null, handler) == null) {
            AnonymousClass00B.A06(handler);
            if (!handler.post(new RunnableRunnableShape11S0100000_I0_10((Object) this, 23))) {
                Log.w("failed to post checkNetworkState isRetry: false");
            }
        }
    }

    public void AgN() {
        this.A05.A00.unregisterReceiver(this.A00);
        this.A00 = null;
        this.A01 = null;
    }

    public boolean isConnected() {
        NetworkInfo A012 = this.A03.A01();
        return A012 != null && A012.isConnected();
    }
}
