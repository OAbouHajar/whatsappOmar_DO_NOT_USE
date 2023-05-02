package X;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.5pT  reason: invalid class name and case insensitive filesystem */
public class C115265pT {
    public static void A00(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
            int i2 = 0;
            for (int i3 = 0; i3 < adapter.getCount(); i3++) {
                View view = adapter.getView(i3, (View) null, listView);
                view.measure(makeMeasureSpec, 0);
                i2 += view.getMeasuredHeight();
            }
            listView.getLayoutParams().height = i2 + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.requestLayout();
        }
    }
}
