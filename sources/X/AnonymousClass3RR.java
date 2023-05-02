package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3RR  reason: invalid class name */
public abstract class AnonymousClass3RR extends AnonymousClass071 {
    public int A00 = 1;

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        C18450wi.A0H(recyclerView, 0);
        if (!A03()) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int height = recyclerView.getHeight();
            if (height != 0) {
                if (this.A00 > computeVerticalScrollOffset / height) {
                    AnonymousClass02W layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && recyclerView.A0N != null) {
                        int A1B = ((LinearLayoutManager) layoutManager).A1B();
                        AnonymousClass01X r0 = recyclerView.A0N;
                        C18450wi.A0F(r0);
                        if (A1B != r0.A0C() - 1) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.A00 += 2;
                A02();
            }
        }
    }

    public abstract void A02();

    public abstract boolean A03();
}
