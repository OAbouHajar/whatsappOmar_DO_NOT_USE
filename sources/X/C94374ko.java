package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4ko  reason: invalid class name and case insensitive filesystem */
public class C94374ko implements ViewTreeObserver.OnGlobalLayoutListener {
    public RecyclerView A00;
    public C57622rT A01;
    public boolean A02;

    public C94374ko(RecyclerView recyclerView, C57622rT r2) {
        this.A00 = recyclerView;
        this.A01 = r2;
    }

    public void onGlobalLayout() {
        if (this.A02) {
            this.A01.A02(this.A00);
            this.A02 = false;
        }
    }
}
