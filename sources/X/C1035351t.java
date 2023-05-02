package X;

import com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.obwhatsapp.status.playback.widget.AudioVolumeView;

/* renamed from: X.51t  reason: invalid class name and case insensitive filesystem */
public class C1035351t implements AnonymousClass5S9 {
    public final /* synthetic */ StatusPlaybackBaseFragment A00;

    public C1035351t(StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A00 = statusPlaybackBaseFragment;
    }

    public void AMp(boolean z2) {
    }

    public void AMt(int i2, int i3, int i4) {
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A00;
        if (statusPlaybackBaseFragment.A00 && i4 != 0) {
            int i5 = i3 + 1;
            if (i3 == 0) {
                i5 = 0;
            }
            AudioVolumeView audioVolumeView = statusPlaybackBaseFragment.A1G().A0D;
            audioVolumeView.setVolume((((float) i5) * 1.0f) / ((float) (i4 + 1)));
            audioVolumeView.setVisibility(0);
            Runnable runnable = statusPlaybackBaseFragment.A06;
            audioVolumeView.removeCallbacks(runnable);
            audioVolumeView.postDelayed(runnable, 1500);
        }
    }
}
