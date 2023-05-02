package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.obwhatsapp.R;

@CoordinatorLayout.DefaultBehavior(FloatingActionButton$Behavior.class)
/* renamed from: X.2WK  reason: invalid class name */
public class AnonymousClass2WK extends AnonymousClass2WL implements AnonymousClass015, C006102p, AnonymousClass2WM {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public PorterDuff.Mode A09;
    public C53462fk A0A;
    public boolean A0B;
    public final Rect A0C;
    public final Rect A0D;
    public final C018108m A0E;
    public final C53442fi A0F;

    public AnonymousClass2WK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr0277);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2WK(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r8 = r15
            r9 = r16
            r12 = r17
            r14.<init>(r15, r9, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r14.A0C = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r14.A0D = r0
            int[] r10 = X.C53362fa.A07
            r13 = 2131952660(0x7f130414, float:1.954177E38)
            r2 = 0
            int[] r11 = new int[r2]
            android.content.res.TypedArray r1 = X.C53382fc.A00(r8, r9, r10, r11, r12, r13)
            r0 = 1
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r15, r1, r0)
            r14.A05 = r0
            r0 = 2
            r4 = -1
            int r3 = r1.getInt(r0, r4)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C53412ff.A00(r0, r3)
            r14.A08 = r0
            r0 = 11
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r15, r1, r0)
            r14.A07 = r0
            r0 = 6
            int r0 = r1.getInt(r0, r4)
            r14.A04 = r0
            r0 = 5
            int r0 = r1.getDimensionPixelSize(r0, r2)
            r14.A01 = r0
            r0 = 3
            int r0 = r1.getDimensionPixelSize(r0, r2)
            r14.A00 = r0
            r0 = 4
            r3 = 0
            float r7 = r1.getDimension(r0, r3)
            r0 = 8
            float r6 = r1.getDimension(r0, r3)
            r0 = 10
            float r5 = r1.getDimension(r0, r3)
            r0 = 13
            boolean r0 = r1.getBoolean(r0, r2)
            r14.A0B = r0
            r0 = 9
            int r0 = r1.getDimensionPixelSize(r0, r2)
            r14.A03 = r0
            r0 = 12
            X.2fg r4 = X.C53422fg.A01(r15, r1, r0)
            r0 = 7
            X.2fg r3 = X.C53422fg.A01(r15, r1, r0)
            r1.recycle()
            X.08m r0 = new X.08m
            r0.<init>(r14)
            r14.A0E = r0
            r0.A02(r9, r12)
            X.2fi r0 = new X.2fi
            r0.<init>(r14)
            r14.A0F = r0
            X.2fk r9 = r14.getImpl()
            android.content.res.ColorStateList r8 = r14.A05
            android.graphics.PorterDuff$Mode r2 = r14.A08
            android.content.res.ColorStateList r1 = r14.A07
            int r0 = r14.A00
            r9.A0C(r8, r1, r2, r0)
            X.2fk r2 = r14.getImpl()
            float r0 = r2.A00
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            r2.A00 = r7
            float r1 = r2.A01
            float r0 = r2.A03
            r2.A0A(r7, r1, r0)
        L_0x00b6:
            X.2fk r2 = r14.getImpl()
            float r0 = r2.A01
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00c9
            r2.A01 = r6
            float r1 = r2.A00
            float r0 = r2.A03
            r2.A0A(r1, r6, r0)
        L_0x00c9:
            X.2fk r2 = r14.getImpl()
            float r0 = r2.A03
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            r2.A03 = r5
            float r1 = r2.A00
            float r0 = r2.A01
            r2.A0A(r1, r0, r5)
        L_0x00dc:
            X.2fk r2 = r14.getImpl()
            int r1 = r14.A03
            int r0 = r2.A06
            if (r0 == r1) goto L_0x00f6
            r2.A06 = r1
            float r0 = r2.A02
            r2.A02 = r0
            android.graphics.Matrix r1 = r2.A0I
            r2.A0D(r1, r0)
            X.2WL r0 = r2.A0N
            r0.setImageMatrix(r1)
        L_0x00f6:
            X.2fk r0 = r14.getImpl()
            r0.A0F = r4
            X.2fk r0 = r14.getImpl()
            r0.A0E = r3
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r14.setScaleType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2WK.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private C53462fk getImpl() {
        C53502fo r0;
        C53462fk r1 = this.A0A;
        if (r1 == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                r1 = new C53522fq(this, r0);
            } else {
                r0 = new C53502fo(this);
                r1 = new C53462fk(this, r0);
            }
            this.A0A = r1;
        }
        return r1;
    }

    public final int A01(int i2) {
        int i3 = this.A01;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? A01(1) : A01(0);
        }
        int i4 = R.dimen.dimen02cc;
        if (i2 != 1) {
            i4 = R.dimen.dimen02cd;
        }
        return resources.getDimensionPixelSize(i4);
    }

    public final void A02() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.A06;
            if (colorStateList == null) {
                C018208n.A08(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.A09;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(AnonymousClass06K.A00(mode, colorForState));
        }
    }

    public void A03(boolean z2) {
        C53462fk impl = getImpl();
        AnonymousClass2WL r3 = impl.A0N;
        int visibility = r3.getVisibility();
        int i2 = impl.A05;
        if (visibility == 0) {
            if (i2 == 1) {
                return;
            }
        } else if (i2 != 2) {
            return;
        }
        Animator animator = impl.A07;
        if (animator != null) {
            animator.cancel();
        }
        if (!C004601z.A0u(r3) || r3.isInEditMode()) {
            int i3 = 4;
            if (z2) {
                i3 = 8;
            }
            r3.A00(i3, z2);
            return;
        }
        C53422fg r1 = impl.A0E;
        if (r1 == null && (r1 = impl.A0C) == null) {
            r1 = C53422fg.A00(r3.getContext(), R.animator.notification_bg);
            impl.A0C = r1;
        }
        AnimatorSet A022 = impl.A02(r1, 0.0f, 0.0f, 0.0f);
        A022.addListener(new C53532fr(impl, z2));
        A022.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r4.isInEditMode() != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(boolean r6) {
        /*
            r5 = this;
            X.2fk r3 = r5.getImpl()
            X.2WL r4 = r3.A0N
            int r2 = r4.getVisibility()
            r0 = 1
            int r1 = r3.A05
            if (r2 == 0) goto L_0x0013
            r0 = 2
            if (r1 != r0) goto L_0x0016
            return
        L_0x0013:
            if (r1 == r0) goto L_0x0016
            return
        L_0x0016:
            android.animation.Animator r0 = r3.A07
            if (r0 == 0) goto L_0x001d
            r0.cancel()
        L_0x001d:
            boolean r0 = X.C004601z.A0u(r4)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r4.isInEditMode()
            r0 = 1
            if (r1 == 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x006f
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L_0x0049
            r1 = 0
            r4.setAlpha(r1)
            r4.setScaleY(r1)
            r4.setScaleX(r1)
            r3.A02 = r1
            android.graphics.Matrix r0 = r3.A0I
            r3.A0D(r0, r1)
            r4.setImageMatrix(r0)
        L_0x0049:
            X.2fg r0 = r3.A0F
            if (r0 != 0) goto L_0x005e
            X.2fg r0 = r3.A0D
            if (r0 != 0) goto L_0x005e
            android.content.Context r1 = r4.getContext()
            r0 = 2130837506(0x7f020002, float:1.7279968E38)
            X.2fg r0 = X.C53422fg.A00(r1, r0)
            r3.A0D = r0
        L_0x005e:
            android.animation.AnimatorSet r2 = r3.A02(r0, r2, r2, r2)
            r1 = 0
            com.facebook.redex.IDxLAdapterShape0S0110000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape0S0110000_2_I0
            r0.<init>(r3, r1, r6)
            r2.addListener(r0)
            r2.start()
            return
        L_0x006f:
            r0 = 0
            r4.A00(r0, r6)
            r4.setAlpha(r2)
            r4.setScaleY(r2)
            r4.setScaleX(r2)
            r3.A02 = r2
            android.graphics.Matrix r0 = r3.A0I
            r3.A0D(r0, r2)
            r4.setImageMatrix(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2WK.A04(boolean):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A0G(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.A05;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.A08;
    }

    public float getCompatElevation() {
        return getImpl().A01();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().A01;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().A03;
    }

    public Drawable getContentBackground() {
        return getImpl().A08;
    }

    public int getCustomSize() {
        return this.A01;
    }

    public int getExpandedComponentIdHint() {
        return this.A0F.A00;
    }

    public C53422fg getHideMotionSpec() {
        return getImpl().A0E;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.A07;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.A07;
    }

    public C53422fg getShowMotionSpec() {
        return getImpl().A0F;
    }

    public int getSize() {
        return this.A04;
    }

    public int getSizeDimension() {
        return A01(this.A04);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.A05;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.A08;
    }

    public ColorStateList getSupportImageTintList() {
        return this.A06;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.A09;
    }

    public boolean getUseCompatPadding() {
        return this.A0B;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A06();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C53462fk impl = getImpl();
        if (impl.A0H()) {
            if (impl.A0B == null) {
                impl.A0B = new IDxDListenerShape190S0100000_2_I0(impl, 0);
            }
            impl.A0N.getViewTreeObserver().addOnPreDrawListener(impl.A0B);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C53462fk impl = getImpl();
        if (impl.A0B != null) {
            impl.A0N.getViewTreeObserver().removeOnPreDrawListener(impl.A0B);
            impl.A0B = null;
        }
    }

    public void onMeasure(int i2, int i3) {
        int A012 = A01(this.A04);
        this.A02 = (A012 - this.A03) >> 1;
        getImpl().A09();
        int i4 = A012;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(A012, size);
        } else if (mode != 0) {
            if (mode == 1073741824) {
                i4 = size;
            } else {
                throw new IllegalArgumentException();
            }
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            A012 = Math.min(A012, size2);
        } else if (mode2 != 0) {
            if (mode2 == 1073741824) {
                A012 = size2;
            } else {
                throw new IllegalArgumentException();
            }
        }
        int min = Math.min(i4, A012);
        Rect rect = this.A0C;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C53552ft)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C53552ft r4 = (C53552ft) parcelable;
        super.onRestoreInstanceState(r4.A00);
        this.A0F.A01((Bundle) r4.A00.get("expandableWidgetHelper"));
    }

    public Parcelable onSaveInstanceState() {
        C53552ft r3 = new C53552ft(super.onSaveInstanceState());
        r3.A00.put("expandableWidgetHelper", this.A0F.A00());
        return r3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.A0D;
            if (C004601z.A0u(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                int i2 = rect.left;
                Rect rect2 = this.A0C;
                rect.left = i2 + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A05 != colorStateList) {
            this.A05 = colorStateList;
            C53462fk impl = getImpl();
            Drawable drawable = impl.A0A;
            if (drawable != null) {
                C018208n.A04(colorStateList, drawable);
            }
            C53562fu r2 = impl.A0G;
            if (r2 != null) {
                if (colorStateList != null) {
                    r2.A04 = colorStateList.getColorForState(r2.getState(), r2.A04);
                }
                r2.A07 = colorStateList;
                r2.A08 = true;
                r2.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            Drawable drawable = getImpl().A0A;
            if (drawable != null) {
                C018208n.A07(mode, drawable);
            }
        }
    }

    public void setCompatElevation(float f2) {
        C53462fk impl = getImpl();
        if (impl.A00 != f2) {
            impl.A00 = f2;
            impl.A0A(f2, impl.A01, impl.A03);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        C53462fk impl = getImpl();
        if (impl.A01 != f2) {
            impl.A01 = f2;
            impl.A0A(impl.A00, f2, impl.A03);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        C53462fk impl = getImpl();
        if (impl.A03 != f2) {
            impl.A03 = f2;
            impl.A0A(impl.A00, impl.A01, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 >= 0) {
            this.A01 = i2;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i2) {
        this.A0F.A00 = i2;
    }

    public void setHideMotionSpec(C53422fg r2) {
        getImpl().A0E = r2;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(C53422fg.A00(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C53462fk impl = getImpl();
        float f2 = impl.A02;
        impl.A02 = f2;
        Matrix matrix = impl.A0I;
        impl.A0D(matrix, f2);
        impl.A0N.setImageMatrix(matrix);
    }

    public void setImageResource(int i2) {
        this.A0E.A01(i2);
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            getImpl().A0B(this.A07);
        }
    }

    public void setShowMotionSpec(C53422fg r2) {
        getImpl().A0F = r2;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(C53422fg.A00(getContext(), i2));
    }

    public void setSize(int i2) {
        this.A01 = 0;
        if (i2 != this.A04) {
            this.A04 = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.A06 != colorStateList) {
            this.A06 = colorStateList;
            A02();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.A09 != mode) {
            this.A09 = mode;
            A02();
        }
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.A0B != z2) {
            this.A0B = z2;
            getImpl().A07();
        }
    }
}
