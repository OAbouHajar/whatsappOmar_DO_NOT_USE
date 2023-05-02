package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.39p  reason: invalid class name and case insensitive filesystem */
public final class C616139p {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Animator A06;
    public Typeface A07;
    public FrameLayout A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextView A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public boolean A0E;
    public boolean A0F;
    public final float A0G;
    public final Context A0H;
    public final TextInputLayout A0I;

    public C616139p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.A0H = context;
        this.A0I = textInputLayout;
        this.A0G = (float) context.getResources().getDimensionPixelSize(R.dimen.dimen02e6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0D) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r4 = this;
            r3 = 0
            r4.A0C = r3
            android.animation.Animator r0 = r4.A06
            if (r0 == 0) goto L_0x000a
            r0.cancel()
        L_0x000a:
            int r1 = r4.A00
            r0 = 1
            if (r1 != r0) goto L_0x001f
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.A0D
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 2
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r4.A01 = r0
        L_0x001f:
            int r2 = r4.A00
            int r1 = r4.A01
            android.widget.TextView r0 = r4.A0A
            boolean r0 = r4.A06(r0, r3)
            r4.A01(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616139p.A00():void");
    }

    public final void A01(int i2, int i3, boolean z2) {
        int i4 = i2;
        int i5 = i3;
        boolean z3 = z2;
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.A06 = animatorSet;
            ArrayList A0u = AnonymousClass000.A0u();
            A04(this.A0B, A0u, 2, i4, i5, this.A0F);
            A04(this.A0A, A0u, 1, i4, i5, this.A0E);
            C53702g8.A00(animatorSet, A0u);
            animatorSet.addListener(new AnonymousClass3KK(i4 != 1 ? i4 != 2 ? null : this.A0B : this.A0A, i5 != 1 ? i5 != 2 ? null : this.A0B : this.A0A, this, i5, i4));
            animatorSet.start();
        } else if (i4 != i5) {
            if (i3 != 0) {
                TextView textView = i5 != 1 ? this.A0B : this.A0A;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setAlpha(1.0f);
                }
            }
            if (i2 != 0) {
                TextView textView2 = i4 != 1 ? this.A0B : this.A0A;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                    if (i4 == 1) {
                        textView2.setText((CharSequence) null);
                    }
                }
            }
            this.A00 = i5;
        }
        TextInputLayout textInputLayout = this.A0I;
        textInputLayout.A03();
        textInputLayout.A0G(z3, false);
        textInputLayout.A04();
    }

    public void A02(TextView textView, int i2) {
        LinearLayout linearLayout;
        if (this.A09 == null && this.A08 == null) {
            Context context = this.A0H;
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.A09 = linearLayout2;
            linearLayout2.setOrientation(0);
            TextInputLayout textInputLayout = this.A0I;
            textInputLayout.addView(this.A09, -1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            this.A08 = frameLayout;
            this.A09.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.A09.addView(new Space(context), new LinearLayout.LayoutParams(0, 0, 1.0f));
            EditText editText = textInputLayout.A0L;
            if (!(editText == null || (linearLayout = this.A09) == null)) {
                C004601z.A0h(linearLayout, C004601z.A08(editText), 0, C004601z.A07(textInputLayout.A0L), 0);
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.A08.setVisibility(0);
            this.A08.addView(textView);
            this.A02++;
        } else {
            this.A09.addView(textView, i2);
        }
        this.A09.setVisibility(0);
        this.A05++;
    }

    public void A03(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            if ((i2 == 0 || i2 == 1) && (frameLayout = this.A08) != null) {
                int i3 = this.A02 - 1;
                this.A02 = i3;
                if (i3 == 0) {
                    frameLayout.setVisibility(8);
                }
                this.A08.removeView(textView);
            } else {
                linearLayout.removeView(textView);
            }
            int i4 = this.A05 - 1;
            this.A05 = i4;
            LinearLayout linearLayout2 = this.A09;
            if (i4 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final void A04(TextView textView, List list, int i2, int i3, int i4, boolean z2) {
        if (textView != null && z2) {
            if (i2 == i4 || i2 == i3) {
                float f2 = 0.0f;
                if (i4 == i2) {
                    f2 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f2});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(C53572fv.A03);
                list.add(ofFloat);
                if (i4 == i2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.A0G, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(C53572fv.A04);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public boolean A05() {
        return this.A01 == 1 && this.A0A != null && !TextUtils.isEmpty(this.A0C);
    }

    public final boolean A06(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.A0I;
        if (!C004601z.A0u(textInputLayout) || !textInputLayout.isEnabled()) {
            return false;
        }
        return this.A01 != this.A00 || textView == null || !TextUtils.equals(textView.getText(), charSequence);
    }
}
