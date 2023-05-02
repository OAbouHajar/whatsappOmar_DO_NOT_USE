package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3N2  reason: invalid class name */
public class AnonymousClass3N2 extends ViewGroup {
    public final /* synthetic */ C56702oM A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3N2(Context context, C56702oM r2) {
        super(context);
        this.A00 = r2;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        float f3 = (float) (i4 - i2);
        int i7 = i5 - i3;
        C56702oM r9 = this.A00;
        float f4 = f3 / ((float) r9.A03.A01);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            float f5 = ((float) i8) * f4;
            View childAt = getChildAt(i8);
            if (C13680ns.A1Z(r9.A02)) {
                i6 = (int) f5;
                f2 = f5 + f4;
            } else {
                f2 = f3 - f5;
                i6 = (int) (f2 - f4);
            }
            childAt.layout(i6, 0, (int) f2, i7);
        }
    }

    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        AnonymousClass3BH r7 = this.A00.A03;
        float f2 = (float) (size / r7.A01);
        for (int i4 = 0; i4 < childCount; i4++) {
            float f3 = ((float) i4) * f2;
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(((int) (f3 + f2)) - ((int) f3), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), r7.A05);
    }
}
