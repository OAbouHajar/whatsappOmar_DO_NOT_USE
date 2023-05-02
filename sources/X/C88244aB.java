package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4aB  reason: invalid class name and case insensitive filesystem */
public class C88244aB {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ AnonymousClass3T3 A04;

    public C88244aB(AnonymousClass3T3 r1) {
        this.A04 = r1;
    }

    public static final int A00(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int i2 = layoutParams.width;
        int i3 = 1073741824;
        int i4 = 0;
        if (i2 > 0) {
            i4 = 1073741824;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i4);
        int i5 = layoutParams.height;
        if (i5 <= 0) {
            i3 = 0;
        }
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5, i3));
        return view.getMeasuredHeight();
    }
}
