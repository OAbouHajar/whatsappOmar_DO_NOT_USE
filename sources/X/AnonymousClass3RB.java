package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3RB  reason: invalid class name */
public class AnonymousClass3RB extends AnonymousClass07D {
    public final /* synthetic */ AnonymousClass291 A00;

    public AnonymousClass3RB(AnonymousClass291 r1) {
        this.A00 = r1;
    }

    public void A01(Canvas canvas, AnonymousClass0Ri r11, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        AnonymousClass291 r6 = this.A00;
        int i2 = paddingLeft + ((int) r6.A01);
        int width = (recyclerView.getWidth() - ((int) r6.A02)) - recyclerView.getPaddingRight();
        for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
            View childAt = recyclerView.getChildAt(i3);
            AnonymousClass0Bp r1 = (AnonymousClass0Bp) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + r1.bottomMargin;
            int intrinsicHeight = r6.A0I.getIntrinsicHeight() + bottom;
            if (r1.A01() == 0 && r6.A0n == null) {
                r6.A0I.setBounds(0, bottom, recyclerView.getWidth(), intrinsicHeight);
            } else {
                r6.A0I.setBounds(i2, bottom, width, intrinsicHeight);
            }
            r6.A0I.draw(canvas);
        }
    }
}
