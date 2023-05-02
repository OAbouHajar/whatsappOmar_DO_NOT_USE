package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4mP  reason: invalid class name and case insensitive filesystem */
public class C95294mP implements AnonymousClass04o {
    public final Application A00;
    public final AnonymousClass1KA A01;
    public final C49992Xb A02;
    public final UserJid A03;
    public final AnonymousClass1KS A04;

    public C95294mP(Application application, AnonymousClass1KA r2, C49992Xb r3, UserJid userJid, AnonymousClass1KS r5) {
        this.A03 = userJid;
        this.A02 = r3;
        this.A00 = application;
        this.A01 = r2;
        this.A04 = r5;
    }

    public C003401n A6s(Class cls) {
        return new AnonymousClass3PX(this.A00, this.A01, this.A02, this.A03, this.A04);
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
