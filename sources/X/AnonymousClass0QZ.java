package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.redex.IDxCListenerShape132S0100000_I1;

/* renamed from: X.0QZ  reason: invalid class name */
public final class AnonymousClass0QZ {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = AnonymousClass000.A0L();
    public final C04560Na A03;
    public final AnonymousClass0KQ A04;
    public final C14990q7 A05;
    public final boolean A06;

    public AnonymousClass0QZ(Context context, C04560Na r3, AnonymousClass0KQ r4, C14990q7 r5, boolean z2) {
        this.A01 = context;
        this.A05 = r5;
        this.A03 = r3;
        this.A06 = z2;
        this.A04 = r4;
    }

    public final Button A00(boolean z2) {
        AnonymousClass0KQ r1 = this.A04;
        AnonymousClass0R8 A032 = AnonymousClass0XA.A03(AnonymousClass0JZ.SECONDARY_BUTTON, r1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = this.A01;
        gradientDrawable.setCornerRadius(AnonymousClass0MV.A00(context, (float) AnonymousClass0XA.A00(C03690Jm.SECONDARY_BUTTON, r1)));
        int i2 = A032.A00;
        AnonymousClass0R9 r0 = A032.A01;
        gradientDrawable.setStroke(i2, z2 ? r0.A00 : r0.A01);
        gradientDrawable.setColor(AnonymousClass0R9.A00(AnonymousClass0KH.SECONDARY_BUTTON_BACKGROUND, r1, z2 ? 1 : 0));
        AnonymousClass0RW A052 = AnonymousClass0XA.A05(r1, AnonymousClass0K1.SECONDARY_BUTTON);
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(C04020Ku.dialog_cancel);
        float f2 = (float) A052.A02;
        button.setTextSize(f2);
        int A002 = AnonymousClass0R9.A00(AnonymousClass0KH.SECONDARY_BUTTON_TEXT, r1, z2);
        button.setHeight((int) AnonymousClass0MV.A00(context, (float) AnonymousClass0XA.A01(r1, C03700Jn.SECONDARY_BUTTON_HEIGHT)));
        button.setLineSpacing(0.0f, A052.A01);
        C14990q7 r3 = this.A05;
        if (r3 != null) {
            Typeface A003 = C90154da.A00().A04().A00(r3, A052.A04, 0);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            button.setLetterSpacing(A052.A00 / (f2 / AnonymousClass000.A0M(context).scaledDensity));
        }
        button.setOnClickListener(new IDxCListenerShape132S0100000_I1(this, 2));
        button.setAlpha(0.0f);
        return button;
    }

    public final void A01(FrameLayout frameLayout) {
        Context context = this.A01;
        boolean A022 = C06290Vd.A02(context, this.A05);
        AnonymousClass0KQ r2 = this.A04;
        AnonymousClass0Ah r22 = new AnonymousClass0Ah(context, AnonymousClass0R9.A00(AnonymousClass0KH.SPINNER, r2, A022 ? 1 : 0), (int) AnonymousClass0MV.A00(context, (float) AnonymousClass0XA.A01(r2, C03700Jn.SPINNER)));
        AnonymousClass0CJ r4 = new AnonymousClass0CJ(context);
        AnonymousClass0Ah r0 = null;
        if (r22 instanceof Animatable) {
            r0 = r22;
        }
        r4.A00 = r0;
        r4.setImageDrawable(r22);
        if (this.A00 == null) {
            this.A00 = new FrameLayout(context);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (!this.A06) {
            Button A002 = A00(A022);
            AnonymousClass0SH A0H = C004601z.A0H(A002);
            View A003 = AnonymousClass0SH.A00(A0H);
            if (A003 != null) {
                A003.animate().setStartDelay(3000);
            }
            A0H.A03(1.0f);
            A0H.A08(200);
            A0H.A09(new LinearInterpolator());
            A0H.A02();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(80);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins((int) AnonymousClass0MV.A00(context, 20.0f), 0, (int) AnonymousClass0MV.A00(context, 20.0f), (int) AnonymousClass0MV.A00(context, 20.0f));
            layoutParams2.weight = 1.0f;
            linearLayout.addView(A002, layoutParams2);
            this.A00.addView(linearLayout);
        }
        this.A00.addView(r4, layoutParams);
        frameLayout.addView(this.A00);
        Animatable animatable = r4.A00;
        if (animatable != null) {
            animatable.start();
        }
        r4.A01 = true;
    }
}
