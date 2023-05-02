package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2c2  reason: invalid class name and case insensitive filesystem */
public class C51662c2 extends AnonymousClass2Qh {
    public final /* synthetic */ C51542bq A00;
    public final /* synthetic */ byte[] A01;

    public C51662c2(C51542bq r1, byte[] bArr) {
        this.A00 = r1;
        this.A01 = bArr;
    }

    public void A00(C28371Vv r10) {
        int A002 = C34451kH.A00(r10);
        if (A002 == 207) {
            for (C28371Vv A0O : r10.A0O("error")) {
                for (C28371Vv r3 : A0O.A0O("error")) {
                    String A0N = r3.A0N("code", (String) null);
                    String A0N2 = r3.A0N("text", (String) null);
                    if (A0N != null) {
                        int A003 = C29501aj.A00(A0N, 0);
                        AnonymousClass2H7 r1 = this.A00.A09;
                        Log.i("xmpp/reader/on-set-pre-key-error");
                        AnonymousClass2H8 r4 = r1.A01;
                        Bundle bundle = new Bundle();
                        bundle.putInt("errorCode", A003);
                        bundle.putString("errorText", A0N2);
                        r4.AZq(Message.obtain((Handler) null, 0, 196, 0, bundle));
                    }
                }
            }
            return;
        }
        AnonymousClass2H7 r12 = this.A00.A09;
        Log.i("xmpp/reader/on-set-pre-key-error");
        AnonymousClass2H8 r42 = r12.A01;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("errorCode", A002);
        r42.AZq(Message.obtain((Handler) null, 0, 78, 0, bundle2));
    }

    public void A02(C28371Vv r5) {
        AnonymousClass2H7 r1 = this.A00.A09;
        Log.i("xmpp/reader/on-set-pre-key-success");
        r1.A01.AZq(Message.obtain((Handler) null, 0, 77, 0));
    }
}
