package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2rP  reason: invalid class name and case insensitive filesystem */
public class C57582rP extends AnonymousClass07D {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final AnonymousClass2AU A03;

    public C57582rP(AnonymousClass2AU r3, int i2, int i3) {
        this.A03 = r3;
        this.A01 = i3;
        this.A00 = i2;
        Paint A05 = C13700nu.A05();
        this.A02 = A05;
        A05.setAntiAlias(true);
    }

    public void A01(Canvas canvas, AnonymousClass0Ri r16, RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        int childCount = recyclerView2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView2.getChildAt(i2);
            if (A04(childAt)) {
                int bottom = childAt.getBottom() + AnonymousClass000.A0O(childAt).bottomMargin;
                int left = recyclerView2.getLeft();
                int width = recyclerView2.getWidth();
                Paint paint = this.A02;
                paint.setColor(this.A00);
                canvas.drawRect((float) left, (float) bottom, (float) width, (float) (this.A01 + bottom), paint);
            }
        }
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r4, RecyclerView recyclerView) {
        if (A04(view)) {
            rect.bottom = this.A01;
        }
    }

    public final boolean A04(View view) {
        int i2;
        if (view != null) {
            int A002 = RecyclerView.A00(view);
            AnonymousClass2AU r1 = this.A03;
            if (A002 != -1) {
                AnonymousClass2UX r2 = r1.A0t;
                if (Integer.valueOf(r2.A00(A002)) != null && (i2 = A002 + 1) > 0 && i2 < r2.size()) {
                    int A003 = r2.A00(i2);
                    return (Integer.valueOf(A003) != null && A003 == 22) || A003 == 23;
                }
            }
        }
        return false;
    }
}
