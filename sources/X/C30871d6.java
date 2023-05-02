package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1d6  reason: invalid class name and case insensitive filesystem */
public class C30871d6 {
    public static Integer A00(C15810rt r2, C15830rv r3) {
        if (r3 == null || !C16030sJ.A0L(r3)) {
            return null;
        }
        GroupJid groupJid = (GroupJid) r3;
        if (!C16030sJ.A0L(groupJid)) {
            return null;
        }
        int A03 = r2.A03(groupJid);
        int i2 = 2;
        if (A03 != 2) {
            i2 = 3;
            if (A03 != 3) {
                i2 = 1;
            }
        }
        return Integer.valueOf(i2);
    }
}
