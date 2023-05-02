package androidx.constraintlayout.widget;

import X.AnonymousClass06X;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        AnonymousClass06X r0 = (AnonymousClass06X) getLayoutParams();
        r0.A0Q = i2;
        setLayoutParams(r0);
    }

    public void setGuidelineEnd(int i2) {
        AnonymousClass06X r0 = (AnonymousClass06X) getLayoutParams();
        r0.A0R = i2;
        setLayoutParams(r0);
    }

    public void setGuidelinePercent(float f2) {
        AnonymousClass06X r0 = (AnonymousClass06X) getLayoutParams();
        r0.A01 = f2;
        setLayoutParams(r0);
    }

    public void setVisibility(int i2) {
    }
}
