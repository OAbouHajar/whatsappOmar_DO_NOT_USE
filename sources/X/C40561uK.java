package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1uK  reason: invalid class name and case insensitive filesystem */
public class C40561uK {
    public static boolean A00(C16010sH r0, C20260zl r1) {
        if (r0 == null) {
            return false;
        }
        return A01(r1, r0.A0E);
    }

    public static boolean A01(C20260zl r2, Jid jid) {
        if (jid == null || jid.getType() != 7) {
            return false;
        }
        return r2.A00();
    }
}
