package com.obwhatsapp;

import X.AnonymousClass00X;
import X.AnonymousClass3CR;
import X.AnonymousClass3P4;
import X.AnonymousClass5OV;
import X.AnonymousClass5RL;
import X.C004601z;
import X.C14890pv;
import X.C41631wI;
import X.C45902Bo;
import X.C99814ud;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.facebook.redex.IDxLAdapterShape0S0100001_2_I0;
import com.facebook.redex.IDxSInterfaceShape356S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;

public final class CodeInputField extends WaEditText {
    public static Typeface A08;
    public static Typeface A09;
    public char A00;
    public char A01;
    public int A02;
    public ValueAnimator A03;
    public AnonymousClass3CR A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;

    public CodeInputField(Context context) {
        super(context);
        A02();
        this.A07 = context;
    }

    public CodeInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A07 = context;
    }

    public CodeInputField(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A07 = context;
    }

    public CodeInputField(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public void A05() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            float x2 = getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{x2, ((float) getResources().getDimensionPixelSize(R.dimen.dimen038a)) + x2});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50);
            ofFloat.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 1));
            ofFloat.addListener(new IDxLAdapterShape0S0100001_2_I0(this, x2, 0));
            this.A03 = ofFloat;
        }
        this.A03.start();
        C41631wI.A02(this.A02);
    }

    public void A06(AnonymousClass5RL r10, int i2) {
        A08(r10, new IDxSInterfaceShape356S0100000_2_I0(this, 1), (String) null, (String) null, 8211, 8226, i2);
    }

    public void A07(AnonymousClass5RL r11, int i2, int i3) {
        C99814ud r4 = new C99814ud(this, i3);
        setPasswordTransformationEnabled(true);
        setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 0));
        setCursorVisible(false);
        A08(r11, r4, "pin_font", (String) null, ')', '(', i2);
    }

    public void A08(AnonymousClass5RL r3, AnonymousClass5OV r4, String str, String str2, char c2, char c3, int i2) {
        this.A02 = i2;
        this.A01 = c2;
        this.A00 = c3;
        AnonymousClass3CR r0 = new AnonymousClass3CR(r3, r4, this);
        this.A04 = r0;
        addTextChangedListener(r0);
        setCode("");
        if (TextUtils.equals(str, "pin_font")) {
            if (A08 == null) {
                A08 = AnonymousClass00X.A02(getContext());
            }
        } else if (A09 == null) {
            A09 = Typeface.createFromAsset(getContext().getAssets(), "fonts/RobotoMono-Regular.ttf");
        }
        C45902Bo.A03(this);
        if (str2 != null) {
            C004601z.A0j(this, new AnonymousClass3P4(this, str2));
        }
    }

    public String getCode() {
        return getText().toString().replaceAll("[^0-9]", "");
    }

    public boolean getErrorState() {
        return this.A05;
    }

    public void onDetachedFromWindow() {
        removeTextChangedListener(this.A04);
        super.onDetachedFromWindow();
    }

    public void onSelectionChanged(int i2, int i3) {
        int indexOf;
        if (i2 == i3 && (indexOf = getText().toString().indexOf(this.A01)) > -1 && i2 > indexOf) {
            setSelection(indexOf);
        }
        super.onSelectionChanged(i2, i3);
    }

    public void setCode(String str) {
        StringBuilder sb = new StringBuilder(str);
        int length = str.length();
        int i2 = length;
        while (true) {
            int i3 = this.A02;
            if (length < i3 + 1) {
                sb.append(this.A01);
                length++;
            } else {
                sb.insert(i3 >> 1, 160);
                this.A04.A01 = true;
                setText(sb);
                setSelection(i2 + 1);
                this.A04.A01 = false;
                return;
            }
        }
    }

    public void setErrorState(boolean z2) {
        if (this.A05 != z2) {
            this.A05 = z2;
            setCode("");
        }
    }

    public void setPasswordTransformationEnabled(boolean z2) {
        setTransformationMethod(z2 ? new C14890pv(this) : null);
    }

    public void setRegistrationVoiceCodeLength(int i2) {
        this.A02 = i2;
    }
}
