package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3RG  reason: invalid class name */
public class AnonymousClass3RG extends AnonymousClass07D {
    public final int A00;
    public final AnonymousClass013 A01;

    public AnonymousClass3RG(AnonymousClass013 r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r10, RecyclerView recyclerView) {
        C02820Fj r2 = (C02820Fj) view.getLayoutParams();
        int i2 = r2.A01;
        int i3 = ((GridLayoutManager) recyclerView.getLayoutManager()).A00;
        int i4 = r2.A00;
        if (i2 == i3 || i3 == 0) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int i5 = i3 / i2;
        int i6 = i4 / i2;
        rect.top = 0;
        int i7 = this.A00;
        rect.bottom = i7;
        float f2 = (float) i7;
        float f3 = (float) i5;
        int floor = (int) Math.floor((double) ((((float) i6) * f2) / f3));
        int ceil = (int) Math.ceil((double) ((f2 * ((float) ((i5 - i6) - 1))) / f3));
        if (this.A01.A0T()) {
            rect.left = ceil;
            rect.right = floor;
            return;
        }
        rect.left = floor;
        rect.right = ceil;
    }
}
