package com.obwhatsapp.privacy.usernotice;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass06X;
import X.AnonymousClass0LL;
import X.AnonymousClass13G;
import X.AnonymousClass1PN;
import X.AnonymousClass1UP;
import X.AnonymousClass3MF;
import X.AnonymousClass4W6;
import X.C004601z;
import X.C12410kM;
import X.C14870pt;
import X.C19220xx;
import X.C46322Dr;
import X.C55352jN;
import X.C57102q8;
import X.C61903Aw;
import X.C67483bg;
import X.C82914Eq;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.redex.IDxCListenerShape383S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape0S0110000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape59S0200000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;

public class UserNoticeBottomSheetDialogFragment extends Hilt_UserNoticeBottomSheetDialogFragment {
    public int A00;
    public ValueAnimator A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public NestedScrollView A08;
    public C14870pt A09;
    public AnonymousClass01V A0A;
    public AnonymousClass1PN A0B;
    public AnonymousClass13G A0C;
    public C19220xx A0D;
    public C46322Dr A0E;
    public UserNoticeModalIconView A0F;
    public Runnable A0G;
    public final View.OnClickListener A0H = new ViewOnClickCListenerShape2S0100000_I0_2(this, 24);
    public final C12410kM A0I = new IDxCListenerShape383S0100000_2_I0(this, 0);
    public final C82914Eq A0J = new C82914Eq(this);

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.i("UserNoticeBottomSheetDialogFragment/onCreateView");
        this.A0E = C46322Dr.A00(A04());
        View inflate = layoutInflater.inflate(R.layout.layout05c2, viewGroup, true);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape59S0200000_2_I0(this, 0, inflate));
        this.A08 = (NestedScrollView) C004601z.A0E(inflate, R.id.user_notice_modal_scrollview);
        this.A03 = C004601z.A0E(inflate, R.id.user_notice_modal_scroll_decoration_group);
        C004601z.A0E(inflate, R.id.user_notice_modal_scroll_button).setOnClickListener(this.A0H);
        this.A08.setNestedScrollingEnabled(false);
        NestedScrollView nestedScrollView = this.A08;
        nestedScrollView.A0E = this.A0I;
        nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 24));
        this.A02 = C004601z.A0E(inflate, R.id.user_notice_modal_button_divider);
        ImageView imageView = (ImageView) C004601z.A0E(inflate, R.id.user_notice_modal_default_icon);
        this.A04 = imageView;
        imageView.setContentDescription(this.A0E.A02);
        UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) C004601z.A0E(inflate, R.id.user_notice_modal_server_icon);
        this.A0F = userNoticeModalIconView;
        userNoticeModalIconView.A00 = this.A04;
        userNoticeModalIconView.A04(this.A0E);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(inflate, R.id.user_notice_modal_body);
        textEmojiLabel.setMovementMethod(LinkMovementMethod.getInstance());
        A1O(textEmojiLabel, this.A0E.A02);
        A1O((TextEmojiLabel) C004601z.A0E(inflate, R.id.user_notice_modal_footer), this.A0E.A04);
        TextView textView = (TextView) C004601z.A0E(inflate, R.id.user_notice_modal_title);
        this.A07 = textView;
        textView.setText(this.A0E.A07);
        C004601z.A0o(this.A07, true);
        this.A06 = (TextView) C004601z.A0E(inflate, R.id.user_notice_modal_sticky_title);
        int dimensionPixelSize = A03().getDimensionPixelSize(R.dimen.dimen07fa);
        int dimensionPixelSize2 = A03().getDimensionPixelSize(R.dimen.dimen0800);
        this.A00 = dimensionPixelSize2;
        this.A06.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.A06.setMaxLines(5);
        this.A06.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView2 = this.A06;
        Drawable A042 = AnonymousClass00T.A04(A02(), R.drawable.bottom_sheet_background);
        AnonymousClass00B.A06(A042);
        textView2.setBackground(A042);
        this.A06.setText(this.A0E.A07);
        C004601z.A0X(this.A06, A03().getDimension(R.dimen.dimen07ff));
        C004601z.A0o(this.A06, true);
        LinearLayout linearLayout = (LinearLayout) C004601z.A0E(inflate, R.id.user_notice_modal_bullets);
        this.A05 = linearLayout;
        LayoutInflater from = LayoutInflater.from(A02());
        int dimensionPixelSize3 = A03().getDimensionPixelSize(R.dimen.dimen07f3);
        for (int i2 = 0; i2 < this.A0E.A08.size(); i2++) {
            TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) from.inflate(R.layout.layout05c3, linearLayout, false);
            textEmojiLabel2.setTag(Integer.valueOf(i2));
            linearLayout.addView(textEmojiLabel2);
            textEmojiLabel2.setMovementMethod(new AnonymousClass3MF());
            textEmojiLabel2.setAccessibilityHelper(new C57102q8(textEmojiLabel2, this.A0A));
            SpannableString A002 = C61903Aw.A00(A02(), this.A0J, ((AnonymousClass4W6) this.A0E.A08.get(i2)).A02);
            SpannableString spannableString = new SpannableString(A002.toString());
            spannableString.setSpan(new BulletSpan(dimensionPixelSize3), 0, A002.length(), 17);
            for (Object obj : A002.getSpans(0, A002.length(), Object.class)) {
                spannableString.setSpan(obj, A002.getSpanStart(obj), A002.getSpanEnd(obj), 17);
            }
            textEmojiLabel2.setText(spannableString);
        }
        TextView textView3 = (TextView) C004601z.A0E(inflate, R.id.user_notice_modal_agree_button);
        textView3.setText(this.A0E.A01);
        textView3.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 22));
        TextView textView4 = (TextView) C004601z.A0E(inflate, R.id.user_notice_modal_dismiss_button);
        if (!TextUtils.isEmpty(this.A0E.A03)) {
            textView4.setText(this.A0E.A03);
            textView4.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 23));
        } else {
            textView4.setVisibility(8);
            AnonymousClass06X r0 = (AnonymousClass06X) textView3.getLayoutParams();
            r0.A0T = 0;
            textView3.setLayoutParams(r0);
        }
        A1H(!TextUtils.isEmpty(this.A0E.A03));
        AnonymousClass13G r2 = this.A0C;
        int i3 = 7;
        if (!TextUtils.isEmpty(this.A0E.A03)) {
            i3 = 3;
        }
        r2.A01(Integer.valueOf(i3));
        return inflate;
    }

    public void A13() {
        super.A13();
        this.A08.A0E = null;
    }

    public void A1M(View view) {
        super.A1M(view);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - AnonymousClass1UP.A02(view.getContext(), AnonymousClass01V.A02(A02()));
        view.setLayoutParams(layoutParams);
        A002.A0E = new C67483bg(A002, this);
        A002.A0M(3);
    }

    public final void A1N() {
        int i2 = 0;
        boolean z2 = false;
        if (((float) this.A08.getScrollY()) > this.A07.getY() - ((float) this.A00)) {
            z2 = true;
        }
        TextView textView = this.A07;
        int i3 = 0;
        if (z2) {
            i3 = 4;
        }
        textView.setVisibility(i3);
        TextView textView2 = this.A06;
        if (!z2) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
    }

    public final void A1O(TextEmojiLabel textEmojiLabel, String str) {
        if (TextUtils.isEmpty(str)) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        textEmojiLabel.setMovementMethod(new AnonymousClass3MF());
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A0A));
        Context A022 = A02();
        AnonymousClass00B.A06(str);
        textEmojiLabel.setText(C61903Aw.A00(A022, this.A0J, str));
    }

    public final void A1P(boolean z2, boolean z3) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.A01 = valueAnimator2;
            valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A01.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 21));
        } else {
            valueAnimator.cancel();
            this.A01.removeAllListeners();
        }
        this.A01.addListener(new IDxLAdapterShape0S0110000_2_I0(this, 4, z2));
        float alpha = this.A03.getAlpha();
        float f2 = 0.0f;
        if (z2) {
            f2 = 1.0f;
        }
        this.A01.setFloatValues(new float[]{alpha, f2});
        this.A01.setDuration(z3 ? 400 : 0);
        this.A01.start();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1M(AnonymousClass0LL.A00(A1A(), R.id.design_bottom_sheet));
        int dimensionPixelSize = A03().getDimensionPixelSize(R.dimen.dimen07f6);
        C55352jN.A02(this.A04, dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = A03().getDimensionPixelSize(R.dimen.dimen07fe);
        C55352jN.A02(this.A0F, dimensionPixelSize2, dimensionPixelSize2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A05.getLayoutParams();
        int dimensionPixelSize3 = A03().getDimensionPixelSize(R.dimen.dimen07f4);
        marginLayoutParams.leftMargin = dimensionPixelSize3;
        marginLayoutParams.rightMargin = dimensionPixelSize3;
        this.A05.setLayoutParams(marginLayoutParams);
        int dimensionPixelSize4 = A03().getDimensionPixelSize(R.dimen.dimen07fa);
        NestedScrollView nestedScrollView = this.A08;
        nestedScrollView.setPadding(dimensionPixelSize4, nestedScrollView.getPaddingTop(), dimensionPixelSize4, this.A08.getPaddingBottom());
        TextView textView = this.A06;
        textView.setPadding(dimensionPixelSize4, textView.getPaddingTop(), dimensionPixelSize4, this.A06.getPaddingBottom());
        this.A08.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 24));
    }
}
