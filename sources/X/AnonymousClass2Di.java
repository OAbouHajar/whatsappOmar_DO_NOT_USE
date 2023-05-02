package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.2Di  reason: invalid class name */
public class AnonymousClass2Di implements C19550yc {
    public final AnonymousClass2Dh A00;
    public final C17190ug A01;

    public AnonymousClass2Di(AnonymousClass2Dh r1, C17190ug r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        Log.i("GetChatPsaBlockingStatusHelper/sendGetChatPsaBlockStatusRequest");
        C17190ug r4 = this.A01;
        String A02 = r4.A02();
        C32461gQ r3 = new C32461gQ("iq");
        r3.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        r3.A02(new C35081lL("xmlns", "w:comms:chat"));
        r3.A02(new C35081lL("id", A02));
        r3.A02(new C35081lL("type", "get"));
        C32461gQ r2 = new C32461gQ("query");
        r2.A03(new C32461gQ("blocking_status").A01());
        r3.A03(r2.A01());
        r4.A0A(this, r3.A01(), A02, 340, 0);
    }

    public void APb(String str) {
        Log.e("delivery failure in getting block status for chat psa");
        this.A00.APY();
    }

    public void AQe(C28371Vv r3, String str) {
        this.A00.AQR(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r2, String str) {
        this.A00.AY9(r2);
    }
}
