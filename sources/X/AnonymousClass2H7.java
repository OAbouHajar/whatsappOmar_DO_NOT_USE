package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2H7  reason: invalid class name */
public class AnonymousClass2H7 {
    public final C16440t3 A00;
    public final AnonymousClass2H8 A01;

    public AnonymousClass2H7(C16440t3 r1, AnonymousClass2H8 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(C28371Vv r5, C30641ci r6, int i2) {
        StringBuilder sb = new StringBuilder("xmpp/reader/on-xmpp-recv type=");
        sb.append(i2);
        Log.i(sb.toString());
        AnonymousClass2H8 r3 = this.A01;
        Message obtain = Message.obtain((Handler) null, 0, i2, 0, r5);
        if (r6 != null) {
            obtain.getData().putParcelable("stanzaKey", r6);
        }
        r3.AZq(obtain);
    }

    public void A01(C30641ci r5) {
        StringBuilder sb = new StringBuilder("xmpp/reader/on-ack-stanza stanza-id=");
        sb.append(r5.A07);
        Log.i(sb.toString());
        this.A01.AZq(Message.obtain((Handler) null, 0, 205, 0, r5));
    }
}
