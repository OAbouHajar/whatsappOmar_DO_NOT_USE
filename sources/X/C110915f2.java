package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

/* renamed from: X.5f2  reason: invalid class name and case insensitive filesystem */
public class C110915f2 extends AnonymousClass07D {
    public void A03(Rect rect, View view, AnonymousClass0Ri r7, RecyclerView recyclerView) {
        super.A03(rect, view, r7, recyclerView);
        int A00 = RecyclerView.A00(view);
        AnonymousClass01X r0 = recyclerView.A0N;
        if (r0 == null) {
            return;
        }
        if (A00 == 0 || A00 == r0.A0C() - 1) {
            C004601z.A0h(view, C004601z.A08(view), (int) view.getResources().getDimension(R.dimen.dimen0656), C004601z.A07(view), view.getPaddingBottom());
        }
    }
}
