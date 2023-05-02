package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2rO  reason: invalid class name and case insensitive filesystem */
public abstract class C57572rO extends AnonymousClass07D {
    public final Rect A00 = AnonymousClass000.A0J();
    public final Drawable A01;

    public C57572rO(Drawable drawable) {
        this.A01 = drawable;
    }

    public void A01(Canvas canvas, AnonymousClass0Ri r11, RecyclerView recyclerView) {
        int width;
        int i2;
        canvas.save();
        int i3 = 0;
        if (recyclerView.A0d) {
            i2 = recyclerView.getPaddingLeft();
            width = C13690nt.A04(recyclerView);
            canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        while (i3 < childCount) {
            View childAt = recyclerView.getChildAt(i3);
            if (A04(recyclerView.A0N.getItemViewType(RecyclerView.A00(childAt)), recyclerView.A0N.getItemViewType(RecyclerView.A00(i3 == childCount + -1 ? null : recyclerView.getChildAt(i3 + 1))))) {
                Rect rect = this.A00;
                RecyclerView.A03(childAt, rect);
                int round = rect.bottom + Math.round(childAt.getTranslationY());
                Drawable drawable = this.A01;
                drawable.setBounds(i2, round - drawable.getIntrinsicHeight(), width, round);
                drawable.draw(canvas);
            }
            i3++;
        }
        canvas.restore();
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r7, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        if (A04(recyclerView.A0N.getItemViewType(A002), recyclerView.A0N.getItemViewType(A002 + 1))) {
            rect.set(0, 0, 0, this.A01.getIntrinsicHeight());
        } else {
            rect.setEmpty();
        }
    }

    public abstract boolean A04(int i2, int i3);
}
