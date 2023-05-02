package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1W7;
import X.AnonymousClass29A;
import X.AnonymousClass2OJ;
import X.AnonymousClass308;
import X.AnonymousClass33A;
import X.AnonymousClass4TY;
import X.C53802gK;
import X.C56082kw;
import X.C82724Dx;
import X.C85234Nq;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.widget.TextView;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;
import com.obwhatsapp.reactions.ReactionEmojiTextView;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

public class IDxLAdapterShape1S0200000_2_I1 extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape1S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onAnimationCancel(Animator animator) {
        if (1 - this.A02 != 0) {
            super.onAnimationCancel(animator);
        } else {
            animator.removeListener(this);
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A02) {
            case 0:
                AnonymousClass308 r1 = (AnonymousClass308) this.A00;
                r1.A05((C82724Dx) this.A01);
                r1.A01.setTranslationY(0.0f);
                return;
            case 1:
                ReactionsTrayViewModel reactionsTrayViewModel = ((C53802gK) ((ViewOnClickCListenerShape1S0100000_I0_1) this.A00).A00).A09;
                String charSequence = ((TextView) this.A01).getText().toString();
                AnonymousClass2OJ r3 = reactionsTrayViewModel.A0A;
                if (charSequence.equals(((C56082kw) r3.A01()).A00)) {
                    charSequence = "";
                }
                reactionsTrayViewModel.A05(0);
                r3.A0B(new C56082kw(((C56082kw) r3.A01()).A00, charSequence, true));
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((AnonymousClass4TY) this.A01).A01();
                return;
            case 4:
                MediaViewBaseFragment mediaViewBaseFragment = ((AnonymousClass33A) this.A00).A06;
                if (mediaViewBaseFragment.A0C() != null) {
                    mediaViewBaseFragment.A1P(true, true);
                    ((AnonymousClass29A) this.A01).AZA(true);
                    return;
                }
                return;
            case 5:
                C85234Nq r2 = (C85234Nq) this.A00;
                ValueAnimator valueAnimator = r2.A03;
                if (!valueAnimator.isRunning() && r2.A05) {
                    valueAnimator.start();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A02) {
            case 2:
                ReactionEmojiTextView reactionEmojiTextView = (ReactionEmojiTextView) this.A01;
                reactionEmojiTextView.setBackgroundScale(0.0f);
                reactionEmojiTextView.setSelected(true);
                return;
            case 3:
                super.onAnimationStart(animator);
                AnonymousClass4TY r1 = (AnonymousClass4TY) this.A01;
                r1.A01 = true;
                r1.A00 = -1.0f;
                return;
            case 5:
                AnonymousClass1W7 r0 = (AnonymousClass1W7) this.A01;
                Handler handler = r0.A00;
                if (handler == null) {
                    handler = AnonymousClass000.A0L();
                    r0.A00 = handler;
                }
                handler.post(r0.A01);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
