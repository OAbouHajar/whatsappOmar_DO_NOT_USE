package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2iU  reason: invalid class name and case insensitive filesystem */
public class C54922iU extends AnonymousClass2Qh {
    public final /* synthetic */ C51542bq A00;

    public C54922iU(C51542bq r1) {
        this.A00 = r1;
    }

    public void A01(int i2) {
        AnonymousClass2H7 r1 = this.A00.A09;
        Log.i("xmpp/reader/read/client_config_error");
        r1.A01.AZq(Message.obtain((Handler) null, 0, 27, i2));
    }

    public void A02(C28371Vv r11) {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        for (C28371Vv r8 : r11.A0O("config")) {
            String A0N = r8.A0N("platform", (String) null);
            String A0N2 = r8.A0N("id", (String) null);
            if ("gcm".equals(A0N)) {
                str4 = r8.A0N("app_mute", (String) null);
                str = A0N2;
            } else if ("fbns".equals(A0N)) {
                str2 = A0N2;
            }
            C28371Vv A0J = r8.A0J("item");
            if (A0J != null) {
                str3 = A0J.A0N("hash", (String) null);
            }
        }
        AnonymousClass2H7 r1 = this.A00.A09;
        Log.i("xmpp/reader/read/client_config");
        AnonymousClass2H8 r4 = r1.A01;
        Bundle bundle = new Bundle();
        bundle.putString("gcmToken", str);
        bundle.putString("fbnsToken", str2);
        bundle.putString("mutedChatsHash", str3);
        bundle.putString("appMuteConfig", str4);
        r4.AZq(Message.obtain((Handler) null, 0, 6, 0, bundle));
    }
}
