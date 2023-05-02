package X;

import com.obwhatsapp.status.StatusesFragment;
import java.util.List;

/* renamed from: X.2Az  reason: invalid class name */
public class AnonymousClass2Az extends C16690tT {
    public final AnonymousClass128 A00;

    public AnonymousClass2Az(AnonymousClass128 r2, StatusesFragment statusesFragment) {
        super(statusesFragment, true);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A01(C34091jg.A00);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C16750ta r1;
        List<C16740tZ> list = (List) obj;
        StatusesFragment statusesFragment = (StatusesFragment) A04(StatusesFragment.class);
        if (statusesFragment != null) {
            statusesFragment.A0s = null;
            List list2 = statusesFragment.A1F;
            list2.clear();
            List list3 = statusesFragment.A1G;
            list3.clear();
            List list4 = statusesFragment.A1E;
            list4.clear();
            int size = list.size() - 1;
            for (C16740tZ r6 : list) {
                int i2 = r6.A0C;
                if (C42881yp.A00(i2, 4) < 0) {
                    if (i2 != 20) {
                        if (C38621r6.A0o(r6)) {
                            list4.add(Integer.valueOf(size));
                        } else if (!(r6 instanceof C16730tY) || (r1 = ((C16730tY) r6).A02) == null || r1.A0P || r1.A0Z) {
                            list3.add(Integer.valueOf(size));
                        }
                    }
                    list2.add(Integer.valueOf(size));
                }
                size--;
                C30991dI r0 = statusesFragment.A0u.A00;
                if (r0 != null && r0.A03() == r6.A14) {
                    long j2 = r6.A0H;
                    if (j2 > 0) {
                        statusesFragment.A0u.A00.A0A(j2);
                    }
                }
            }
            statusesFragment.A0i.getFilter().filter(statusesFragment.A10);
        }
    }
}
