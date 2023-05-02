package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4U3  reason: invalid class name */
public final class AnonymousClass4U3 {
    public final UserJid A00;
    public final C28371Vv A01;

    public AnonymousClass4U3(C16300so r9, C28371Vv r10) {
        String[] A1b = AnonymousClass3K3.A1b(r10, "participant");
        A1b[0] = "lid";
        this.A00 = (UserJid) C32271fx.A01(r9, r10, UserJid.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, A1b, false);
        this.A01 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4U3.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass4U3) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A00, C13680ns.A1b());
    }
}
