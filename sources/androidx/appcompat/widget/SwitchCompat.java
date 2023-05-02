package androidx.appcompat.widget;

import X.AnonymousClass04h;
import X.AnonymousClass06L;
import X.AnonymousClass08R;
import X.C004601z;
import X.C015307j;
import X.C018208n;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.facebook.redex.IDxPropertyShape0S0000000_I0;
import com.obwhatsapp.R;

public class SwitchCompat extends CompoundButton {
    public static final Property A0d = new IDxPropertyShape0S0000000_I0(0);
    public static final int[] A0e = {16842912};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public ObjectAnimator A0G;
    public ColorStateList A0H;
    public ColorStateList A0I;
    public ColorStateList A0J;
    public PorterDuff.Mode A0K;
    public PorterDuff.Mode A0L;
    public Drawable A0M;
    public Drawable A0N;
    public Layout A0O;
    public Layout A0P;
    public TransformationMethod A0Q;
    public VelocityTracker A0R;
    public CharSequence A0S;
    public CharSequence A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Rect A0a;
    public final TextPaint A0b;
    public final AnonymousClass08R A0c;

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr04da);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r13 = r16
            r10 = r17
            r12 = r18
            r15 = r19
            r13.<init>(r10, r12, r15)
            r1 = 0
            r13.A0I = r1
            r13.A0K = r1
            r5 = 0
            r13.A0U = r5
            r13.A0V = r5
            r13.A0J = r1
            r13.A0L = r1
            r13.A0W = r5
            r13.A0X = r5
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.A0R = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r13.A0a = r0
            android.content.Context r0 = r13.getContext()
            X.AnonymousClass08P.A03(r0, r13)
            r7 = 1
            android.text.TextPaint r2 = new android.text.TextPaint
            r2.<init>(r7)
            r13.A0b = r2
            android.content.res.Resources r0 = r13.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r2.density = r0
            int[] r14 = X.AnonymousClass05L.A0L
            X.07T r2 = X.AnonymousClass07T.A00(r10, r12, r14, r15, r5)
            android.content.res.TypedArray r11 = r2.A02
            X.C004601z.A0N(r10, r11, r12, r13, r14, r15)
            r0 = 2
            android.graphics.drawable.Drawable r0 = r2.A02(r0)
            r13.A0M = r0
            if (r0 == 0) goto L_0x005c
            r0.setCallback(r13)
        L_0x005c:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r2.A02(r0)
            r13.A0N = r0
            if (r0 == 0) goto L_0x0069
            r0.setCallback(r13)
        L_0x0069:
            java.lang.CharSequence r0 = r11.getText(r5)
            r13.A0T = r0
            java.lang.CharSequence r0 = r11.getText(r7)
            r13.A0S = r0
            r0 = 3
            boolean r0 = r11.getBoolean(r0, r7)
            r13.A0Y = r0
            r0 = 8
            int r0 = r11.getDimensionPixelSize(r0, r5)
            r13.A0C = r0
            r0 = 5
            int r0 = r11.getDimensionPixelSize(r0, r5)
            r13.A07 = r0
            r0 = 6
            int r0 = r11.getDimensionPixelSize(r0, r5)
            r13.A08 = r0
            r0 = 4
            boolean r0 = r11.getBoolean(r0, r5)
            r13.A0Z = r0
            r0 = 9
            android.content.res.ColorStateList r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x00a5
            r13.A0I = r0
            r13.A0U = r7
        L_0x00a5:
            r0 = 10
            r3 = -1
            int r0 = r11.getInt(r0, r3)
            android.graphics.PorterDuff$Mode r4 = X.C015307j.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r13.A0K
            if (r0 == r4) goto L_0x00b8
            r13.A0K = r4
            r13.A0V = r7
        L_0x00b8:
            boolean r0 = r13.A0U
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r13.A0V
            if (r0 == 0) goto L_0x00c3
        L_0x00c0:
            r13.A01()
        L_0x00c3:
            r0 = 12
            android.content.res.ColorStateList r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x00cf
            r13.A0J = r0
            r13.A0W = r7
        L_0x00cf:
            r0 = 13
            int r0 = r11.getInt(r0, r3)
            android.graphics.PorterDuff$Mode r1 = X.C015307j.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r13.A0L
            if (r0 == r1) goto L_0x00e1
            r13.A0L = r1
            r13.A0X = r7
        L_0x00e1:
            boolean r0 = r13.A0W
            if (r0 != 0) goto L_0x00e9
            boolean r0 = r13.A0X
            if (r0 == 0) goto L_0x00ec
        L_0x00e9:
            r13.A02()
        L_0x00ec:
            r0 = 7
            r8 = 0
            int r1 = r11.getResourceId(r0, r5)
            if (r1 == 0) goto L_0x0175
            int[] r0 = X.AnonymousClass05L.A0M
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r1, r0)
            X.07T r4 = new X.07T
            r4.<init>(r10, r0)
            r0 = 3
            android.content.res.ColorStateList r0 = r4.A01(r0)
            if (r0 != 0) goto L_0x010a
            android.content.res.ColorStateList r0 = r13.getTextColors()
        L_0x010a:
            r13.A0H = r0
            android.content.res.TypedArray r6 = r4.A02
            int r0 = r6.getDimensionPixelSize(r5, r5)
            if (r0 == 0) goto L_0x0125
            float r3 = (float) r0
            android.text.TextPaint r1 = r13.A0b
            float r0 = r1.getTextSize()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
            r1.setTextSize(r3)
            r13.requestLayout()
        L_0x0125:
            r3 = -1
            int r1 = r6.getInt(r7, r3)
            r0 = 2
            int r9 = r6.getInt(r0, r3)
            if (r1 == r7) goto L_0x01b8
            if (r1 == r0) goto L_0x01b5
            r0 = 3
            if (r1 == r0) goto L_0x01b2
            r1 = 0
        L_0x0137:
            r7 = 0
            if (r9 <= 0) goto L_0x01a6
            if (r1 != 0) goto L_0x01a1
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r9)
        L_0x0140:
            r13.setSwitchTypeface(r0)
            if (r0 == 0) goto L_0x019f
            int r0 = r0.getStyle()
        L_0x0149:
            r3 = r0 ^ -1
            r3 = r3 & r9
            android.text.TextPaint r1 = r13.A0b
            r0 = r3 & 1
            if (r0 == 0) goto L_0x0153
            r8 = 1
        L_0x0153:
            r1.setFakeBoldText(r8)
            r0 = r3 & 2
            if (r0 == 0) goto L_0x015c
            r7 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x015c:
            r1.setTextSkewX(r7)
        L_0x015f:
            r0 = 14
            boolean r0 = r6.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x019d
            android.content.Context r1 = r13.getContext()
            X.08M r0 = new X.08M
            r0.<init>(r1)
        L_0x0170:
            r13.A0Q = r0
            r4.A04()
        L_0x0175:
            X.08R r0 = new X.08R
            r0.<init>(r13)
            r13.A0c = r0
            r0.A0A(r12, r15)
            r2.A04()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r10)
            int r0 = r1.getScaledTouchSlop()
            r13.A0F = r0
            int r0 = r1.getScaledMinimumFlingVelocity()
            r13.A03 = r0
            r13.refreshDrawableState()
            boolean r0 = r13.isChecked()
            r13.setChecked(r0)
            return
        L_0x019d:
            r0 = 0
            goto L_0x0170
        L_0x019f:
            r0 = 0
            goto L_0x0149
        L_0x01a1:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r9)
            goto L_0x0140
        L_0x01a6:
            android.text.TextPaint r0 = r13.A0b
            r0.setFakeBoldText(r5)
            r0.setTextSkewX(r7)
            r13.setSwitchTypeface(r1)
            goto L_0x015f
        L_0x01b2:
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            goto L_0x0137
        L_0x01b5:
            android.graphics.Typeface r1 = android.graphics.Typeface.SERIF
            goto L_0x0137
        L_0x01b8:
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            goto L_0x0137
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private boolean getTargetCheckedState() {
        return this.A00 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C004601z.A06(this) == 1 ? 1.0f - this.A00 : this.A00) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.A0N;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.A0a;
        drawable.getPadding(rect);
        Drawable drawable2 = this.A0M;
        Rect A012 = drawable2 != null ? C015307j.A01(drawable2) : C015307j.A01;
        return ((((this.A0B - this.A0D) - rect.left) - rect.right) - A012.left) - A012.right;
    }

    public final Layout A00(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        TransformationMethod transformationMethod = this.A0Q;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.A0b;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void A01() {
        Drawable drawable = this.A0M;
        if (drawable == null) {
            return;
        }
        if (this.A0U || this.A0V) {
            Drawable mutate = C018208n.A03(drawable).mutate();
            this.A0M = mutate;
            if (this.A0U) {
                C018208n.A04(this.A0I, mutate);
            }
            if (this.A0V) {
                C018208n.A07(this.A0K, this.A0M);
            }
            if (this.A0M.isStateful()) {
                this.A0M.setState(getDrawableState());
            }
        }
    }

    public final void A02() {
        Drawable drawable = this.A0N;
        if (drawable == null) {
            return;
        }
        if (this.A0W || this.A0X) {
            Drawable mutate = C018208n.A03(drawable).mutate();
            this.A0N = mutate;
            if (this.A0W) {
                C018208n.A04(this.A0J, mutate);
            }
            if (this.A0X) {
                C018208n.A07(this.A0L, this.A0N);
            }
            if (this.A0N.isStateful()) {
                this.A0N.setState(getDrawableState());
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect rect = this.A0a;
        int i2 = this.A06;
        int i3 = this.A0A;
        int i4 = this.A09;
        int i5 = this.A04;
        int thumbOffset = getThumbOffset() + i2;
        Drawable drawable = this.A0M;
        Rect A012 = drawable != null ? C015307j.A01(drawable) : C015307j.A01;
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i6 = rect.left;
            thumbOffset += i6;
            int i7 = A012.left;
            if (i7 > i6) {
                i2 += i7 - i6;
            }
            int i8 = A012.top;
            int i9 = rect.top;
            int i10 = (i8 - i9) + i3;
            if (i8 <= i9) {
                i10 = i3;
            }
            int i11 = A012.right;
            int i12 = rect.right;
            if (i11 > i12) {
                i4 -= i11 - i12;
            }
            int i13 = A012.bottom;
            int i14 = rect.bottom;
            int i15 = i5 - (i13 - i14);
            if (i13 <= i14) {
                i15 = i5;
            }
            this.A0N.setBounds(i2, i10, i4, i15);
        }
        Drawable drawable3 = this.A0M;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.A0D + rect.right;
            this.A0M.setBounds(i16, i3, i17, i5);
            Drawable background = getBackground();
            if (background != null) {
                C018208n.A0B(background, i16, i3, i17, i5);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.A0M;
        if (drawable != null) {
            C018208n.A09(drawable, f2, f3);
        }
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            C018208n.A09(drawable2, f2, f3);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0M;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0N;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        boolean z2 = true;
        if (C004601z.A06(this) != 1) {
            z2 = false;
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (!z2) {
            return compoundPaddingLeft;
        }
        int i2 = compoundPaddingLeft + this.A0B;
        return !TextUtils.isEmpty(getText()) ? i2 + this.A08 : i2;
    }

    public int getCompoundPaddingRight() {
        boolean z2 = true;
        if (C004601z.A06(this) != 1) {
            z2 = false;
        }
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (z2) {
            return compoundPaddingRight;
        }
        int i2 = compoundPaddingRight + this.A0B;
        return !TextUtils.isEmpty(getText()) ? i2 + this.A08 : i2;
    }

    public boolean getShowText() {
        return this.A0Y;
    }

    public boolean getSplitTrack() {
        return this.A0Z;
    }

    public int getSwitchMinWidth() {
        return this.A07;
    }

    public int getSwitchPadding() {
        return this.A08;
    }

    public CharSequence getTextOff() {
        return this.A0S;
    }

    public CharSequence getTextOn() {
        return this.A0T;
    }

    public Drawable getThumbDrawable() {
        return this.A0M;
    }

    public int getThumbTextPadding() {
        return this.A0C;
    }

    public ColorStateList getThumbTintList() {
        return this.A0I;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.A0K;
    }

    public Drawable getTrackDrawable() {
        return this.A0N;
    }

    public ColorStateList getTrackTintList() {
        return this.A0J;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.A0L;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0M;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.A0G;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.A0G.end();
            this.A0G = null;
        }
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, A0e);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.A0a;
        Drawable drawable = this.A0N;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.A0A;
        int i3 = this.A04;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.A0M;
        if (drawable != null) {
            if (!this.A0Z || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect A012 = C015307j.A01(drawable2);
                drawable2.copyBounds(rect);
                rect.left += A012.left;
                rect.right -= A012.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.A0P : this.A0O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A0H;
            if (colorStateList != null) {
                this.A0b.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0b.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((float) ((width >> 1) - (layout.getWidth() >> 1)), (float) (((i4 + i5) >> 1) - (layout.getHeight() >> 1)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.A0T : this.A0S;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        super.onLayout(z2, i2, i3, i4, i5);
        int i10 = 0;
        if (this.A0M != null) {
            Rect rect = this.A0a;
            Drawable drawable = this.A0N;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect A012 = C015307j.A01(this.A0M);
            i6 = Math.max(0, A012.left - rect.left);
            i10 = Math.max(0, A012.right - rect.right);
        } else {
            i6 = 0;
        }
        if (C004601z.A06(this) == 1) {
            i7 = getPaddingLeft() + i6;
            width = ((this.A0B + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.A0B) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i8 = this.A05;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) >> 1) - (i8 >> 1);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i8 = this.A05;
        } else {
            i9 = getHeight() - getPaddingBottom();
            paddingTop = i9 - this.A05;
            this.A06 = i7;
            this.A0A = paddingTop;
            this.A04 = i9;
            this.A09 = width;
        }
        i9 = i8 + paddingTop;
        this.A06 = i7;
        this.A0A = paddingTop;
        this.A04 = i9;
        this.A09 = width;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.A0Y) {
            if (this.A0P == null) {
                this.A0P = A00(this.A0T);
            }
            if (this.A0O == null) {
                this.A0O = A00(this.A0S);
            }
        }
        Rect rect = this.A0a;
        Drawable drawable = this.A0M;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.A0M.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.A0M.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        this.A0D = Math.max(this.A0Y ? Math.max(this.A0P.getWidth(), this.A0O.getWidth()) + (this.A0C << 1) : 0, i4);
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.A0N.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.A0M;
        if (drawable3 != null) {
            Rect A012 = C015307j.A01(drawable3);
            i7 = Math.max(i7, A012.left);
            i8 = Math.max(i8, A012.right);
        }
        int max = Math.max(this.A07, (this.A0D << 1) + i7 + i8);
        int max2 = Math.max(i6, i5);
        this.A0B = max;
        this.A05 = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.A0T : this.A0S;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        if (isEnabled() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r2 = r9.A0R
            r2.addMovement(r10)
            int r1 = r10.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x00fc
            r6 = 2
            if (r1 == r4) goto L_0x008d
            if (r1 == r6) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x008d
        L_0x0014:
            boolean r0 = super.onTouchEvent(r10)
            return r0
        L_0x0019:
            int r0 = r9.A0E
            if (r0 == r4) goto L_0x005c
            if (r0 != r6) goto L_0x0014
            float r6 = r10.getX()
            int r2 = r9.getThumbScrollRange()
            float r0 = r9.A01
            float r1 = r6 - r0
            r5 = 0
            if (r2 == 0) goto L_0x0053
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x0030:
            int r0 = X.C004601z.A06(r9)
            if (r0 != r4) goto L_0x0037
            float r1 = -r1
        L_0x0037:
            float r3 = r9.A00
            float r2 = r3 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            r2 = 0
        L_0x0042:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004b
            r9.A01 = r6
            r9.setThumbPosition(r2)
        L_0x004b:
            return r4
        L_0x004c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0053:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 <= 0) goto L_0x0030
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0030
        L_0x005c:
            float r5 = r10.getX()
            float r3 = r10.getY()
            float r0 = r9.A01
            float r0 = r5 - r0
            float r2 = java.lang.Math.abs(r0)
            int r0 = r9.A0F
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            float r0 = r9.A02
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
        L_0x007f:
            r9.A0E = r6
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            r9.A01 = r5
            r9.A02 = r3
            return r4
        L_0x008d:
            int r0 = r9.A0E
            if (r0 != r6) goto L_0x00f4
            r6 = 0
            r9.A0E = r6
            int r0 = r10.getAction()
            r5 = 1
            if (r0 != r4) goto L_0x00a2
            boolean r1 = r9.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            boolean r3 = r9.isChecked()
            if (r0 == 0) goto L_0x00f2
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r0)
            float r2 = r2.getXVelocity()
            float r1 = java.lang.Math.abs(r2)
            int r0 = r9.A03
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ed
            int r0 = X.C004601z.A06(r9)
            r1 = 1
            if (r0 == r4) goto L_0x00c5
            r1 = 0
        L_0x00c5:
            r0 = 0
            if (r1 == 0) goto L_0x00e6
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00eb
        L_0x00cc:
            if (r5 == r3) goto L_0x00d1
            r9.playSoundEffect(r6)
        L_0x00d1:
            r9.setChecked(r5)
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r10)
            r0 = 3
            r1.setAction(r0)
            super.onTouchEvent(r1)
            r1.recycle()
            super.onTouchEvent(r10)
            return r4
        L_0x00e6:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            goto L_0x00cc
        L_0x00eb:
            r5 = 0
            goto L_0x00cc
        L_0x00ed:
            boolean r5 = r9.getTargetCheckedState()
            goto L_0x00cc
        L_0x00f2:
            r5 = r3
            goto L_0x00cc
        L_0x00f4:
            r0 = 0
            r9.A0E = r0
            r2.clear()
            goto L_0x0014
        L_0x00fc:
            float r3 = r10.getX()
            float r2 = r10.getY()
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = r9.A0M
            if (r0 == 0) goto L_0x0014
            int r5 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r0 = r9.A0M
            android.graphics.Rect r1 = r9.A0a
            r0.getPadding(r1)
            int r8 = r9.A0A
            int r7 = r9.A0F
            int r8 = r8 - r7
            int r6 = r9.A06
            int r6 = r6 + r5
            int r6 = r6 - r7
            int r5 = r9.A0D
            int r5 = r5 + r6
            int r0 = r1.left
            int r5 = r5 + r0
            int r0 = r1.right
            int r5 = r5 + r0
            int r5 = r5 + r7
            int r1 = r9.A04
            int r1 = r1 + r7
            float r0 = (float) r6
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = (float) r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            float r0 = (float) r8
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            r9.A0E = r4
            r9.A01 = r3
            r9.A02 = r2
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r6) {
        /*
            r5 = this;
            super.setChecked(r6)
            boolean r2 = r5.isChecked()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r2 == 0) goto L_0x0056
            if (r1 < r0) goto L_0x0021
            java.lang.CharSequence r0 = r5.A0T
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131893173(0x7f121bb5, float:1.9421115E38)
        L_0x001a:
            java.lang.String r0 = r1.getString(r0)
        L_0x001e:
            X.C004601z.A0m(r5, r0)
        L_0x0021:
            android.os.IBinder r0 = r5.getWindowToken()
            if (r0 == 0) goto L_0x0064
            boolean r0 = X.C004601z.A0u(r5)
            if (r0 == 0) goto L_0x0064
            r4 = 0
            if (r2 == 0) goto L_0x0032
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0032:
            android.util.Property r2 = A0d
            r3 = 1
            float[] r1 = new float[r3]
            r0 = 0
            r1[r0] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r2, r1)
            r5.A0G = r2
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r1 < r0) goto L_0x0050
            android.animation.ObjectAnimator r0 = r5.A0G
            r0.setAutoCancel(r3)
        L_0x0050:
            android.animation.ObjectAnimator r0 = r5.A0G
            r0.start()
            return
        L_0x0056:
            if (r1 < r0) goto L_0x0021
            java.lang.CharSequence r0 = r5.A0S
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131893172(0x7f121bb4, float:1.9421113E38)
            goto L_0x001a
        L_0x0064:
            android.animation.ObjectAnimator r0 = r5.A0G
            if (r0 == 0) goto L_0x006b
            r0.cancel()
        L_0x006b:
            r0 = 0
            if (r2 == 0) goto L_0x0070
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0070:
            r5.setThumbPosition(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.setChecked(boolean):void");
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass04h.A02(callback, this));
    }

    public void setShowText(boolean z2) {
        if (this.A0Y != z2) {
            this.A0Y = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.A0Z = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.A07 = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.A08 = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.A0b;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.A0S = charSequence;
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0S;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(R.string.str1bb4);
            }
            C004601z.A0m(this, charSequence2);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.A0T = charSequence;
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0T;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(R.string.str1bb5);
            }
            C004601z.A0m(this, charSequence2);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0M;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A0M = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.A00 = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AnonymousClass06L.A02().A05(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.A0C = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A0I = colorStateList;
        this.A0U = true;
        A01();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.A0K = mode;
        this.A0V = true;
        A01();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A0N = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AnonymousClass06L.A02().A05(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A0J = colorStateList;
        this.A0W = true;
        A02();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.A0L = mode;
        this.A0X = true;
        A02();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0M || drawable == this.A0N;
    }
}
