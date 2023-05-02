package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.3ON  reason: invalid class name */
public abstract class AnonymousClass3ON extends LinearLayout {
    public boolean A00;

    public AnonymousClass3ON(Context context) {
        super(context);
    }

    public AnonymousClass3ON(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass3ON(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public abstract View getPrimaryNameView();

    public abstract View getSecondaryNameView();

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        View childAt = getChildAt(0);
        View secondaryNameView = getSecondaryNameView();
        if (childAt == null || secondaryNameView == null) {
            AnonymousClass00B.A08("ConversationRowParticipantHeaderBaseView should have both primary and secondary name views.");
        } else if (!this.A00) {
        } else {
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int paddingLeft = getPaddingLeft() + getPaddingRight();
                int paddingTop = measuredHeight - (getPaddingTop() + getPaddingBottom());
                secondaryNameView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE));
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max((measuredWidth - secondaryNameView.getMeasuredWidth()) - paddingLeft, 0), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE));
            }
        }
    }

    public abstract void setShouldTruncateNameViewWhenNeeded(boolean z2);
}
