package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0ff  reason: invalid class name and case insensitive filesystem */
public class C09530ff implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public C09530ff(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void run() {
        RecyclerView recyclerView = this.A00;
        C005502j r0 = recyclerView.A0R;
        if (r0 != null) {
            r0.A09();
        }
        recyclerView.A0o = false;
    }
}
