package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.53o  reason: invalid class name and case insensitive filesystem */
public final class C1040053o implements AnonymousClass5NC, AnonymousClass5NG {
    public final UserJid A00;
    public final C28371Vv A01;

    public C1040053o(C16300so r9, C28371Vv r10) {
        String[] A1b = AnonymousClass3K3.A1b(r10, "participant");
        A1b[0] = "jid";
        this.A00 = (UserJid) C32271fx.A01(r9, r10, UserJid.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, A1b, false);
        this.A01 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1040053o.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C1040053o) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A00, C13680ns.A1b());
    }
}
