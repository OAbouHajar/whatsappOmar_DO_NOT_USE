package X;

import android.content.Context;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.33Y  reason: invalid class name */
public final class AnonymousClass33Y extends C110755em {
    public AnonymousClass33Y(Bundle bundle, C14870pt r2, C16040sK r3, C17150uc r4, AnonymousClass1ME r5, AnonymousClass01Y r6, C16000sG r7, AnonymousClass01V r8, C16440t3 r9, C16980tz r10, AnonymousClass013 r11, C16460t6 r12, C17630vO r13, C221116r r14, AnonymousClass173 r15, AnonymousClass160 r16, C1204661t r17, AnonymousClass107 r18, AnonymousClass175 r19, C18300wT r20, AnonymousClass17Y r21, C18090w8 r22, C18290wS r23, AnonymousClass1MA r24, C1222969a r25, AnonymousClass1GO r26, AnonymousClass5wT r27, C218315p r28, C16320sq r29) {
        super(bundle, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
    }

    public C228919r A05() {
        C228919r A04 = this.A0c.A04("P2M_LITE");
        C18450wi.A0F(A04);
        C18450wi.A0B(A04);
        return A04;
    }

    public C116245r4 A07() {
        AnonymousClass1Vt r0;
        AnonymousClass1W2 r02;
        String A0G;
        C113975mv r2 = new C113975mv();
        r2.A04 = this.A0P.A00.getString(R.string.str17e8);
        C117415sx r03 = this.A07;
        if (r03 == null || (r0 = r03.A01) == null || (r02 = r0.A0A) == null || (A0G = r02.A0G()) == null) {
            return null;
        }
        r2.A03 = A0G;
        return r2;
    }

    public void A0I(List list) {
        AnonymousClass1Vt r0;
        UserJid userJid;
        AnonymousClass1Vt r11;
        AnonymousClass1Vt r3;
        A0H(list);
        ArrayList A0u = AnonymousClass000.A0u();
        C116245r4 A07 = A07();
        if (A07 != null) {
            A0u.add(A07);
        }
        C117415sx r02 = this.A07;
        if (!(r02 == null || (r3 = r02.A01) == null)) {
            C113975mv r2 = new C113975mv();
            r2.A04 = this.A0P.A00.getString(R.string.str17ca);
            r2.A03 = this.A0i.A0K(r3);
            A0u.add(r2);
        }
        C117415sx r03 = this.A07;
        if (!(r03 == null || (r11 = r03.A01) == null)) {
            C113975mv r5 = new C113975mv();
            Context context = this.A0P.A00;
            r5.A04 = context.getString(R.string.str0ef2);
            Object[] A1b = C13680ns.A1b();
            AnonymousClass013 r22 = this.A0Q;
            C16440t3 r9 = this.A0O;
            r5.A03 = C13680ns.A0d(context, C42681yF.A05(r22, C28891Zc.A03(r22, r9.A02(r11.A06)), C47672Jx.A00(r22, r9.A02(r11.A06))), A1b, 0, R.string.str17a6);
            A0u.add(r5);
        }
        C113825mg r8 = new C113825mg();
        C16980tz r52 = this.A0P;
        Context context2 = r52.A00;
        Object[] objArr = new Object[1];
        C117415sx r04 = this.A07;
        String str = null;
        if (!(r04 == null || (r0 = r04.A01) == null || (userJid = r0.A0D) == null)) {
            C16010sH A0A = this.A0M.A0A(userJid);
            String A09 = A0A.A09();
            if (A09 == null || !(!C008703y.A0L(A09))) {
                String A0B = A0A.A0B();
                str = (A0B == null || !(C008703y.A0L(A0B) ^ true)) ? r52.A02(R.string.str1d4d) : A0A.A0B();
            } else {
                str = A0A.A09();
            }
        }
        int i2 = 0;
        r8.A00 = C13680ns.A0d(context2, str, objArr, 0, R.string.str17cf);
        A0u.add(r8);
        if (!A0u.isEmpty()) {
            C110755em.A02(list);
            int size = A0u.size();
            while (i2 < size) {
                int i3 = i2 + 1;
                list.add(A0u.get(i2));
                if (i2 != A0u.size() - 1) {
                    list.add(new C113755mZ());
                }
                i2 = i3;
            }
        }
    }
}
