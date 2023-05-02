package X;

import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: X.3yt  reason: invalid class name and case insensitive filesystem */
public class C78913yt extends C16690tT {
    public final AnonymousClass11G A00;
    public final UserJid A01;
    public final C16220sf A02;
    public final WeakReference A03;

    public C78913yt(ContactInfoActivity contactInfoActivity, AnonymousClass11G r3, UserJid userJid, C16220sf r5) {
        this.A00 = r3;
        this.A02 = r5;
        this.A01 = userJid;
        this.A03 = C13690nt.A0h(contactInfoActivity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r4) {
        /*
            r3 = this;
            X.11G r1 = r3.A00
            com.whatsapp.jid.UserJid r0 = r3.A01
            X.1dI r2 = r1.A06(r0)
            X.0rv r1 = X.C15830rv.A00(r0)
            if (r1 == 0) goto L_0x0017
            X.0sf r0 = r3.A02
            boolean r0 = r0.A0R(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r2 != 0) goto L_0x001c
            r0 = 0
            return r0
        L_0x001c:
            X.2XQ r0 = new X.2XQ
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78913yt.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass2XQ r3 = (AnonymousClass2XQ) obj;
        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A03.get();
        if (contactInfoActivity != null) {
            contactInfoActivity.A0X = null;
            contactInfoActivity.A1L = r3;
            contactInfoActivity.A0Z.setStatusData(r3);
        }
    }
}
