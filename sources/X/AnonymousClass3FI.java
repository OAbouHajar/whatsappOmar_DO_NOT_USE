package X;

import com.facebook.redex.IDxObjectShape261S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3FI  reason: invalid class name */
public class AnonymousClass3FI implements C109215Rd, C109205Rc {
    public AnonymousClass26B A00;
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final C17180uf A02;
    public final C17210ui A03;
    public final AnonymousClass2Z2 A04;
    public final AnonymousClass4DO A05 = new AnonymousClass4DO(this);
    public final AnonymousClass4DP A06 = new AnonymousClass4DP(this);
    public final AnonymousClass4N7 A07;
    public final C14710pd A08;
    public final Map A09 = new Hashtable();
    public final AnonymousClass1DU A0A = new IDxObjectShape261S0100000_2_I1(this, 1);
    public final AnonymousClass1DU A0B = new IDxObjectShape261S0100000_2_I1(this, 2);

    public AnonymousClass3FI(C17180uf r3, C17210ui r4, AnonymousClass2Z2 r5, C14710pd r6) {
        this.A08 = r6;
        this.A02 = r3;
        this.A07 = new AnonymousClass4N7();
        this.A04 = r5;
        r5.A08 = this;
        this.A03 = r4;
        r5.A09 = this;
    }

    public static final boolean A00(AnonymousClass26B r3) {
        if (r3 == null) {
            return false;
        }
        String str = r3.A08;
        return "device".equals(str) || "pin_on_map".equals(str) || "manual".equals(str);
    }

    public List A01() {
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(new C71873lC());
        A0u.add(new C72003lP(new ViewOnClickCListenerShape16S0100000_I1_1(this, 6)));
        return A0u;
    }

    public void A02() {
        this.A01.A09(this.A07);
    }

    public final void A03() {
        Object obj;
        Object obj2;
        Object obj3;
        Map map = this.A09;
        Iterator A0q = C13680ns.A0q(map);
        while (A0q.hasNext()) {
            if (((AnonymousClass4HK) A0q.next()).A00 == 2) {
                return;
            }
        }
        ArrayList A0u = AnonymousClass000.A0u();
        C17180uf r6 = this.A02;
        if (r6.A08()) {
            A0u.add(new C72213lk(this.A00, this.A0A, R.string.str01c1));
            if (r6.A09()) {
                AnonymousClass26B r62 = this.A00;
                if (A00(r62)) {
                    AnonymousClass4HK r0 = (AnonymousClass4HK) AnonymousClass000.A0Y(map, 0);
                    if (r0 == null || (obj3 = r0.A01) == null) {
                        A0u.add(new C72123lb(false));
                    } else {
                        C87314Wg r3 = (C87314Wg) obj3;
                        AnonymousClass387.A00(r62, Double.valueOf(1.0d), r3.A07);
                        A0u.add(new C72223ll(r62, r3.A07, this.A0B));
                    }
                }
            }
            A0u.add(new C72223ll(this.A00, Collections.emptyList(), this.A0B));
        } else if (this.A08.A0E(C16620tM.A02, 1890)) {
            AnonymousClass26B r2 = this.A00;
            AnonymousClass1DU r32 = this.A0A;
            A0u.add(new C72213lk(r2, r32, R.string.str01c1));
            if (A00(this.A00)) {
                AnonymousClass4HK r02 = (AnonymousClass4HK) AnonymousClass000.A0Y(map, 0);
                if (r02 == null || (obj = r02.A01) == null) {
                    A0u.add(new C72153le(false));
                } else {
                    C87314Wg r1 = (C87314Wg) obj;
                    if (r1.A07.isEmpty()) {
                        A0u.add(new C72143ld(r32));
                    } else {
                        A0u.add(new C72233lm(this.A00, this.A06, r1.A07));
                    }
                }
            } else {
                A0u.add(new C72133lc(this.A05));
            }
        }
        AnonymousClass4HK r03 = (AnonymousClass4HK) map.get(C13680ns.A0Y());
        if (r03 == null || (obj2 = r03.A01) == null) {
            A0u.add(new C71933lI());
        } else {
            A0u.add(new C71963lL(this, ((AnonymousClass4DL) C13690nt.A0Z((List) obj2)).A00));
            A0u.add(new C71893lE());
        }
        A0u.addAll(A01());
        synchronized (AnonymousClass3FI.class) {
            AnonymousClass4N7 r12 = this.A07;
            r12.A01 = 1;
            List list = r12.A04;
            list.clear();
            list.addAll(A0u);
            A02();
        }
    }

    public final void A04(int i2) {
        synchronized (AnonymousClass3FI.class) {
            AnonymousClass4N7 r1 = this.A07;
            r1.A01 = 4;
            r1.A00 = i2;
            A02();
        }
    }

    public void ANp(int i2) {
        AnonymousClass4HK r1 = (AnonymousClass4HK) AnonymousClass000.A0Y(this.A09, 0);
        if (r1 != null) {
            r1.A00 = 2;
        }
        A04(i2);
    }

    public void ANq(C87314Wg r4) {
        synchronized (AnonymousClass3FI.class) {
            AnonymousClass4HK r1 = (AnonymousClass4HK) AnonymousClass000.A0Y(this.A09, 0);
            if (r1 != null) {
                r1.A00 = 1;
                r1.A01 = r4;
            }
            A03();
        }
    }

    public void ARE(int i2) {
        AnonymousClass4HK r1 = (AnonymousClass4HK) this.A09.get(C13680ns.A0Y());
        if (r1 != null) {
            r1.A00 = 2;
        }
        A04(i2);
    }

    public void ARF(List list) {
        synchronized (AnonymousClass3FI.class) {
            AnonymousClass4HK r2 = (AnonymousClass4HK) AnonymousClass000.A0Y(this.A09, 1);
            if (list.isEmpty()) {
                AnonymousClass4N7 r1 = this.A07;
                r1.A01 = 4;
                r1.A00 = 3;
                if (r2 != null) {
                    r2.A00 = 2;
                }
                Log.e("HomeWidgetsDelegate/onFetchWidgetsSuccess widgets list cannot be empty");
                A02();
            } else {
                if (r2 != null) {
                    r2.A00 = 1;
                    r2.A01 = list;
                }
                if (this.A02.A08()) {
                    this.A03.A01(73);
                }
                A03();
            }
        }
    }
}
