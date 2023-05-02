package X;

import android.animation.Animator;
import com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment;

/* renamed from: X.4fB  reason: invalid class name and case insensitive filesystem */
public class C90984fB implements Animator.AnimatorListener {
    public final /* synthetic */ MaximizedParticipantVideoDialogFragment A00;
    public final /* synthetic */ Runnable A01;

    public C90984fB(MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment, Runnable runnable) {
        this.A00 = maximizedParticipantVideoDialogFragment;
        this.A01 = runnable;
    }

    public void onAnimationCancel(Animator animator) {
        this.A01.run();
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.run();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
