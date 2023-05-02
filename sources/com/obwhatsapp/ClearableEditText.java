package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass00X;
import X.AnonymousClass013;
import X.AnonymousClass3PF;
import X.C004601z;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;

public class ClearableEditText extends TextInputEditText implements TextWatcher, View.OnTouchListener, AnonymousClass006 {
    public Drawable A00;
    public View.OnClickListener A01;
    public AnonymousClass013 A02;
    public C52662eE A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;

    public ClearableEditText(Context context) {
        super(context, (AttributeSet) null);
        A02();
        this.A07 = true;
        this.A08 = new Rect();
        A03(context, (AttributeSet) null);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A07 = true;
        this.A08 = new Rect();
        A03(context, attributeSet);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A07 = true;
        this.A08 = new Rect();
        A03(context, attributeSet);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public static /* synthetic */ boolean A01(ClearableEditText clearableEditText, int i2, int i3) {
        Rect clearBounds = clearableEditText.getClearBounds();
        return i2 >= clearBounds.left && i2 <= clearBounds.right && i3 >= clearBounds.top && i3 <= clearBounds.bottom;
    }

    /* access modifiers changed from: private */
    public Rect getClearBounds() {
        Drawable clearIconDrawable = getClearIconDrawable();
        if (clearIconDrawable == null) {
            return new Rect();
        }
        int width = this.A02.A0T() ? 0 : (getWidth() - getPaddingRight()) - clearIconDrawable.getIntrinsicWidth();
        int paddingLeft = this.A02.A0T() ? getPaddingLeft() + clearIconDrawable.getIntrinsicWidth() : getWidth();
        int bottom = ((getBottom() - getTop()) >> 1) - (clearIconDrawable.getIntrinsicHeight() >> 1);
        int bottom2 = ((getBottom() - getTop()) >> 1) + (clearIconDrawable.getIntrinsicHeight() >> 1);
        Rect rect = this.A08;
        rect.left = width;
        rect.right = paddingLeft;
        rect.top = bottom;
        rect.bottom = bottom2;
        return rect;
    }

    public void A02() {
        if (!this.A06) {
            this.A06 = true;
            this.A02 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final void A03(Context context, AttributeSet attributeSet) {
        int i2 = R.drawable.ic_backup_cancel;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A07);
            this.A05 = obtainStyledAttributes.getBoolean(1, false);
            this.A07 = obtainStyledAttributes.getBoolean(3, true);
            this.A04 = obtainStyledAttributes.getBoolean(0, false);
            i2 = obtainStyledAttributes.getResourceId(2, R.drawable.ic_backup_cancel);
            obtainStyledAttributes.recycle();
        }
        this.A00 = AnonymousClass00X.A04((Resources.Theme) null, getResources(), i2);
        setOnTouchListener(this);
        addTextChangedListener(this);
        C004601z.A0j(this, new AnonymousClass3PF(this, this));
    }

    public final void A04(Editable editable) {
        if (this.A04 || (!TextUtils.isEmpty(editable) && isFocusable() && isEnabled())) {
            if (this.A00 != null) {
                boolean A0T = this.A02.A0T();
                Drawable drawable = this.A00;
                if (A0T) {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        } else if (getClearIconDrawable() != null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void afterTextChanged(Editable editable) {
        A04(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public Drawable getClearIconDrawable() {
        boolean A0T = this.A02.A0T();
        Drawable[] compoundDrawables = getCompoundDrawables();
        char c2 = 2;
        if (A0T) {
            c2 = 0;
        }
        return compoundDrawables[c2];
    }

    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        if (this.A05 && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            clearFocus();
        }
        return super.onKeyPreIme(i2, keyEvent);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getClearIconDrawable() == null) {
            return false;
        }
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (motionEvent.getAction() != 1) {
            return false;
        }
        Rect clearBounds = getClearBounds();
        if (x2 < clearBounds.left || x2 > clearBounds.right || y2 < clearBounds.top || y2 > clearBounds.bottom) {
            return false;
        }
        View.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        setText("");
        requestFocus();
        return this.A07;
    }

    public void setAlwaysShowClearIcon(boolean z2) {
        if (z2 != this.A04) {
            this.A04 = z2;
            invalidate();
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        A04(getText());
    }

    public void setOnClearIconClickedListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }
}
