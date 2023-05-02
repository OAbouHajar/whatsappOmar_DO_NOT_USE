package X;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.089  reason: invalid class name */
public class AnonymousClass089 implements C016507v {
    public final Rect A00 = new Rect();
    public final /* synthetic */ ViewPager A01;

    public AnonymousClass089(ViewPager viewPager) {
        this.A01 = viewPager;
    }

    public AnonymousClass030 AMY(View view, AnonymousClass030 r10) {
        AnonymousClass030 A0K = C004601z.A0K(view, r10);
        if (A0K.A00.A09()) {
            return A0K;
        }
        Rect rect = this.A00;
        rect.left = A0K.A04();
        rect.top = A0K.A06();
        rect.right = A0K.A05();
        rect.bottom = A0K.A03();
        ViewPager viewPager = this.A01;
        int childCount = viewPager.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            AnonymousClass030 A0J = C004601z.A0J(viewPager.getChildAt(i2), A0K);
            rect.left = Math.min(A0J.A04(), rect.left);
            rect.top = Math.min(A0J.A06(), rect.top);
            rect.right = Math.min(A0J.A05(), rect.right);
            rect.bottom = Math.min(A0J.A03(), rect.bottom);
        }
        return A0K.A08(rect.left, rect.top, rect.right, rect.bottom);
    }
}
