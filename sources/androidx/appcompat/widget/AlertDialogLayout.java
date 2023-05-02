package androidx.appcompat.widget;

import X.C004601z;
import X.C05570Sc;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context, (AttributeSet) null);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int A00(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return A00(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingTop;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i4 - i2;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i9 = this.A06;
        int i10 = i9 & 112;
        int i11 = i9 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i10 != 16) {
            paddingTop = getPaddingTop();
            if (i10 == 80) {
                paddingTop = ((paddingTop + i5) - i3) - measuredHeight;
            }
        } else {
            paddingTop = getPaddingTop() + (((i5 - i3) - measuredHeight) >> 1);
        }
        Drawable drawable = this.A0A;
        int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int i13 = layoutParams.gravity;
                if (i13 < 0) {
                    i13 = i11;
                }
                int A00 = C05570Sc.A00(i13, C004601z.A06(this)) & 7;
                if (A00 == 1) {
                    i6 = ((paddingRight2 - measuredWidth) >> 1) + paddingLeft + layoutParams.leftMargin;
                    i7 = i6 - layoutParams.rightMargin;
                } else if (A00 != 5) {
                    i7 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i7 = i6 - layoutParams.rightMargin;
                }
                if (A05(i12)) {
                    paddingTop += intrinsicHeight;
                }
                int i14 = paddingTop + layoutParams.topMargin;
                childAt.layout(i7, i14, measuredWidth + i7, measuredHeight2 + i14);
                paddingTop = i14 + measuredHeight2 + layoutParams.bottomMargin;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        View view = null;
        int i10 = 0;
        View view2 = null;
        View view3 = null;
        int i11 = 0;
        while (true) {
            i4 = i2;
            i5 = i3;
            if (i11 < childCount) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = childAt;
                    } else if (id == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i11++;
            } else {
                int mode = View.MeasureSpec.getMode(i5);
                int size = View.MeasureSpec.getSize(i5);
                int mode2 = View.MeasureSpec.getMode(i4);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i4, 0);
                    paddingTop += view.getMeasuredHeight();
                    i6 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i6 = 0;
                }
                if (view2 != null) {
                    view2.measure(i4, 0);
                    i7 = A00(view2);
                    i8 = view2.getMeasuredHeight() - i7;
                    paddingTop += i7;
                    i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (view3 != null) {
                    if (mode != 0) {
                        i10 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i4, i10);
                    i9 = view3.getMeasuredHeight();
                    paddingTop += i9;
                    i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
                } else {
                    i9 = 0;
                }
                int i12 = size - paddingTop;
                if (view2 != null) {
                    int i13 = paddingTop - i7;
                    int min = Math.min(i12, i8);
                    if (min > 0) {
                        i12 -= min;
                        i7 += min;
                    }
                    view2.measure(i4, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                    paddingTop = i13 + view2.getMeasuredHeight();
                    i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
                }
                if (view3 != null && i12 > 0) {
                    view3.measure(i4, View.MeasureSpec.makeMeasureSpec(i9 + i12, mode));
                    paddingTop = (paddingTop - i9) + view3.getMeasuredHeight();
                    i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
                }
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt2 = getChildAt(i15);
                    if (childAt2.getVisibility() != 8) {
                        i14 = Math.max(i14, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i14 + getPaddingLeft() + getPaddingRight(), i4, i6), View.resolveSizeAndState(paddingTop, i5, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i16 = 0; i16 < childCount; i16++) {
                        View childAt3 = getChildAt(i16);
                        if (childAt3.getVisibility() != 8) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt3.getLayoutParams();
                            if (layoutParams.width == -1) {
                                int i17 = layoutParams.height;
                                layoutParams.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i5, 0);
                                layoutParams.height = i17;
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        super.onMeasure(i4, i5);
    }
}
