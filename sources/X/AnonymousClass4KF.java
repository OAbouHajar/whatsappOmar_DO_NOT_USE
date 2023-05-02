package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4KF  reason: invalid class name */
public class AnonymousClass4KF {
    public final RecyclerView A00;
    public final C64513Qp A01 = new C64513Qp();
    public final C109185Ra A02;

    public AnonymousClass4KF(RecyclerView recyclerView, C109185Ra r4) {
        this.A00 = recyclerView;
        this.A02 = r4;
        RecyclerView recyclerView2 = this.A00;
        recyclerView2.setNestedScrollingEnabled(true);
        recyclerView2.setAdapter(this.A01);
    }
}
