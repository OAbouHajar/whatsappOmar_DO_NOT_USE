package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4wi  reason: invalid class name and case insensitive filesystem */
public class C101104wi implements AnonymousClass5P6 {
    public final UserJid A00;

    public C101104wi(UserJid userJid) {
        this.A00 = userJid;
    }

    public int ACu() {
        return 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C101104wi) && this.A00.equals(((C101104wi) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A00, 6758);
    }
}
