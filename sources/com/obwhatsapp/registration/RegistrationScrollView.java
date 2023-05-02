package com.obwhatsapp.registration;

import X.AnonymousClass006;
import X.C004601z;
import X.C52662eE;
import X.C94464kx;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.facebook.redex.IDxCListenerShape237S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

public class RegistrationScrollView extends ScrollView implements AnonymousClass006 {
    public View A00;
    public View A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public LinearLayout A03;
    public WaTextView A04;
    public C52662eE A05;
    public boolean A06;
    public boolean A07;
    public final float A08;
    public final ViewTreeObserver.OnScrollChangedListener A09;

    public RegistrationScrollView(Context context) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A08 = getResources().getDimension(R.dimen.dimen005d);
        this.A09 = new IDxCListenerShape237S0100000_2_I1(this, 4);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A08 = getResources().getDimension(R.dimen.dimen005d);
        this.A09 = new IDxCListenerShape237S0100000_2_I1(this, 4);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A08 = getResources().getDimension(R.dimen.dimen005d);
        this.A09 = new IDxCListenerShape237S0100000_2_I1(this, 4);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
    }

    public static /* synthetic */ void A00(View view, View view2, LinearLayout linearLayout, WaTextView waTextView, RegistrationScrollView registrationScrollView) {
        if (!registrationScrollView.A06) {
            registrationScrollView.getViewTreeObserver().addOnScrollChangedListener(registrationScrollView.A09);
            registrationScrollView.A06 = true;
        }
        boolean canScrollVertically = registrationScrollView.canScrollVertically(1);
        boolean canScrollVertically2 = registrationScrollView.canScrollVertically(-1);
        if (canScrollVertically2 || canScrollVertically) {
            if (canScrollVertically) {
                if (Build.VERSION.SDK_INT < 21) {
                    view.setVisibility(0);
                }
                C004601z.A0X(waTextView, registrationScrollView.A08);
            }
            if (canScrollVertically2) {
                if (Build.VERSION.SDK_INT < 21) {
                    view2.setVisibility(0);
                }
                C004601z.A0X(linearLayout, registrationScrollView.A08);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            view.setVisibility(8);
            view2.setVisibility(8);
        }
        C004601z.A0X(linearLayout, 0.0f);
        C004601z.A0X(waTextView, 0.0f);
    }

    public static /* synthetic */ void A01(RegistrationScrollView registrationScrollView) {
        float f2;
        float f3;
        float f4;
        boolean canScrollVertically = registrationScrollView.canScrollVertically(1);
        if (registrationScrollView.canScrollVertically(-1) || canScrollVertically) {
            int bottom = registrationScrollView.getChildAt(registrationScrollView.getChildCount() - 1).getBottom();
            int height = registrationScrollView.getHeight();
            int scrollY = registrationScrollView.getScrollY();
            float height2 = (float) (registrationScrollView.getChildAt(0).getHeight() - height);
            float f5 = ((float) scrollY) / height2;
            float f6 = ((float) (bottom - (height + scrollY))) / height2;
            WaTextView waTextView = registrationScrollView.A04;
            View view = registrationScrollView.A01;
            int i2 = (f5 > 0.1f ? 1 : (f5 == 0.1f ? 0 : -1));
            int i3 = Build.VERSION.SDK_INT;
            if (i2 < 0) {
                if (i3 < 21) {
                    view.setVisibility(0);
                    view.setAlpha(f5 * 10.0f);
                }
                f3 = registrationScrollView.A08;
                f2 = f5 * 10.0f * f3;
            } else {
                if (i3 < 21) {
                    view.setVisibility(0);
                }
                f2 = registrationScrollView.A08;
                f3 = f2;
            }
            C004601z.A0X(waTextView, f2);
            LinearLayout linearLayout = registrationScrollView.A03;
            View view2 = registrationScrollView.A00;
            int i4 = (f6 > 0.1f ? 1 : (f6 == 0.1f ? 0 : -1));
            int i5 = Build.VERSION.SDK_INT;
            if (i4 < 0) {
                if (i5 < 21) {
                    view2.setVisibility(0);
                    view2.setAlpha(f6 * 10.0f);
                }
                f4 = f6 * 10.0f * f3;
            } else {
                if (i5 < 21) {
                    view2.setVisibility(0);
                }
                f4 = f3;
            }
            C004601z.A0X(linearLayout, f4);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A05;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setTopAndBottomScrollingElevation(LinearLayout linearLayout, WaTextView waTextView, View view, View view2) {
        this.A03 = linearLayout;
        this.A04 = waTextView;
        this.A01 = view;
        View view3 = view2;
        this.A00 = view2;
        this.A02 = new C94464kx(view3, view, linearLayout, waTextView, this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }
}
