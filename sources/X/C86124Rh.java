package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.4Rh  reason: invalid class name and case insensitive filesystem */
public class C86124Rh {
    public final int A00;
    public final int A01;
    public final UserJid A02;
    public final String A03;
    public final Set A04;

    public C86124Rh(UserJid userJid, String str, Set set, int i2, int i3) {
        this.A02 = userJid;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = set;
        this.A03 = str;
    }

    public String toString() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A02;
        A1Z[1] = this.A04;
        return String.format("GetCategoriesRequest{bizJid=%s, categoryIds=%s'}", A1Z);
    }
}
