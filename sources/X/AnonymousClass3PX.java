package X;

import android.app.Application;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3PX  reason: invalid class name */
public class AnonymousClass3PX extends AnonymousClass02H {
    public final int A00;
    public final AnonymousClass027 A01;
    public final AnonymousClass1KA A02;
    public final C49992Xb A03;
    public final UserJid A04;
    public final AnonymousClass1KS A05;

    public AnonymousClass3PX(Application application, AnonymousClass1KA r5, C49992Xb r6, UserJid userJid, AnonymousClass1KS r8) {
        super(application);
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A01 = A0O;
        this.A04 = userJid;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = r8;
        this.A00 = application.getResources().getDimensionPixelSize(R.dimen.dimen063f);
        r6.A00 = A0O;
    }
}
