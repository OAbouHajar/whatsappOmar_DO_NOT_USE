package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1wm  reason: invalid class name and case insensitive filesystem */
public class C41861wm {
    public static boolean A00(C16000sG r3, C17030uP r4, C14710pd r5, C20260zl r6, C16740tZ r7) {
        if (!r5.A0E(C16620tM.A02, 1105) || r7 == null) {
            return false;
        }
        C15830rv r0 = r7.A11.A00;
        AnonymousClass00B.A06(r0);
        C16010sH A07 = r3.A07(r0);
        if (A07 == null) {
            return false;
        }
        UserJid userJid = (UserJid) A07.A08(UserJid.class);
        return !C32431gL.A01(r6, userJid) && new C32441gM(r4, userJid).A02();
    }

    public static boolean A01(C17030uP r2, C14710pd r3, C20260zl r4, UserJid userJid) {
        return r3.A0E(C16620tM.A02, 1105) && userJid != null && !C32431gL.A01(r4, userJid) && new C32441gM(r2, userJid).A02();
    }
}
