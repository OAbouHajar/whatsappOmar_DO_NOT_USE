package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.4Uu  reason: invalid class name and case insensitive filesystem */
public class C86954Uu {
    public final int A00;
    public final int A01;
    public final C16010sH A02;
    public final UserJid A03;
    public final String A04;

    public C86954Uu(C16010sH r1, UserJid userJid, String str, int i2, int i3) {
        this.A02 = r1;
        this.A03 = userJid;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C86954Uu r5 = (C86954Uu) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && C34901l3.A00(this.A02, r5.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A02;
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass3K2.A1W(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }
}
