package com.obwhatsapp.storage;

import X.AnonymousClass2GQ;
import X.AnonymousClass3KB;
import X.AnonymousClass4BW;
import X.C91094fM;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.obwhatsapp.WaTextView;
import java.util.ArrayList;

public class SizeTickerView extends WaTextView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AnimatorSet A06;
    public boolean A07;

    public SizeTickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SizeTickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SizeTickerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0E);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = 1000;
        this.A00 = 300;
        setTextSize(0, (float) this.A04);
    }

    public final void A0A() {
        CharSequence charSequence;
        CharSequence[] split = AnonymousClass2GQ.A03(this.A01, this.A05).split(" ");
        int length = split.length;
        if (length == 0) {
            charSequence = "";
        } else if (length == 1) {
            charSequence = split[0];
        } else {
            SpannableString spannableString = new SpannableString(split[1]);
            spannableString.setSpan(new AbsoluteSizeSpan(this.A03), 0, split[1].length(), 18);
            charSequence = TextUtils.concat(new CharSequence[]{split[0], " ", spannableString});
        }
        setText(charSequence);
    }

    public void A0B(long j2, int i2, boolean z2) {
        long j3 = j2;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            AnimatorSet animatorSet = this.A06;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.A06 = new AnimatorSet();
            long j4 = this.A05;
            if (j4 != j2) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 10});
                ofInt.addUpdateListener(new C91094fM(this, j4, j3));
                arrayList.add(ofInt);
            }
            if (this.A02 != i2) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(this.A02), Integer.valueOf(i2)});
                ofObject.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 25));
                arrayList.add(ofObject);
            }
            this.A06.addListener(new AnonymousClass3KB(this, i2, j2));
            this.A06.setInterpolator(new LinearInterpolator());
            this.A06.setDuration((long) this.A01);
            this.A06.setStartDelay((long) this.A00);
            this.A06.playTogether(arrayList);
            this.A06.start();
            return;
        }
        AnimatorSet animatorSet2 = this.A06;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.A05 = j2;
        this.A02 = i2;
        setTextColor(i2);
        A0A();
    }
}
