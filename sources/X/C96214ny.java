package X;

import com.google.android.exoplayer2.Timeline;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4ny  reason: invalid class name and case insensitive filesystem */
public class C96214ny implements AnonymousClass5TQ {
    public final /* synthetic */ C78603yM A00;

    public C96214ny(C78603yM r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void AQo(boolean z2) {
    }

    public /* synthetic */ void ASO(boolean z2) {
    }

    public /* synthetic */ void ASP(boolean z2) {
    }

    public /* synthetic */ void ATO(C86924Ur r1, int i2) {
    }

    public /* synthetic */ void AUm(boolean z2, int i2) {
    }

    public /* synthetic */ void AUo(C89214bm r1) {
    }

    public /* synthetic */ void AUq(int i2) {
    }

    public /* synthetic */ void AUr(int i2) {
    }

    public void AUs(C804643y r3) {
        Log.e(AnonymousClass000.A0h(r3.toString(), AnonymousClass000.A0r("exoaudioplayer/onPlayerError: ")));
    }

    public void AUt(boolean z2, int i2) {
        if (i2 == 3) {
            C78603yM r3 = this.A00;
            if (!r3.A05) {
                int ABq = (int) r3.A07.ABq();
                r3.A00 = ABq;
                AnonymousClass4E4 r1 = r3.A04;
                if (r1 != null) {
                    r3.A05 = true;
                    r1.A00.A03 = ABq;
                }
            }
        }
    }

    public /* synthetic */ void AUy(int i2) {
    }

    public /* synthetic */ void AWt() {
    }

    public /* synthetic */ void AXd(List list) {
    }

    public /* synthetic */ void AYr(Timeline timeline, int i2) {
        C806544y.A00(this, timeline, i2);
    }

    public /* synthetic */ void AYs(Timeline timeline, Object obj, int i2) {
    }

    public void AZ8(C93604jT r6, AnonymousClass4TI r7) {
        C78603yM r4 = this.A00;
        if (r6 != r4.A01) {
            AnonymousClass4S2 r0 = r4.A08.A00;
            if (r0 != null && r0.A00(1) == 1) {
                C16300so r3 = r4.A03;
                if (r3 != null) {
                    r3.AcB("exoaudioplayer/audio-track-not-playable", (String) null, false);
                }
                Log.e("exoaudioplayer/onTracksChanged: Media includes audio tracks, but none are playable by this device");
            }
            r4.A01 = r6;
        }
    }
}
