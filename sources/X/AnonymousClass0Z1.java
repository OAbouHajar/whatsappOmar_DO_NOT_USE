package X;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.0Z1  reason: invalid class name */
public class AnonymousClass0Z1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C06490Wi A02;

    public AnonymousClass0Z1(View view, View view2, C06490Wi r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = view2;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        C06490Wi.A01(absListView, this.A01, this.A00);
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
