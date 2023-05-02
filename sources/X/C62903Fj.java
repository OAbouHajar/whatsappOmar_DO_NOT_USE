package X;

import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Fj  reason: invalid class name and case insensitive filesystem */
public class C62903Fj implements C16710tV {
    public final AnonymousClass26B A00;
    public final /* synthetic */ AnonymousClass2Z2 A01;

    public C62903Fj(AnonymousClass26B r1, AnonymousClass2Z2 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AQR(int i2) {
        C84794Lx r2 = this.A01.A0C;
        if (r2 != null) {
            AnonymousClass4N8 r1 = r2.A01;
            r1.A03 = null;
            r1.A04.clear();
            r1.A01 = 5;
            r1.A00 = i2;
            r2.A00.A0B(r1);
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        C87314Wg r13 = (C87314Wg) obj;
        AnonymousClass2Z2 r1 = this.A01;
        if (r1.A0C != null) {
            List list = r13.A07;
            C61853Aq.A02(this.A00, list);
            C84794Lx r7 = r1.A0C;
            AnonymousClass4N8 r6 = r7.A01;
            r6.A03 = null;
            List list2 = r6.A04;
            list2.clear();
            r6.A02 = r13;
            List<C73563oM> list3 = r13.A05;
            if (list3.isEmpty()) {
                r6.A01 = 2;
            } else {
                ArrayList A0u = AnonymousClass000.A0u();
                for (C73563oM r9 : list3) {
                    A0u.add(new C72093lY(new ViewOnClickCListenerShape1S0200000_I1(r7, 18, r9), r9.A01, r9.A01, false));
                }
                C30801cy r92 = r7.A02.A00.A0S;
                if (r92.A01() != null && !list.isEmpty()) {
                    String A0d = C13680ns.A0d(r7.A03.A00, ((C31241dn) r92.A01()).A01, new Object[1], 0, R.string.str01c9);
                    A0u.add(new C71893lE());
                    A0u.add(new C72093lY(new ViewOnClickCListenerShape4S0100000_I1(r7, 26), "", A0d, true));
                }
                r6.A01 = 1;
                list2.clear();
                list2.addAll(A0u);
            }
            r7.A00.A0B(r6);
        }
    }
}
