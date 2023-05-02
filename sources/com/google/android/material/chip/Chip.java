package com.google.android.material.chip;

import X.AnonymousClass02E;
import X.AnonymousClass08E;
import X.AnonymousClass0EL;
import X.AnonymousClass2UK;
import X.C004601z;
import X.C017508g;
import X.C018208n;
import X.C019108x;
import X.C019208y;
import X.C53422fg;
import X.C53732gB;
import X.C56352nV;
import X.C57092q7;
import X.C615239g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Chip extends AppCompatCheckBox implements AnonymousClass2UK {
    public static final Rect A0D = new Rect();
    public static final int[] A0E = {16842913};
    public int A00;
    public RippleDrawable A01;
    public View.OnClickListener A02;
    public CompoundButton.OnCheckedChangeListener A03;
    public C56352nV A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Rect A09;
    public final RectF A0A;
    public final C017508g A0B;
    public final C57092q7 A0C;

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr00cc);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r9 = r16
            r12 = r17
            r14.<init>(r15, r9, r12)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r14.A00 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r14.A09 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r14.A0A = r0
            X.3P0 r0 = new X.3P0
            r0.<init>(r14)
            r14.A0B = r0
            if (r16 == 0) goto L_0x0082
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = "background"
            java.lang.String r0 = r9.getAttributeValue(r2, r0)
            if (r0 != 0) goto L_0x0301
            java.lang.String r0 = "drawableLeft"
            java.lang.String r0 = r9.getAttributeValue(r2, r0)
            if (r0 != 0) goto L_0x02f9
            java.lang.String r0 = "drawableStart"
            java.lang.String r0 = r9.getAttributeValue(r2, r0)
            if (r0 != 0) goto L_0x02f1
            java.lang.String r0 = "drawableEnd"
            java.lang.String r0 = r9.getAttributeValue(r2, r0)
            java.lang.String r1 = "Please set end drawable using R.attr#closeIcon."
            if (r0 != 0) goto L_0x02eb
            java.lang.String r0 = "drawableRight"
            java.lang.String r0 = r9.getAttributeValue(r2, r0)
            if (r0 != 0) goto L_0x02e5
            java.lang.String r0 = "singleLine"
            r1 = 1
            boolean r0 = r9.getAttributeBooleanValue(r2, r0, r1)
            if (r0 == 0) goto L_0x02dd
            java.lang.String r0 = "lines"
            int r0 = r9.getAttributeIntValue(r2, r0, r1)
            if (r0 != r1) goto L_0x02dd
            java.lang.String r0 = "minLines"
            int r0 = r9.getAttributeIntValue(r2, r0, r1)
            if (r0 != r1) goto L_0x02dd
            java.lang.String r0 = "maxLines"
            int r0 = r9.getAttributeIntValue(r2, r0, r1)
            if (r0 != r1) goto L_0x02dd
            java.lang.String r0 = "gravity"
            r1 = 8388627(0x800013, float:1.175497E-38)
            int r0 = r9.getAttributeIntValue(r2, r0, r1)
            if (r0 == r1) goto L_0x0082
            java.lang.String r1 = "Chip"
            java.lang.String r0 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r1, r0)
        L_0x0082:
            X.2nV r2 = new X.2nV
            r2.<init>(r15)
            r13 = 2131952682(0x7f13042a, float:1.9541814E38)
            android.content.Context r8 = r2.A0p
            int[] r10 = X.C53362fa.A03
            r1 = 0
            int[] r11 = new int[r1]
            android.content.res.TypedArray r3 = X.C53382fc.A00(r8, r9, r10, r11, r12, r13)
            r0 = 8
            android.content.res.ColorStateList r4 = X.C53402fe.A00(r8, r3, r0)
            android.content.res.ColorStateList r0 = r2.A0L
            if (r0 == r4) goto L_0x00a8
            r2.A0L = r4
            int[] r0 = r2.getState()
            r2.onStateChange(r0)
        L_0x00a8:
            r0 = 16
            r4 = 0
            float r5 = r3.getDimension(r0, r4)
            float r0 = r2.A03
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            r2.A03 = r5
            r2.invalidateSelf()
            r2.A03()
        L_0x00bd:
            r0 = 9
            float r5 = r3.getDimension(r0, r4)
            float r0 = r2.A00
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            r2.A00 = r5
            r2.invalidateSelf()
        L_0x00ce:
            r0 = 18
            android.content.res.ColorStateList r5 = X.C53402fe.A00(r8, r3, r0)
            android.content.res.ColorStateList r0 = r2.A0N
            if (r0 == r5) goto L_0x00e1
            r2.A0N = r5
            int[] r0 = r2.getState()
            r2.onStateChange(r0)
        L_0x00e1:
            r0 = 19
            float r5 = r3.getDimension(r0, r4)
            float r0 = r2.A05
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00f7
            r2.A05 = r5
            android.graphics.Paint r0 = r2.A0r
            r0.setStrokeWidth(r5)
            r2.invalidateSelf()
        L_0x00f7:
            r0 = 30
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r8, r3, r0)
            r2.A0C(r0)
            r0 = 3
            java.lang.CharSequence r7 = r3.getText(r0)
            if (r7 != 0) goto L_0x0109
            java.lang.String r7 = ""
        L_0x0109:
            java.lang.CharSequence r0 = r2.A0d
            if (r0 == r7) goto L_0x0124
            r2.A0d = r7
            X.02E r6 = X.AnonymousClass02E.A02()
            X.02F r0 = r6.A00
            r5 = 1
            java.lang.CharSequence r0 = r6.A03(r0, r7)
            r2.A0e = r0
            r2.A0m = r5
            r2.invalidateSelf()
            r2.A03()
        L_0x0124:
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x02da
            int r5 = r3.getResourceId(r1, r1)
            if (r5 == 0) goto L_0x02da
            X.39g r0 = new X.39g
            r0.<init>(r8, r5)
        L_0x0135:
            r2.A0I(r0)
            r0 = 1
            int r5 = r3.getInt(r0, r1)
            if (r5 == r0) goto L_0x02d6
            r0 = 2
            if (r5 == r0) goto L_0x02d2
            r0 = 3
            if (r5 != r0) goto L_0x0149
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x0147:
            r2.A0Y = r0
        L_0x0149:
            r0 = 15
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0L(r0)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r16 == 0) goto L_0x016f
            java.lang.String r0 = "chipIconEnabled"
            java.lang.String r0 = r9.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = "chipIconVisible"
            java.lang.String r0 = r9.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x016f
            r0 = 12
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0L(r0)
        L_0x016f:
            r0 = 11
            android.graphics.drawable.Drawable r0 = X.C53402fe.A01(r8, r3, r0)
            r2.A0F(r0)
            r0 = 14
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r8, r3, r0)
            r2.A0A(r0)
            r0 = 13
            float r0 = r3.getDimension(r0, r4)
            r2.A04(r0)
            r0 = 26
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0M(r0)
            if (r16 == 0) goto L_0x01ae
            java.lang.String r0 = "closeIconEnabled"
            java.lang.String r0 = r9.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = "closeIconVisible"
            java.lang.String r0 = r9.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x01ae
            r0 = 21
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0M(r0)
        L_0x01ae:
            r0 = 20
            android.graphics.drawable.Drawable r0 = X.C53402fe.A01(r8, r3, r0)
            r2.A0G(r0)
            r0 = 25
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r8, r3, r0)
            r2.A0B(r0)
            r0 = 23
            float r0 = r3.getDimension(r0, r4)
            r2.A06(r0)
            r0 = 4
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0J(r0)
            r0 = 7
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0K(r0)
            if (r16 == 0) goto L_0x01f3
            java.lang.String r0 = "checkedIconEnabled"
            java.lang.String r0 = r9.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x01f3
            java.lang.String r0 = "checkedIconVisible"
            java.lang.String r0 = r9.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x01f3
            r0 = 6
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0K(r0)
        L_0x01f3:
            r0 = 5
            android.graphics.drawable.Drawable r0 = X.C53402fe.A01(r8, r3, r0)
            r2.A0E(r0)
            r0 = 31
            X.2fg r0 = X.C53422fg.A01(r8, r3, r0)
            r2.A0a = r0
            r0 = 27
            X.2fg r0 = X.C53422fg.A01(r8, r3, r0)
            r2.A0Z = r0
            r0 = 17
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x021f
            r2.A04 = r1
            r2.invalidateSelf()
            r2.A03()
        L_0x021f:
            r0 = 29
            float r0 = r3.getDimension(r0, r4)
            r2.A09(r0)
            r0 = 28
            float r0 = r3.getDimension(r0, r4)
            r2.A08(r0)
            r0 = 33
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A0C
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0245
            r2.A0C = r1
            r2.invalidateSelf()
            r2.A03()
        L_0x0245:
            r0 = 32
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A0B
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0259
            r2.A0B = r1
            r2.invalidateSelf()
            r2.A03()
        L_0x0259:
            r0 = 24
            float r0 = r3.getDimension(r0, r4)
            r2.A07(r0)
            r0 = 22
            float r0 = r3.getDimension(r0, r4)
            r2.A05(r0)
            r0 = 10
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x027f
            r2.A01 = r1
            r2.invalidateSelf()
            r2.A03()
        L_0x027f:
            r1 = 2
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r3.getDimensionPixelSize(r1, r0)
            r2.A0K = r0
            r3.recycle()
            r14.setChipDrawable(r2)
            X.2q7 r0 = new X.2q7
            r0.<init>(r14, r14)
            r14.A0C = r0
            X.C004601z.A0j(r14, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x02a7
            X.3N5 r0 = new X.3N5
            r0.<init>(r14)
            r14.setOutlineProvider(r0)
        L_0x02a7:
            boolean r0 = r14.A08
            r14.setChecked(r0)
            r1 = 0
            r2.A0l = r1
            java.lang.CharSequence r0 = r2.A0d
            r14.setText(r0)
            android.text.TextUtils$TruncateAt r0 = r2.A0Y
            r14.setEllipsize(r0)
            r14.setIncludeFontPadding(r1)
            X.39g r0 = r14.getTextAppearance()
            if (r0 == 0) goto L_0x02c5
            r14.A03(r0)
        L_0x02c5:
            r14.setSingleLine()
            r0 = 8388627(0x800013, float:1.175497E-38)
            r14.setGravity(r0)
            r14.A02()
            return
        L_0x02d2:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0147
        L_0x02d6:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x0147
        L_0x02da:
            r0 = 0
            goto L_0x0135
        L_0x02dd:
            java.lang.String r1 = "Chip does not support multi-line text"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x02e5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x02eb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x02f1:
            java.lang.String r1 = "Please set start drawable using R.attr#chipIcon."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x02f9:
            java.lang.String r1 = "Please set left drawable using R.attr#chipIcon."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0301:
            java.lang.String r1 = "Do not set the background; Chip manages its own background drawable."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.A0A;
        rectF.setEmpty();
        C56352nV r4 = this.A04;
        if (!(r4 == null || r4.A02() == null)) {
            Rect bounds = r4.getBounds();
            rectF.setEmpty();
            if (r4.A0P()) {
                float f2 = r4.A01 + r4.A06 + r4.A07 + r4.A08 + r4.A0B;
                if (C018208n.A01(r4) == 0) {
                    float f3 = (float) bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = (float) bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.A09;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private C615239g getTextAppearance() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0b;
        }
        return null;
    }

    private void setCloseIconFocused(boolean z2) {
        if (this.A05 != z2) {
            this.A05 = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.A06 != z2) {
            this.A06 = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.A07 != z2) {
            this.A07 = z2;
            refreshDrawableState();
        }
    }

    private void setFocusedVirtualView(int i2) {
        int i3 = this.A00;
        if (i3 != i2) {
            if (i3 == 0) {
                setCloseIconFocused(false);
            }
            this.A00 = i2;
            if (i2 == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    public final void A02() {
        C56352nV r2;
        Drawable drawable;
        if (!TextUtils.isEmpty(getText()) && (r2 = this.A04) != null) {
            float f2 = r2.A04 + r2.A01 + r2.A0C + r2.A0B;
            if ((r2.A0i && (drawable = r2.A0W) != null && (!(drawable instanceof C019208y) || ((C019108x) ((C019208y) drawable)).A02 != null)) || (r2.A0V != null && r2.A0h && isChecked())) {
                C56352nV r22 = this.A04;
                f2 += r22.A0A + r22.A09 + r22.A02;
            }
            C56352nV r23 = this.A04;
            if (r23.A0j && r23.A02() != null) {
                f2 += r23.A08 + r23.A06 + r23.A07;
            }
            if (((float) C004601z.A07(this)) != f2) {
                C004601z.A0h(this, C004601z.A08(this), getPaddingTop(), (int) f2, getPaddingBottom());
            }
        }
    }

    public final void A03(C615239g r4) {
        TextPaint paint = getPaint();
        paint.drawableState = this.A04.getState();
        r4.A01(getContext(), paint, this.A0B);
    }

    public void AOS() {
        A02();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Class<AnonymousClass0EL> cls = AnonymousClass0EL.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("mHoveredVirtualViewId");
                declaredField.setAccessible(true);
                C57092q7 r4 = this.A0C;
                if (((Number) declaredField.get(r4)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("updateHoveredVirtualView", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(r4, new Object[]{Integer.MIN_VALUE});
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            }
        }
        return this.A0C.A0K(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A0C.A0J(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        C56352nV r0 = this.A04;
        if (r0 != null && (drawable = r0.A0X) != null && drawable.isStateful()) {
            C56352nV r2 = this.A04;
            int isEnabled = isEnabled();
            if (this.A05) {
                isEnabled++;
            }
            if (this.A06) {
                isEnabled++;
            }
            if (this.A07) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            int i2 = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.A05) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.A06) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.A07) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(r2.A0o, iArr)) {
                r2.A0o = iArr;
                if (r2.A0P() && r2.A0Q(r2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    public Drawable getCheckedIcon() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0L;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A00;
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.A04;
    }

    public float getChipEndPadding() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A01;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C56352nV r0 = this.A04;
        if (r0 == null || (drawable = r0.A0W) == null) {
            return null;
        }
        return drawable instanceof C019208y ? ((C019108x) ((C019208y) drawable)).A02 : drawable;
    }

    public float getChipIconSize() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A02;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0M;
        }
        return null;
    }

    public float getChipMinHeight() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A03;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A04;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0N;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A05;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A02();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0c;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A06;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A07;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A08;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0O;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0Y;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.A00 == 0) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C53422fg getHideMotionSpec() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A09;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0A;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0Q;
        }
        return null;
    }

    public C53422fg getShowMotionSpec() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0a;
        }
        return null;
    }

    public CharSequence getText() {
        C56352nV r0 = this.A04;
        return r0 != null ? r0.A0d : "";
    }

    public float getTextEndPadding() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0B;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            return r0.A0C;
        }
        return 0.0f;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        C56352nV r0;
        if (TextUtils.isEmpty(getText()) || (r0 = this.A04) == null || r0.A0l) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        float chipStartPadding = getChipStartPadding() + this.A04.A00() + getTextStartPadding();
        if (C004601z.A06(this) != 0) {
            chipStartPadding = -chipStartPadding;
        }
        canvas.translate(chipStartPadding, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        int i3 = Integer.MIN_VALUE;
        if (z2) {
            i3 = -1;
        }
        setFocusedVirtualView(i3);
        invalidate();
        super.onFocusChanged(z2, i2, rect);
        this.A0C.A0F(z2, i2, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r5.A00 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        setFocusedVirtualView(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r4 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r0 != -1) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        setFocusedVirtualView(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r0 != 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        setFocusedVirtualView(-1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0010 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r6, android.view.KeyEvent r7) {
        /*
            r5 = this;
            int r1 = r7.getKeyCode()
            r0 = 61
            r3 = 1
            if (r1 == r0) goto L_0x006b
            r0 = 66
            if (r1 == r0) goto L_0x0053
            switch(r1) {
                case 21: goto L_0x0015;
                case 22: goto L_0x0024;
                case 23: goto L_0x0053;
                default: goto L_0x0010;
            }
        L_0x0010:
            boolean r0 = super.onKeyDown(r6, r7)
            return r0
        L_0x0015:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L_0x0010
            int r0 = X.C004601z.A06(r5)
            r4 = 1
            if (r0 == r3) goto L_0x0034
            r4 = 0
            goto L_0x0034
        L_0x0024:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L_0x0010
            int r1 = X.C004601z.A06(r5)
            r0 = 1
            if (r1 == r3) goto L_0x0032
            r0 = 0
        L_0x0032:
            r4 = r0 ^ 1
        L_0x0034:
            int r1 = r5.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x003e
            r0 = -1
            r5.setFocusedVirtualView(r0)
        L_0x003e:
            r2 = -1
            r1 = 0
            int r0 = r5.A00
            if (r4 == 0) goto L_0x004d
            if (r0 != r2) goto L_0x0010
            r5.setFocusedVirtualView(r1)
        L_0x0049:
            r5.invalidate()
            return r3
        L_0x004d:
            if (r0 != 0) goto L_0x0010
            r5.setFocusedVirtualView(r2)
            goto L_0x0049
        L_0x0053:
            int r1 = r5.A00
            r0 = -1
            if (r1 == r0) goto L_0x0091
            if (r1 != 0) goto L_0x0010
            r1 = 0
            r5.playSoundEffect(r1)
            android.view.View$OnClickListener r0 = r5.A02
            if (r0 == 0) goto L_0x0065
            r0.onClick(r5)
        L_0x0065:
            X.2q7 r0 = r5.A0C
            r0.A0B(r1, r3)
            return r3
        L_0x006b:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L_0x0089
            r4 = 2
        L_0x0072:
            android.view.ViewParent r2 = r5.getParent()
            r1 = r5
        L_0x0077:
            android.view.View r1 = r1.focusSearch(r4)
            if (r1 == 0) goto L_0x0010
            if (r1 == r5) goto L_0x0085
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == r2) goto L_0x0077
        L_0x0085:
            r1.requestFocus()
            return r3
        L_0x0089:
            boolean r0 = r7.hasModifiers(r3)
            if (r0 == 0) goto L_0x0010
            r4 = 1
            goto L_0x0072
        L_0x0091:
            r5.performClick()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r3 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            android.graphics.RectF r2 = r4.getCloseIconTouchBounds()
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r1 = r2.contains(r1, r0)
            r2 = 0
            r0 = 1
            if (r3 == 0) goto L_0x004f
            if (r3 == r0) goto L_0x0032
            r0 = 2
            if (r3 == r0) goto L_0x0028
            r0 = 3
            if (r3 == r0) goto L_0x004d
        L_0x0020:
            boolean r0 = super.onTouchEvent(r5)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            return r2
        L_0x0028:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0020
            if (r1 != 0) goto L_0x0026
            r4.setCloseIconPressed(r2)
            goto L_0x0026
        L_0x0032:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x004d
            r4.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r4.A02
            r1 = 1
            if (r0 == 0) goto L_0x0041
            r0.onClick(r4)
        L_0x0041:
            X.2q7 r0 = r4.A0C
            r0.A0B(r2, r1)
            r0 = 1
        L_0x0047:
            r4.setCloseIconPressed(r2)
            if (r0 != 0) goto L_0x0026
            goto L_0x0020
        L_0x004d:
            r0 = 0
            goto L_0x0047
        L_0x004f:
            if (r1 == 0) goto L_0x0020
            r4.setCloseIconPressed(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.A04 || drawable == this.A01) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int i2) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.A04 || drawable == this.A01) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i2) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0J(z2);
        }
    }

    public void setCheckableResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0J(r1.A0p.getResources().getBoolean(i2));
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C56352nV r0 = this.A04;
        if (r0 == null) {
            this.A08 = z2;
        } else if (r0.A0g) {
            boolean isChecked = isChecked();
            super.setChecked(z2);
            if (isChecked != z2 && (onCheckedChangeListener = this.A03) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z2);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0E(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0E(AnonymousClass08E.A01(r1.A0p, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0K(r1.A0p.getResources().getBoolean(i2));
        }
    }

    public void setCheckedIconVisible(boolean z2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0K(z2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A0L != colorStateList) {
            r1.A0L = colorStateList;
            r1.onStateChange(r1.getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList A002;
        C56352nV r2 = this.A04;
        if (r2 != null && r2.A0L != (A002 = AnonymousClass08E.A00(r2.A0p, i2))) {
            r2.A0L = A002;
            r2.onStateChange(r2.getState());
        }
    }

    public void setChipCornerRadius(float f2) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A00 != f2) {
            r1.A00 = f2;
            r1.invalidateSelf();
        }
    }

    public void setChipCornerRadiusResource(int i2) {
        C56352nV r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i2);
            if (r2.A00 != dimension) {
                r2.A00 = dimension;
                r2.invalidateSelf();
            }
        }
    }

    public void setChipDrawable(C56352nV r5) {
        C56352nV r2 = this.A04;
        if (r2 != r5) {
            if (r2 != null) {
                r2.A0f = new WeakReference((Object) null);
            }
            this.A04 = r5;
            r5.A0f = new WeakReference(this);
            if (C53732gB.A00) {
                this.A01 = new RippleDrawable(C53732gB.A02(this.A04.A0Q), this.A04, (Drawable) null);
                C56352nV r22 = this.A04;
                if (r22.A0n) {
                    r22.A0n = false;
                    r22.A0P = null;
                    r22.onStateChange(r22.getState());
                }
                setBackground(this.A01);
                return;
            }
            C56352nV r23 = this.A04;
            if (!r23.A0n) {
                r23.A0n = true;
                r23.A0P = C53732gB.A02(r23.A0Q);
                r23.onStateChange(r23.getState());
            }
            setBackground(this.A04);
        }
    }

    public void setChipEndPadding(float f2) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A01 != f2) {
            r1.A01 = f2;
            r1.invalidateSelf();
            r1.A03();
        }
    }

    public void setChipEndPaddingResource(int i2) {
        C56352nV r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i2);
            if (r2.A01 != dimension) {
                r2.A01 = dimension;
                r2.invalidateSelf();
                r2.A03();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0F(AnonymousClass08E.A01(r1.A0p, i2));
        }
    }

    public void setChipIconSize(float f2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A04(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A04(r1.A0p.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0A(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0A(AnonymousClass08E.A00(r1.A0p, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0L(r1.A0p.getResources().getBoolean(i2));
        }
    }

    public void setChipIconVisible(boolean z2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0L(z2);
        }
    }

    public void setChipMinHeight(float f2) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A03 != f2) {
            r1.A03 = f2;
            r1.invalidateSelf();
            r1.A03();
        }
    }

    public void setChipMinHeightResource(int i2) {
        C56352nV r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i2);
            if (r2.A03 != dimension) {
                r2.A03 = dimension;
                r2.invalidateSelf();
                r2.A03();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A04 != f2) {
            r1.A04 = f2;
            r1.invalidateSelf();
            r1.A03();
        }
    }

    public void setChipStartPaddingResource(int i2) {
        C56352nV r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i2);
            if (r2.A04 != dimension) {
                r2.A04 = dimension;
                r2.invalidateSelf();
                r2.A03();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A0N != colorStateList) {
            r1.A0N = colorStateList;
            r1.onStateChange(r1.getState());
        }
    }

    public void setChipStrokeColorResource(int i2) {
        ColorStateList A002;
        C56352nV r2 = this.A04;
        if (r2 != null && r2.A0N != (A002 = AnonymousClass08E.A00(r2.A0p, i2))) {
            r2.A0N = A002;
            r2.onStateChange(r2.getState());
        }
    }

    public void setChipStrokeWidth(float f2) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A05 != f2) {
            r1.A05 = f2;
            r1.A0r.setStrokeWidth(f2);
            r1.invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        C56352nV r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i2);
            if (r2.A05 != dimension) {
                r2.A05 = dimension;
                r2.A0r.setStrokeWidth(dimension);
                r2.invalidateSelf();
            }
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0G(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C56352nV r2 = this.A04;
        if (r2 != null && r2.A0c != charSequence) {
            AnonymousClass02E A022 = AnonymousClass02E.A02();
            r2.A0c = A022.A03(A022.A00, charSequence);
            r2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A05(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A05(r1.A0p.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0G(AnonymousClass08E.A01(r1.A0p, i2));
        }
    }

    public void setCloseIconSize(float f2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A06(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A06(r1.A0p.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A07(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A07(r1.A0p.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0B(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0B(AnonymousClass08E.A00(r1.A0p, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0M(r1.A0p.getResources().getBoolean(i2));
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0M(z2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A04 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C56352nV r0 = this.A04;
            if (r0 != null) {
                r0.A0Y = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(C53422fg r2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0Z = r2;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0Z = C53422fg.A00(r1.A0p, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A08(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A08(r1.A0p.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A09(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A09(r1.A0p.getResources().getDimension(i2));
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0K = i2;
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A03 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0C(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0C(AnonymousClass08E.A00(r1.A0p, i2));
        }
    }

    public void setShowMotionSpec(C53422fg r2) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0a = r2;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        C56352nV r1 = this.A04;
        if (r1 != null) {
            r1.A0a = C53422fg.A00(r1.A0p, i2);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.A04 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            AnonymousClass02E A022 = AnonymousClass02E.A02();
            CharSequence A032 = A022.A03(A022.A00, charSequence);
            if (this.A04.A0l) {
                A032 = null;
            }
            super.setText(A032, bufferType);
            C56352nV r3 = this.A04;
            if (r3 != null && r3.A0d != charSequence) {
                r3.A0d = charSequence;
                AnonymousClass02E A023 = AnonymousClass02E.A02();
                r3.A0e = A023.A03(A023.A00, charSequence);
                r3.A0m = true;
                r3.invalidateSelf();
                r3.A03();
            }
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        C56352nV r2 = this.A04;
        if (r2 != null) {
            r2.A0I(new C615239g(r2.A0p, i2));
        }
        C615239g textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(getContext(), getPaint(), this.A0B);
            A03(getTextAppearance());
        }
    }

    public void setTextAppearance(C615239g r5) {
        C56352nV r0 = this.A04;
        if (r0 != null) {
            r0.A0I(r5);
        }
        C615239g textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(getContext(), getPaint(), this.A0B);
            A03(r5);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C56352nV r2 = this.A04;
        if (r2 != null) {
            r2.A0I(new C615239g(r2.A0p, i2));
        }
        C615239g textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(context, getPaint(), this.A0B);
            A03(getTextAppearance());
        }
    }

    public void setTextAppearanceResource(int i2) {
        C56352nV r2 = this.A04;
        if (r2 != null) {
            r2.A0I(new C615239g(r2.A0p, i2));
        }
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A0B != f2) {
            r1.A0B = f2;
            r1.invalidateSelf();
            r1.A03();
        }
    }

    public void setTextEndPaddingResource(int i2) {
        C56352nV r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i2);
            if (r2.A0B != dimension) {
                r2.A0B = dimension;
                r2.invalidateSelf();
                r2.A03();
            }
        }
    }

    public void setTextStartPadding(float f2) {
        C56352nV r1 = this.A04;
        if (r1 != null && r1.A0C != f2) {
            r1.A0C = f2;
            r1.invalidateSelf();
            r1.A03();
        }
    }

    public void setTextStartPaddingResource(int i2) {
        C56352nV r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i2);
            if (r2.A0C != dimension) {
                r2.A0C = dimension;
                r2.invalidateSelf();
                r2.A03();
            }
        }
    }
}
