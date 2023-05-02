package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.2Bb  reason: invalid class name */
public class AnonymousClass2Bb {
    public final AnonymousClass1ZX A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;

    public AnonymousClass2Bb(AnonymousClass1ZX r1, UserJid userJid, String str, String str2) {
        this.A01 = userJid;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = str2;
    }

    public boolean A00() {
        return C16030sJ.A0O(this.A01) && this.A00 != null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2Bb r5 = (AnonymousClass2Bb) obj;
            if (!this.A01.equals(r5.A01) || !this.A03.equals(r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A03});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParticipantProtocolModel{jid=");
        sb.append(this.A01);
        sb.append(", type='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", lid=");
        sb.append(this.A00);
        sb.append(", displayName='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
