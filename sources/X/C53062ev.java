package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.2ev  reason: invalid class name and case insensitive filesystem */
public class C53062ev extends LinearLayout implements ViewGroup.OnHierarchyChangeListener, AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public int[] A02;

    public C53062ev(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = new int[4];
        setOnHierarchyChangeListener(this);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onChildViewAdded(View view, View view2) {
        int childCount = getChildCount();
        if (this.A02.length < childCount) {
            this.A02 = new int[childCount];
        }
    }

    public void onChildViewRemoved(View view, View view2) {
    }

    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        int i4 = 1;
        if (childCount > 1 && size > 0) {
            View childAt = getChildAt(0);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), i3);
            int size2 = View.MeasureSpec.getSize(i2) - childAt.getMeasuredWidth();
            int i5 = 1;
            boolean z2 = false;
            int i6 = 0;
            do {
                View childAt2 = getChildAt(i5);
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, 0), i3);
                this.A02[i5] = childAt2.getMeasuredWidth();
                i6 += this.A02[i5];
                if (((float) childAt2.getMeasuredWidth()) > ((float) size2) / ((float) (childCount - 1))) {
                    z2 = true;
                }
                i5++;
            } while (i5 < childCount);
            if (z2) {
                do {
                    getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec((this.A02[i4] * size2) / i6, 1073741824), i3);
                    i4++;
                } while (i4 < childCount);
                setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
                return;
            }
        }
        super.onMeasure(i2, i3);
    }
}
