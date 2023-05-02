package X;

import android.widget.TextView;
import com.obwhatsapp.mediacomposer.VideoComposerFragment;
import com.obwhatsapp.mediacomposer.VideoTimelineView;

/* renamed from: X.3G7  reason: invalid class name */
public class AnonymousClass3G7 implements C108845Ps {
    public final /* synthetic */ VideoComposerFragment A00;

    public AnonymousClass3G7(VideoComposerFragment videoComposerFragment) {
        this.A00 = videoComposerFragment;
    }

    public void AYt(VideoTimelineView videoTimelineView, int i2, long j2, long j3) {
        long j4 = j3;
        VideoComposerFragment videoComposerFragment = this.A00;
        if (videoComposerFragment.A0M.A0C()) {
            videoComposerFragment.A1I();
        }
        long j5 = j2;
        videoComposerFragment.A02 = j5;
        videoComposerFragment.A03 = j4;
        long j6 = 0;
        if (j2 - 200 <= 0 && j3 + 200 >= videoComposerFragment.A0L.A04) {
            j4 = 0;
        } else if (j3 - j2 < 1000) {
            j4 = Math.min(j2 + 1000, videoComposerFragment.A0L.A04);
            j6 = Math.max(0, j4 - 1000);
        } else {
            j6 = j5;
        }
        ((AnonymousClass29K) videoComposerFragment.A0C()).Aev(videoComposerFragment.A00, j6, j4);
        videoComposerFragment.A0M.A0A((int) j5);
        videoComposerFragment.A1E();
        TextView textView = videoComposerFragment.A0E;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(C28961Zl.A04(videoComposerFragment.A07, videoComposerFragment.A02 / 1000));
        A0o.append(" - ");
        textView.setText(AnonymousClass000.A0h(C28961Zl.A04(videoComposerFragment.A07, videoComposerFragment.A03 / 1000), A0o));
        videoComposerFragment.A1K();
    }
}
