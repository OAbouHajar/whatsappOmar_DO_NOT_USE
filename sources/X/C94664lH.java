package X;

import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: X.4lH  reason: invalid class name and case insensitive filesystem */
public class C94664lH implements AbsListView.OnScrollListener {
    public int A00;
    public int A01;
    public final /* synthetic */ C45692Af A02;

    public C94664lH(C45692Af r1) {
        this.A02 = r1;
    }

    public final void A00(int i2, int i3) {
        C16740tZ A04;
        C45692Af r4 = this.A02;
        int count = r4.A07.getCount();
        while (i2 <= i3) {
            ListView ADA = r4.ADA();
            AnonymousClass00B.A04(ADA);
            int headerViewsCount = i2 - ADA.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1 && (A04 = r4.A07.getItem(headerViewsCount)) != null && A04.A10 == 13) {
                r4.A00.A0y.A01(A04.A11);
            }
            i2++;
        }
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        int i5;
        if (!(i3 == 0 || (i5 = this.A01) == 0)) {
            int i6 = i2 + i3;
            int i7 = this.A00;
            int i8 = i5 + i7;
            if (i7 < i2) {
                A00(i7, i2 - 1);
            } else if (i6 < i8) {
                A00(i6 + 1, i8);
            }
        }
        this.A00 = i2;
        this.A01 = i3;
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
