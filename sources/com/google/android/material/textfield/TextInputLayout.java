package com.google.android.material.textfield;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass02G;
import X.AnonymousClass02Z;
import X.AnonymousClass04h;
import X.AnonymousClass06K;
import X.AnonymousClass07T;
import X.AnonymousClass08E;
import X.AnonymousClass3B3;
import X.AnonymousClass3BO;
import X.AnonymousClass3PA;
import X.AnonymousClass3PE;
import X.C004601z;
import X.C015307j;
import X.C017108b;
import X.C018208n;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C53362fa;
import X.C53382fc;
import X.C53412ff;
import X.C53572fv;
import X.C56362nW;
import X.C616139p;
import X.C805144d;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.obwhatsapp.R;
import java.lang.reflect.Method;

public class TextInputLayout extends LinearLayout {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public ValueAnimator A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public PorterDuff.Mode A0E;
    public Typeface A0F;
    public Drawable A0G;
    public Drawable A0H;
    public Drawable A0I;
    public Drawable A0J;
    public GradientDrawable A0K;
    public EditText A0L;
    public TextView A0M;
    public CheckableImageButton A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final Rect A0o;
    public final RectF A0p;
    public final FrameLayout A0q;
    public final AnonymousClass3BO A0r;
    public final C616139p A0s;

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr0524);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        this.A0s = new C616139p(this);
        this.A0o = AnonymousClass000.A0J();
        this.A0p = AnonymousClass000.A0K();
        AnonymousClass3BO r4 = new AnonymousClass3BO(this);
        this.A0r = r4;
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.A0q = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        TimeInterpolator timeInterpolator = C53572fv.A03;
        r4.A0O = timeInterpolator;
        r4.A04();
        r4.A0N = timeInterpolator;
        r4.A04();
        if (r4.A0K != 8388659) {
            r4.A0K = 8388659;
            r4.A04();
        }
        int[] iArr = C53362fa.A0G;
        C53382fc.A01(context, attributeSet, i2, R.style.style0419);
        C53382fc.A02(context2, attributeSet2, iArr, new int[0], i3, R.style.style0419);
        AnonymousClass07T A002 = AnonymousClass07T.A00(context, attributeSet, iArr, i2, R.style.style0419);
        TypedArray typedArray = A002.A02;
        this.A0X = typedArray.getBoolean(21, true);
        setHint(typedArray.getText(1));
        this.A0W = typedArray.getBoolean(20, true);
        this.A0e = context.getResources().getDimensionPixelOffset(R.dimen.dimen055c);
        this.A0g = context.getResources().getDimensionPixelOffset(R.dimen.dimen055f);
        this.A0f = typedArray.getDimensionPixelOffset(4, 0);
        this.A03 = typedArray.getDimension(8, 0.0f);
        this.A02 = typedArray.getDimension(7, 0.0f);
        this.A00 = typedArray.getDimension(5, 0.0f);
        this.A01 = typedArray.getDimension(6, 0.0f);
        this.A04 = typedArray.getColor(2, 0);
        this.A09 = typedArray.getColor(9, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0561);
        this.A0h = dimensionPixelSize;
        this.A0i = context.getResources().getDimensionPixelSize(R.dimen.dimen0562);
        this.A07 = dimensionPixelSize;
        setBoxBackgroundMode(typedArray.getInt(3, 0));
        if (typedArray.hasValue(0)) {
            ColorStateList A012 = A002.A01(0);
            this.A0C = A012;
            this.A0B = A012;
        }
        this.A0l = AnonymousClass00T.A00(context, R.color.color0572);
        this.A0m = AnonymousClass00T.A00(context, R.color.color0573);
        this.A0n = AnonymousClass00T.A00(context, R.color.color0575);
        if (typedArray.getResourceId(22, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(22, 0));
        }
        int resourceId = typedArray.getResourceId(16, 0);
        boolean z2 = typedArray.getBoolean(15, false);
        int resourceId2 = typedArray.getResourceId(19, 0);
        boolean z3 = typedArray.getBoolean(18, false);
        CharSequence text = typedArray.getText(17);
        boolean z4 = typedArray.getBoolean(11, false);
        setCounterMaxLength(typedArray.getInt(12, -1));
        this.A0k = typedArray.getResourceId(14, 0);
        this.A0j = typedArray.getResourceId(13, 0);
        this.A0b = typedArray.getBoolean(25, false);
        this.A0I = A002.A02(24);
        this.A0Q = typedArray.getText(23);
        if (typedArray.hasValue(26)) {
            this.A0T = true;
            this.A0D = A002.A01(26);
        }
        if (typedArray.hasValue(27)) {
            this.A0U = true;
            this.A0E = C53412ff.A00((PorterDuff.Mode) null, typedArray.getInt(27, -1));
        }
        A002.A04();
        setHelperTextEnabled(z3);
        setHelperText(text);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z2);
        setErrorTextAppearance(resourceId);
        setCounterEnabled(z4);
        A06();
        C004601z.A0d(this, 2);
    }

    public static void A00(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                A00((ViewGroup) childAt, z2);
            }
        }
    }

    public static Drawable[] A01(TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18) {
            return C017108b.A05(textView);
        }
        if (i2 < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z2 = true;
        if (C017108b.A00(textView) != 1) {
            z2 = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (!z2) {
            return compoundDrawables;
        }
        Drawable drawable = compoundDrawables[2];
        Drawable drawable2 = compoundDrawables[0];
        compoundDrawables[0] = drawable;
        compoundDrawables[2] = drawable2;
        return compoundDrawables;
    }

    private Drawable getBoxBackground() {
        int i2 = this.A05;
        if (i2 == 1 || i2 == 2) {
            return this.A0K;
        }
        throw new IllegalStateException();
    }

    private float[] getCornerRadiiAsArray() {
        float f2;
        float[] fArr = new float[8];
        if (!C13690nt.A1R(C004601z.A06(this))) {
            float f3 = this.A03;
            fArr[0] = f3;
            fArr[1] = f3;
            float f4 = this.A02;
            fArr[2] = f4;
            fArr[3] = f4;
            float f5 = this.A00;
            fArr[4] = f5;
            fArr[5] = f5;
            f2 = this.A01;
        } else {
            float f6 = this.A02;
            fArr[0] = f6;
            fArr[1] = f6;
            float f7 = this.A03;
            fArr[2] = f7;
            fArr[3] = f7;
            float f8 = this.A01;
            fArr[4] = f8;
            fArr[5] = f8;
            f2 = this.A00;
        }
        fArr[6] = f2;
        fArr[7] = f2;
        return fArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r2 = r0.A0I;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setEditText(android.widget.EditText r7) {
        /*
            r6 = this;
            android.widget.EditText r0 = r6.A0L
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r7 instanceof com.google.android.material.textfield.TextInputEditText
            if (r0 != 0) goto L_0x000f
            java.lang.String r1 = "TextInputLayout"
            java.lang.String r0 = "EditText added is not a TextInputEditText. Please switch to using that class instead."
            android.util.Log.i(r1, r0)
        L_0x000f:
            r6.A0L = r7
            r6.A07()
            X.3PA r0 = new X.3PA
            r0.<init>(r6)
            r6.setTextInputAccessibilityDelegate(r0)
            android.widget.EditText r0 = r6.A0L
            if (r0 == 0) goto L_0x00bf
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto L_0x00bf
        L_0x0028:
            X.3BO r3 = r6.A0r
            android.widget.EditText r0 = r6.A0L
            float r1 = r0.getTextSize()
            float r0 = r3.A0F
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            r3.A0F = r1
            r3.A04()
        L_0x003b:
            android.widget.EditText r0 = r6.A0L
            int r2 = r0.getGravity()
            r0 = r2 & -113(0xffffffffffffff8f, float:NaN)
            r1 = r0 | 48
            int r0 = r3.A0K
            if (r0 == r1) goto L_0x004e
            r3.A0K = r1
            r3.A04()
        L_0x004e:
            int r0 = r3.A0M
            if (r0 == r2) goto L_0x0057
            r3.A0M = r2
            r3.A04()
        L_0x0057:
            android.widget.EditText r1 = r6.A0L
            r5 = 0
            com.facebook.redex.IDxObjectShape279S0100000_2_I1 r0 = new com.facebook.redex.IDxObjectShape279S0100000_2_I1
            r0.<init>(r6, r5)
            r1.addTextChangedListener(r0)
            android.content.res.ColorStateList r0 = r6.A0B
            if (r0 != 0) goto L_0x006e
            android.widget.EditText r0 = r6.A0L
            android.content.res.ColorStateList r0 = r0.getHintTextColors()
            r6.A0B = r0
        L_0x006e:
            boolean r0 = r6.A0X
            r4 = 1
            if (r0 == 0) goto L_0x008e
            java.lang.CharSequence r0 = r6.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x008c
            android.widget.EditText r0 = r6.A0L
            java.lang.CharSequence r0 = r0.getHint()
            r6.A0P = r0
            r6.setHint(r0)
            android.widget.EditText r1 = r6.A0L
            r0 = 0
            r1.setHint(r0)
        L_0x008c:
            r6.A0a = r4
        L_0x008e:
            android.widget.TextView r0 = r6.A0M
            if (r0 == 0) goto L_0x009f
            android.widget.EditText r0 = r6.A0L
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r6.A0D(r0)
        L_0x009f:
            X.39p r0 = r6.A0s
            android.widget.LinearLayout r3 = r0.A09
            if (r3 == 0) goto L_0x00b8
            com.google.android.material.textfield.TextInputLayout r2 = r0.A0I
            android.widget.EditText r0 = r2.A0L
            if (r0 == 0) goto L_0x00b8
            int r1 = X.C004601z.A08(r0)
            android.widget.EditText r0 = r2.A0L
            int r0 = X.C004601z.A07(r0)
            X.C004601z.A0h(r3, r1, r5, r0, r5)
        L_0x00b8:
            r6.A0A()
            r6.A0G(r5, r4)
            return
        L_0x00bf:
            X.3BO r1 = r6.A0r
            android.widget.EditText r0 = r6.A0L
            android.graphics.Typeface r0 = r0.getTypeface()
            r1.A0V = r0
            r1.A0T = r0
            r1.A04()
            goto L_0x0028
        L_0x00d0:
            java.lang.String r0 = "We already have an EditText, can only have one"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setEditText(android.widget.EditText):void");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0O)) {
            this.A0O = charSequence;
            this.A0r.A0E(charSequence);
            if (!this.A0Y) {
                A08();
            }
        }
    }

    public final int A02() {
        float A002;
        if (this.A0X) {
            int i2 = this.A05;
            if (i2 == 0 || i2 == 1) {
                A002 = AnonymousClass3BO.A00(this.A0r);
            } else if (i2 == 2) {
                A002 = AnonymousClass3BO.A00(this.A0r) / 2.0f;
            }
            return (int) A002;
        }
        return 0;
    }

    public void A03() {
        Drawable background;
        Drawable background2;
        boolean z2;
        int currentTextColor;
        EditText editText = this.A0L;
        if (editText != null && (background = editText.getBackground()) != null) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 == 21 || i2 == 22) && (background2 = this.A0L.getBackground()) != null && !this.A0V) {
                Drawable newDrawable = background2.getConstantState().newDrawable();
                if (background2 instanceof DrawableContainer) {
                    Drawable.ConstantState constantState = newDrawable.getConstantState();
                    if (!C805144d.A01) {
                        try {
                            Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainer.DrawableContainerState.class});
                            C805144d.A00 = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                            Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
                        }
                        C805144d.A01 = true;
                    }
                    Method method = C805144d.A00;
                    if (method != null) {
                        try {
                            method.invoke(background2, new Object[]{constantState});
                            z2 = true;
                        } catch (Exception unused2) {
                            Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
                        }
                        this.A0V = z2;
                    }
                    z2 = false;
                    this.A0V = z2;
                }
                if (!this.A0V) {
                    this.A0L.setBackground(newDrawable);
                    this.A0V = true;
                    A07();
                }
            }
            if (C015307j.A03(background)) {
                background = background.mutate();
            }
            C616139p r1 = this.A0s;
            if (r1.A05()) {
                TextView textView = r1.A0A;
                if (textView == null) {
                    currentTextColor = -1;
                }
                currentTextColor = textView.getCurrentTextColor();
            } else {
                if (!this.A0S || (textView = this.A0M) == null) {
                    C018208n.A08(background);
                    this.A0L.refreshDrawableState();
                    return;
                }
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(AnonymousClass06K.A00(PorterDuff.Mode.SRC_IN, currentTextColor));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r2 == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0.hasFocus() == false) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            android.graphics.drawable.GradientDrawable r0 = r4.A0K
            if (r0 == 0) goto L_0x003f
            int r0 = r4.A05
            if (r0 == 0) goto L_0x003f
            android.widget.EditText r0 = r4.A0L
            r3 = 1
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.hasFocus()
            r2 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            android.widget.EditText r0 = r4.A0L
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.isHovered()
            if (r0 == 0) goto L_0x006e
        L_0x001f:
            int r1 = r4.A05
            r0 = 2
            if (r1 != r0) goto L_0x003f
            boolean r0 = r4.isEnabled()
            if (r0 != 0) goto L_0x0040
            int r0 = r4.A0m
        L_0x002c:
            r4.A06 = r0
            if (r3 != 0) goto L_0x0032
            if (r2 == 0) goto L_0x006b
        L_0x0032:
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x006b
            int r0 = r4.A0i
        L_0x003a:
            r4.A07 = r0
            r4.A05()
        L_0x003f:
            return
        L_0x0040:
            X.39p r1 = r4.A0s
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x004e
            android.widget.TextView r0 = r1.A0A
            if (r0 != 0) goto L_0x0056
            r0 = -1
            goto L_0x002c
        L_0x004e:
            boolean r0 = r4.A0S
            if (r0 == 0) goto L_0x005b
            android.widget.TextView r0 = r4.A0M
            if (r0 == 0) goto L_0x005b
        L_0x0056:
            int r0 = r0.getCurrentTextColor()
            goto L_0x002c
        L_0x005b:
            if (r2 == 0) goto L_0x0060
            int r0 = r4.A09
            goto L_0x002c
        L_0x0060:
            if (r3 == 0) goto L_0x0067
            int r0 = r4.A0n
            r4.A06 = r0
            goto L_0x0032
        L_0x0067:
            int r0 = r4.A0l
            r4.A06 = r0
        L_0x006b:
            int r0 = r4.A0h
            goto L_0x003a
        L_0x006e:
            r3 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A04():void");
    }

    public final void A05() {
        int i2;
        Drawable drawable;
        if (this.A0K != null) {
            int i3 = this.A05;
            if (i3 == 1) {
                this.A07 = 0;
            } else if (i3 == 2 && this.A09 == 0) {
                this.A09 = this.A0C.getColorForState(getDrawableState(), this.A0C.getDefaultColor());
            }
            EditText editText = this.A0L;
            if (editText != null && this.A05 == 2) {
                if (editText.getBackground() != null) {
                    this.A0G = this.A0L.getBackground();
                }
                this.A0L.setBackground((Drawable) null);
            }
            EditText editText2 = this.A0L;
            if (!(editText2 == null || this.A05 != 1 || (drawable = this.A0G) == null)) {
                editText2.setBackground(drawable);
            }
            int i4 = this.A07;
            if (i4 > -1 && (i2 = this.A06) != 0) {
                this.A0K.setStroke(i4, i2);
            }
            this.A0K.setCornerRadii(getCornerRadiiAsArray());
            this.A0K.setColor(this.A04);
            invalidate();
        }
    }

    public final void A06() {
        Drawable drawable;
        Drawable drawable2 = this.A0I;
        if (drawable2 == null) {
            return;
        }
        if (this.A0T || this.A0U) {
            Drawable mutate = C018208n.A03(drawable2).mutate();
            this.A0I = mutate;
            if (this.A0T) {
                C018208n.A04(this.A0D, mutate);
            }
            if (this.A0U) {
                C018208n.A07(this.A0E, this.A0I);
            }
            CheckableImageButton checkableImageButton = this.A0N;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.A0I)) {
                this.A0N.setImageDrawable(drawable);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r2 = this;
            int r1 = r2.A05
            r0 = 0
            if (r1 == 0) goto L_0x0017
            r0 = 2
            if (r1 != r0) goto L_0x0024
            boolean r0 = r2.A0X
            if (r0 == 0) goto L_0x0024
            android.graphics.drawable.GradientDrawable r0 = r2.A0K
            boolean r0 = r0 instanceof X.C56362nW
            if (r0 != 0) goto L_0x0024
            X.2nW r0 = new X.2nW
            r0.<init>()
        L_0x0017:
            r2.A0K = r0
        L_0x0019:
            int r0 = r2.A05
            if (r0 == 0) goto L_0x0020
            r2.A09()
        L_0x0020:
            r2.A0B()
            return
        L_0x0024:
            android.graphics.drawable.GradientDrawable r0 = r2.A0K
            if (r0 != 0) goto L_0x0019
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A07():void");
    }

    public final void A08() {
        float measureText;
        float f2;
        float f3;
        float measureText2;
        if (A0H()) {
            RectF rectF = this.A0p;
            AnonymousClass3BO r4 = this.A0r;
            CharSequence charSequence = r4.A0W;
            boolean AJb = (C004601z.A06(r4.A0i) == 1 ? AnonymousClass02G.A02 : AnonymousClass02G.A01).AJb(charSequence, 0, charSequence.length());
            Rect rect = r4.A0d;
            if (!AJb) {
                f2 = (float) rect.left;
            } else {
                float f4 = (float) rect.right;
                if (r4.A0W == null) {
                    measureText = 0.0f;
                } else {
                    TextPaint textPaint = r4.A0h;
                    textPaint.setTextSize(r4.A05);
                    textPaint.setTypeface(r4.A0T);
                    CharSequence charSequence2 = r4.A0W;
                    measureText = textPaint.measureText(charSequence2, 0, charSequence2.length());
                }
                f2 = f4 - measureText;
            }
            rectF.left = f2;
            rectF.top = (float) rect.top;
            if (!AJb) {
                if (r4.A0W == null) {
                    measureText2 = 0.0f;
                } else {
                    TextPaint textPaint2 = r4.A0h;
                    textPaint2.setTextSize(r4.A05);
                    textPaint2.setTypeface(r4.A0T);
                    CharSequence charSequence3 = r4.A0W;
                    measureText2 = textPaint2.measureText(charSequence3, 0, charSequence3.length());
                }
                f3 = f2 + measureText2;
            } else {
                f3 = (float) rect.right;
            }
            rectF.right = f3;
            float A002 = ((float) rect.top) + AnonymousClass3BO.A00(r4);
            rectF.bottom = A002;
            float f5 = rectF.left;
            float f6 = (float) this.A0g;
            float f7 = f5 - f6;
            rectF.left = f7;
            float f8 = rectF.top - f6;
            rectF.top = f8;
            float f9 = rectF.right + f6;
            rectF.right = f9;
            float f10 = A002 + f6;
            rectF.bottom = f10;
            ((C56362nW) this.A0K).A00(f7, f8, f9, f10);
        }
    }

    public final void A09() {
        FrameLayout frameLayout = this.A0q;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        int A022 = A02();
        if (A022 != layoutParams.topMargin) {
            layoutParams.topMargin = A022;
            frameLayout.requestLayout();
        }
    }

    public final void A0A() {
        EditText editText = this.A0L;
        if (editText != null) {
            boolean z2 = this.A0b && ((editText.getTransformationMethod() instanceof PasswordTransformationMethod) || this.A0c);
            CheckableImageButton checkableImageButton = this.A0N;
            if (z2) {
                if (checkableImageButton == null) {
                    LayoutInflater A0G2 = C13680ns.A0G(this);
                    FrameLayout frameLayout = this.A0q;
                    CheckableImageButton checkableImageButton2 = (CheckableImageButton) A0G2.inflate(R.layout.layout0224, frameLayout, false);
                    this.A0N = checkableImageButton2;
                    checkableImageButton2.setImageDrawable(this.A0I);
                    this.A0N.setContentDescription(this.A0Q);
                    frameLayout.addView(this.A0N);
                    C13680ns.A1A(this.A0N, this, 2);
                }
                EditText editText2 = this.A0L;
                if (editText2 != null && editText2.getMinimumHeight() <= 0) {
                    this.A0L.setMinimumHeight(this.A0N.getMinimumHeight());
                }
                this.A0N.setVisibility(0);
                this.A0N.setChecked(this.A0c);
                Drawable drawable = this.A0J;
                if (drawable == null) {
                    drawable = new ColorDrawable();
                    this.A0J = drawable;
                }
                drawable.setBounds(0, 0, this.A0N.getMeasuredWidth(), 1);
                Drawable[] A012 = A01(this.A0L);
                Drawable drawable2 = A012[2];
                Drawable drawable3 = this.A0J;
                if (drawable2 != drawable3) {
                    this.A0H = drawable2;
                }
                AnonymousClass04h.A05(A012[0], A012[1], drawable3, A012[3], this.A0L);
                this.A0N.setPadding(this.A0L.getPaddingLeft(), this.A0L.getPaddingTop(), this.A0L.getPaddingRight(), this.A0L.getPaddingBottom());
                return;
            }
            if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                this.A0N.setVisibility(8);
            }
            if (this.A0J != null) {
                Drawable[] A013 = A01(this.A0L);
                if (A013[2] == this.A0J) {
                    AnonymousClass04h.A05(A013[0], A013[1], this.A0H, A013[3], this.A0L);
                    this.A0J = null;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r7 = this;
            int r0 = r7.A05
            if (r0 == 0) goto L_0x0097
            android.graphics.drawable.GradientDrawable r0 = r7.A0K
            if (r0 == 0) goto L_0x0097
            android.widget.EditText r0 = r7.A0L
            if (r0 == 0) goto L_0x0097
            int r0 = r7.getRight()
            if (r0 == 0) goto L_0x0097
            android.widget.EditText r0 = r7.A0L
            int r6 = r0.getLeft()
            android.widget.EditText r2 = r7.A0L
            if (r2 == 0) goto L_0x009d
            int r1 = r7.A05
            r0 = 1
            if (r1 == r0) goto L_0x0098
            r0 = 2
            if (r1 != r0) goto L_0x009d
            int r1 = r2.getTop()
            int r0 = r7.A02()
            int r1 = r1 + r0
        L_0x002d:
            android.widget.EditText r0 = r7.A0L
            int r5 = r0.getRight()
            android.widget.EditText r0 = r7.A0L
            int r4 = r0.getBottom()
            int r0 = r7.A0e
            int r4 = r4 + r0
            int r0 = r7.A05
            r3 = 2
            if (r0 != r3) goto L_0x004a
            int r2 = r7.A0i
            int r0 = r2 >> 1
            int r6 = r6 + r0
            int r1 = r1 - r0
            int r5 = r5 - r0
            int r2 = r2 / r3
            int r4 = r4 + r2
        L_0x004a:
            android.graphics.drawable.GradientDrawable r0 = r7.A0K
            r0.setBounds(r6, r1, r5, r4)
            r7.A05()
            android.widget.EditText r0 = r7.A0L
            if (r0 == 0) goto L_0x0097
            android.graphics.drawable.Drawable r5 = r0.getBackground()
            if (r5 == 0) goto L_0x0097
            boolean r0 = X.C015307j.A03(r5)
            if (r0 == 0) goto L_0x0066
            android.graphics.drawable.Drawable r5 = r5.mutate()
        L_0x0066:
            android.graphics.Rect r1 = X.AnonymousClass000.A0J()
            android.widget.EditText r0 = r7.A0L
            X.AnonymousClass3B3.A01(r1, r0, r7)
            android.graphics.Rect r4 = r5.getBounds()
            int r1 = r4.left
            int r0 = r4.right
            if (r1 == r0) goto L_0x0097
            android.graphics.Rect r1 = X.AnonymousClass000.A0J()
            r5.getPadding(r1)
            int r3 = r4.left
            int r0 = r1.left
            int r3 = r3 - r0
            int r2 = r4.right
            int r0 = r1.right
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r1 = r4.top
            android.widget.EditText r0 = r7.A0L
            int r0 = r0.getBottom()
            r5.setBounds(r3, r1, r2, r0)
        L_0x0097:
            return
        L_0x0098:
            int r1 = r2.getTop()
            goto L_0x002d
        L_0x009d:
            r1 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0B():void");
    }

    public void A0C(float f2) {
        AnonymousClass3BO r4 = this.A0r;
        if (r4.A0B != f2) {
            if (this.A0A == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A0A = valueAnimator;
                valueAnimator.setInterpolator(C53572fv.A02);
                this.A0A.setDuration(167);
                C13690nt.A0p(this.A0A, this, 2);
            }
            this.A0A.setFloatValues(new float[]{r4.A0B, f2});
            this.A0A.start();
        }
    }

    public void A0D(int i2) {
        boolean z2 = this.A0S;
        int i3 = this.A08;
        TextView textView = this.A0M;
        if (i3 == -1) {
            textView.setText(String.valueOf(i2));
            this.A0M.setContentDescription((CharSequence) null);
            this.A0S = false;
        } else {
            if (C004601z.A04(textView) == 1) {
                C004601z.A0c(this.A0M, 0);
            }
            boolean A0g2 = C13700nu.A0g(i2, this.A08);
            this.A0S = A0g2;
            if (z2 != A0g2) {
                A0E(this.A0M, A0g2 ? this.A0j : this.A0k);
                if (this.A0S) {
                    C004601z.A0c(this.A0M, 1);
                }
            }
            TextView textView2 = this.A0M;
            Context context = getContext();
            Object[] objArr = new Object[2];
            Integer valueOf = Integer.valueOf(i2);
            objArr[0] = valueOf;
            AnonymousClass000.A1M(objArr, this.A08, 1);
            textView2.setText(context.getString(R.string.str1c22, objArr));
            TextView textView3 = this.A0M;
            Context context2 = getContext();
            Object[] objArr2 = new Object[2];
            objArr2[0] = valueOf;
            AnonymousClass000.A1M(objArr2, this.A08, 1);
            textView3.setContentDescription(context2.getString(R.string.str1c21, objArr2));
        }
        if (this.A0L != null && z2 != this.A0S) {
            A0G(false, false);
            A04();
            A03();
        }
    }

    public void A0E(TextView textView, int i2) {
        try {
            AnonymousClass04h.A08(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        AnonymousClass04h.A08(textView, R.style.style0286);
        C13680ns.A0v(getContext(), textView, R.color.color01c6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A0b
            if (r0 == 0) goto L_0x0034
            android.widget.EditText r0 = r3.A0L
            int r2 = r0.getSelectionEnd()
            android.widget.EditText r0 = r3.A0L
            if (r0 == 0) goto L_0x0017
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            android.widget.EditText r1 = r3.A0L
            if (r0 == 0) goto L_0x0035
            r0 = 0
            r1.setTransformationMethod(r0)
            r1 = 1
        L_0x0021:
            r3.A0c = r1
            com.google.android.material.internal.CheckableImageButton r0 = r3.A0N
            r0.setChecked(r1)
            if (r4 == 0) goto L_0x002f
            com.google.android.material.internal.CheckableImageButton r0 = r3.A0N
            r0.jumpDrawablesToCurrentState()
        L_0x002f:
            android.widget.EditText r0 = r3.A0L
            r0.setSelection(r2)
        L_0x0034:
            return
        L_0x0035:
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r1.setTransformationMethod(r0)
            r1 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0F(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(boolean r9, boolean r10) {
        /*
            r8 = this;
            boolean r7 = r8.isEnabled()
            android.widget.EditText r0 = r8.A0L
            r6 = 1
            if (r0 == 0) goto L_0x0014
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r5 = 1
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            android.widget.EditText r0 = r8.A0L
            if (r0 == 0) goto L_0x0114
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0114
        L_0x001f:
            X.39p r3 = r8.A0s
            boolean r4 = r3.A05()
            android.content.res.ColorStateList r1 = r8.A0B
            if (r1 == 0) goto L_0x003f
            X.3BO r2 = r8.A0r
            android.content.res.ColorStateList r0 = r2.A0P
            if (r0 == r1) goto L_0x0034
            r2.A0P = r1
            r2.A04()
        L_0x0034:
            android.content.res.ColorStateList r1 = r8.A0B
            android.content.res.ColorStateList r0 = r2.A0Q
            if (r0 == r1) goto L_0x003f
            r2.A0Q = r1
            r2.A04()
        L_0x003f:
            if (r7 != 0) goto L_0x00e8
            X.3BO r3 = r8.A0r
            int r2 = r8.A0m
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            android.content.res.ColorStateList r0 = r3.A0P
            if (r0 == r1) goto L_0x0052
            r3.A0P = r1
            r3.A04()
        L_0x0052:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            android.content.res.ColorStateList r0 = r3.A0Q
            if (r0 == r1) goto L_0x005f
            r3.A0Q = r1
            r3.A04()
        L_0x005f:
            if (r5 != 0) goto L_0x006b
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x009e
            if (r6 != 0) goto L_0x006b
            if (r4 == 0) goto L_0x009e
        L_0x006b:
            if (r10 != 0) goto L_0x0071
            boolean r0 = r8.A0Y
            if (r0 == 0) goto L_0x0097
        L_0x0071:
            android.animation.ValueAnimator r0 = r8.A0A
            if (r0 == 0) goto L_0x0080
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0080
            android.animation.ValueAnimator r0 = r8.A0A
            r0.cancel()
        L_0x0080:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x0098
            boolean r0 = r8.A0W
            if (r0 == 0) goto L_0x0098
            r8.A0C(r1)
        L_0x008b:
            r0 = 0
            r8.A0Y = r0
            boolean r0 = r8.A0H()
            if (r0 == 0) goto L_0x0097
            r8.A08()
        L_0x0097:
            return
        L_0x0098:
            X.3BO r0 = r8.A0r
            r0.A05(r1)
            goto L_0x008b
        L_0x009e:
            if (r10 != 0) goto L_0x00a4
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x0097
        L_0x00a4:
            android.animation.ValueAnimator r0 = r8.A0A
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00b3
            android.animation.ValueAnimator r0 = r8.A0A
            r0.cancel()
        L_0x00b3:
            r1 = 0
            if (r9 == 0) goto L_0x00e2
            boolean r0 = r8.A0W
            if (r0 == 0) goto L_0x00e2
            r8.A0C(r1)
        L_0x00bd:
            boolean r0 = r8.A0H()
            if (r0 == 0) goto L_0x00de
            android.graphics.drawable.GradientDrawable r0 = r8.A0K
            X.2nW r0 = (X.C56362nW) r0
            android.graphics.RectF r0 = r0.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00de
            boolean r0 = r8.A0H()
            if (r0 == 0) goto L_0x00de
            android.graphics.drawable.GradientDrawable r0 = r8.A0K
            X.2nW r0 = (X.C56362nW) r0
            r0.A00(r1, r1, r1, r1)
        L_0x00de:
            r0 = 1
            r8.A0Y = r0
            return
        L_0x00e2:
            X.3BO r0 = r8.A0r
            r0.A05(r1)
            goto L_0x00bd
        L_0x00e8:
            if (r4 == 0) goto L_0x00fc
            X.3BO r2 = r8.A0r
            android.widget.TextView r0 = r3.A0A
            if (r0 != 0) goto L_0x0106
            r1 = 0
        L_0x00f1:
            android.content.res.ColorStateList r0 = r2.A0P
            if (r0 == r1) goto L_0x005f
            r2.A0P = r1
            r2.A04()
            goto L_0x005f
        L_0x00fc:
            boolean r0 = r8.A0S
            if (r0 == 0) goto L_0x010b
            android.widget.TextView r0 = r8.A0M
            if (r0 == 0) goto L_0x010b
            X.3BO r2 = r8.A0r
        L_0x0106:
            android.content.res.ColorStateList r1 = r0.getTextColors()
            goto L_0x00f1
        L_0x010b:
            if (r6 == 0) goto L_0x005f
            android.content.res.ColorStateList r1 = r8.A0C
            if (r1 == 0) goto L_0x005f
            X.3BO r2 = r8.A0r
            goto L_0x00f1
        L_0x0114:
            r6 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0G(boolean, boolean):void");
    }

    public final boolean A0H() {
        return this.A0X && !TextUtils.isEmpty(this.A0O) && (this.A0K instanceof C56362nW);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.A0q;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            A09();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.A0P == null || (editText = this.A0L) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z2 = this.A0a;
        this.A0a = false;
        CharSequence hint = editText.getHint();
        this.A0L.setHint(this.A0P);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.A0L.setHint(hint);
            this.A0a = z2;
        }
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0d = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0d = false;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.A0K;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.A0X) {
            this.A0r.A0D(canvas);
        }
    }

    public void drawableStateChanged() {
        ColorStateList colorStateList;
        if (!this.A0Z) {
            boolean z2 = true;
            this.A0Z = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C004601z.A0u(this) || !isEnabled()) {
                z2 = false;
            }
            A0G(z2, false);
            A03();
            A0B();
            A04();
            AnonymousClass3BO r1 = this.A0r;
            if (r1 != null) {
                r1.A0c = drawableState;
                ColorStateList colorStateList2 = r1.A0P;
                if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = r1.A0Q) != null && colorStateList.isStateful())) {
                    r1.A04();
                    invalidate();
                }
            }
            this.A0Z = false;
        }
    }

    public int getBoxBackgroundColor() {
        return this.A04;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.A00;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.A01;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.A02;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.A03;
    }

    public int getBoxStrokeColor() {
        return this.A09;
    }

    public int getCounterMaxLength() {
        return this.A08;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.A0R || !this.A0S || (textView = this.A0M) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0B;
    }

    public EditText getEditText() {
        return this.A0L;
    }

    public CharSequence getError() {
        C616139p r1 = this.A0s;
        if (r1.A0E) {
            return r1.A0C;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int getErrorTextCurrentColor() {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        C616139p r1 = this.A0s;
        if (r1.A0F) {
            return r1.A0D;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A0s.A0B;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0X) {
            return this.A0O;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return AnonymousClass3BO.A00(this.A0r);
    }

    public final int getHintCurrentCollapsedTextColor() {
        AnonymousClass3BO r0 = this.A0r;
        int[] iArr = r0.A0c;
        return iArr != null ? r0.A0P.getColorForState(iArr, 0) : r0.A0P.getDefaultColor();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A0Q;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A0I;
    }

    public Typeface getTypeface() {
        return this.A0F;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        EditText editText;
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.A0K != null) {
            A0B();
        }
        if (this.A0X && (editText = this.A0L) != null) {
            Rect rect = this.A0o;
            AnonymousClass3B3.A01(rect, editText, this);
            int compoundPaddingLeft = rect.left + this.A0L.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.A0L.getCompoundPaddingRight();
            int i6 = this.A05;
            int paddingTop = i6 != 1 ? i6 != 2 ? getPaddingTop() : getBoxBackground().getBounds().top - A02() : getBoxBackground().getBounds().top + this.A0f;
            AnonymousClass3BO r6 = this.A0r;
            r6.A0C(compoundPaddingLeft, rect.top + this.A0L.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.A0L.getCompoundPaddingBottom());
            r6.A0B(compoundPaddingLeft, paddingTop, compoundPaddingRight, (i5 - i3) - getPaddingBottom());
            r6.A04();
            if (A0H() && !this.A0Y) {
                A08();
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        A0A();
        super.onMeasure(i2, i3);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass3PE)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass3PE r2 = (AnonymousClass3PE) parcelable;
        super.onRestoreInstanceState(r2.A00);
        setError(r2.A00);
        if (r2.A01) {
            A0F(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass3PE r1 = new AnonymousClass3PE(super.onSaveInstanceState());
        if (this.A0s.A05()) {
            r1.A00 = getError();
        }
        r1.A01 = this.A0c;
        return r1;
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.A04 != i2) {
            this.A04 = i2;
            A05();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(AnonymousClass00T.A00(getContext(), i2));
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.A05) {
            this.A05 = i2;
            A07();
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.A09 != i2) {
            this.A09 = i2;
            A04();
        }
    }

    public void setCounterEnabled(boolean z2) {
        if (this.A0R != z2) {
            if (z2) {
                AnonymousClass02Z r1 = new AnonymousClass02Z(getContext(), (AttributeSet) null);
                this.A0M = r1;
                r1.setId(R.id.textinput_counter);
                Typeface typeface = this.A0F;
                if (typeface != null) {
                    this.A0M.setTypeface(typeface);
                }
                this.A0M.setMaxLines(1);
                A0E(this.A0M, this.A0k);
                this.A0s.A02(this.A0M, 2);
                EditText editText = this.A0L;
                A0D(editText == null ? 0 : editText.getText().length());
            } else {
                this.A0s.A03(this.A0M, 2);
                this.A0M = null;
            }
            this.A0R = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.A08 != i2) {
            if (i2 <= 0) {
                i2 = -1;
            }
            this.A08 = i2;
            if (this.A0R) {
                EditText editText = this.A0L;
                A0D(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0B = colorStateList;
        this.A0C = colorStateList;
        if (this.A0L != null) {
            A0G(false, false);
        }
    }

    public void setEnabled(boolean z2) {
        A00(this, z2);
        super.setEnabled(z2);
    }

    public void setError(CharSequence charSequence) {
        C616139p r3 = this.A0s;
        if (!r3.A0E) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0C = charSequence;
            r3.A0A.setText(charSequence);
            int i2 = r3.A00;
            if (i2 != 1) {
                r3.A01 = 1;
            }
            r3.A01(i2, r3.A01, r3.A06(r3.A0A, charSequence));
            return;
        }
        r3.A00();
    }

    public void setErrorEnabled(boolean z2) {
        C616139p r3 = this.A0s;
        if (r3.A0E != z2) {
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            if (z2) {
                AnonymousClass02Z r1 = new AnonymousClass02Z(r3.A0H, (AttributeSet) null);
                r3.A0A = r1;
                r1.setId(R.id.textinput_error);
                Typeface typeface = r3.A07;
                if (typeface != null) {
                    r3.A0A.setTypeface(typeface);
                }
                int i2 = r3.A03;
                r3.A03 = i2;
                TextView textView = r3.A0A;
                if (textView != null) {
                    r3.A0I.A0E(textView, i2);
                }
                r3.A0A.setVisibility(4);
                C004601z.A0c(r3.A0A, 1);
                r3.A02(r3.A0A, 0);
            } else {
                r3.A00();
                r3.A03(r3.A0A, 0);
                r3.A0A = null;
                TextInputLayout textInputLayout = r3.A0I;
                textInputLayout.A03();
                textInputLayout.A04();
            }
            r3.A0E = z2;
        }
    }

    public void setErrorTextAppearance(int i2) {
        C616139p r0 = this.A0s;
        r0.A03 = i2;
        TextView textView = r0.A0A;
        if (textView != null) {
            r0.A0I.A0E(textView, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            C616139p r3 = this.A0s;
            if (!r3.A0F) {
                setHelperTextEnabled(true);
            }
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0D = charSequence;
            r3.A0B.setText(charSequence);
            int i2 = r3.A00;
            if (i2 != 2) {
                r3.A01 = 2;
            }
            r3.A01(i2, r3.A01, r3.A06(r3.A0B, charSequence));
        } else if (this.A0s.A0F) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        TextView textView = this.A0s.A0B;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        C616139p r4 = this.A0s;
        if (r4.A0F != z2) {
            Animator animator = r4.A06;
            if (animator != null) {
                animator.cancel();
            }
            if (z2) {
                AnonymousClass02Z r1 = new AnonymousClass02Z(r4.A0H, (AttributeSet) null);
                r4.A0B = r1;
                r1.setId(R.id.textinput_helper_text);
                Typeface typeface = r4.A07;
                if (typeface != null) {
                    r4.A0B.setTypeface(typeface);
                }
                r4.A0B.setVisibility(4);
                C004601z.A0c(r4.A0B, 1);
                int i2 = r4.A04;
                r4.A04 = i2;
                TextView textView = r4.A0B;
                if (textView != null) {
                    AnonymousClass04h.A08(textView, i2);
                }
                r4.A02(r4.A0B, 1);
            } else {
                Animator animator2 = r4.A06;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i3 = r4.A00;
                if (i3 == 2) {
                    r4.A01 = 0;
                }
                r4.A01(i3, r4.A01, r4.A06(r4.A0B, (CharSequence) null));
                r4.A03(r4.A0B, 1);
                r4.A0B = null;
                TextInputLayout textInputLayout = r4.A0I;
                textInputLayout.A03();
                textInputLayout.A04();
            }
            r4.A0F = z2;
        }
    }

    public void setHelperTextTextAppearance(int i2) {
        C616139p r0 = this.A0s;
        r0.A04 = i2;
        TextView textView = r0.A0B;
        if (textView != null) {
            AnonymousClass04h.A08(textView, i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0X) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.A0W = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.A0X) {
            this.A0X = z2;
            if (!z2) {
                this.A0a = false;
                if (!TextUtils.isEmpty(this.A0O) && TextUtils.isEmpty(this.A0L.getHint())) {
                    this.A0L.setHint(this.A0O);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.A0L.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0O)) {
                        setHint(hint);
                    }
                    this.A0L.setHint((CharSequence) null);
                }
                this.A0a = true;
            }
            if (this.A0L != null) {
                A09();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        AnonymousClass3BO r0 = this.A0r;
        r0.A09(i2);
        this.A0C = r0.A0P;
        if (this.A0L != null) {
            A0G(false, false);
            A09();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A0Q = charSequence;
        CheckableImageButton checkableImageButton = this.A0N;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? AnonymousClass08E.A01(getContext(), i2) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A0I = drawable;
        CheckableImageButton checkableImageButton = this.A0N;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        EditText editText;
        if (this.A0b != z2) {
            this.A0b = z2;
            if (!z2 && this.A0c && (editText = this.A0L) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.A0c = false;
            A0A();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        this.A0T = true;
        A06();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.A0E = mode;
        this.A0U = true;
        A06();
    }

    public void setTextInputAccessibilityDelegate(AnonymousClass3PA r2) {
        EditText editText = this.A0L;
        if (editText != null) {
            C004601z.A0j(editText, r2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0F) {
            this.A0F = typeface;
            AnonymousClass3BO r0 = this.A0r;
            r0.A0V = typeface;
            r0.A0T = typeface;
            r0.A04();
            C616139p r1 = this.A0s;
            if (typeface != r1.A07) {
                r1.A07 = typeface;
                TextView textView = r1.A0A;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = r1.A0B;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0M;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }
}
