package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxLAdapterShape0S0101000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.obwhatsapp.mentions.MentionPickerView;

/* renamed from: X.2VV  reason: invalid class name */
public abstract class AnonymousClass2VV extends AnonymousClass2VW {
    public int A00;
    public ValueAnimator A01;
    public View A02;
    public View A03;
    public AnonymousClass01V A04;
    public C14710pd A05;

    public AnonymousClass2VV(Context context) {
        super(context);
    }

    public AnonymousClass2VV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getActionBarSize() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16843499});
        try {
            return (int) obtainStyledAttributes.getDimension(0, 0.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void A02() {
        if (this.A02 != null) {
            MentionPickerView mentionPickerView = (MentionPickerView) this;
            ViewGroup.LayoutParams layoutParams = mentionPickerView.A00.getLayoutParams();
            layoutParams.width = this.A02.getWidth();
            mentionPickerView.A00.setLayoutParams(layoutParams);
        }
    }

    public void A03(int i2) {
        if (i2 != this.A00) {
            this.A00 = i2;
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z2 = false;
            if (getVisibility() == 0) {
                z2 = true;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{z2 ? getHeight() : 0, i2});
            this.A01 = ofInt;
            ofInt.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 12));
            this.A01.addListener(new IDxLAdapterShape0S0101000_2_I0(this, i2, 0));
            this.A01.setDuration(250);
            this.A01.start();
        }
    }

    public void A04(int i2, int i3) {
        int i4;
        if (i2 != 0) {
            if (this.A05.A0E(C16620tM.A02, 571)) {
                i4 = i3 * Math.min(2, i2);
            } else {
                int actionBarSize = getActionBarSize();
                Display defaultDisplay = AnonymousClass01V.A02(getContext()).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                int i5 = point.y;
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                View view = this.A03;
                if (view == null) {
                    view = (View) getParent().getParent();
                    this.A03 = view;
                }
                view.getLocationOnScreen(iArr2);
                double d2 = (double) i3;
                int min = Math.min((int) (((((double) i5) * 0.5d) - ((double) actionBarSize)) - ((double) ((int) (1.25d * d2)))), ((iArr[1] + getHeight()) - iArr2[1]) - ((int) (0.6d * d2))) / i3;
                i4 = i2 > min ? (min * i3) + ((int) (d2 * 0.5d)) : i3 * i2;
            }
            if (i4 != 0) {
                A03(i4);
                return;
            }
        }
        if (getVisibility() == 0) {
            A03(0);
        }
    }

    public double getAvailableScreenHeightPercentage() {
        return 0.5d;
    }

    public abstract View getContentView();

    public void onConfigurationChanged(Configuration configuration) {
        if (this.A02 != null && getVisibility() == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 12));
        }
    }

    public void setAnchorWidthView(View view) {
        this.A02 = view;
        A02();
    }

    public void setConstraintParentView(View view) {
        this.A03 = view;
    }
}
