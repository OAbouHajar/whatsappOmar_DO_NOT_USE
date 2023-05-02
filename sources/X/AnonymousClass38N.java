package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.redex.IDxLListenerShape60S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;

/* renamed from: X.38N  reason: invalid class name */
public class AnonymousClass38N {
    public final Context A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final WaImageView A05;
    public final WaImageView A06;
    public final C16820th A07;
    public final AnonymousClass2OB A08 = new AnonymousClass2OB();
    public final AnonymousClass2OB A09;
    public final C25791Ld A0A;
    public final AnonymousClass2OJ A0B;
    public final C16320sq A0C;

    public AnonymousClass38N(ViewGroup viewGroup, C001300o r11, C16820th r12, C25791Ld r13, C16320sq r14) {
        AnonymousClass2OB r2 = new AnonymousClass2OB();
        this.A09 = r2;
        AnonymousClass2OJ r4 = new AnonymousClass2OJ(Boolean.FALSE);
        this.A0B = r4;
        this.A0C = r14;
        this.A0A = r13;
        this.A07 = r12;
        Context context = viewGroup.getContext();
        this.A00 = context;
        this.A02 = viewGroup;
        ViewGroup A072 = C13700nu.A07(viewGroup, R.id.caption_container);
        this.A01 = A072;
        this.A04 = C13680ns.A0Q(viewGroup, R.id.title);
        this.A03 = C13680ns.A0Q(viewGroup, R.id.subtitle);
        WaImageView A0R = C13690nt.A0R(viewGroup, R.id.cancel);
        this.A05 = A0R;
        WaImageView A0R2 = C13690nt.A0R(viewGroup, R.id.thumbnail);
        this.A06 = A0R2;
        if (C15450qv.A04()) {
            Drawable A042 = AnonymousClass00T.A04(context, R.drawable.balloon_outgoing_frame);
            int A002 = AnonymousClass00T.A00(context, R.color.color0178);
            AnonymousClass00B.A06(A042);
            A072.setForeground(AnonymousClass2SR.A06(A042, A002));
            Drawable A043 = AnonymousClass00T.A04(context, R.drawable.balloon_outgoing_frame);
            int A003 = AnonymousClass00T.A00(context, R.color.color0178);
            AnonymousClass00B.A06(A043);
            A0R2.setForeground(AnonymousClass2SR.A06(A043, A003));
        }
        viewGroup.setClickable(true);
        viewGroup.setImportantForAccessibility(2);
        A072.setClickable(true);
        A072.setImportantForAccessibility(2);
        C13690nt.A1J(r11, r2, this, 22);
        C13680ns.A17(A0R, this, 13);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        Animator animator = layoutTransition.getAnimator(1);
        if (animator instanceof ObjectAnimator) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(animator.getStartDelay());
            animator.setStartDelay(0);
            animatorSet.play(animator);
            layoutTransition.setAnimator(1, animatorSet);
        }
        layoutTransition.setDuration(3, 100);
        layoutTransition.setInterpolator(3, new AccelerateDecelerateInterpolator());
        layoutTransition.setDuration(1, 200);
        layoutTransition.setStartDelay(1, 100);
        layoutTransition.setInterpolator(1, new AccelerateDecelerateInterpolator());
        C13680ns.A1N(r11, r4, this, 78);
        A072.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape60S0200000_2_I1(this, 2, viewGroup));
    }
}
