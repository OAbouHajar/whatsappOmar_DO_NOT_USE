package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape132S0100000_I1;
import com.facebook.redex.IDxCListenerShape31S0200000_I1;
import com.obwhatsapp.R;

/* renamed from: X.0Q0  reason: invalid class name */
public final class AnonymousClass0Q0 {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = AnonymousClass000.A0L();
    public final AnonymousClass0NZ A03;
    public final C04560Na A04;
    public final AnonymousClass0KQ A05;
    public final C14990q7 A06;

    public AnonymousClass0Q0(Context context, AnonymousClass0NZ r3, C04560Na r4, AnonymousClass0KQ r5, C14990q7 r6) {
        this.A01 = context;
        this.A06 = r6;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
    }

    public final void A00(FrameLayout frameLayout, AnonymousClass0NZ r19) {
        FrameLayout frameLayout2;
        FrameLayout frameLayout3 = this.A00;
        if (frameLayout3 == null) {
            this.A00 = new FrameLayout(this.A01);
        } else if (!(frameLayout3.getParent() == null || (frameLayout2 = this.A00) == null)) {
            ViewParent parent = frameLayout2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A00);
            }
            this.A00.removeAllViews();
        }
        Context context = this.A01;
        C14990q7 r13 = this.A06;
        boolean A022 = C06290Vd.A02(context, r13);
        AnonymousClass0KQ r3 = this.A05;
        int A023 = AnonymousClass0XA.A02(r3, AnonymousClass0K0.SCREEN_GUTTER);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(C04010Kt.company_layer_icons_close_outline_24);
        imageView.setColorFilter(AnonymousClass0R9.A00(AnonymousClass0KH.CLOSE_BUTTON, r3, A022 ? 1 : 0));
        imageView.setOnClickListener(new IDxCListenerShape132S0100000_I1(this, 1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) AnonymousClass0MV.A00(context, 24.0f), (int) AnonymousClass0MV.A00(context, 24.0f));
        layoutParams.setMargins((int) AnonymousClass0MV.A00(context, 20.0f), (int) AnonymousClass0MV.A00(context, 30.0f), 0, 0);
        layoutParams.gravity = 51;
        AnonymousClass07V A012 = AnonymousClass07V.A01((Resources.Theme) null, context.getResources(), R.drawable.ic_error_outline_96_rev);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(A012);
        imageView2.setPadding(0, 0, 0, (int) AnonymousClass0MV.A00(context, (float) AnonymousClass0XA.A02(r3, AnonymousClass0K0.SECTION)));
        imageView2.setColorFilter(AnonymousClass0R9.A00(AnonymousClass0KH.ERROR_ICON, r3, A022));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        float f2 = (float) A023;
        linearLayout.setPadding((int) AnonymousClass0MV.A00(context, f2), 0, (int) AnonymousClass0MV.A00(context, f2), 0);
        linearLayout.addView(imageView2, layoutParams2);
        AnonymousClass0RW A052 = AnonymousClass0XA.A05(r3, AnonymousClass0K1.HEADLINE);
        TextView textView = new TextView(context);
        textView.setText(C04020Ku.__external__failed_loading_title);
        int A002 = AnonymousClass0R9.A00(AnonymousClass0KH.HEADLINE_TEXT, r3, A022);
        float f3 = (float) A052.A02;
        textView.setTextSize(f3);
        textView.setLineSpacing(0.0f, A052.A01);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            textView.setLetterSpacing(A052.A00 / (f3 / AnonymousClass000.A0M(context).scaledDensity));
        }
        if (r13 != null) {
            Typeface A003 = C90154da.A00().A04().A00(r13, A052.A04, 0);
        }
        textView.setMaxLines(3);
        textView.setPadding(0, 0, 0, (int) AnonymousClass0MV.A00(context, (float) AnonymousClass0XA.A02(r3, AnonymousClass0K0.HEADLINE_BODY)));
        AnonymousClass0RW A053 = AnonymousClass0XA.A05(r3, AnonymousClass0K1.BODY);
        TextView textView2 = new TextView(context);
        textView2.setText(C04020Ku.__external__failed_loading_message);
        int A004 = AnonymousClass0R9.A00(AnonymousClass0KH.BODY_TEXT, r3, A022);
        float f4 = (float) A053.A02;
        textView2.setTextSize(f4);
        textView2.setLineSpacing(0.0f, A053.A01);
        if (r13 != null) {
            Typeface A005 = C90154da.A00().A04().A00(r13, A053.A04, 0);
        }
        if (i2 >= 21) {
            textView2.setLetterSpacing(A053.A00 / (f4 / AnonymousClass000.A0M(context).scaledDensity));
        }
        textView2.setTextSize(15.0f);
        textView2.setMaxLines(7);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        AnonymousClass0R8 A032 = AnonymousClass0XA.A03(AnonymousClass0JZ.PRIMARY_BUTTON, r3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AnonymousClass0MV.A00(context, (float) AnonymousClass0XA.A00(C03690Jm.PRIMARY_BUTTON, r3)));
        gradientDrawable.setColor(AnonymousClass0R9.A00(AnonymousClass0KH.PRIMARY_BUTTON_BACKGROUND, r3, A022));
        int i3 = A032.A00;
        AnonymousClass0R9 r0 = A032.A01;
        gradientDrawable.setStroke(i3, A022 ? r0.A00 : r0.A01);
        AnonymousClass0RW A054 = AnonymousClass0XA.A05(r3, AnonymousClass0K1.PRIMARY_BUTTON);
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(C04020Ku.__external__failed_loading_refresh);
        float f5 = (float) A054.A02;
        button.setTextSize(f5);
        int A006 = AnonymousClass0R9.A00(AnonymousClass0KH.PRIMARY_BUTTON_TEXT, r3, A022);
        button.setHeight((int) AnonymousClass0MV.A00(context, (float) AnonymousClass0XA.A01(r3, C03700Jn.PRIMARY_BUTTON_HEIGHT)));
        button.setLineSpacing(0.0f, A054.A01);
        if (r13 != null) {
            Typeface A007 = C90154da.A00().A04().A00(r13, A054.A04, 0);
        }
        if (i2 >= 21) {
            button.setLetterSpacing(A054.A00 / (f5 / AnonymousClass000.A0M(context).scaledDensity));
        }
        int A024 = AnonymousClass0XA.A02(r3, AnonymousClass0K0.BUTTON_PADDING_HORIZONTAL);
        button.setPadding(A024, 0, A024, 0);
        button.setOnClickListener(new IDxCListenerShape31S0200000_I1(r19, 1, this));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(80);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins((int) AnonymousClass0MV.A00(context, 20.0f), 0, (int) AnonymousClass0MV.A00(context, 20.0f), (int) AnonymousClass0MV.A00(context, 20.0f));
        layoutParams3.weight = 1.0f;
        linearLayout2.addView(button, layoutParams3);
        this.A00.addView(imageView, layoutParams);
        this.A00.addView(linearLayout);
        this.A00.addView(linearLayout2);
        frameLayout.addView(this.A00);
    }
}
