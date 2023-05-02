package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4av  reason: invalid class name and case insensitive filesystem */
public class C88684av {
    public final int A00;
    public final UserJid A01;
    public final String A02;

    public C88684av(UserJid userJid, String str) {
        this.A02 = str;
        this.A01 = userJid;
        this.A00 = 0;
    }

    public C88684av(String str, int i2) {
        this.A02 = str;
        this.A01 = null;
        this.A00 = i2;
    }

    public String toString() {
        return this.A02;
    }
}
