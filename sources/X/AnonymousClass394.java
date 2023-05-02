package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.394  reason: invalid class name */
public class AnonymousClass394 {
    public final /* synthetic */ C84724Lq A00;
    public final /* synthetic */ AnonymousClass1KA A01;

    public AnonymousClass394(C84724Lq r1, AnonymousClass1KA r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(int i2) {
        C84724Lq r4 = this.A00;
        AnonymousClass1KA r3 = r4.A00;
        r3.A04.A09(Boolean.FALSE);
        if (i2 == 404) {
            r3.A0B.A0F(r4.A01, true);
        }
        r3.A02.A09(new C71433kN(r4.A01, r4.A02, i2));
    }

    public void A01(C83514Gz r15, C55252j9 r16) {
        String str;
        C84724Lq r8 = this.A00;
        AnonymousClass1KA r9 = r8.A00;
        r9.A04.A09(Boolean.FALSE);
        String str2 = r16.A04;
        if (str2 == null || str2.equals(r8.A03)) {
            boolean z2 = true;
            boolean A1V = AnonymousClass000.A1V(str2);
            C18640x1 r7 = r9.A0B;
            UserJid userJid = r8.A01;
            synchronized (r7) {
                AnonymousClass2GE r11 = r15.A01;
                List<C35701mM> list = r11.A04;
                for (C35701mM r3 : list) {
                    Map map = r7.A02;
                    String str3 = r3.A0D;
                    map.put(new AnonymousClass2GG(userJid, str3), r3);
                    r7.A03.put(str3, userJid);
                }
                str = r11.A03;
                AnonymousClass2GF r2 = (AnonymousClass2GF) r7.A01(userJid).A04.get(str);
                if (r2 != null) {
                    if (!A1V) {
                        r2.A01.A04.clear();
                    }
                    AnonymousClass2GE r1 = r2.A01;
                    r1.A02 = r11.A02;
                    r1.A01 = r11.A01;
                    r1.A00 = r11.A00;
                    r1.A04.addAll(list);
                } else {
                    AnonymousClass2GD A012 = r7.A01(userJid);
                    r2 = new AnonymousClass2GF(r11);
                    A012.A04.put(str, r2);
                }
                r2.A00 = r15.A00;
            }
            AnonymousClass027 r12 = r9.A02;
            if (r8.A03 != null) {
                z2 = false;
            }
            r12.A09(new C71443kO(userJid, str, false, z2));
        }
    }
}
