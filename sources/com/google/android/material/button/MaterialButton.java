package com.google.android.material.button;

import X.AnonymousClass000;
import X.AnonymousClass04h;
import X.AnonymousClass08E;
import X.C004601z;
import X.C018208n;
import X.C13690nt;
import X.C61763Af;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatButton;
import com.obwhatsapp.R;

public class MaterialButton extends AppCompatButton {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public PorterDuff.Mode A05;
    public Drawable A06;
    public final C61763Af A07;

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr036e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            r4 = r18
            r15.<init>(r0, r1, r4)
            int[] r2 = X.C53362fa.A0B
            r5 = 2131952671(0x7f13041f, float:1.9541791E38)
            r8 = 0
            int[] r3 = new int[r8]
            android.content.res.TypedArray r7 = X.C53382fc.A00(r0, r1, r2, r3, r4, r5)
            r0 = 9
            int r0 = r7.getDimensionPixelSize(r0, r8)
            r15.A02 = r0
            r1 = 12
            r0 = -1
            int r1 = r7.getInt(r1, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r0 = X.C53412ff.A00(r0, r1)
            r15.A05 = r0
            android.content.Context r1 = r15.getContext()
            r0 = 11
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r1, r7, r0)
            r15.A04 = r0
            android.content.Context r1 = r15.getContext()
            r0 = 7
            android.graphics.drawable.Drawable r0 = X.C53402fe.A01(r1, r7, r0)
            r15.A06 = r0
            r0 = 8
            r10 = 1
            int r0 = r7.getInteger(r0, r10)
            r15.A00 = r0
            r0 = 10
            int r0 = r7.getDimensionPixelSize(r0, r8)
            r15.A03 = r0
            X.3Af r6 = new X.3Af
            r6.<init>(r15)
            r15.A07 = r6
            r3 = 0
            int r0 = r7.getDimensionPixelOffset(r8, r8)
            r6.A02 = r0
            int r0 = r7.getDimensionPixelOffset(r10, r8)
            r6.A03 = r0
            r0 = 2
            int r0 = r7.getDimensionPixelOffset(r0, r8)
            r6.A04 = r0
            r0 = 3
            int r0 = r7.getDimensionPixelOffset(r0, r8)
            r6.A01 = r0
            r0 = 6
            int r0 = r7.getDimensionPixelSize(r0, r8)
            r6.A00 = r0
            r0 = 15
            int r0 = r7.getDimensionPixelSize(r0, r8)
            r6.A05 = r0
            r1 = 5
            r0 = -1
            int r1 = r7.getInt(r1, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r0 = X.C53412ff.A00(r0, r1)
            r6.A09 = r0
            com.google.android.material.button.MaterialButton r5 = r6.A0L
            android.content.Context r1 = r5.getContext()
            r0 = 4
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r1, r7, r0)
            r6.A06 = r0
            android.content.Context r1 = r5.getContext()
            r0 = 14
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r1, r7, r0)
            r6.A08 = r0
            android.content.Context r1 = r5.getContext()
            r0 = 13
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r1, r7, r0)
            r6.A07 = r0
            android.graphics.Paint r2 = r6.A0I
            X.C13690nt.A0y(r2)
            int r0 = r6.A05
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            android.content.res.ColorStateList r1 = r6.A08
            if (r1 == 0) goto L_0x00cf
            int[] r0 = r5.getDrawableState()
            int r3 = r1.getColorForState(r0, r8)
        L_0x00cf:
            r2.setColor(r3)
            int r4 = X.C004601z.A08(r5)
            int r3 = r5.getPaddingTop()
            int r2 = X.C004601z.A07(r5)
            int r1 = r5.getPaddingBottom()
            boolean r0 = X.C61763Af.A0M
            if (r0 == 0) goto L_0x0108
            android.graphics.drawable.Drawable r9 = r6.A00()
        L_0x00ea:
            super.setBackgroundDrawable(r9)
            int r0 = r6.A02
            int r4 = r4 + r0
            int r0 = r6.A04
            int r3 = r3 + r0
            int r0 = r6.A03
            int r2 = r2 + r0
            int r0 = r6.A01
            int r1 = r1 + r0
            X.C004601z.A0h(r5, r4, r3, r2, r1)
            r7.recycle()
            int r0 = r15.A02
            r15.setCompoundDrawablePadding(r0)
            r15.A00()
            return
        L_0x0108:
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            r6.A0D = r9
            int r0 = r6.A00
            float r0 = (float) r0
            r12 = 925353388(0x3727c5ac, float:1.0E-5)
            float r0 = r0 + r12
            r9.setCornerRadius(r0)
            android.graphics.drawable.GradientDrawable r0 = r6.A0D
            r11 = -1
            r0.setColor(r11)
            android.graphics.drawable.GradientDrawable r0 = r6.A0D
            android.graphics.drawable.Drawable r9 = X.C018208n.A03(r0)
            r6.A0A = r9
            android.content.res.ColorStateList r0 = r6.A06
            X.C018208n.A04(r0, r9)
            android.graphics.PorterDuff$Mode r9 = r6.A09
            if (r9 == 0) goto L_0x0135
            android.graphics.drawable.Drawable r0 = r6.A0A
            X.C018208n.A07(r9, r0)
        L_0x0135:
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            r6.A0F = r9
            int r0 = r6.A00
            float r0 = (float) r0
            float r0 = r0 + r12
            r9.setCornerRadius(r0)
            android.graphics.drawable.GradientDrawable r0 = r6.A0F
            r0.setColor(r11)
            android.graphics.drawable.GradientDrawable r0 = r6.A0F
            android.graphics.drawable.Drawable r9 = X.C018208n.A03(r0)
            r6.A0B = r9
            android.content.res.ColorStateList r0 = r6.A07
            X.C018208n.A04(r0, r9)
            r0 = 2
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r0]
            android.graphics.drawable.Drawable r0 = r6.A0A
            r9[r8] = r0
            android.graphics.drawable.Drawable r0 = r6.A0B
            r9[r10] = r0
            android.graphics.drawable.LayerDrawable r10 = new android.graphics.drawable.LayerDrawable
            r10.<init>(r9)
            int r11 = r6.A02
            int r12 = r6.A04
            int r13 = r6.A03
            int r14 = r6.A01
            android.graphics.drawable.InsetDrawable r9 = new android.graphics.drawable.InsetDrawable
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x00ea
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void A00() {
        Drawable drawable = this.A06;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A06 = mutate;
            C018208n.A04(this.A04, mutate);
            PorterDuff.Mode mode = this.A05;
            if (mode != null) {
                C018208n.A07(mode, this.A06);
            }
            int i2 = this.A03;
            if (i2 == 0) {
                i2 = this.A06.getIntrinsicWidth();
            }
            int i3 = this.A03;
            if (i3 == 0) {
                i3 = this.A06.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A06;
            int i4 = this.A01;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        AnonymousClass04h.A05(this.A06, (Drawable) null, (Drawable) null, (Drawable) null, this);
    }

    public final boolean A01() {
        C61763Af r0 = this.A07;
        return r0 != null && !r0.A0H;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (A01()) {
            return this.A07.A00;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.A06;
    }

    public int getIconGravity() {
        return this.A00;
    }

    public int getIconPadding() {
        return this.A02;
    }

    public int getIconSize() {
        return this.A03;
    }

    public ColorStateList getIconTint() {
        return this.A04;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A05;
    }

    public ColorStateList getRippleColor() {
        if (A01()) {
            return this.A07.A07;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (A01()) {
            return this.A07.A08;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (A01()) {
            return this.A07.A05;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return A01() ? this.A07.A06 : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return A01() ? this.A07.A09 : super.getSupportBackgroundTintMode();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && A01()) {
            C61763Af r4 = this.A07;
            if (canvas != null && r4.A08 != null && r4.A05 > 0) {
                Rect rect = r4.A0J;
                rect.set(r4.A0L.getBackground().getBounds());
                RectF rectF = r4.A0K;
                float f2 = (float) rect.left;
                float f3 = ((float) r4.A05) / 2.0f;
                rectF.set(f2 + f3 + ((float) r4.A02), ((float) rect.top) + f3 + ((float) r4.A04), (((float) rect.right) - f3) - ((float) r4.A03), (((float) rect.bottom) - f3) - ((float) r4.A01));
                float f4 = ((float) r4.A00) - (((float) r4.A05) / 2.0f);
                canvas.drawRoundRect(rectF, f4, f4, r4.A0I);
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        C61763Af r4;
        super.onLayout(z2, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (r4 = this.A07) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            GradientDrawable gradientDrawable = r4.A0E;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(r4.A02, r4.A04, i7 - r4.A03, i6 - r4.A01);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A06 != null && this.A00 == 2) {
            int measureText = (int) getPaint().measureText(C13690nt.A0b(this));
            int i4 = this.A03;
            if (i4 == 0) {
                i4 = this.A06.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - C004601z.A07(this)) - i4) - this.A02) - C004601z.A08(this)) / 2;
            if (C004601z.A06(this) == 1) {
                measuredWidth = -measuredWidth;
            }
            if (this.A01 != measuredWidth) {
                this.A01 = measuredWidth;
                A00();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (A01()) {
            C61763Af r1 = this.A07;
            GradientDrawable gradientDrawable = C61763Af.A0M ? r1.A0C : r1.A0D;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (A01()) {
            if (drawable != getBackground()) {
                Log.i("MaterialButton", "Setting a custom background is not supported.");
                C61763Af r2 = this.A07;
                r2.A0H = true;
                MaterialButton materialButton = r2.A0L;
                materialButton.setSupportBackgroundTintList(r2.A06);
                materialButton.setSupportBackgroundTintMode(r2.A09);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? AnonymousClass08E.A01(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i2) {
        if (A01()) {
            this.A07.A02(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (A01()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A06 != drawable) {
            this.A06 = drawable;
            A00();
        }
    }

    public void setIconGravity(int i2) {
        this.A00 = i2;
    }

    public void setIconPadding(int i2) {
        if (this.A02 != i2) {
            this.A02 = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? AnonymousClass08E.A01(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw AnonymousClass000.A0T("iconSize cannot be less than 0");
        } else if (this.A03 != i2) {
            this.A03 = i2;
            A00();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A04 != colorStateList) {
            this.A04 = colorStateList;
            A00();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A05 != mode) {
            this.A05 = mode;
            A00();
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(AnonymousClass08E.A00(getContext(), i2));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (A01()) {
            this.A07.A03(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (A01()) {
            setRippleColor(AnonymousClass08E.A00(getContext(), i2));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (A01()) {
            C61763Af r3 = this.A07;
            if (r3.A08 != colorStateList) {
                r3.A08 = colorStateList;
                Paint paint = r3.A0I;
                int i2 = 0;
                if (colorStateList != null) {
                    i2 = colorStateList.getColorForState(r3.A0L.getDrawableState(), 0);
                }
                paint.setColor(i2);
                if (!C61763Af.A0M) {
                    r3.A0L.invalidate();
                } else if (r3.A0G != null) {
                    super.setBackgroundDrawable(r3.A00());
                }
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (A01()) {
            setStrokeColor(AnonymousClass08E.A00(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (A01()) {
            C61763Af r2 = this.A07;
            if (r2.A05 != i2) {
                r2.A05 = i2;
                r2.A0I.setStrokeWidth((float) i2);
                if (!C61763Af.A0M) {
                    r2.A0L.invalidate();
                } else if (r2.A0G != null) {
                    super.setBackgroundDrawable(r2.A00());
                }
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (A01()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        boolean A012 = A01();
        C61763Af r1 = this.A07;
        if (A012) {
            if (r1.A06 != colorStateList) {
                r1.A06 = colorStateList;
                if (C61763Af.A0M) {
                    r1.A01();
                    return;
                }
                Drawable drawable = r1.A0A;
                if (drawable != null) {
                    C018208n.A04(colorStateList, drawable);
                }
            }
        } else if (r1 != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        boolean A012 = A01();
        C61763Af r1 = this.A07;
        if (A012) {
            if (r1.A09 != mode) {
                r1.A09 = mode;
                if (C61763Af.A0M) {
                    r1.A01();
                    return;
                }
                Drawable drawable = r1.A0A;
                if (drawable != null && mode != null) {
                    C018208n.A07(mode, drawable);
                }
            }
        } else if (r1 != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}
