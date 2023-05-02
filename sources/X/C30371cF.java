package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.1cF  reason: invalid class name and case insensitive filesystem */
public class C30371cF {
    public static final C30371cF A04 = new C30371cF((UserJid) null, (String) null, (String) null, 0);
    public final long A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;

    public C30371cF(UserJid userJid, String str, String str2, long j2) {
        this.A03 = str;
        this.A00 = j2;
        this.A01 = userJid;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C30371cF r7 = (C30371cF) obj;
            if (this.A00 != r7.A00 || !C34901l3.A00(this.A03, r7.A03) || !C34901l3.A00(this.A01, r7.A01) || !C34901l3.A00(this.A02, r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Long.valueOf(this.A00), this.A01, this.A02});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupDescription{id=");
        sb.append(this.A03);
        sb.append(", time=");
        sb.append(this.A00);
        sb.append(", setterJid='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", len(description)='");
        String str = this.A02;
        sb.append(str == null ? "null" : Integer.valueOf(str.length()));
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
