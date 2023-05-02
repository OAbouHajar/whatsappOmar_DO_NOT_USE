package com.obwhatsapp.biz.catalog.view.widgets;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass090;
import X.AnonymousClass2JP;
import X.AnonymousClass41G;
import X.AnonymousClass4BW;
import X.C004601z;
import X.C108565Om;
import X.C108575On;
import X.C16150sX;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C64063Mp;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.IDxUListenerShape0S0102000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;

public class QuantitySelector extends FrameLayout implements AnonymousClass006 {
    public long A00;
    public long A01;
    public ValueAnimator A02;
    public ColorStateList A03;
    public C108565Om A04;
    public C108575On A05;
    public AnonymousClass41G A06;
    public AnonymousClass01V A07;
    public AnonymousClass013 A08;
    public C52662eE A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final TextView A0E;
    public final WaImageButton A0F;
    public final WaImageButton A0G;

    public QuantitySelector(Context context) {
        this(context, (AttributeSet) null);
    }

    public QuantitySelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public QuantitySelector(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0C) {
            this.A0C = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A08 = (AnonymousClass013) r1.AR8.get();
            this.A07 = (AnonymousClass01V) r1.AOi.get();
        }
        this.A0D = new Handler(Looper.getMainLooper());
        this.A0A = false;
        this.A06 = AnonymousClass41G.COLLAPSED;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0C, 0, 0);
        try {
            setCollapsible(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
            if (Build.VERSION.SDK_INT < 21) {
                int A002 = AnonymousClass00T.A00(getContext(), R.color.color0653);
                int A052 = AnonymousClass090.A05(AnonymousClass00T.A00(getContext(), R.color.color00d9), A002);
                this.A03 = new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842910}, new int[]{16842908, 16842919}, new int[0]}, new int[]{A052, A002, A052, A002});
            }
            View inflate = FrameLayout.inflate(getContext(), R.layout.layout04e3, this);
            this.A0E = (TextView) C004601z.A0E(inflate, R.id.quantity_count);
            this.A0F = (WaImageButton) C004601z.A0E(inflate, R.id.minus_button);
            this.A0G = (WaImageButton) C004601z.A0E(inflate, R.id.plus_button);
            A04(0, 99);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A00() {
        int measuredWidth = this.A0G.getMeasuredWidth();
        int measuredWidth2 = (measuredWidth << 1) + this.A0E.getMeasuredWidth();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{measuredWidth, measuredWidth2});
        this.A02 = ofInt;
        ofInt.addUpdateListener(new IDxUListenerShape0S0102000_2_I0(this, measuredWidth, measuredWidth2, 0));
        this.A02.setInterpolator(new DecelerateInterpolator());
        this.A02.setDuration(250);
        this.A02.start();
    }

    public final void A01() {
        ColorStateList colorStateList;
        this.A06 = AnonymousClass41G.COLLAPSED;
        WaImageButton waImageButton = this.A0G;
        waImageButton.setImageResource(0);
        waImageButton.setBackgroundResource(R.drawable.btn_default);
        if (Build.VERSION.SDK_INT < 21 && (colorStateList = this.A03) != null) {
            C004601z.A0O(colorStateList, waImageButton);
        }
        waImageButton.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 46));
        this.A0E.setTextColor(getResources().getColor(R.color.color0654));
        A03();
    }

    public final void A02() {
        this.A06 = AnonymousClass41G.EXPANDED;
        A03();
        if (Build.VERSION.SDK_INT < 21) {
            C004601z.A0O((ColorStateList) null, this.A0G);
        }
        this.A0E.setTextColor(getResources().getColor(R.color.color0773));
        WaImageButton waImageButton = this.A0G;
        waImageButton.setImageResource(R.drawable.vec_ic_add_control);
        waImageButton.setBackgroundResource(R.drawable.quantity_button_selector);
        waImageButton.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 45));
        this.A0F.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 47));
    }

    public final void A03() {
        TextView textView = this.A0E;
        textView.setClickable(false);
        if (this.A01 > 0) {
            textView.setText(this.A08.A0K().format(this.A01));
            if (this.A06 == AnonymousClass41G.EXPANDED) {
                textView.setClickable(true);
                return;
            }
            return;
        }
        textView.setText("");
    }

    public void A04(long j2, long j3) {
        long j4 = this.A01;
        this.A00 = j3;
        this.A01 = j2;
        if (this.A0B) {
            if (this.A06 == AnonymousClass41G.COLLAPSED || j4 == 0) {
                if (j2 > 0) {
                    A01();
                    return;
                }
            } else if (this.A0A) {
                return;
            }
        }
        A02();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A09;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public long getQuantity() {
        return this.A01;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int left;
        int top2;
        int left2;
        int left3;
        super.onLayout(z2, i2, i3, i4, i5);
        WaImageButton waImageButton = this.A0G;
        int measuredWidth = waImageButton.getMeasuredWidth();
        TextView textView = this.A0E;
        int measuredWidth2 = (measuredWidth - textView.getMeasuredWidth()) >> 1;
        if (!this.A08.A0T()) {
            int left4 = waImageButton.getLeft();
            WaImageButton waImageButton2 = this.A0F;
            if (left4 >= waImageButton2.getMeasuredWidth() - measuredWidth2) {
                left = waImageButton2.getRight();
                top2 = textView.getTop();
                left2 = waImageButton2.getRight();
            }
            left = waImageButton.getLeft() + measuredWidth2;
            top2 = textView.getTop();
            left2 = waImageButton.getLeft() + measuredWidth2;
        } else {
            WaImageButton waImageButton3 = this.A0F;
            if (waImageButton3.getLeft() >= waImageButton3.getMeasuredWidth() - measuredWidth2) {
                left = waImageButton3.getLeft() - textView.getMeasuredWidth();
                top2 = textView.getTop();
                left3 = waImageButton3.getLeft();
                textView.layout(left, top2, left3, textView.getBottom());
            }
            left = waImageButton.getLeft() + measuredWidth2;
            top2 = textView.getTop();
            left2 = waImageButton.getLeft() + measuredWidth2;
        }
        left3 = left2 + textView.getMeasuredWidth();
        textView.layout(left, top2, left3, textView.getBottom());
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        WaImageButton waImageButton = this.A0G;
        ViewGroup.LayoutParams layoutParams = waImageButton.getLayoutParams();
        layoutParams.width = getMeasuredHeight();
        waImageButton.setLayoutParams(layoutParams);
        WaImageButton waImageButton2 = this.A0F;
        ViewGroup.LayoutParams layoutParams2 = waImageButton2.getLayoutParams();
        layoutParams2.width = getMeasuredHeight();
        waImageButton2.setLayoutParams(layoutParams2);
        super.onMeasure(i2, i3);
        int measuredWidth = waImageButton.getMeasuredWidth();
        int measuredWidth2 = (measuredWidth << 1) + this.A0E.getMeasuredWidth();
        if (!this.A0A) {
            AnonymousClass41G r4 = this.A06;
            AnonymousClass41G r3 = AnonymousClass41G.EXPANDED;
            if (r4 == r3 && this.A01 > 0) {
                setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                return;
            } else if ((r4 == r3 && this.A01 == 0) || r4 == AnonymousClass41G.COLLAPSED) {
                setMeasuredDimension(measuredWidth, getMeasuredHeight());
                return;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C64063Mp r5 = (C64063Mp) parcelable;
        super.onRestoreInstanceState(r5.getSuperState());
        this.A0B = r5.A02;
        this.A06 = AnonymousClass41G.COLLAPSED;
        A04(r5.A01, r5.A00);
    }

    public Parcelable onSaveInstanceState() {
        C64063Mp r2 = new C64063Mp(super.onSaveInstanceState());
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        r2.A02 = this.A0B;
        return r2;
    }

    public void setCollapsible(boolean z2) {
        this.A0B = z2;
        if (z2 && AnonymousClass2JP.A06(this.A07.A0P())) {
            this.A0B = false;
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.A0E.setEnabled(z2);
        this.A0G.setEnabled(z2);
        this.A0F.setEnabled(z2);
    }

    public void setLimit(int i2) {
        this.A00 = (long) i2;
    }

    public void setOnLimitReachedListener(C108565Om r1) {
        this.A04 = r1;
    }

    public void setOnQuantityChanged(C108575On r1) {
        this.A05 = r1;
    }

    public void setQuantity(long j2) {
        A04(j2, this.A00);
    }
}
