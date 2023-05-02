package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.4nb  reason: invalid class name and case insensitive filesystem */
public class C95984nb implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass02W layoutManager;
        AnonymousClass3U0 r12 = (AnonymousClass3U0) obj2;
        if (obj3 != null) {
            C57522rJ r7 = r12.A0G;
            AnonymousClass4JP r13 = (AnonymousClass4JP) obj3;
            int i2 = r7.A00;
            int i3 = r13.A00;
            boolean z2 = true;
            boolean z3 = false;
            boolean A1X = AnonymousClass3K2.A1X(i2, i3);
            int i4 = r7.A01;
            int i5 = r13.A01;
            boolean A1X2 = AnonymousClass3K2.A1X(i4, i5);
            RecyclerView recyclerView = r7.A02;
            if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
                if ((!layoutManager.A13() || !A1X) && (!layoutManager.A14() || !A1X2)) {
                    z2 = false;
                }
                z3 = z2;
            }
            r7.A01 = i5;
            r7.A00 = i3;
            List list = r7.A04;
            r7.A04 = r13.A02;
            if (z3) {
                r7.A01();
            } else {
                AnonymousClass07B.A00(new AnonymousClass3QM(r7, list)).A02(r7);
            }
        } else {
            throw AnonymousClass000.A0V("List data was not computed during layout");
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 == null || obj4 == null) {
            return false;
        }
        AnonymousClass4JP r6 = (AnonymousClass4JP) obj3;
        AnonymousClass4JP r7 = (AnonymousClass4JP) obj4;
        return (r6.A01 == r7.A01 && r6.A00 == r7.A00 && r6.A02.equals(r7.A02)) ? false : true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
    }
}
