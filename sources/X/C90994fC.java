package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.obwhatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.4fC  reason: invalid class name and case insensitive filesystem */
public class C90994fC implements Animator.AnimatorListener {
    public final /* synthetic */ AnimatorSet A00;
    public final /* synthetic */ MessageReplyActivity A01;
    public final /* synthetic */ int[] A02;

    public C90994fC(AnimatorSet animatorSet, MessageReplyActivity messageReplyActivity, int[] iArr) {
        this.A01 = messageReplyActivity;
        this.A00 = animatorSet;
        this.A02 = iArr;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00.removeAllListeners();
        this.A01.A3B(AnonymousClass2Sy.A06(this.A02), 15);
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.removeAllListeners();
        this.A01.A3B(AnonymousClass2Sy.A06(this.A02), 15);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
