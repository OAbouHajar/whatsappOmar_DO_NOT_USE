package androidx.cardview.widget;

import X.AnonymousClass000;
import X.C02580Dd;
import X.C04370Mh;
import X.C07160ai;
import X.C07170aj;
import X.C07180ak;
import X.C12310kB;
import X.C13420m0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class CardView extends FrameLayout {
    public static final C13420m0 A07;
    public static final int[] A08 = {16842801};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final Rect A04;
    public final Rect A05;
    public final C12310kB A06;

    static {
        C13420m0 r0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            r0 = new C07170aj();
            A07 = r0;
        } else if (i2 >= 17) {
            r0 = new C02580Dd();
            A07 = r0;
        } else {
            r0 = new C07180ak();
            A07 = r0;
        }
        r0.AIF();
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr00a1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ColorStateList valueOf;
        Context context2 = context;
        Rect A0J = AnonymousClass000.A0J();
        this.A04 = A0J;
        this.A05 = AnonymousClass000.A0J();
        C07160ai r8 = new C07160ai(this);
        this.A06 = r8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C04370Mh.A00, i2, R.style.style00f9);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A08);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(getResources().getColor(fArr[2] > 0.5f ? R.color.color00f8 : R.color.color00f7));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A02 = obtainStyledAttributes.getBoolean(7, false);
        this.A03 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        A0J.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        A0J.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        A0J.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        A0J.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        A07.AIK(context2, valueOf, r8, dimension, dimension2, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return A07.AA1(this.A06);
    }

    public float getCardElevation() {
        return A07.ABv(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A07.ADN(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A07.AFL(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    public void onMeasure(int i2, int i3) {
        C13420m0 r6 = A07;
        if (!(r6 instanceof C07170aj)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) r6.ADo(this.A06)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) r6.ADm(this.A06)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        A07.Ada(ColorStateList.valueOf(i2), this.A06);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A07.Ada(colorStateList, this.A06);
    }

    public void setCardElevation(float f2) {
        A07.Ads(this.A06, f2);
    }

    public void setMaxCardElevation(float f2) {
        A07.Ae8(this.A06, f2);
    }

    public void setMinimumHeight(int i2) {
        this.A00 = i2;
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        this.A01 = i2;
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.A03) {
            this.A03 = z2;
            A07.AVE(this.A06);
        }
    }

    public void setRadius(float f2) {
        A07.AeU(this.A06, f2);
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.A02 != z2) {
            this.A02 = z2;
            A07.AOp(this.A06);
        }
    }
}
