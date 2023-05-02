package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0SK  reason: invalid class name */
public class AnonymousClass0SK {
    public final AnonymousClass0SE A00 = new AnonymousClass0SE();
    public final C12470kS A01;
    public final List A02 = AnonymousClass000.A0u();

    public AnonymousClass0SK(C12470kS r2) {
        this.A01 = r2;
    }

    public int A00() {
        return ((C07570c7) this.A01).A00.getChildCount() - this.A02.size();
    }

    public int A01() {
        return ((C07570c7) this.A01).A00.getChildCount();
    }

    public final int A02(int i2) {
        if (i2 >= 0) {
            int childCount = ((C07570c7) this.A01).A00.getChildCount();
            int i3 = i2;
            while (i3 < childCount) {
                AnonymousClass0SE r1 = this.A00;
                int A002 = i2 - (i3 - r1.A00(i3));
                if (A002 != 0) {
                    i3 += A002;
                } else {
                    while (r1.A06(i3)) {
                        i3++;
                    }
                    return i3;
                }
            }
        }
        return -1;
    }

    public View A03(int i2) {
        return ((C07570c7) this.A01).A00.getChildAt(A02(i2));
    }

    public View A04(int i2) {
        return ((C07570c7) this.A01).A00.getChildAt(i2);
    }

    public void A05(int i2) {
        C005602k A012;
        int A022 = A02(i2);
        this.A00.A07(A022);
        RecyclerView recyclerView = ((C07570c7) this.A01).A00;
        View childAt = recyclerView.getChildAt(A022);
        if (!(childAt == null || (A012 = RecyclerView.A01(childAt)) == null)) {
            int i3 = A012.A00;
            if ((i3 & 256) == 0 || A012.A05()) {
                A012.A00 = 256 | i3;
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("called detach on an already detached child ");
                A0r.append(A012);
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(recyclerView.A0G(), A0r));
            }
        }
        recyclerView.detachViewFromParent(A022);
    }

    public void A06(int i2) {
        int A022 = A02(i2);
        RecyclerView recyclerView = ((C07570c7) this.A01).A00;
        View childAt = recyclerView.getChildAt(A022);
        if (childAt != null) {
            if (this.A00.A07(A022)) {
                A08(childAt);
            }
            View childAt2 = recyclerView.getChildAt(A022);
            if (childAt2 != null) {
                recyclerView.A0i(childAt2);
                childAt2.clearAnimation();
            }
            recyclerView.removeViewAt(A022);
        }
    }

    public final void A07(View view) {
        this.A02.add(view);
        C07570c7 r0 = (C07570c7) this.A01;
        C005602k A012 = RecyclerView.A01(view);
        if (A012 != null) {
            RecyclerView recyclerView = r0.A00;
            int i2 = A012.A04;
            if (i2 == -1) {
                i2 = A012.A0H.getImportantForAccessibility();
            }
            A012.A07 = i2;
            if (recyclerView.A09 > 0) {
                A012.A04 = 4;
                recyclerView.A15.add(A012);
                return;
            }
            C004601z.A0d(A012.A0H, 4);
        }
    }

    public final void A08(View view) {
        if (this.A02.remove(view)) {
            this.A01.ASb(view);
        }
    }

    public void A09(View view, int i2, boolean z2) {
        int childCount = i2 < 0 ? ((C07570c7) this.A01).A00.getChildCount() : A02(i2);
        this.A00.A05(childCount, z2);
        if (z2) {
            A07(view);
        }
        RecyclerView recyclerView = ((C07570c7) this.A01).A00;
        recyclerView.addView(view, childCount);
        C005602k A012 = RecyclerView.A01(view);
        AnonymousClass01X r0 = recyclerView.A0N;
        if (!(r0 == null || A012 == null)) {
            r0.A05(A012);
        }
        List list = recyclerView.A0a;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AnonymousClass05I) recyclerView.A0a.get(size)).AOQ(view);
                } else {
                    return;
                }
            }
        }
    }

    public void A0A(View view, ViewGroup.LayoutParams layoutParams, int i2, boolean z2) {
        int childCount = i2 < 0 ? ((C07570c7) this.A01).A00.getChildCount() : A02(i2);
        this.A00.A05(childCount, z2);
        if (z2) {
            A07(view);
        }
        C07570c7 r3 = (C07570c7) this.A01;
        C005602k A012 = RecyclerView.A01(view);
        if (A012 != null) {
            int i3 = A012.A00;
            if ((i3 & 256) != 0 || A012.A05()) {
                A012.A00 = i3 & -257;
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("Called attach on a child which is not detached: ");
                A0r.append(A012);
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(r3.A00.A0G(), A0r));
            }
        }
        r3.A00.attachViewToParent(view, childCount, layoutParams);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(this.A00, A0o);
        A0o.append(", hidden list:");
        return AnonymousClass000.A0l(A0o, this.A02.size());
    }
}
