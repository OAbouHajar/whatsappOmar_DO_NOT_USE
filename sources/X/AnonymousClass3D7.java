package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;

/* renamed from: X.3D7  reason: invalid class name */
public class AnonymousClass3D7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MaximizedParticipantVideoDialogFragment A00;

    public AnonymousClass3D7(MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment) {
        this.A00 = maximizedParticipantVideoDialogFragment;
    }

    public boolean onPreDraw() {
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A00;
        maximizedParticipantVideoDialogFragment.A07.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        maximizedParticipantVideoDialogFragment.A07.getLocationOnScreen(iArr);
        maximizedParticipantVideoDialogFragment.A02 = maximizedParticipantVideoDialogFragment.A0G - iArr[0];
        maximizedParticipantVideoDialogFragment.A03 = maximizedParticipantVideoDialogFragment.A0H - iArr[1];
        float f2 = 1.0f;
        maximizedParticipantVideoDialogFragment.A01 = maximizedParticipantVideoDialogFragment.A07.getWidth() != 0 ? ((float) maximizedParticipantVideoDialogFragment.A0F) / ((float) maximizedParticipantVideoDialogFragment.A07.getWidth()) : 1.0f;
        if (maximizedParticipantVideoDialogFragment.A07.getHeight() != 0) {
            f2 = ((float) maximizedParticipantVideoDialogFragment.A0E) / ((float) maximizedParticipantVideoDialogFragment.A07.getHeight());
        }
        maximizedParticipantVideoDialogFragment.A00 = f2;
        VideoCallParticipantView videoCallParticipantView = maximizedParticipantVideoDialogFragment.A07;
        AnonymousClass00B.A04(videoCallParticipantView);
        AnonymousClass00B.A04(maximizedParticipantVideoDialogFragment.A06);
        AnonymousClass00B.A04(maximizedParticipantVideoDialogFragment.A05);
        videoCallParticipantView.setPivotX(0.0f);
        maximizedParticipantVideoDialogFragment.A07.setPivotY(0.0f);
        maximizedParticipantVideoDialogFragment.A07.setScaleX(maximizedParticipantVideoDialogFragment.A01);
        maximizedParticipantVideoDialogFragment.A07.setScaleY(maximizedParticipantVideoDialogFragment.A00);
        maximizedParticipantVideoDialogFragment.A07.setTranslationX((float) maximizedParticipantVideoDialogFragment.A02);
        maximizedParticipantVideoDialogFragment.A07.setTranslationY((float) maximizedParticipantVideoDialogFragment.A03);
        C13690nt.A0L(maximizedParticipantVideoDialogFragment.A07.animate().setDuration(250)).setInterpolator(new DecelerateInterpolator(1.5f));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        maximizedParticipantVideoDialogFragment.A06.startAnimation(alphaAnimation);
        if (maximizedParticipantVideoDialogFragment.A05.getVisibility() == 0) {
            maximizedParticipantVideoDialogFragment.A05.startAnimation(alphaAnimation);
        }
        View view = maximizedParticipantVideoDialogFragment.A04;
        AnonymousClass00B.A04(view);
        view.setAlpha(0.0f);
        maximizedParticipantVideoDialogFragment.A04.animate().setDuration(250).alpha(0.4f);
        return true;
    }
}
