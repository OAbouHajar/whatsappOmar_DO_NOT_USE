package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2c4  reason: invalid class name */
public class AnonymousClass2c4 extends AnonymousClass2Qh {
    public final /* synthetic */ C51542bq A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass2c4(C51542bq r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public void A02(C28371Vv r6) {
        AnonymousClass2H7 r3 = this.A00.A09;
        boolean z2 = this.A01;
        StringBuilder sb = new StringBuilder("xmpp/reader/read/connectionactive/set ");
        sb.append(z2);
        Log.i(sb.toString());
        r3.A01.AZq(Message.obtain((Handler) null, 0, 87, 0, Boolean.valueOf(z2)));
    }
}
