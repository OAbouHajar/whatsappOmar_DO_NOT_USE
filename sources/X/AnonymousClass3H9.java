package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3H9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3H9 implements C54222h0 {
    public final /* synthetic */ AnonymousClass3F1 A00;

    public /* synthetic */ AnonymousClass3H9(AnonymousClass3F1 r1) {
        this.A00 = r1;
    }

    public final void AOf() {
        UserJid userJid;
        AnonymousClass3F1 r3 = this.A00;
        C17090uW r2 = r3.A02;
        Context context = r3.A06.getContext();
        C35611mD r0 = r3.A00;
        AnonymousClass00B.A06(r0);
        r2.Act(context, Uri.parse(r0.A0D));
        if (r3.A09.A00()) {
            C74983rQ r1 = new C74983rQ();
            r1.A01 = C13680ns.A0a();
            r1.A00 = C13680ns.A0Y();
            C35611mD r02 = r3.A00;
            if (!(r02 == null || (userJid = r02.A04) == null)) {
                r1.A02 = C24561Gk.A03(userJid);
            }
            r3.A08.A06(r1);
        }
    }
}
