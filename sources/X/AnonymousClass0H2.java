package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.redex.IDxBReceiverShape5S0100000_I1;

/* renamed from: X.0H2  reason: invalid class name */
public abstract class AnonymousClass0H2 extends AnonymousClass0V4 {
    public final BroadcastReceiver A00 = new IDxBReceiverShape5S0100000_I1(this, 1);

    public AnonymousClass0H2(Context context, AnonymousClass04d r4) {
        super(context, r4);
    }

    public void A03() {
        C06530Wm.A00().A02(C04500Mu.A00, AnonymousClass000.A0h(": registering receiver", AnonymousClass000.A0p(this)));
        this.A01.registerReceiver(this.A00, A07());
    }

    public void A04() {
        C06530Wm.A00().A02(C04500Mu.A00, AnonymousClass000.A0h(": unregistering receiver", AnonymousClass000.A0p(this)));
        this.A01.unregisterReceiver(this.A00);
    }

    public abstract IntentFilter A07();

    public abstract void A08(Intent intent);
}
