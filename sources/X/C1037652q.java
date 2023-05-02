package X;

import com.obwhatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.52q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1037652q implements AnonymousClass1WE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DeepLinkActivity A01;

    public /* synthetic */ C1037652q(DeepLinkActivity deepLinkActivity, int i2) {
        this.A01 = deepLinkActivity;
        this.A00 = i2;
    }

    public final void accept(Object obj) {
        DeepLinkActivity deepLinkActivity = this.A01;
        int i2 = this.A00;
        deepLinkActivity.A00.removeMessages(1);
        deepLinkActivity.Ac1();
        if (((Boolean) obj).booleanValue()) {
            deepLinkActivity.finish();
        } else {
            deepLinkActivity.Afg(i2);
        }
    }
}
