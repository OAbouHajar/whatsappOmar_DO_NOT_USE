package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import com.obwhatsapp.R;

/* renamed from: X.4ks  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94414ks implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Adapter A02;
    public final /* synthetic */ C49662Uu A03;

    public /* synthetic */ C94414ks(View view, View view2, Adapter adapter, C49662Uu r4) {
        this.A03 = r4;
        this.A02 = adapter;
        this.A00 = view;
        this.A01 = view2;
    }

    public final void onGlobalLayout() {
        C49662Uu r6 = this.A03;
        Adapter adapter = this.A02;
        View view = this.A00;
        View view2 = this.A01;
        if (r6.A0H.isLayoutRequested()) {
            return;
        }
        if (r6.getHeight() >= r6.getWidth()) {
            int max = Math.max(r6.getMeasuredHeight() - ((((r6.A0D.getMeasuredHeight() - r6.getMeasuredWidth()) + (adapter.getCount() * r6.getResources().getDimensionPixelSize(R.dimen.dimen074d))) + view.getMeasuredHeight()) + r6.A03(r6.A0C.getMeasuredWidth())), 0) + r6.getResources().getDimensionPixelSize(R.dimen.dimen0157);
            if (view2.getPaddingBottom() != max) {
                view2.setPadding(0, 0, 0, max);
            }
        } else if (view2.getPaddingBottom() != 0) {
            view2.setPadding(0, 0, 0, 0);
        }
    }
}
