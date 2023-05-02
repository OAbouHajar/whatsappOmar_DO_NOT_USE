package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.2si  reason: invalid class name and case insensitive filesystem */
public class C58092si extends C54882iQ {
    public boolean A00;
    public final /* synthetic */ C55722kE A01;
    public final /* synthetic */ C41811wh A02;

    public C58092si(C55722kE r1, C41811wh r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void A01(View view, float f2) {
        int i2 = (f2 > 0.95f ? 1 : (f2 == 0.95f ? 0 : -1));
        C41811wh r2 = this.A02;
        if (i2 > 0) {
            r2.A0G();
        } else {
            r2.A0M(false, false);
        }
        View view2 = this.A01.A03;
        float f3 = 1.0f;
        if (f2 < 0.5f) {
            f3 = 2.0f * f2;
        }
        view2.setAlpha(f3);
        C43211zc r4 = (C43211zc) r2.A0R.A01.A0C();
        if (r4 != null) {
            C000900k r42 = (C000900k) r4;
            float f4 = 0.0f;
            if (f2 >= 0.9f) {
                f4 = 1.0f - ((1.0f - f2) * 10.0f);
            }
            View findViewById = r42.findViewById(R.id.video_playback_container_overlay);
            findViewById.setVisibility(0);
            findViewById.setBackgroundColor(((int) (f4 * 255.0f)) << 24);
            r42.findViewById(R.id.video_playback_container).setVisibility(4);
        }
        if (!this.A00) {
            r2.A09().A06(true);
            this.A00 = true;
        }
    }

    public void A02(View view, int i2) {
        if (i2 == 4) {
            AnonymousClass4L6 r2 = this.A02.A0R;
            StringBuilder A0r = AnonymousClass000.A0r("playbackFragment/onPlaybackExit ");
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = r2.A01;
            A0r.append(statusPlaybackBaseFragment);
            C13680ns.A1V(A0r);
            C43211zc r1 = (C43211zc) statusPlaybackBaseFragment.A0C();
            if (r1 != null) {
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) r1;
                statusPlaybackActivity.A03 = 1;
                statusPlaybackActivity.finish();
                statusPlaybackActivity.overridePendingTransition(0, 0);
            }
        } else if (i2 == 3) {
            C41811wh r22 = this.A02;
            if (r22.A00.A0B != 3) {
                r22.A09().A06(false);
                this.A00 = false;
                r22.A0D();
            }
        }
    }
}
