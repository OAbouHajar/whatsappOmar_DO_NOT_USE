package com.obwhatsapp.text;

import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass3MF;
import X.AnonymousClass52F;
import X.AnonymousClass52G;
import X.AnonymousClass5QV;
import X.AnonymousClass5SA;
import X.C49742Vo;
import X.C53072ew;
import X.C63393Ht;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ReadMoreTextView extends C49742Vo {
    public static final AnonymousClass5SA A0B;
    public int A00;
    public int A01;
    public AnonymousClass5QV A02;
    public CharSequence A03;
    public CharSequence A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final AnonymousClass027 A09 = new AnonymousClass027(Boolean.FALSE);
    public final Runnable A0A = new C63393Ht(this);

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            A0B = new AnonymousClass52F();
        } else {
            A0B = new AnonymousClass52G();
        }
    }

    public ReadMoreTextView(Context context) {
        super(context);
        A0J(context, (AttributeSet) null);
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0J(context, attributeSet);
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0J(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public void setVisibleText(CharSequence charSequence) {
        this.A07 = true;
        setText(charSequence);
        this.A07 = false;
    }

    public final void A0J(Context context, AttributeSet attributeSet) {
        A0B.Aef(this);
        this.A07 = new AnonymousClass3MF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0G);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A03 = this.A01.A09(resourceId);
            }
            this.A01 = obtainStyledAttributes.getResourceId(2, R.color.color04f8);
            this.A06 = obtainStyledAttributes.getBoolean(1, false);
            int i2 = obtainStyledAttributes.getInt(0, 0);
            this.A00 = i2;
            if (i2 > 0) {
                setMaxLines(i2);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean A0K() {
        AnonymousClass027 r1 = this.A09;
        return r1.A01() != null && ((Boolean) r1.A01()).booleanValue();
    }

    public AnonymousClass028 getExpanded() {
        return this.A09;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A08.removeCallbacks(this.A0A);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        Handler handler = this.A08;
        Runnable runnable = this.A0A;
        handler.removeCallbacks(runnable);
        if (this.A00 != 0) {
            handler.post(runnable);
        }
    }

    public void setExpanded(boolean z2) {
        int i2;
        Boolean valueOf = Boolean.valueOf(z2);
        AnonymousClass027 r1 = this.A09;
        if (!valueOf.equals(r1.A01())) {
            r1.A0B(valueOf);
            if (z2 || (i2 = this.A00) == 0) {
                i2 = Integer.MAX_VALUE;
            }
            setMaxLines(i2);
            setText(this.A04);
        }
    }

    public void setLinesLimit(int i2) {
        int i3;
        this.A00 = i2;
        if (A0K() || (i3 = this.A00) == 0) {
            i3 = Integer.MAX_VALUE;
        }
        setMaxLines(i3);
        requestLayout();
        invalidate();
    }

    public void setReadMoreClickListener(AnonymousClass5QV r1) {
        this.A02 = r1;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (!this.A07) {
            this.A04 = charSequence;
        }
    }
}
