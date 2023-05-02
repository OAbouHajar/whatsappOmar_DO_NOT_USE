package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.0C9  reason: invalid class name */
public class AnonymousClass0C9 extends FrameLayout {
    public ViewGroup A00;
    public AnonymousClass0CE A01;
    public final C03880Kf A02;

    public AnonymousClass0C9(Context context, C03880Kf r5) {
        super(context);
        this.A02 = r5;
        Context context2 = getContext();
        this.A00 = new FrameLayout(context2);
        AnonymousClass0CE r1 = new AnonymousClass0CE(context2);
        this.A01 = r1;
        r1.setImportantForAccessibility(1);
        addView(this.A01);
        addView(this.A00);
    }

    public AnonymousClass0CE getContentPager() {
        return this.A01;
    }

    public ViewGroup getHeaderContainer() {
        return this.A00;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.A01.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredWidth()), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), Integer.MIN_VALUE);
        ViewGroup viewGroup = this.A00;
        viewGroup.measure(makeMeasureSpec, makeMeasureSpec2);
        viewGroup.layout(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        int size = View.MeasureSpec.getSize(i3);
        if (this.A02 == C03880Kf.FLEXIBLE_SHEET) {
            i4 = Integer.MIN_VALUE;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, i4);
        AnonymousClass0CE r0 = this.A01;
        r0.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(r0.getMeasuredWidth(), r0.getMeasuredHeight());
    }
}
