package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2bt  reason: invalid class name and case insensitive filesystem */
public final class C51572bt extends Handler implements C51582bu {
    public final /* synthetic */ C41391vi A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51572bt(C41391vi r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            Log.i("xmpp/connection/recv/sending_channel_ready");
            C41391vi r3 = this.A00;
            r3.A04 = (AnonymousClass2CU) message.obj;
            ((Handler) r3.A0b).obtainMessage(0, new AnonymousClass2CT(r3)).sendToTarget();
        } else if (i2 == 1) {
            C41391vi r2 = this.A00;
            if (message.obj == r2.A07) {
                r2.A06(true);
            }
        } else if (i2 == 2) {
            C41391vi r0 = this.A00;
            Object obj = message.obj;
            C51432bf r32 = r0.A03;
            r32.sendMessageDelayed(r32.obtainMessage(1, obj), 45000);
        }
    }
}
