package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.546  reason: invalid class name */
public final class AnonymousClass546 implements AnonymousClass5NG {
    public final UserJid A00;
    public final C28371Vv A01;
    public final C86654Tq A02;

    public AnonymousClass546(C16300so r10, C28371Vv r11) {
        String[] A1b = AnonymousClass3K3.A1b(r11, "participant");
        A1b[0] = "jid";
        this.A00 = (UserJid) C32271fx.A01(r10, r11, UserJid.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, A1b, false);
        this.A02 = (C86654Tq) AnonymousClass3K2.A0d(r10, r11, 123, 0);
        this.A01 = r11;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass546.class != obj.getClass()) {
                return false;
            }
            AnonymousClass546 r5 = (AnonymousClass546) obj;
            if (!this.A00.equals(r5.A00) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A00;
        return AnonymousClass3K2.A08(this.A02, A1Z);
    }
}
