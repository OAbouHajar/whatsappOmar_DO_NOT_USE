package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3RK  reason: invalid class name */
public class AnonymousClass3RK extends AnonymousClass07D {
    public int A00 = 0;
    public int A01;
    public final int A02;

    public AnonymousClass3RK(int i2, int i3) {
        this.A02 = i2;
        this.A01 = i3;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r6, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        if (A002 == 0) {
            rect.set(0, this.A01, 0, 0);
        } else if (A002 == this.A02 - 1) {
            rect.set(0, 0, 0, this.A00);
        }
    }
}
