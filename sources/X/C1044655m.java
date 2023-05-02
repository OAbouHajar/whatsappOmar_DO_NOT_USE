package X;

import com.whatsapp.voipcalling.Voip;

/* renamed from: X.55m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1044655m implements Runnable {
    public final /* synthetic */ C447225g A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C1044655m(C447225g r1, String str, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A02 = z2;
        this.A03 = z3;
        this.A01 = str;
    }

    public final void run() {
        C447225g r0 = this.A00;
        boolean z2 = this.A02;
        boolean z3 = this.A03;
        String str = this.A01;
        C16040sK r02 = r0.A1d;
        if (r02 != null) {
            r02.A0B();
            if (r02.A01 == null) {
                return;
            }
            if (z2) {
                if (z3) {
                    Voip.endCallAndAcceptPendingCallWithVideoStopped(str);
                } else {
                    Voip.endCallAndAcceptPendingCall(str);
                }
            } else if (z3) {
                Voip.acceptCallWithVideoStopped();
            } else {
                Voip.acceptCall();
            }
        }
    }
}
