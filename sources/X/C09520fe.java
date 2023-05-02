package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0fe  reason: invalid class name and case insensitive filesystem */
public class C09520fe implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public C09520fe(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void run() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A0g && !recyclerView.isLayoutRequested()) {
            if (!recyclerView.A0j) {
                recyclerView.requestLayout();
            } else if (recyclerView.A0m) {
                recyclerView.A0n = true;
            } else {
                recyclerView.A0H();
            }
        }
    }
}
