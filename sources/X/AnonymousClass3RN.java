package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

/* renamed from: X.3RN  reason: invalid class name */
public class AnonymousClass3RN extends AnonymousClass07D {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;

    public AnonymousClass3RN(int i2, int i3, int i4) {
        this.A00 = i3;
        this.A02 = i4;
        this.A01 = i2;
        Paint paint = new Paint();
        this.A03 = paint;
        paint.setAntiAlias(true);
    }

    public static final int A00(View view, RecyclerView recyclerView) {
        if (view != null) {
            int A002 = RecyclerView.A00(view);
            AnonymousClass3R0 r4 = (AnonymousClass3R0) recyclerView.A0N;
            if (!(r4 == null || A002 == -1 || A002 == r4.A01.size() - 1)) {
                int i2 = A002 + 1;
                int itemViewType = r4.getItemViewType(A002);
                if (i2 > 0 && i2 < r4.A01.size() && r4.getItemViewType(i2) == 0) {
                    return 1;
                }
                if (itemViewType == 2) {
                    return 2;
                }
            }
        }
        return 0;
    }

    public void A01(Canvas canvas, AnonymousClass0Ri r13, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int A002 = A00(childAt, recyclerView);
            if (A002 != 0) {
                int bottom = childAt.getBottom() + AnonymousClass000.A0O(childAt).bottomMargin;
                int i3 = (A002 != 1 ? this.A00 : this.A02) + bottom;
                int paddingLeft = recyclerView.getPaddingLeft() + recyclerView.getResources().getDimensionPixelSize(R.dimen.dimen0652);
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                if (A002 == 2) {
                    Paint paint = this.A03;
                    paint.setColor(this.A01);
                    canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) i3, paint);
                }
            }
        }
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r5, RecyclerView recyclerView) {
        int A002 = A00(view, recyclerView);
        if (A002 != 0) {
            rect.bottom = A002 != 1 ? this.A00 : this.A02;
        }
    }
}
