package X;

import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.obwhatsapp.status.playback.widget.StatusPlaybackProgressView;

/* renamed from: X.4Ta  reason: invalid class name */
public class AnonymousClass4Ta {
    public final /* synthetic */ C41811wh A00;
    public final /* synthetic */ AnonymousClass2B3 A01;

    public AnonymousClass4Ta(AnonymousClass2B3 r1) {
        this.A01 = r1;
        this.A00 = r1;
    }

    public void A00() {
        StringBuilder A0r = AnonymousClass000.A0r("playbackPage/onPlaybackContentFinished page=");
        A0r.append(this);
        A0r.append("; host=");
        C41811wh r3 = this.A00;
        A0r.append(r3.A0R.A01);
        C13680ns.A1V(A0r);
        StatusPlaybackProgressView statusPlaybackProgressView = r3.A02;
        if (statusPlaybackProgressView.A03 == r3.A0S) {
            statusPlaybackProgressView.A03 = null;
        }
        statusPlaybackProgressView.invalidate();
        if (!r3.A04) {
            r3.A08.post(new RunnableRunnableShape20S0100000_I1_3(this, 14));
        }
    }

    public void A01() {
        StringBuilder A0r = AnonymousClass000.A0r("playbackPage/onPlaybackContentStarted page=");
        A0r.append(this);
        A0r.append("; host=");
        C41811wh r1 = this.A00;
        A0r.append(r1.A0R.A01);
        C13680ns.A1V(A0r);
        r1.A0B();
    }
}
