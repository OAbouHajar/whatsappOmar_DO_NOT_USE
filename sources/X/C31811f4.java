package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1f4  reason: invalid class name and case insensitive filesystem */
public class C31811f4 {
    public static C28861Yb A00(C36421nW r4) {
        UserJid nullable = UserJid.getNullable(r4.A01);
        AnonymousClass00B.A06(nullable);
        String str = nullable.user;
        int i2 = 0;
        if (nullable instanceof AnonymousClass1ZX) {
            i2 = 1;
        }
        return new C28861Yb(i2, str, r4.A00);
    }

    public static String A01(C28861Yb r3) {
        String str = r3.A01 == 0 ? "s.whatsapp.net" : "lid";
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A02);
        sb.append('@');
        sb.append(str);
        return sb.toString();
    }

    public static C36061mw A02(C30981dH r3) {
        C28861Yb r0 = r3.A00;
        return new C36061mw(r3.A01, new C36421nW(A01(r0), r0.A00));
    }
}
