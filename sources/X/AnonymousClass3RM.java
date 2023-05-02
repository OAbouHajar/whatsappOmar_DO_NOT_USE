package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3RM  reason: invalid class name */
public final class AnonymousClass3RM extends AnonymousClass07D {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass3RM(int i2, int i3, int i4) {
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r8, RecyclerView recyclerView) {
        int i2;
        int length;
        super.A03(rect, view, r8, recyclerView);
        int A002 = RecyclerView.A00(view);
        boolean z2 = this.A00;
        int width = recyclerView.getWidth();
        if (z2) {
            int i3 = this.A01;
            length = AnonymousClass335.A01.length;
            i2 = (width - (i3 * length)) >> 1;
        } else {
            i2 = this.A02;
            length = AnonymousClass335.A01.length;
            int i4 = ((width - (i2 << 1)) - (this.A03 * length)) / ((length << 1) - 2);
            rect.left = i4;
            rect.right = i4;
        }
        if (A002 == 0) {
            rect.left = i2;
        } else if (A002 == length - 1) {
            rect.right = i2;
        }
    }
}
