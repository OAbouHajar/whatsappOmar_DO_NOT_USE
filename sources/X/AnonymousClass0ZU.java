package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: X.0ZU  reason: invalid class name */
public abstract class AnonymousClass0ZU implements C13350lt, C13250li, AdapterView.OnItemClickListener {
    public Rect A00;

    public static int A00(Context context, ListAdapter listAdapter, int i2) {
        FrameLayout frameLayout = null;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    public abstract void A01(int i2);

    public abstract void A02(int i2);

    public abstract void A03(int i2);

    public abstract void A04(View view);

    public abstract void A05(PopupWindow.OnDismissListener onDismissListener);

    public abstract void A06(C016607w r1);

    public abstract void A07(boolean z2);

    public abstract void A08(boolean z2);

    public boolean A09() {
        return true;
    }

    public boolean A6P(C016607w r2, C07290av r3) {
        return false;
    }

    public boolean A8s(C016607w r2, C07290av r3) {
        return false;
    }

    public void AIA(Context context, C016607w r2) {
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        ListAdapter listAdapter2 = listAdapter;
        if (listAdapter instanceof HeaderViewListAdapter) {
            listAdapter2 = ((HeaderViewListAdapter) listAdapter2).getWrappedAdapter();
        }
        C016607w r3 = ((AnonymousClass0C5) listAdapter2).A01;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i2);
        int i3 = 4;
        if (A09()) {
            i3 = 0;
        }
        r3.A0L(menuItem, this, i3);
    }
}
