package X;

import android.widget.AbsListView;

/* renamed from: X.4lC  reason: invalid class name and case insensitive filesystem */
public class C94614lC implements AbsListView.OnScrollListener {
    public int A00 = 0;
    public final /* synthetic */ AnonymousClass1V8 A01;

    public C94614lC(AnonymousClass1V8 r2) {
        this.A01 = r2;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        int i3 = this.A00;
        if (i3 == 0 && i2 != i3) {
            this.A01.A0B.A01(absListView);
        }
        this.A00 = i2;
    }
}
