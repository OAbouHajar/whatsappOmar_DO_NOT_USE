package com.obwhatsapp.authentication;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass4PP;
import X.C016907z;
import X.C13680ns;
import X.C13700nu;
import X.C52662eE;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxACallbackShape39S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.obwhatsapp.R;

public class FingerprintView extends LinearLayout implements AnonymousClass006 {
    public AnonymousClass4PP A00;
    public C52662eE A01;
    public boolean A02;
    public final ImageView A03;
    public final TextView A04;
    public final C016907z A05;
    public final C016907z A06;
    public final C016907z A07;
    public final C016907z A08;
    public final Runnable A09;

    public FingerprintView(Context context) {
        this(context, (AttributeSet) null, 0, R.style.style017e);
    }

    public FingerprintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, R.style.style017e);
    }

    public FingerprintView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, R.style.style017e);
    }

    public FingerprintView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i3);
        setOrientation(1);
        LayoutInflater A012 = AnonymousClass01V.A01(context);
        AnonymousClass00B.A06(A012);
        A012.inflate(R.layout.layout028c, this, true);
        this.A04 = C13680ns.A0M(this, R.id.fingerprint_prompt);
        ImageView A0K = C13680ns.A0K(this, R.id.fingerprint_icon);
        this.A03 = A0K;
        C016907z A042 = C016907z.A04(contextThemeWrapper, R.drawable.vec_fingerprint_icon);
        AnonymousClass00B.A06(A042);
        this.A06 = A042;
        A0K.setImageDrawable(A042);
        A042.start();
        C016907z A043 = C016907z.A04(contextThemeWrapper, R.drawable.vec_fingerprint_icon_to_success);
        AnonymousClass00B.A06(A043);
        this.A08 = A043;
        C016907z A044 = C016907z.A04(contextThemeWrapper, R.drawable.vec_fingerprint_icon_to_error);
        AnonymousClass00B.A06(A044);
        this.A07 = A044;
        C016907z A045 = C016907z.A04(contextThemeWrapper, R.drawable.vec_error_to_fingerprint_icon);
        AnonymousClass00B.A06(A045);
        this.A05 = A045;
        this.A09 = new RunnableRunnableShape17S0100000_I1((Object) this, 15);
    }

    private void setError(String str) {
        if (getContext() != null) {
            TextView textView = this.A04;
            textView.setText(str);
            C13680ns.A0v(getContext(), textView, R.color.color0710);
            textView.announceForAccessibility(str);
        }
    }

    public void A01() {
        C13700nu.A0T(this.A04);
        ImageView imageView = this.A03;
        imageView.removeCallbacks(this.A09);
        C016907z r2 = this.A08;
        imageView.setImageDrawable(r2);
        r2.start();
        r2.A08(new IDxACallbackShape39S0100000_2_I1(this, 0));
    }

    public final void A02(C016907z r5) {
        String string = getContext().getString(R.string.str08f7);
        if (getContext() != null) {
            TextView textView = this.A04;
            textView.setText(string);
            C13680ns.A0v(getContext(), textView, R.color.color0710);
            textView.announceForAccessibility(string);
        }
        this.A03.setImageDrawable(r5);
        r5.start();
    }

    public void A03(CharSequence charSequence) {
        setError(charSequence.toString());
        ImageView imageView = this.A03;
        imageView.removeCallbacks(this.A09);
        Drawable drawable = imageView.getDrawable();
        C016907z r2 = this.A07;
        if (!drawable.equals(r2)) {
            imageView.setImageDrawable(r2);
            r2.start();
            r2.A08(new IDxACallbackShape39S0100000_2_I1(this, 1));
        }
    }

    public void A04(String str) {
        setError(str);
        ImageView imageView = this.A03;
        Drawable drawable = imageView.getDrawable();
        C016907z r1 = this.A07;
        if (!drawable.equals(r1)) {
            imageView.setImageDrawable(r1);
            r1.start();
        }
        Runnable runnable = this.A09;
        imageView.removeCallbacks(runnable);
        imageView.postDelayed(runnable, 1000);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setListener(AnonymousClass4PP r1) {
        this.A00 = r1;
    }
}
