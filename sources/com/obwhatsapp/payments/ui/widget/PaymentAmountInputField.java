package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass1UP;
import X.AnonymousClass1VR;
import X.AnonymousClass5xr;
import X.AnonymousClass685;
import X.AnonymousClass69P;
import X.C110125dY;
import X.C111265fd;
import X.C115725qD;
import X.C1212964y;
import X.C13680ns;
import X.C14870pt;
import X.C16150sX;
import X.C28411Vz;
import X.C52652eD;
import X.C809346e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.math.BigDecimal;
import java.util.HashSet;

public class PaymentAmountInputField extends AnonymousClass1VR {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public ValueAnimator A06;
    public TextPaint A07;
    public View A08;
    public Animation A09;
    public TextView A0A;
    public C14870pt A0B;
    public AnonymousClass013 A0C;
    public AnonymousClass013 A0D;
    public C28411Vz A0E;
    public AnonymousClass69P A0F;
    public AnonymousClass685 A0G;
    public String A0H;
    public BigDecimal A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final Runnable A0O;

    public PaymentAmountInputField(Context context) {
        super(context);
        A02();
        this.A0O = new C1212964y(this);
        this.A0N = false;
        this.A0J = true;
        A0B((AttributeSet) null);
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0O = new C1212964y(this);
        this.A0N = false;
        this.A0J = true;
        A0B(attributeSet);
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A0O = new C1212964y(this);
        this.A0N = false;
        this.A0J = true;
        A0B(attributeSet);
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public static String A00(AnonymousClass013 r2) {
        String A002 = C809346e.A00(r2);
        String str = ",";
        String str2 = str;
        if (A002.contains(str)) {
            str = ".";
        }
        return str.equals(".") ? "\\." : str2;
    }

    private ViewGroup getFirstNonWrapContentParent() {
        if (getParent() != null) {
            ViewParent parent = getParent();
            while (true) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup == null) {
                    break;
                } else if (viewGroup.getLayoutParams().width != -2) {
                    return viewGroup;
                } else {
                    parent = viewGroup.getParent();
                }
            }
        }
        return null;
    }

    public void A02() {
        if (!this.A0M) {
            this.A0M = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            AnonymousClass01J r1 = A002.AR8;
            this.A03 = (AnonymousClass013) r1.get();
            this.A02 = C16150sX.A0T(A002);
            this.A0B = C16150sX.A02(A002);
            this.A0C = (AnonymousClass013) r1.get();
        }
    }

    public float A05(String str) {
        return A08(str, getTextSize());
    }

    public void A07(boolean z2) {
        AnonymousClass69P r1 = this.A0F;
        if (r1 != null) {
            Editable text = getText();
            AnonymousClass00B.A06(text);
            r1.ART(text.toString(), z2);
        }
    }

    public final float A08(String str, float f2) {
        String str2;
        String str3;
        float f3 = 0.0f;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (this.A07 == null) {
            TextPaint textPaint = new TextPaint();
            this.A07 = textPaint;
            textPaint.setTypeface(AnonymousClass1UP.A03(getContext()));
        }
        int indexOf = TextUtils.indexOf(str, C809346e.A00(this.A0D).charAt(0));
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str3 = str.substring(indexOf);
        } else {
            str2 = str;
            str3 = "";
        }
        this.A07.setTextSize(f2);
        float measureText = this.A07.measureText(str2);
        if (!TextUtils.isEmpty(str3)) {
            this.A07.setTextSize(f2 * 1.0f);
            f3 = this.A07.measureText(str3);
        }
        return measureText + f3;
    }

    public void A09() {
        if (this.A08 != null) {
            ValueAnimator valueAnimator = this.A05;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else {
                float dimensionPixelSize = (float) getResources().getDimensionPixelSize(R.dimen.dimen02b4);
                View view = this.A08;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.setRepeatCount(3);
                ofFloat.setRepeatMode(2);
                ofFloat.setDuration(65);
                ofFloat.addUpdateListener(new AnonymousClass5xr(view, dimensionPixelSize));
                this.A05 = ofFloat;
                ofFloat.addListener(new C110125dY(this));
            }
            this.A05.start();
        }
    }

    public final void A0A() {
        String str = "0123456789";
        if (this.A0J) {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(C809346e.A00(this.A0D).charAt(0));
            str = A0q.toString();
        }
        setKeyListener(DigitsKeyListener.getInstance(str));
    }

    public final void A0B(AttributeSet attributeSet) {
        boolean z2 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C115725qD.A02);
            boolean z3 = obtainStyledAttributes.getBoolean(0, false);
            this.A0L = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            z2 = z3;
        } else {
            this.A0L = false;
        }
        this.A0D = this.A0C;
        this.A0H = C13680ns.A0f(this);
        this.A02 = -1;
        this.A04 = C13680ns.A0D(this).getConfiguration().orientation;
        setInputType(2);
        A0A();
        setFilterTouchesWhenObscured(true);
        setCursorVisible(true);
        setFocusable(true);
        setSingleLine(true);
        addTextChangedListener(this);
        setAutoScaleTextSize(z2);
        this.A0N = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(java.lang.String r7) {
        /*
            r6 = this;
            float r5 = r6.getTextSize()
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x0081
            int r0 = r6.A02
            if (r0 <= 0) goto L_0x0081
            r4 = 0
        L_0x000d:
            float r3 = r6.A00
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r4
            r0 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r0
            float r2 = r2 - r1
            float r3 = r3 * r2
            float r2 = r6.A08(r7, r3)
            if (r4 != 0) goto L_0x006c
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0023:
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0075
        L_0x0028:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x006b
            android.animation.ValueAnimator r0 = r6.A06
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x003b
            android.animation.ValueAnimator r0 = r6.A06
            r0.cancel()
        L_0x003b:
            r0 = 2
            float[] r1 = new float[r0]
            r0 = 0
            r1[r0] = r5
            r0 = 1
            r1[r0] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r1)
            r6.A06 = r2
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r2.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r6.A06
            r0 = 100
            r2.setDuration(r0)
            android.animation.ValueAnimator r2 = r6.A06
            r1 = 0
            com.facebook.redex.IDxUListenerShape142S0100000_3_I1 r0 = new com.facebook.redex.IDxUListenerShape142S0100000_3_I1
            r0.<init>(r6, r1)
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r6.A06
            r0.start()
        L_0x006b:
            return
        L_0x006c:
            r0 = 1
            if (r4 != r0) goto L_0x0075
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = 1061158912(0x3f400000, float:0.75)
            goto L_0x0023
        L_0x0075:
            int r4 = r4 + 1
            r0 = 2
            if (r4 <= r0) goto L_0x000d
            float r0 = r6.A01
            float r3 = java.lang.Math.max(r3, r0)
            goto L_0x0028
        L_0x0081:
            float r3 = r6.A00
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.widget.PaymentAmountInputField.A0C(java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        if (r5 != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        r0 = r9.A03.A9K(r9.A02, r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r11) {
        /*
            r10 = this;
            java.lang.String r1 = r11.toString()
            java.lang.String r0 = r10.A0H
            boolean r0 = r1.equals(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0129
            X.685 r0 = r10.A0G
            if (r0 == 0) goto L_0x0129
            java.lang.String r7 = r11.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r5 = 1
            if (r0 == 0) goto L_0x00a6
            r10.A0H = r7
            java.lang.String r0 = "0"
            r10.setHint(r0)
        L_0x0023:
            r5 = 0
        L_0x0024:
            java.lang.String r1 = r10.A0H
            X.013 r0 = r10.A0D
            java.lang.String r0 = X.C809346e.A00(r0)
            char r0 = r0.charAt(r6)
            int r3 = android.text.TextUtils.indexOf(r1, r0)
            java.lang.String r2 = r10.A0H
            r1 = r2
            r0 = -1
            if (r3 == r0) goto L_0x0057
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r1)
            int r0 = r2.length()
            java.lang.CharSequence r0 = r2.subSequence(r3, r0)
            java.lang.String r0 = r0.toString()
            X.5dn r1 = new X.5dn
            r1.<init>(r0)
            int r0 = r2.length()
            r2.setSpan(r1, r3, r0, r6)
        L_0x0057:
            r10.setText(r2)
            java.lang.String r0 = r10.A0H
            int r0 = r0.length()
            r10.setSelection(r0)
            boolean r0 = r10.A0K
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r10.A0H
            r10.A0C(r0)
        L_0x006c:
            if (r5 != 0) goto L_0x0080
        L_0x006e:
            X.69P r1 = r10.A0F
            if (r1 == 0) goto L_0x0080
            android.text.Editable r0 = r10.getText()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.toString()
            r1.AMQ(r0)
        L_0x0080:
            android.widget.TextView r0 = r10.A0A
            if (r0 == 0) goto L_0x00a5
            if (r5 != 0) goto L_0x0088
            r6 = 8
        L_0x0088:
            r0.setVisibility(r6)
            X.0pt r0 = r10.A0B
            java.lang.Runnable r3 = r10.A0O
            r0.A0J(r3)
            if (r5 == 0) goto L_0x00a5
            android.view.animation.Animation r0 = r10.A09
            r0.cancel()
            android.view.animation.Animation r0 = r10.A09
            r0.reset()
            X.0pt r2 = r10.A0B
            r0 = 1200(0x4b0, double:5.93E-321)
            r2.A0L(r3, r0)
        L_0x00a5:
            return
        L_0x00a6:
            X.013 r0 = r10.A0D
            java.lang.String r0 = A00(r0)
            java.lang.String r8 = ""
            java.lang.String r4 = r7.replaceAll(r0, r8)
            java.lang.String r1 = r10.A0H
            X.013 r0 = r10.A0D
            java.lang.String r0 = A00(r0)
            java.lang.String r0 = r1.replaceAll(r0, r8)
            X.685 r9 = r10.A0G
            int r3 = r10.A03
            int r1 = r4.length()
            int r0 = r0.length()
            r2 = 0
            if (r1 >= r0) goto L_0x00ce
            r2 = 1
        L_0x00ce:
            X.62Q r9 = (X.AnonymousClass62Q) r9
            java.lang.String r0 = "^([0]([.,]\\d{0,2})?|[1-9]\\d*([.,]\\d{0,2})?)"
            boolean r0 = r4.matches(r0)
            if (r0 == 0) goto L_0x00ef
            X.1Vz r1 = r9.A03
            X.013 r0 = r9.A02
            java.math.BigDecimal r0 = r1.A9K(r0, r4)
            if (r0 == 0) goto L_0x00ef
            X.5s3 r2 = r9.A00(r4, r0, r3, r2)
        L_0x00e6:
            int r1 = r2.A00
            if (r1 != 0) goto L_0x00f5
            r10.setAmount(r7, r4)
            goto L_0x0023
        L_0x00ef:
            X.5s3 r2 = new X.5s3
            r2.<init>(r5, r8)
            goto L_0x00e6
        L_0x00f5:
            r10.A09()
            r0 = 3
            if (r1 != r0) goto L_0x0023
            java.lang.String r3 = r2.A01
            if (r3 == 0) goto L_0x0023
            android.widget.TextView r0 = r10.A0A
            if (r0 == 0) goto L_0x010b
            r0.setText(r3)
            X.01V r0 = r10.A02
            X.C41631wI.A02(r0)
        L_0x010b:
            java.math.BigDecimal r2 = r10.A0I
            if (r2 == 0) goto L_0x0120
            X.1Vz r1 = r10.A0E
            X.013 r0 = r10.A0D
            java.math.BigDecimal r0 = r1.A9K(r0, r4)
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L_0x0120
            r10.setAmount(r7, r4)
        L_0x0120:
            X.69P r0 = r10.A0F
            if (r0 == 0) goto L_0x0024
            r0.AQb(r3)
            goto L_0x0024
        L_0x0129:
            r5 = 0
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.widget.PaymentAmountInputField.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.A0I = this.A0E.A9K(this.A0D, charSequence.toString());
        }
    }

    public int getCursorColor() {
        return AnonymousClass00T.A00(getContext(), R.color.color0659);
    }

    public int getCursorVerticalPadding() {
        return getResources().getDimensionPixelSize(R.dimen.dimen05d1);
    }

    public int getCursorWidth() {
        return getResources().getDimensionPixelSize(R.dimen.dimen05d2);
    }

    public AnonymousClass013 getWhatsAppLocale() {
        return this.A0D;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i2 = configuration.orientation;
        if (i2 != this.A04) {
            this.A04 = i2;
            this.A02 = -1;
        }
        super.onConfigurationChanged(configuration);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.A0K && this.A02 == -1) {
            if (getLayoutParams().width == -2) {
                ViewGroup firstNonWrapContentParent = getFirstNonWrapContentParent();
                if (firstNonWrapContentParent == null) {
                    width = Resources.getSystem().getDisplayMetrics().widthPixels;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    HashSet A0o = C13680ns.A0o();
                    i6 = firstNonWrapContentParent.getWidth();
                    while (!A0o.contains(firstNonWrapContentParent)) {
                        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                            View childAt = viewGroup.getChildAt(i7);
                            if (childAt != this && !A0o.contains(childAt)) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                                i6 -= (childAt.getWidth() + marginLayoutParams.rightMargin) + marginLayoutParams.leftMargin;
                                A0o.add(childAt);
                            }
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                        i6 -= ((marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin) + viewGroup.getPaddingRight()) + viewGroup.getPaddingLeft();
                        A0o.add(viewGroup);
                        viewGroup = (ViewGroup) viewGroup.getParent();
                    }
                    this.A02 = i6;
                }
            } else {
                width = getWidth();
            }
            i6 = (width - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.A02 = i6;
        }
    }

    public void onSelectionChanged(int i2, int i3) {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || (i2 == text.length() && i3 == text.length())) {
            super.onSelectionChanged(i2, i3);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if ((i2 == 4 || i2 == 8) && this.A0A != null) {
            this.A0B.A0J(this.A0O);
            this.A09.cancel();
            this.A09.reset();
            this.A0A.setVisibility(8);
        }
    }

    public void setAllowDecimal(boolean z2) {
        this.A0J = z2;
        A0A();
    }

    public final void setAmount(String str, String str2) {
        if (this.A0L) {
            char charAt = C809346e.A00(this.A0D).charAt(0);
            int indexOf = TextUtils.indexOf(str, charAt);
            C28411Vz r2 = this.A0E;
            if (r2 != null) {
                AnonymousClass013 r1 = this.A0D;
                this.A0H = r2.A9G(r1, r2.A9K(r1, str2));
            }
            if (indexOf != -1) {
                int indexOf2 = TextUtils.indexOf(this.A0H, charAt);
                StringBuilder A0o = AnonymousClass000.A0o();
                String str3 = this.A0H;
                if (indexOf2 != -1) {
                    str3 = str3.substring(0, indexOf2);
                }
                A0o.append(str3);
                str = AnonymousClass000.A0h(str.substring(indexOf), A0o);
            } else {
                return;
            }
        }
        this.A0H = str;
    }

    public void setAutoScaleTextSize(boolean z2) {
        this.A0K = z2;
        if (z2) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
        }
    }

    public void setCurrency(C28411Vz r1) {
        this.A0E = r1;
    }

    public void setErrorTextView(TextView textView) {
        this.A0A = textView;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A09 = alphaAnimation;
        alphaAnimation.setDuration(500);
        this.A09.setAnimationListener(new C111265fd(textView, this));
    }

    public void setFormatWithCommas(boolean z2) {
        this.A0L = z2;
    }

    public void setInputAmountType(int i2) {
        this.A03 = i2;
    }

    public void setInputAmountValidator(AnonymousClass685 r1) {
        this.A0G = r1;
    }

    public void setOnAmountChangedLister(AnonymousClass69P r1) {
        this.A0F = r1;
    }

    public void setPaymentAmountContainer(View view) {
        this.A08 = view;
    }

    public void setTextSize(float f2) {
        super.setTextSize(f2);
        if (this.A0K) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
            A0C(this.A0H);
        }
    }

    public void setWhatsAppLocale(AnonymousClass013 r1) {
        this.A0D = r1;
    }
}
