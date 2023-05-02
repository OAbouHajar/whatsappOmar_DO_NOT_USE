package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.52N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass52N implements C54222h0 {
    public final /* synthetic */ AnonymousClass3F2 A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ AnonymousClass52N(AnonymousClass3F2 r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public final void AOf() {
        AnonymousClass3F2 r6 = this.A00;
        UserJid userJid = this.A01;
        AnonymousClass5MT r0 = r6.A0D.A0B;
        if (r0 != null) {
            AnonymousClass2Xz.A01(((C100564vq) r0).A00, 6);
        }
        r6.A0F.A00();
        C19980zJ r4 = r6.A05;
        Context context = r6.A04;
        int i2 = 9;
        if (r6.A0I) {
            i2 = 13;
        }
        r4.A06(context, C14750ph.A0T(context, userJid, (Integer) null, i2));
    }
}
