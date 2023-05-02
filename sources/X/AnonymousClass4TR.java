package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4TR  reason: invalid class name */
public class AnonymousClass4TR {
    public final UserJid A00;
    public final boolean A01;

    public AnonymousClass4TR(UserJid userJid, boolean z2) {
        this.A01 = z2;
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4TR r5 = (AnonymousClass4TR) obj;
            if (this.A01 != r5.A01 || !C34901l3.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A00;
        return AnonymousClass3K2.A08(Boolean.valueOf(this.A01), A1Z);
    }
}
