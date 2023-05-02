package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5nj  reason: invalid class name and case insensitive filesystem */
public class C114415nj extends C16690tT {
    public UserJid A00;
    public final C19230xz A01;
    public final C18290wS A02;

    public C114415nj(C19230xz r1, UserJid userJid, C18290wS r3) {
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = userJid;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        UserJid userJid = this.A00;
        if (userJid != null) {
            A0u.add(userJid);
            if (!this.A01.A00(C453027w.A0H, C34861kz.A0C, A0u).A00()) {
                return Boolean.FALSE;
            }
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                C110115dX.A0H(this.A02).A0G((UserJid) it.next());
            }
            return Boolean.TRUE;
        }
        throw AnonymousClass000.A0W("getAllIndividualContacts");
    }
}
