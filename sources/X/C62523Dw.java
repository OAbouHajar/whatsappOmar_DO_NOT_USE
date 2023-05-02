package X;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3Dw  reason: invalid class name and case insensitive filesystem */
public class C62523Dw implements AnonymousClass5SJ {
    public final AnonymousClass4CG A00;
    public final C85414Oi A01;

    public C62523Dw(AnonymousClass4CG r1, C85414Oi r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C85414Oi r5 = this.A01;
        r5.A06 = recyclerView;
        r5.A03 = recyclerView.getScrollX();
        recyclerView.A0o(r5.A05);
        int i2 = r5.A00;
        if (i2 != -1) {
            if (!r5.A08) {
                recyclerView.A0Z(i2);
            } else if (!r5.A07.equals("")) {
                C64473Ql r1 = new C64473Ql(context);
                r1.A09(r5.A07);
                r1.A00 = r5.A00;
                AnonymousClass02W layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.A0Q(r1);
                }
            } else {
                recyclerView.A0a(i2);
            }
            r5.A00 = -1;
            r5.A08 = false;
            r5.A07 = "";
        }
        int i3 = r5.A01;
        if (i3 != -1 || r5.A02 != -1) {
            boolean z2 = r5.A09;
            int i4 = r5.A02;
            if (z2) {
                recyclerView.A0e(i3, i4);
            } else {
                recyclerView.scrollBy(i3, i4);
            }
            r5.A01 = -1;
            r5.A02 = -1;
            r5.A09 = false;
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) obj;
        if (Build.VERSION.SDK_INT >= 26 && (recyclerView = this.A01.A06) != null) {
            recyclerView.setImportantForAutofill(0);
        }
        C85414Oi r1 = this.A01;
        r1.A06 = null;
        recyclerView2.A0p(r1.A05);
    }
}
