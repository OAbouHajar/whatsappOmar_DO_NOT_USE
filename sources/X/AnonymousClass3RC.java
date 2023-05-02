package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

/* renamed from: X.3RC  reason: invalid class name */
public class AnonymousClass3RC extends AnonymousClass07D {
    public final AnonymousClass013 A00;

    public AnonymousClass3RC(AnonymousClass013 r1) {
        this.A00 = r1;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r6, RecyclerView recyclerView) {
        int dimensionPixelSize = C13680ns.A0D(view).getDimensionPixelSize(R.dimen.dimen03fb);
        if (C13680ns.A1Z(this.A00)) {
            rect.set(0, 0, dimensionPixelSize, 0);
        } else {
            rect.set(dimensionPixelSize, 0, 0, 0);
        }
    }
}
