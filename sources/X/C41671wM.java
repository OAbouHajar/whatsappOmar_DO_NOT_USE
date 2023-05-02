package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.1wM  reason: invalid class name and case insensitive filesystem */
public class C41671wM extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextStatusComposerActivity A01;

    public C41671wM(TextStatusComposerActivity textStatusComposerActivity, int i2) {
        this.A01 = textStatusComposerActivity;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        TextStatusComposerActivity textStatusComposerActivity = this.A01;
        textStatusComposerActivity.A09.clearAnimation();
        ViewGroup viewGroup = textStatusComposerActivity.A09;
        int i2 = this.A00;
        viewGroup.setVisibility(i2);
        if (i2 == 0) {
            textStatusComposerActivity.A0B.post(new RunnableRunnableShape15S0100000_I0_14(this, 33));
            return;
        }
        ViewGroup.LayoutParams layoutParams = textStatusComposerActivity.A09.getLayoutParams();
        if (layoutParams.height != -2) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            textStatusComposerActivity.A09.setLayoutParams(layoutParams);
            textStatusComposerActivity.A09.requestLayout();
        }
    }
}
