package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2bz  reason: invalid class name and case insensitive filesystem */
public class C51632bz extends AnonymousClass2Qh {
    public final /* synthetic */ C51542bq A00;

    public C51632bz(C51542bq r1) {
        this.A00 = r1;
    }

    public void A01(int i2) {
        AnonymousClass2H8 r3;
        Handler handler;
        int i3;
        int i4;
        if (i2 == 404) {
            AnonymousClass2H7 r1 = this.A00.A09;
            Log.i("xmpp/reader/on-get-pre-key-digest-none");
            r3 = r1.A01;
            handler = null;
            i3 = 0;
            i4 = 83;
        } else if (i2 == 503) {
            AnonymousClass2H7 r12 = this.A00.A09;
            Log.i("xmpp/reader/on-get-pre-key-digest-server-error");
            r3 = r12.A01;
            handler = null;
            i3 = 0;
            i4 = 84;
        } else {
            return;
        }
        r3.AZq(Message.obtain(handler, i3, i4, i3));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [byte[][], java.io.Serializable] */
    public void A02(C28371Vv r16) {
        C28371Vv A0K = r16.A0K("digest");
        C28371Vv A0K2 = A0K.A0K("registration");
        C28371Vv A0K3 = A0K.A0K("type");
        C28371Vv A0K4 = A0K.A0K("skey").A0K("id");
        C28371Vv A0K5 = A0K.A0K("list");
        C28371Vv A0K6 = A0K.A0K("hash");
        C28371Vv[] r13 = A0K5.A03;
        int length = r13 != null ? r13.length : 0;
        ? r8 = new byte[length][];
        for (int i2 = 0; i2 < length; i2++) {
            C28371Vv.A06(r13[i2], "id");
            r8[i2] = C28371Vv.A08(r13[i2], 3);
        }
        AnonymousClass2H7 r2 = this.A00.A09;
        byte[] A08 = C28371Vv.A08(A0K2, 4);
        byte b2 = C28371Vv.A08(A0K3, 1)[0];
        byte[] A082 = C28371Vv.A08(A0K4, 3);
        byte[] A083 = C28371Vv.A08(A0K6, 20);
        Log.i("xmpp/reader/on-get-pre-key-digest");
        AnonymousClass2H8 r3 = r2.A01;
        Bundle bundle = new Bundle();
        bundle.putByteArray("registration", A08);
        bundle.putByte("type", b2);
        bundle.putByteArray("signedKeyId", A082);
        bundle.putSerializable("keyIds", r8);
        bundle.putByteArray("hash", A083);
        r3.AZq(Message.obtain((Handler) null, 0, 82, 0, bundle));
    }
}
