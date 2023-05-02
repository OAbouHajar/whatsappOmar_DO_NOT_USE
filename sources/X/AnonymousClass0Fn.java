package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Fn  reason: invalid class name */
public class AnonymousClass0Fn extends AnonymousClass071 {
    public boolean A00 = false;
    public final /* synthetic */ C02840Fl A01;

    public AnonymousClass0Fn(C02840Fl r2) {
        this.A01 = r2;
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            this.A00 = true;
        }
    }

    public void A01(RecyclerView recyclerView, int i2) {
        if (i2 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A01();
        }
    }
}
