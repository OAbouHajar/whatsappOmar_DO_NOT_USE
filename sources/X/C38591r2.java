package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.1r2  reason: invalid class name and case insensitive filesystem */
public class C38591r2 {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public C38591r2(UserJid userJid, String str, long j2) {
        this.A00 = j2;
        this.A02 = str;
        this.A01 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C38591r2 r7 = (C38591r2) obj;
            if (this.A00 != r7.A00 || !this.A02.equals(r7.A02) || !C34901l3.A00(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A02, this.A01});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallLink[rowId=");
        sb.append(this.A00);
        sb.append(", token='");
        sb.append(this.A02);
        sb.append(", creatorJid=");
        sb.append(this.A01);
        sb.append(']');
        return sb.toString();
    }
}
