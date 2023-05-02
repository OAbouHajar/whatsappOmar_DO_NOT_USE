package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5nb  reason: invalid class name and case insensitive filesystem */
public class C114335nb extends C16690tT {
    public final C16460t6 A00;
    public final Runnable A01;

    public C114335nb(C16460t6 r1, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        synchronized (this) {
            C16460t6 r1 = this.A00;
            r1.A0Q((C15830rv) null, (UserJid) null);
            r1.A0K();
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }
}
