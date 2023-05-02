package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.facebook.redex.IDxBReceiverShape5S0100000_I1;

/* renamed from: X.0Rv  reason: invalid class name and case insensitive filesystem */
public abstract class C05510Rv {
    public BroadcastReceiver A00;
    public final /* synthetic */ AnonymousClass06G A01;

    public C05510Rv(AnonymousClass06G r1) {
        this.A01 = r1;
    }

    public abstract int A00();

    public abstract IntentFilter A01();

    public void A02() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0j.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public void A03() {
        A02();
        IntentFilter A012 = A01();
        if (A012 != null && A012.countActions() != 0) {
            BroadcastReceiver broadcastReceiver = this.A00;
            if (broadcastReceiver == null) {
                broadcastReceiver = new IDxBReceiverShape5S0100000_I1(this, 0);
                this.A00 = broadcastReceiver;
            }
            this.A01.A0j.registerReceiver(broadcastReceiver, A012);
        }
    }

    public abstract void A04();
}
