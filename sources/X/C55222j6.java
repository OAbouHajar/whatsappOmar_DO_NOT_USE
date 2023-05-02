package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2j6  reason: invalid class name and case insensitive filesystem */
public final class C55222j6 {
    public final UserJid A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C55222j6(UserJid userJid, String str, String str2, List list) {
        this.A00 = userJid;
        this.A03 = list;
        this.A02 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C55222j6.class != obj.getClass()) {
                return false;
            }
            C55222j6 r5 = (C55222j6) obj;
            if (!this.A00.equals(r5.A00) || !this.A03.equals(r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A03});
    }
}
