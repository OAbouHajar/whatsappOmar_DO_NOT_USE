package X;

import com.obwhatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.55n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1044755n implements Runnable {
    public final /* synthetic */ DeepLinkActivity A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C1044755n(DeepLinkActivity deepLinkActivity, UserJid userJid, String str, boolean z2) {
        this.A00 = deepLinkActivity;
        this.A01 = userJid;
        this.A02 = str;
        this.A03 = z2;
    }

    public final void run() {
        this.A00.A0L.A00(new C41261vV(new C41271vW(this.A01, this.A02, this.A03 ? "whatsapp" : null, System.currentTimeMillis(), System.currentTimeMillis())));
    }
}
