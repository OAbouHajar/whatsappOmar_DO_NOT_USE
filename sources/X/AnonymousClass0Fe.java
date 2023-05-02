package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Fe  reason: invalid class name */
public class AnonymousClass0Fe extends AnonymousClass07D {
    public int A00;
    public Drawable A01;
    public boolean A02 = true;
    public final /* synthetic */ PreferenceFragmentCompat A03;

    public AnonymousClass0Fe(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A03 = preferenceFragmentCompat;
    }

    public void A02(Canvas canvas, AnonymousClass0Ri r9, RecyclerView recyclerView) {
        if (this.A01 != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (A04(childAt, recyclerView)) {
                    int y2 = ((int) childAt.getY()) + childAt.getHeight();
                    this.A01.setBounds(0, y2, width, this.A00 + y2);
                    this.A01.draw(canvas);
                }
            }
        }
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r4, RecyclerView recyclerView) {
        if (A04(view, recyclerView)) {
            rect.bottom = this.A00;
        }
    }

    public final boolean A04(View view, RecyclerView recyclerView) {
        C005602k A0F = recyclerView.A0F(view);
        if (!(A0F instanceof AnonymousClass0Fp) || !((AnonymousClass0Fp) A0F).A01) {
            return false;
        }
        boolean z2 = this.A02;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z2;
        }
        C005602k A0F2 = recyclerView.A0F(recyclerView.getChildAt(indexOfChild + 1));
        return (A0F2 instanceof AnonymousClass0Fp) && ((AnonymousClass0Fp) A0F2).A00;
    }
}
