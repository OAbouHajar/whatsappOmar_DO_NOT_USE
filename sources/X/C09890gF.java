package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0gF  reason: invalid class name and case insensitive filesystem */
public class C09890gF implements Runnable {
    public final /* synthetic */ AnonymousClass0XS A00;
    public final /* synthetic */ C02800Fh A01;

    public C09890gF(AnonymousClass0XS r1, C02800Fh r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        C02800Fh r4 = this.A01;
        RecyclerView recyclerView = r4.A0M;
        if (recyclerView != null && recyclerView.A0j) {
            AnonymousClass0XS r1 = this.A00;
            if (!r1.A05 && r1.A0C.A00() != -1) {
                C005502j r0 = recyclerView.A0R;
                if (r0 == null || !r0.A0B()) {
                    List list = r4.A0O;
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        if (((AnonymousClass0XS) list.get(i2)).A03) {
                            i2++;
                        }
                    }
                    return;
                }
                r4.A0M.post(this);
            }
        }
    }
}
