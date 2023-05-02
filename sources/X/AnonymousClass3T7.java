package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3T7  reason: invalid class name */
public class AnonymousClass3T7 extends AnonymousClass0EK {
    public final /* synthetic */ AnonymousClass3T4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3T7(RecyclerView recyclerView, AnonymousClass3T4 r2) {
        super(recyclerView);
        this.A00 = r2;
    }

    public void A06(View view, AnonymousClass031 r4) {
        AnonymousClass05M r0 = this.A00.A00;
        if (r0 != null) {
            r0.A06(view, r4);
        }
        r4.A0A(AnonymousClass032.A0X);
        r4.A0A(AnonymousClass032.A0S);
        r4.A0A(AnonymousClass032.A0U);
        r4.A0A(AnonymousClass032.A0V);
        r4.A0A(AnonymousClass032.A0T);
        r4.A0A(AnonymousClass032.A0R);
        r4.A01.setScrollable(false);
    }
}
