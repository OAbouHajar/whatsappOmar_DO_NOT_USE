package X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;

/* renamed from: X.29h  reason: invalid class name and case insensitive filesystem */
public class C455629h implements AnonymousClass20Z {
    public final /* synthetic */ C30151bp A00;

    public C455629h(C30151bp r1) {
        this.A00 = r1;
    }

    public void AQQ() {
        RecyclerView recyclerView = this.A00.A09.A0Q;
        if (recyclerView != null) {
            recyclerView.post(new RunnableRunnableShape11S0100000_I0_10((Object) this, 0));
        }
    }

    public /* bridge */ /* synthetic */ void AVi(Object obj) {
        RecyclerView recyclerView = this.A00.A09.A0Q;
        if (recyclerView != null) {
            recyclerView.post(new RunnableRunnableShape8S0200000_I0_6(this, 33, obj));
        }
    }
}
