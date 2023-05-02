package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.whatsapp.util.Log;

/* renamed from: X.1Vn  reason: invalid class name and case insensitive filesystem */
public class C28321Vn implements AnonymousClass1Vm {
    public Handler A00;
    public AnonymousClass3LO A01;
    public final AnonymousClass01V A02;
    public final AnonymousClass1H9 A03;
    public final C19090xk A04;

    public C28321Vn(AnonymousClass01V r1, AnonymousClass1H9 r2, C19090xk r3) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r5 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C28321Vn r7) {
        /*
            X.3LO r0 = r7.A01
            X.AnonymousClass00B.A06(r0)
            android.net.Network r1 = r0.A00
            if (r1 == 0) goto L_0x0044
            r6 = 1
            long r2 = r1.getNetworkHandle()
        L_0x000e:
            X.01V r0 = r7.A02
            android.net.ConnectivityManager r0 = r0.A0H()
            r5 = 0
            if (r0 == 0) goto L_0x002f
            if (r1 == 0) goto L_0x002f
            android.net.NetworkCapabilities r1 = r0.getNetworkCapabilities(r1)
            r0 = 1
            if (r1 == 0) goto L_0x002f
            boolean r0 = r1.hasTransport(r0)
            if (r0 == 0) goto L_0x002f
            r0 = 17
            boolean r0 = r1.hasCapability(r0)
            if (r0 == 0) goto L_0x002f
            r5 = 1
        L_0x002f:
            r4 = 1
            X.1H9 r0 = r7.A03
            r0.A00()
            X.0xk r1 = r7.A04
            if (r6 == 0) goto L_0x003c
            r0 = 1
            if (r5 == 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            r1.A09(r2, r0)
            r1.A0F(r5, r4)
            return
        L_0x0044:
            r6 = 0
            r2 = -1
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28321Vn.A00(X.1Vn):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r0.getNetworkCapabilities(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean A01(android.net.Network r1, X.C28321Vn r2) {
        /*
            X.01V r0 = r2.A02
            android.net.ConnectivityManager r0 = r0.A0H()
            r2 = 0
            if (r0 == 0) goto L_0x001f
            android.net.NetworkCapabilities r1 = r0.getNetworkCapabilities(r1)
            r0 = 1
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.hasTransport(r0)
            if (r0 == 0) goto L_0x001f
            r0 = 17
            boolean r0 = r1.hasCapability(r0)
            if (r0 == 0) goto L_0x001f
            r2 = 1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28321Vn.A01(android.net.Network, X.1Vn):boolean");
    }

    public long ABO() {
        Network activeNetwork;
        ConnectivityManager A0H = this.A02.A0H();
        if (A0H == null || (activeNetwork = A0H.getActiveNetwork()) == null) {
            return -1;
        }
        return activeNetwork.getNetworkHandle();
    }

    public void AcG() {
        Handler handler = this.A00;
        AnonymousClass00B.A06(handler);
        handler.post(new RunnableRunnableShape11S0100000_I0_10((Object) this, 22));
    }

    public void Ag6(Handler handler) {
        boolean z2 = false;
        if (this.A01 == null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        this.A00 = handler;
        this.A01 = new AnonymousClass3LO(this);
        ConnectivityManager A0H = this.A02.A0H();
        if (A0H != null) {
            try {
                A0H.registerDefaultNetworkCallback(this.A01, handler);
            } catch (SecurityException unused) {
            }
        } else {
            Log.e("xmpp/handler/network/startNetworkCallbacks cm null");
        }
    }

    public void AgN() {
        boolean z2 = false;
        if (this.A01 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        ConnectivityManager A0H = this.A02.A0H();
        if (A0H != null) {
            A0H.unregisterNetworkCallback(this.A01);
        }
        this.A01 = null;
        this.A00 = null;
    }

    public boolean isConnected() {
        AnonymousClass3LO r0 = this.A01;
        return (r0 == null || r0.A00 == null) ? false : true;
    }
}
