package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Fg  reason: invalid class name */
public class AnonymousClass0Fg extends AnonymousClass07D {
    public static final int[] A02 = {16843284};
    public Drawable A00;
    public final Rect A01 = AnonymousClass000.A0J();

    public AnonymousClass0Fg(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A02);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.A00 = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }

    public void A01(Canvas canvas, AnonymousClass0Ri r9, RecyclerView recyclerView) {
        int width;
        int i2;
        if (recyclerView.getLayoutManager() != null && this.A00 != null) {
            canvas.save();
            if (recyclerView.A0d) {
                i2 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                Rect rect = this.A01;
                RecyclerView.A03(childAt, rect);
                int round = rect.bottom + Math.round(childAt.getTranslationY());
                this.A00.setBounds(i2, round - this.A00.getIntrinsicHeight(), width, round);
                this.A00.draw(canvas);
            }
            canvas.restore();
        }
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r5, RecyclerView recyclerView) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        }
    }
}
