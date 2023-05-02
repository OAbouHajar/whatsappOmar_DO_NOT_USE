package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.5wY  reason: invalid class name */
public final class AnonymousClass5wY {
    public static final ArrayList A03;
    public final UserJid A00;
    public final C28371Vv A01;
    public final String A02;

    static {
        String[] strArr = new String[3];
        strArr[0] = "ACTIVE";
        strArr[1] = "ELIGIBLE";
        A03 = AnonymousClass3K2.A0q("INELIGIBLE", strArr, 2);
    }

    public AnonymousClass5wY(C28371Vv r11) {
        C28371Vv.A06(r11, "contact");
        this.A00 = (UserJid) C32271fx.A01((C16300so) null, r11, UserJid.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"user"}, false);
        this.A02 = C32271fx.A06(r11, A03, new String[]{"payment-status"});
        this.A01 = r11;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass5wY.class != obj.getClass()) {
                return false;
            }
            AnonymousClass5wY r5 = (AnonymousClass5wY) obj;
            if (!this.A02.equals(r5.A02) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A02;
        A1Z[1] = this.A00;
        return Arrays.hashCode(A1Z);
    }
}
