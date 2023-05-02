package X;

import android.os.Handler;
import android.widget.FrameLayout;
import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import com.obwhatsapp.videoplayback.ExoPlayerErrorFrame;

/* renamed from: X.4WY  reason: invalid class name */
public class AnonymousClass4WY {
    public RunnableRunnableShape1S1100000_I1 A00;
    public final Handler A01 = new Handler();
    public final ExoPlaybackControlView A02;
    public final ExoPlayerErrorFrame A03;
    public final boolean A04;

    public AnonymousClass4WY(ExoPlaybackControlView exoPlaybackControlView, ExoPlayerErrorFrame exoPlayerErrorFrame, boolean z2) {
        this.A03 = exoPlayerErrorFrame;
        this.A02 = exoPlaybackControlView;
        this.A04 = z2;
    }

    public void A00() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A03;
        exoPlayerErrorFrame.setLoadingViewVisibility(8);
        RunnableRunnableShape1S1100000_I1 runnableRunnableShape1S1100000_I1 = this.A00;
        if (runnableRunnableShape1S1100000_I1 != null) {
            this.A01.removeCallbacks(runnableRunnableShape1S1100000_I1);
        }
        if (exoPlayerErrorFrame.getErrorScreenVisibility() == 0) {
            ExoPlaybackControlView exoPlaybackControlView = this.A02;
            if (exoPlaybackControlView != null) {
                exoPlaybackControlView.setPlayControlVisibility(0);
            }
            FrameLayout frameLayout = exoPlayerErrorFrame.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
    }

    public void A01() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A03;
        exoPlayerErrorFrame.setLoadingViewVisibility(0);
        FrameLayout frameLayout = exoPlayerErrorFrame.A02;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public void A02(String str) {
        this.A03.setLoadingViewVisibility(0);
        if (this.A04) {
            RunnableRunnableShape1S1100000_I1 runnableRunnableShape1S1100000_I1 = this.A00;
            if (runnableRunnableShape1S1100000_I1 != null) {
                this.A01.removeCallbacks(runnableRunnableShape1S1100000_I1);
            } else {
                this.A00 = new RunnableRunnableShape1S1100000_I1(11, str, this);
            }
            this.A01.postDelayed(this.A00, 5000);
        }
    }
}
