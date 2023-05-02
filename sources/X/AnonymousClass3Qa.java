package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.obwhatsapp.StickyHeadersRecyclerView;

/* renamed from: X.3Qa  reason: invalid class name */
public class AnonymousClass3Qa extends AnonymousClass0Q9 {
    public final /* synthetic */ GridLayoutManager A00;
    public final /* synthetic */ StickyHeadersRecyclerView A01;

    public AnonymousClass3Qa(GridLayoutManager gridLayoutManager, StickyHeadersRecyclerView stickyHeadersRecyclerView) {
        this.A01 = stickyHeadersRecyclerView;
        this.A00 = gridLayoutManager;
    }

    public int A00(int i2) {
        if ((((AnonymousClass3R4) this.A01.A0N).A0E(i2) & 4294967295L) == 4294967295L) {
            return this.A00.A00;
        }
        return 1;
    }
}
