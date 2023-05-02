package com.obwhatsapp.components;

import X.AnonymousClass3K7;
import X.C004601z;
import X.C18450wi;
import X.C53072ew;
import X.C54392hN;
import X.C91134fQ;
import X.C94244kb;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

public final class AutoScrollView extends FrameLayout {
    public HorizontalScrollView A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final WaTextView A0A;
    public final WaTextView A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C18450wi.A0H(context, 1);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.dimen008c);
        this.A03 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A01);
        C18450wi.A0B(obtainStyledAttributes);
        this.A09 = (long) obtainStyledAttributes.getInt(2, 3500);
        this.A08 = (long) obtainStyledAttributes.getInt(0, 5000);
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.dimen0762));
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.dimen008b));
        obtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.layout0083, this, true);
            View A0E = C004601z.A0E(inflate, R.id.main_text_view);
            C18450wi.A0B(A0E);
            this.A0A = (WaTextView) A0E;
            View A0E2 = C004601z.A0E(inflate, R.id.placeholder_text_view);
            C18450wi.A0B(A0E2);
            WaTextView waTextView = (WaTextView) A0E2;
            this.A0B = waTextView;
            View A0E3 = C004601z.A0E(inflate, R.id.horizontal_scroll_view);
            C18450wi.A0B(A0E3);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) A0E3;
            this.A00 = horizontalScrollView;
            horizontalScrollView.setOnTouchListener(new C94244kb());
            this.A00.getChildAt(0).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(inflate, 14));
            waTextView.setVisibility(8);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoScrollView(Context context, AttributeSet attributeSet, int i2, int i3, C54392hN r6) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public static final /* synthetic */ void A00(AutoScrollView autoScrollView, float f2, int i2, int i3, int i4, long j2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j2);
        long j3 = autoScrollView.A09;
        if (j3 <= 0) {
            ofFloat.setRepeatCount(-1);
        }
        ofFloat.addUpdateListener(new C91134fQ(autoScrollView, f2, i2, i3, i4));
        AnimatorSet animatorSet = new AnimatorSet();
        if (j3 > 0) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(j3);
            animatorSet.addListener(new AnonymousClass3K7());
            animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
        } else {
            animatorSet.play(ofFloat);
        }
        animatorSet.start();
    }

    public final HorizontalScrollView getHorizontalScrollView() {
        return this.A00;
    }

    public final int getScrollWidth() {
        return this.A05;
    }

    public final CharSequence getText() {
        CharSequence text = this.A0A.getText();
        C18450wi.A0B(text);
        return text;
    }

    public final void setText(int i2) {
        this.A0A.setText(i2);
        this.A0B.setText(i2);
    }

    public final void setText(String str) {
        C18450wi.A0H(str, 0);
        this.A0A.setText(str);
        this.A0B.setText(str);
    }
}
