package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxIDrawableShape11S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

/* renamed from: X.267  reason: invalid class name */
public class AnonymousClass267 {
    public static final int A0A;
    public static final int A0B;
    public int A00;
    public View.OnClickListener A01 = new ViewOnClickCListenerShape7S0100000_I0(this, 7);
    public SearchView A02;
    public WaImageView A03;
    public boolean A04;
    public final Activity A05;
    public final View A06;
    public final C016807y A07;
    public final Toolbar A08;
    public final AnonymousClass013 A09;

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 250;
        int i4 = 220;
        if (i2 >= 21) {
            i4 = 250;
        }
        A0A = i4;
        if (i2 < 21) {
            i3 = 220;
        }
        A0B = i3;
    }

    public AnonymousClass267(Activity activity, View view, C016807y r5, Toolbar toolbar, AnonymousClass013 r7) {
        this.A05 = activity;
        this.A09 = r7;
        this.A06 = view;
        this.A08 = toolbar;
        this.A07 = r5;
    }

    public static void A00(View view) {
        view.setBackgroundResource(R.drawable.search_background);
        if (Build.VERSION.SDK_INT < 21 && (view.getBackground() instanceof NinePatchDrawable)) {
            AnonymousClass2SR.A06(view.getBackground(), AnonymousClass00T.A00(view.getContext(), R.color.color06af));
        }
    }

    public void A01() {
        if (this instanceof AnonymousClass266) {
            AnonymousClass266 r1 = (AnonymousClass266) this;
            if (!r1.A06()) {
                r1.A0B.setVisibility(0);
            }
        }
    }

    public void A02() {
        int width;
        if (!A06()) {
            if (this.A02 == null) {
                View view = this.A06;
                A00(view);
                Activity activity = this.A05;
                activity.getLayoutInflater().inflate(this instanceof AnonymousClass266 ? R.layout.layout00af : R.layout.layout02f3, (ViewGroup) view, true);
                SearchView searchView = (SearchView) C004601z.A0E(view, R.id.search_view);
                this.A02 = searchView;
                int i2 = R.string.str14a4;
                if (this.A04) {
                    i2 = R.string.str14a5;
                    ((ImageView) C004601z.A0E(searchView, R.id.search_close_btn)).setImageDrawable((Drawable) null);
                }
                int A002 = AnonymousClass00T.A00(activity, R.color.color06bd);
                ((TextView) C004601z.A0E(this.A02, R.id.search_src_text)).setHintTextColor(AnonymousClass00T.A00(activity, R.color.color04c0));
                this.A02.setIconifiedByDefault(false);
                this.A02.setQueryHint(activity.getString(i2));
                SearchView searchView2 = this.A02;
                searchView2.A0B = this.A07;
                ((ImageView) searchView2.findViewById(R.id.search_mag_icon)).setImageDrawable(new IDxIDrawableShape11S0100000_2_I0(AnonymousClass00T.A04(activity, R.drawable.ic_back), this, 1));
                ImageView imageView = (ImageView) view.findViewById(R.id.search_back);
                SearchView searchView3 = this.A02;
                if (!(searchView3 == null || searchView3.getContext() == null)) {
                    imageView.setImageDrawable(new C447725m(AnonymousClass2SR.A02(this.A02.getContext(), R.drawable.ic_back, R.color.color06b3), this.A09));
                }
                imageView.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0(this, 6));
                if (this.A04) {
                    WaImageView waImageView = (WaImageView) C004601z.A0E(view, R.id.search_dialpad);
                    this.A03 = waImageView;
                    waImageView.setVisibility(0);
                    this.A03.setOnClickListener(this.A01);
                }
            }
            if (this instanceof AnonymousClass266) {
                AnonymousClass266 r7 = (AnonymousClass266) this;
                Activity activity2 = r7.A07;
                AnonymousClass266.A0G = activity2.getString(R.string.str01d6);
                AnonymousClass266.A0H = "";
                AnonymousClass266.A0F = "";
                View view2 = r7.A08;
                r7.A04 = (TextView) C004601z.A0E(view2, R.id.search_hint_fade_in);
                r7.A05 = (TextView) C004601z.A0E(view2, R.id.search_hint_fade_out);
                SearchView searchView4 = (SearchView) C004601z.A0E(view2, R.id.search_view);
                r7.A06 = searchView4;
                if (TextUtils.equals(searchView4.getQueryHint(), activity2.getString(R.string.str14a4))) {
                    r7.A06.setQueryHint("");
                }
                TextView textView = r7.A04;
                int A003 = AnonymousClass00T.A00(activity2, R.color.color04c0);
                TextView textView2 = r7.A05;
                int A004 = AnonymousClass00T.A00(activity2, R.color.color04c0);
                r7.A04.setHint("");
                r7.A05.setHint("");
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7.A05, "translationY", new float[]{0.0f, 50.0f});
                r7.A03 = ofFloat;
                ofFloat.setDuration(300);
                r7.A03.setStartDelay(700);
                r7.A03.addListener(new IDxLAdapterShape3S0100000_2_I0(r7, 5));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r7.A04, "translationY", new float[]{-50.0f, 0.0f});
                r7.A01 = ofFloat2;
                ofFloat2.setDuration(300);
                r7.A01.setStartDelay(700);
                r7.A01.addListener(new IDxLAdapterShape3S0100000_2_I0(r7, 6));
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r7.A04, "alpha", new float[]{0.0f, 1.0f});
                r7.A00 = ofFloat3;
                ofFloat3.setInterpolator(r7.A09);
                r7.A00.setDuration(300);
                r7.A00.setStartDelay(700);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r7.A05, "alpha", new float[]{1.0f, 0.0f});
                r7.A02 = ofFloat4;
                ofFloat4.setInterpolator(r7.A0A);
                r7.A02.setDuration(300);
                r7.A02.setStartDelay(700);
            }
            View view3 = this.A06;
            view3.setVisibility(0);
            if (Build.VERSION.SDK_INT < 21) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) A0A);
                alphaAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 2));
                view3.clearAnimation();
                view3.startAnimation(alphaAnimation);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                Toolbar toolbar = this.A08;
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) ((-toolbar.getHeight()) >> 3));
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation2);
                animationSet.addAnimation(translateAnimation);
                animationSet.setDuration((long) A0B);
                toolbar.startAnimation(animationSet);
                toolbar.setVisibility(4);
            } else if (view3.isAttachedToWindow()) {
                View findViewById = this.A08.findViewById(R.id.menuitem_search);
                if (findViewById != null) {
                    int[] iArr = new int[2];
                    findViewById.getLocationInWindow(iArr);
                    width = this.A09.A0T() ^ true ? (view3.getWidth() - iArr[0]) - (findViewById.getWidth() / 2) : iArr[0] + (findViewById.getWidth() / 2);
                } else {
                    width = view3.getWidth() / 2;
                }
                this.A00 = width;
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view3, this.A09.A0T() ^ true ? view3.getWidth() - this.A00 : this.A00, view3.getHeight() / 2, 0.0f, (float) Math.max(width, view3.getWidth() - this.A00));
                createCircularReveal.setDuration((long) A0A);
                createCircularReveal.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 3));
                createCircularReveal.start();
            }
            if (C15450qv.A04()) {
                C434920f.A04(this.A05, R.color.color04f1);
            } else if (C15450qv.A03()) {
                Activity activity3 = this.A05;
                Window window = activity3.getWindow();
                int A005 = AnonymousClass00T.A00(activity3, R.color.color00a2);
            }
        }
    }

    public void A03(Bundle bundle) {
        CharSequence charSequence;
        if (bundle != null && (charSequence = bundle.getCharSequence("search_text")) != null) {
            A02();
            this.A00 = bundle.getInt("search_button_x_pos");
            this.A02.A0F(charSequence);
        }
    }

    public void A04(Bundle bundle) {
        if (this.A02 != null && A06()) {
            bundle.putCharSequence("search_text", this.A02.A0k.getText());
            bundle.putInt("search_button_x_pos", this.A00);
        }
    }

    public void A05(boolean z2) {
        if (A06()) {
            this.A02.A0F("");
            Toolbar toolbar = this.A08;
            toolbar.setVisibility(0);
            if (!z2) {
                this.A02.A07();
                this.A06.setVisibility(4);
            } else if (Build.VERSION.SDK_INT >= 21) {
                int i2 = this.A00;
                View view = this.A06;
                int width = view.getWidth();
                int i3 = this.A00;
                int max = Math.max(i2, width - i3);
                if (i3 == 0) {
                    this.A00 = view.getWidth() >> 1;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, this.A09.A0T() ^ true ? view.getWidth() - this.A00 : this.A00, view.getHeight() >> 1, (float) max, 0.0f);
                createCircularReveal.setDuration((long) A0B);
                createCircularReveal.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 4));
                createCircularReveal.start();
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                long j2 = (long) A0B;
                alphaAnimation.setDuration(j2);
                alphaAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 3));
                this.A06.startAnimation(alphaAnimation);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) ((-toolbar.getHeight()) / 4), 0.0f);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation2);
                animationSet.addAnimation(translateAnimation);
                animationSet.setDuration(j2);
                toolbar.startAnimation(animationSet);
            }
            Activity activity = this.A05;
            C434920f.A08(activity.getWindow(), false);
            C434920f.A03(activity, R.color.color064b);
        }
    }

    public boolean A06() {
        return this.A06.getVisibility() == 0;
    }
}
