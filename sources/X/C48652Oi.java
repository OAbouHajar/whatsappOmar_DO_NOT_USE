package X;

import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.util.Log;

/* renamed from: X.2Oi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C48652Oi {
    public final /* synthetic */ AnonymousClass29C A00;

    public /* synthetic */ C48652Oi(AnonymousClass29C r1) {
        this.A00 = r1;
    }

    public final void A00(String str, boolean z2, int i2) {
        AnonymousClass29C r3 = this.A00;
        boolean z3 = false;
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder("ExoPlayerVideoPlayer/onError=");
            sb.append(str);
            Log.e(sb.toString());
            r3.A02(str, "download_failed", z2);
            AnonymousClass2PV r1 = r3.A0D;
            if (r1 != null && !(r1 instanceof C610537d)) {
                ((C610637e) r1).A0A.A00();
            }
        } else if (i2 == 2) {
            ExoPlaybackControlView exoPlaybackControlView = r3.A0C;
            if (exoPlaybackControlView != null) {
                exoPlaybackControlView.setPlayControlVisibility(0);
            }
            r3.A09();
            r3.A08();
        }
        C56852oj r32 = r3.A0Y;
        if (i2 == 1) {
            z3 = true;
        }
        r32.A06 = str;
        AnonymousClass4WY r2 = r32.A03;
        if (r2 != null && r32.A07 != z3) {
            int i3 = r32.A00;
            if (z3) {
                if (i3 == 2) {
                    r2.A02(str);
                }
            } else if (i3 == 2) {
                r2.A01();
            }
            r32.A07 = z3;
        }
    }
}
