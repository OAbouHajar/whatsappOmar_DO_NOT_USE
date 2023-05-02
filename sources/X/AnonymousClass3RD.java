package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3RD  reason: invalid class name */
public class AnonymousClass3RD extends AnonymousClass07D {
    public final /* synthetic */ AnonymousClass4Om A00;

    public AnonymousClass3RD(AnonymousClass4Om r1) {
        this.A00 = r1;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r9, RecyclerView recyclerView) {
        AnonymousClass4Om r5 = this.A00;
        if (r5.A00 != 0) {
            int A002 = RecyclerView.A00(view);
            int i2 = r5.A00;
            int i3 = A002 % i2;
            int i4 = (r5.A04 - (r5.A01 * i2)) / (i2 + 1);
            rect.left = i4 - ((i3 * i4) / i2);
            rect.right = ((i3 + 1) * i4) / i2;
            if (A002 < i2) {
                rect.top = r5.A02;
            }
            rect.bottom = r5.A02;
        }
    }
}
