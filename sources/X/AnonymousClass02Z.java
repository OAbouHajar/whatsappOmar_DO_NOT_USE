package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.02Z  reason: invalid class name */
public class AnonymousClass02Z extends TextView implements AnonymousClass015, AnonymousClass02a, C004702b {
    public Future A00;
    public boolean A01;
    public final AnonymousClass08Q A02;
    public final AnonymousClass08S A03;
    public final AnonymousClass08R A04;

    public AnonymousClass02Z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AnonymousClass02Z(Context context, AttributeSet attributeSet, int i2) {
        super(AnonymousClass08O.A00(context), attributeSet, i2);
        this.A01 = false;
        AnonymousClass08P.A03(getContext(), this);
        AnonymousClass08Q r0 = new AnonymousClass08Q(this);
        this.A02 = r0;
        r0.A05(attributeSet, i2);
        AnonymousClass08R r02 = new AnonymousClass08R(this);
        this.A04 = r02;
        r02.A0A(attributeSet, i2);
        r02.A02();
        this.A03 = new AnonymousClass08S(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r2 >= 18) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass08U A00(android.widget.TextView r3) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 < r0) goto L_0x0010
            android.text.PrecomputedText$Params r1 = X.AnonymousClass08T.A00(r3)
            X.08U r0 = new X.08U
            r0.<init>(r1)
            return r0
        L_0x0010:
            android.text.TextPaint r1 = r3.getPaint()
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r1)
            X.08V r1 = new X.08V
            r1.<init>(r0)
            r0 = 23
            if (r2 < r0) goto L_0x003c
            int r0 = X.AnonymousClass08W.A00(r3)
            r1.A01(r0)
            int r0 = X.AnonymousClass08W.A01(r3)
            r1.A02(r0)
        L_0x0030:
            android.text.TextDirectionHeuristic r0 = X.AnonymousClass04h.A01(r3)
            r1.A03(r0)
        L_0x0037:
            X.08U r0 = r1.A00()
            return r0
        L_0x003c:
            r0 = 18
            if (r2 < r0) goto L_0x0037
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02Z.A00(android.widget.TextView):X.08U");
    }

    public static void A01(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new NullPointerException("getPrecomputedText");
        }
        A00(textView);
        throw new NullPointerException("getParams");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass08Q r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass08R r02 = this.A04;
        if (r02 != null) {
            r02.A02();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeMinTextSize();
        }
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeStepGranularity();
        }
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AnonymousClass08R r0 = this.A04;
        return r0 != null ? r0.A0C.A07 : new int[0];
    }

    public int getAutoSizeTextType() {
        if (AnonymousClass02a.A00) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            return r0.A0C.A03;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A02;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A02;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        AnonymousClass08Y r0 = this.A04.A08;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        AnonymousClass08Y r0 = this.A04.A08;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public CharSequence getText() {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                A01(this);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x000f
            X.08S r0 = r2.A03
            if (r0 == 0) goto L_0x000f
            android.view.textclassifier.TextClassifier r0 = r0.A00()
            return r0
        L_0x000f:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02Z.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public AnonymousClass08U getTextMetricsParamsCompat() {
        return A00(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass08R.A01(editorInfo, onCreateInputConnection, this);
        AnonymousClass08Z.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        AnonymousClass08R r1 = this.A04;
        if (r1 != null && !AnonymousClass02a.A00) {
            r1.A0C.A04();
        }
    }

    public void onMeasure(int i2, int i3) {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                A01(this);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        AnonymousClass08R r1 = this.A04;
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
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A04(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (AnonymousClass02a.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A0B(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (AnonymousClass02a.A00) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A03(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass08Q r0 = this.A02;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AnonymousClass08Q r0 = this.A02;
        if (r0 != null) {
            r0.A02(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable A05 = i2 != 0 ? AnonymousClass06L.A02().A05(context, i2) : null;
        Drawable A052 = i3 != 0 ? AnonymousClass06L.A02().A05(context, i3) : null;
        Drawable A053 = i4 != 0 ? AnonymousClass06L.A02().A05(context, i4) : null;
        if (i5 != 0) {
            drawable = AnonymousClass06L.A02().A05(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(A05, A052, A053, drawable);
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable A05 = i2 != 0 ? AnonymousClass06L.A02().A05(context, i2) : null;
        Drawable A052 = i3 != 0 ? AnonymousClass06L.A02().A05(context, i3) : null;
        Drawable A053 = i4 != 0 ? AnonymousClass06L.A02().A05(context, i4) : null;
        if (i5 != 0) {
            drawable = AnonymousClass06L.A02().A05(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(A05, A052, A053, drawable);
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass04h.A02(callback, this));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            AnonymousClass04h.A06(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            AnonymousClass04h.A07(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        if (i2 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (i2 != fontMetricsInt) {
                setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setPrecomputedText(C017008a r3) {
        A01(this);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass08Q r0 = this.A02;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass08Q r0 = this.A02;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        AnonymousClass08R r0 = this.A04;
        r0.A07(colorStateList);
        r0.A02();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        AnonymousClass08R r0 = this.A04;
        r0.A08(mode);
        r0.A02();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            r0.A05(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        AnonymousClass08S r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A03) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.A01(textClassifier);
        }
    }

    public void setTextFuture(Future future) {
        this.A00 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(AnonymousClass08U r4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18) {
            C017108b.A04(this, AnonymousClass04h.A00(r4.A02()));
            if (i2 >= 23) {
                getPaint().set(r4.A04);
                AnonymousClass08W.A04(this, r4.A00());
                AnonymousClass08W.A05(this, r4.A01());
                return;
            }
        }
        TextPaint textPaint = r4.A04;
        float textScaleX = textPaint.getTextScaleX();
        getPaint().set(textPaint);
        if (textScaleX == getTextScaleX()) {
            setTextScaleX((textScaleX / 2.0f) + 1.0f);
        }
        setTextScaleX(textScaleX);
    }

    public void setTextSize(int i2, float f2) {
        if (AnonymousClass02a.A00) {
            super.setTextSize(i2, f2);
            return;
        }
        AnonymousClass08R r0 = this.A04;
        if (r0 != null) {
            AnonymousClass08X r1 = r0.A0C;
            if (!(!(r1.A09 instanceof AnonymousClass014)) || r1.A03 == 0) {
                r1.A06(i2, f2);
            }
        }
    }

    public void setTypeface(Typeface typeface, int i2) {
        if (!this.A01) {
            Typeface typeface2 = null;
            if (typeface != null && i2 > 0) {
                typeface2 = AnonymousClass08N.A00(getContext(), typeface, i2);
            }
            this.A01 = true;
            if (typeface2 != null) {
                Typeface typeface3 = typeface2;
            }
            this.A01 = false;
        }
    }
}
