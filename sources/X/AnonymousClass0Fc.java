package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.0Fc  reason: invalid class name */
public class AnonymousClass0Fc extends AnonymousClass078 {
    public final /* synthetic */ RecyclerView A00;

    public AnonymousClass0Fc(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00() {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0r((String) null);
        recyclerView.A0y.A0C = true;
        recyclerView.A0s(true);
        if (recyclerView.A0J.A04.size() <= 0) {
            recyclerView.requestLayout();
        }
    }

    public void A02(int i2, int i3) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0r((String) null);
        C07620cC r3 = recyclerView.A0J;
        if (i3 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.ALt((Object) null, 1, i2, i3));
            r3.A00 |= 1;
            if (arrayList.size() == 1) {
                A06();
            }
        }
    }

    public void A03(int i2, int i3) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0r((String) null);
        C07620cC r3 = recyclerView.A0J;
        if (i3 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.ALt((Object) null, 2, i2, i3));
            r3.A00 |= 2;
            if (arrayList.size() == 1) {
                A06();
            }
        }
    }

    public void A04(int i2, int i3, int i4) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0r((String) null);
        C07620cC r3 = recyclerView.A0J;
        if (i2 != i3) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.ALt((Object) null, 8, i2, i3));
            r3.A00 |= 8;
            if (arrayList.size() == 1) {
                A06();
            }
        }
    }

    public void A05(Object obj, int i2, int i3) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0r((String) null);
        C07620cC r3 = recyclerView.A0J;
        if (i3 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.ALt(obj, 4, i2, i3));
            r3.A00 |= 4;
            if (arrayList.size() == 1) {
                A06();
            }
        }
    }

    public void A06() {
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A0h || !recyclerView.A0j) {
            recyclerView.A0c = true;
            recyclerView.requestLayout();
            return;
        }
        recyclerView.postOnAnimation(recyclerView.A12);
    }
}
