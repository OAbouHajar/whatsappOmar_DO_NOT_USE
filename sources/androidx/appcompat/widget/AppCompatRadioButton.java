package androidx.appcompat.widget;

import X.AnonymousClass015;
import X.AnonymousClass02B;
import X.AnonymousClass06L;
import X.AnonymousClass08O;
import X.AnonymousClass08P;
import X.AnonymousClass08Q;
import X.AnonymousClass08R;
import X.AnonymousClass08Y;
import X.AnonymousClass0RY;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.obwhatsapp.R;

public class AppCompatRadioButton extends RadioButton implements AnonymousClass015, AnonymousClass02B {
    public final AnonymousClass08Q A00;
    public final AnonymousClass0RY A01;
    public final AnonymousClass08R A02;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr040e);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i2) {
        super(AnonymousClass08O.A00(context), attributeSet, i2);
        AnonymousClass08P.A03(getContext(), this);
        AnonymousClass0RY r0 = new AnonymousClass0RY(this);
        this.A01 = r0;
        r0.A02(attributeSet, i2);
        AnonymousClass08Q r02 = new AnonymousClass08Q(this);
        this.A00 = r02;
        r02.A05(attributeSet, i2);
        AnonymousClass08R r03 = new AnonymousClass08R(this);
        this.A02 = r03;
        r03.A0A(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass08R r02 = this.A02;
        if (r02 != null) {
            r02.A02();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        AnonymousClass0RY r0 = this.A01;
        return r0 != null ? r0.A00(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A00;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A00;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportButtonTintList() {
        AnonymousClass0RY r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        AnonymousClass0RY r0 = this.A01;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A02(i2);
        }
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(AnonymousClass06L.A01(getContext(), i2));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        AnonymousClass0RY r1 = this.A01;
        if (r1 == null) {
            return;
        }
        if (r1.A04) {
            r1.A04 = false;
            return;
        }
        r1.A04 = true;
        r1.A01();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        AnonymousClass0RY r1 = this.A01;
        if (r1 != null) {
            r1.A00 = colorStateList;
            r1.A02 = true;
            r1.A01();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        AnonymousClass0RY r1 = this.A01;
        if (r1 != null) {
            r1.A01 = mode;
            r1.A03 = true;
            r1.A01();
        }
    }
}
