package androidx.constraintlayout.widget;

import X.AnonymousClass06X;
import X.AnonymousClass0SN;
import X.C012306a;
import android.content.Context;
import android.util.AttributeSet;

public class Group extends C012306a {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A04(AttributeSet attributeSet) {
        super.A04(attributeSet);
    }

    public void A07(ConstraintLayout constraintLayout) {
        AnonymousClass0SN r1 = ((AnonymousClass06X) getLayoutParams()).A0r;
        r1.A0A(0);
        r1.A09(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A01();
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        A01();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        A01();
    }
}
