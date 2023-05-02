package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2bf  reason: invalid class name and case insensitive filesystem */
public final class C51432bf extends Handler {
    public final /* synthetic */ C41391vi A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51432bf(C41391vi r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            C41391vi r4 = this.A00;
            if (r4.A0J.A00()) {
                Log.i("xmpp/connection/logout/timeout/skip-voip-active");
                r4.A03.sendEmptyMessageDelayed(0, 10000);
                AnonymousClass2CU r3 = r4.A04;
                Message obtain = Message.obtain((Handler) null, 0, 22, 0);
                obtain.what = 2;
                ((Handler) r3).sendMessage(obtain);
                return;
            }
            Log.i("xmpp/connection/logout/timeout/close-socket");
            r4.A04();
        } else if (i2 == 1) {
            C28381Vw r5 = (C28381Vw) message.obj;
            C41391vi r32 = this.A00;
            C16740tZ A03 = r32.A0R.A0K.A03(r5);
            if (A03 != null) {
                int i3 = A03.A0C;
                if (C42881yp.A00(i3, 4) < 0 && i3 != 20) {
                    StringBuilder sb = new StringBuilder("message receipt timeout fired; messageKey=");
                    sb.append(r5);
                    sb.append("; fMessage.status=");
                    sb.append(A03.A0C);
                    Log.w(sb.toString());
                    removeMessages(1);
                    r32.A06(true);
                }
            }
        } else if (i2 == 2) {
            Log.w("connection active timeout fired");
            removeMessages(2);
            this.A00.A06(true);
        }
    }
}
