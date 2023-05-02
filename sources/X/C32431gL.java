package X;

import com.whatsapp.jid.Jid;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.1gL  reason: invalid class name and case insensitive filesystem */
public class C32431gL {
    public static boolean A00(C20260zl r4, Jid jid) {
        if (jid == null) {
            return false;
        }
        if (!A01(r4, jid)) {
            String A06 = r4.A00.A06(C16620tM.A02, 1036);
            if (AnonymousClass1ZW.A0E(A06) || !new HashSet(Arrays.asList(A06.split(","))).contains(jid.user)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A01(C20260zl r4, Jid jid) {
        if (jid != null) {
            String A06 = r4.A00.A06(C16620tM.A02, 1035);
            if (!AnonymousClass1ZW.A0E(A06)) {
                return new HashSet(Arrays.asList(A06.split(","))).contains(jid.user);
            }
        }
        return false;
    }
}
