package androidx.appcompat.widget;

import X.AnonymousClass014;
import X.AnonymousClass015;
import X.AnonymousClass02a;
import X.AnonymousClass04h;
import X.AnonymousClass08O;
import X.AnonymousClass08P;
import X.AnonymousClass08Q;
import X.AnonymousClass08R;
import X.AnonymousClass08X;
import X.AnonymousClass08Y;
import X.C004702b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.obwhatsapp.R;

public class AppCompatButton extends Button implements AnonymousClass015, AnonymousClass02a, C004702b {
    public final AnonymousClass08Q A00;
    public final AnonymousClass08R A01;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr0087);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i2) {
        super(AnonymousClass08O.A00(context), attributeSet, i2);
        AnonymousClass08P.A03(getContext(), this);
        AnonymousClass08Q r0 = new AnonymousClass08Q(this);
        this.A00 = r0;
        r0.A05(attributeSet, i2);
        AnonymousClass08R r02 = new AnonymousClass08R(this);
        this.A01 = r02;
        r02.A0A(attributeSet, i2);
        r02.A02();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass08R r02 = this.A01;
        if (r02 != null) {
            r02.A02();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeMinTextSize();
        }
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeStepGranularity();
        }
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AnonymousClass08R r0 = this.A01;
        return r0 != null ? r0.A0C.A07 : new int[0];
    }

    public int getAutoSizeTextType() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            return r0.A0C.A03;
        }
        return 0;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        AnonymousClass08Y r0 = this.A01.A08;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        AnonymousClass08Y r0 = this.A01.A08;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        AnonymousClass08R r1 = this.A01;
        if (r1 != null && !AnonymousClass02a.A00) {
            r1.A0C.A04();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        AnonymousClass08R r1 = this.A01;
        if (r1 != null && !AnonymousClass02a.A00) {
            AnonymousClass08X r12 = r1.A0C;
            if ((!(r12.A09 instanceof AnonymousClass014)) && r12.A03 != 0) {
                r12.A04();
            }
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (AnonymousClass02a.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            r0.A04(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (AnonymousClass02a.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            r0.A0B(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (AnonymousClass02a.A00) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            r0.A03(i2);
        }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass04h.A02(callback, this));
    }

    public void setSupportAllCaps(boolean z2) {
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            r0.A0B.setAllCaps(z2);
        }
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        AnonymousClass08R r0 = this.A01;
        r0.A07(colorStateList);
        r0.A02();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        AnonymousClass08R r0 = this.A01;
        r0.A08(mode);
        r0.A02();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            r0.A05(context, i2);
        }
    }

    public void setTextSize(int i2, float f2) {
        if (AnonymousClass02a.A00) {
            super.setTextSize(i2, f2);
            return;
        }
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            AnonymousClass08X r1 = r0.A0C;
            if (!(!(r1.A09 instanceof AnonymousClass014)) || r1.A03 == 0) {
                r1.A06(i2, f2);
            }
        }
    }
}
