package com.obwhatsapp;

import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass090;
import X.AnonymousClass0EL;
import X.AnonymousClass2Sy;
import X.AnonymousClass2TP;
import X.AnonymousClass3MD;
import X.AnonymousClass3MF;
import X.AnonymousClass5MQ;
import X.C004601z;
import X.C17020u3;
import X.C17250um;
import X.C30521cU;
import X.C30531cW;
import X.C45922Bq;
import X.C89684cj;
import X.C99984uu;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import com.obwhatsapp.yo.tf;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class TextEmojiLabel extends C30531cW {
    public static final Spannable.Factory A0D = new AnonymousClass3MD();
    public static final boolean A0E;
    public static final boolean A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public TextView.BufferType A05;
    public AnonymousClass0EL A06;
    public AnonymousClass3MF A07;
    public AnonymousClass5MQ A08;
    public AnonymousClass01V A09;
    public C17250um A0A;
    public C17020u3 A0B;
    public CharSequence A0C;

    static {
        boolean z2;
        Class<Layout> cls = Layout.class;
        try {
            Class cls2 = Integer.TYPE;
            cls.getDeclaredMethod("processToSupportEmoji", new Class[]{CharSequence.class, cls2, cls2});
            z2 = true;
        } catch (NoSuchMethodException | SecurityException unused) {
            z2 = false;
        }
        A0E = z2;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT < 19) {
            z3 = true;
        }
        A0F = z3;
    }

    public TextEmojiLabel(Context context) {
        super(context);
        initTE();
        A0B();
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initTE();
        A0B();
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0B();
    }

    public void A0A() {
        setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void A0B() {
        if (A0F) {
            setSpannableFactory(A0D);
        }
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public void A0C(int i2, int i3) {
        Drawable A042 = AnonymousClass00T.A04(getContext(), i2);
        if (this.A01.A0T()) {
            setCompoundDrawablesWithIntrinsicBounds(A042, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A042, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(i3));
    }

    public void A0D(Drawable drawable) {
        if (this.A01.A0T()) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.dimen00e9));
    }

    public void A0E(AnonymousClass2TP r8, CharSequence charSequence, List list, float f2, int i2, boolean z2) {
        AnonymousClass2TP r3 = r8;
        if (z2) {
            charSequence = C45922Bq.A03(this.A09, this.A0B, charSequence);
        }
        if (i2 > 0 && charSequence != null && charSequence.length() > i2) {
            int charCount = i2 + (Character.charCount(Character.codePointAt(charSequence, i2 - 1)) - 1);
            charSequence = charSequence instanceof Editable ? ((Editable) charSequence).delete(charCount, charSequence.length()) : charSequence.subSequence(0, charCount);
        }
        CharSequence A042 = AnonymousClass2Sy.A04(getContext(), getPaint(), this.A0A, charSequence, f2);
        if (r8 == null) {
            r3 = AnonymousClass2TP.A04;
        }
        setText((CharSequence) AnonymousClass2TP.A00(getContext(), this.A01, r3, A042, list, false).A00);
    }

    public void A0F(AnonymousClass2TP r8, CharSequence charSequence, List list, int i2, boolean z2) {
        A0E(r8, charSequence, list, 1.0f, i2, z2);
    }

    public void A0G(CharSequence charSequence) {
        A0I((List) null, charSequence);
    }

    public void A0H(CharSequence charSequence, List list, int i2, boolean z2) {
        A0F((AnonymousClass2TP) null, charSequence, list, i2, z2);
    }

    public void A0I(List list, CharSequence charSequence) {
        A0H(charSequence, list, 0, false);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AnonymousClass0EL r0 = this.A06;
        return (r0 != null && r0.A0K(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AnonymousClass0EL r0 = this.A06;
        return (r0 != null && r0.A0J(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public void initTE() {
        tf.myFace(this);
        tf.initTE(this);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.A03 > 0) {
            canvas2.drawRect((float) (getScrollX() + getPaddingLeft()), (float) (((getHeight() - getPaddingBottom()) - this.A01) - this.A02), (float) ((getScrollX() + getWidth()) - getPaddingRight()), (float) ((getHeight() - getPaddingBottom()) - this.A01), this.A04);
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(getText());
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            throw new RuntimeException(e2);
        }
    }

    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        AnonymousClass0EL r0 = this.A06;
        if (r0 != null) {
            r0.A0F(z2, i2, rect);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        AnonymousClass5MQ r1 = this.A08;
        if (r1 != null) {
            int i6 = i4 - i2;
            C99984uu r12 = (C99984uu) r1;
            C30521cU r6 = r12.A01;
            AtomicReference atomicReference = r12.A06;
            String str = r12.A03;
            String str2 = r12.A04;
            List list = r12.A05;
            AnonymousClass2TP r9 = r12.A02;
            float f2 = r12.A00;
            TextEmojiLabel textEmojiLabel = r6.A02;
            textEmojiLabel.A08 = null;
            Object obj = atomicReference.get();
            CharSequence text = textEmojiLabel.getText();
            if (obj == null || obj.equals(text)) {
                TextUtils.TruncateAt ellipsize = textEmojiLabel.getEllipsize();
                textEmojiLabel.setEllipsize((TextUtils.TruncateAt) null);
                TextPaint paint = textEmojiLabel.getPaint();
                String A022 = r6.A02(str, str2);
                if (((int) Math.ceil((double) paint.measureText(A022))) > i6) {
                    StringBuilder sb = new StringBuilder(" ");
                    sb.append(str2);
                    int ceil = i6 - ((int) Math.ceil((double) paint.measureText(sb.toString())));
                    if (ceil > 0) {
                        str = r6.A02(TextUtils.ellipsize(str, paint, (float) ceil, TextUtils.TruncateAt.END).toString(), str2);
                    }
                    A022 = str;
                }
                int i7 = 0;
                if (f2 == 1.0f) {
                    i7 = 256;
                }
                textEmojiLabel.A0E(r9, A022, list, f2, i7, false);
                textEmojiLabel.setEllipsize(ellipsize);
                return;
            }
            Log.e("textemojilabelviewcontroller/post-layout updating wrong text");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A03
            if (r0 <= 0) goto L_0x0025
            int r2 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            super.onMeasure(r7, r8)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 == r0) goto L_0x0020
            int r0 = r6.A03
            int r1 = r1 * r0
            int r1 = r1 / 100
        L_0x0018:
            int r0 = r6.getMeasuredHeight()
            r6.setMeasuredDimension(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            int r1 = r6.getMeasuredWidth()
            goto L_0x0018
        L_0x0025:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r1 == r0) goto L_0x002f
            r0 = 17
            if (r1 != r0) goto L_0x0093
        L_0x002f:
            super.onMeasure(r7, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            goto L_0x0096
        L_0x0033:
            r1 = move-exception
            java.lang.String r0 = "textemojilabel/measure "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.CharSequence r0 = r6.A0C
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            int r0 = r3.length()
            java.lang.Class<android.text.style.MetricAffectingSpan> r2 = android.text.style.MetricAffectingSpan.class
            r5 = 0
            int r1 = r3.nextSpanTransition(r5, r0, r2)
        L_0x004c:
            java.lang.String r4 = " "
            if (r1 < 0) goto L_0x0064
            int r0 = r3.length()
            if (r1 >= r0) goto L_0x0064
            r3.insert(r1, r4)
            int r1 = r1 + 1
            int r0 = r3.length()
            int r1 = r3.nextSpanTransition(r1, r0, r2)
            goto L_0x004c
        L_0x0064:
            r6.A0C = r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d }
            super.setText(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d }
            super.onMeasure(r7, r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d }
            goto L_0x0096
        L_0x006d:
            r1 = move-exception
            java.lang.String r0 = "textemojilabel/measure1 "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.CharSequence r0 = r6.A0C
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            r2 = 10
            int r1 = android.text.TextUtils.indexOf(r3, r2, r5)
        L_0x0081:
            if (r1 < 0) goto L_0x008e
            int r0 = r1 + 1
            android.text.SpannableStringBuilder r3 = r3.replace(r1, r0, r4)
            int r1 = android.text.TextUtils.indexOf(r3, r2, r0)
            goto L_0x0081
        L_0x008e:
            r6.A0C = r3
            super.setText(r3)
        L_0x0093:
            super.onMeasure(r7, r8)
        L_0x0096:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 == 0) goto L_0x001f
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r0 = r6.getCompoundPaddingLeft()
            int r4 = r4 - r0
            int r0 = r6.getCompoundPaddingRight()
            int r4 = r4 - r0
            if (r4 <= 0) goto L_0x001f
            int r0 = r6.A00
            if (r0 == r4) goto L_0x001f
            java.lang.CharSequence r0 = r6.A0C
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x001f
            android.text.TextUtils$TruncateAt r0 = r6.getEllipsize()
            if (r0 == 0) goto L_0x001f
            android.text.method.TransformationMethod r0 = r6.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.SingleLineTransformationMethod
            if (r0 == 0) goto L_0x001f
            r6.A00 = r4
            android.text.method.TransformationMethod r0 = r6.getTransformationMethod()
            if (r0 == 0) goto L_0x00f1
            android.text.method.TransformationMethod r1 = r6.getTransformationMethod()
            java.lang.CharSequence r0 = r6.A0C
            java.lang.CharSequence r3 = r1.getTransformation(r0, r6)
        L_0x00d6:
            android.text.TextPaint r2 = r6.getPaint()
            float r1 = (float) r4
            android.text.TextUtils$TruncateAt r0 = r6.getEllipsize()
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r3, r2, r1, r0)
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x001f
            android.widget.TextView$BufferType r0 = r6.A05
            super.setText(r1, r0)
            return
        L_0x00f1:
            java.lang.CharSequence r3 = r6.A0C
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.TextEmojiLabel.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.A07 == null) {
            return onTouchEvent;
        }
        CharSequence text = getText();
        return (!(text instanceof Spannable) || getLayout() == null) ? onTouchEvent : onTouchEvent | this.A07.onTouchEvent(this, (Spannable) text, motionEvent);
    }

    public void setAccessibilityHelper(AnonymousClass0EL r1) {
        this.A06 = r1;
        C004601z.A0j(this, r1);
    }

    public void setLinkHandler(AnonymousClass3MF r1) {
        this.A07 = r1;
    }

    public void setOnPostLayoutListener(AnonymousClass5MQ r1) {
        this.A08 = r1;
    }

    public void setPlaceholder(int i2) {
        if (this.A03 != i2) {
            this.A03 = i2;
            if (i2 > 0) {
                Paint.FontMetricsInt A002 = C89684cj.A00(getPaint());
                this.A02 = ((-A002.ascent) * 6) / 10;
                this.A01 = A002.bottom;
                Paint paint = this.A04;
                if (paint == null) {
                    paint = new Paint();
                    this.A04 = paint;
                }
                paint.setColor(AnonymousClass090.A06(getPaint().getColor(), (Color.alpha(getPaint().getColor()) * 12) / MotionEventCompat.ACTION_MASK));
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (A0E && charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                char charAt = charSequence.charAt(i2);
                if (55296 <= charAt && charAt <= 57343) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    }
                    spannableStringBuilder.replace(i2, i2 + 1, "□");
                }
            }
            if (spannableStringBuilder != null) {
                charSequence = spannableStringBuilder;
            }
        }
        this.A0C = charSequence;
        this.A05 = bufferType;
        this.A00 = 0;
        if ((A0F || this.A07 != null) && (charSequence instanceof Spanned)) {
            bufferType = TextView.BufferType.SPANNABLE;
        }
        super.setText(charSequence, bufferType);
    }
}
