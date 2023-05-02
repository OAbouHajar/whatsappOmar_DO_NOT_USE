package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.27p  reason: invalid class name and case insensitive filesystem */
public class C452327p {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public C452327p(UserJid userJid, String str, long j2) {
        this.A00 = j2;
        this.A01 = userJid;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("id=");
        sb.append(this.A00);
        sb.append(" jid=");
        sb.append(this.A01);
        sb.append(" display=");
        sb.append(this.A02);
        return sb.toString();
    }
}
