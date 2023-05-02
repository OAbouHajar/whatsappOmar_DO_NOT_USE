package X;

import com.google.android.exoplayer2.Timeline;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import java.util.List;

/* renamed from: X.3E0  reason: invalid class name */
public final class AnonymousClass3E0 implements AnonymousClass5TQ, C108335No, C107705Lb {
    public final /* synthetic */ C56852oj A00;

    public AnonymousClass3E0(C56852oj r1) {
        this.A00 = r1;
    }

    public void APH(List list) {
        this.A00.A0C.APH(list);
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

    public void AUo(C89214bm r1) {
    }

    public /* synthetic */ void AUq(int i2) {
    }

    public /* synthetic */ void AUr(int i2) {
    }

    public void AUs(C804643y r1) {
    }

    public void AUt(boolean z2, int i2) {
        C56852oj r2 = this.A00;
        r2.A00 = i2;
        if (i2 != 3) {
            ExoPlaybackControlView exoPlaybackControlView = r2.A02;
            if (exoPlaybackControlView != null && i2 == 4) {
                if (!exoPlaybackControlView.A07()) {
                    r2.A02.A01();
                }
                AnonymousClass4WY r0 = r2.A03;
                if (r0 != null) {
                    r0.A00();
                }
                AnonymousClass2PR r1 = r2.A01;
                AnonymousClass00B.A06(r1);
                r1.AeK(false);
                r2.A01.AdF(0);
                return;
            } else if (i2 == 2) {
                AnonymousClass4WY r12 = r2.A03;
                if (r12 == null) {
                    return;
                }
                if (r2.A07) {
                    r12.A02(r2.A06);
                    return;
                } else {
                    r12.A01();
                    return;
                }
            }
        }
        AnonymousClass4WY r02 = r2.A03;
        if (r02 != null) {
            r02.A00();
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

    public void AZ8(C93604jT r1, AnonymousClass4TI r2) {
    }
}
