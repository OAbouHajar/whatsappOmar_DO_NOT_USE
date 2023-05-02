package X;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.exoplayer2.Timeline;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import java.util.Formatter;
import java.util.List;

/* renamed from: X.3Cs  reason: invalid class name and case insensitive filesystem */
public final class C62253Cs implements View.OnClickListener, AnonymousClass5TQ, SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public final /* synthetic */ ExoPlaybackControlView A01;

    public C62253Cs(ExoPlaybackControlView exoPlaybackControlView) {
        this.A01 = exoPlaybackControlView;
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
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A04();
        exoPlaybackControlView.A05();
    }

    public void AUy(int i2) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A03();
        exoPlaybackControlView.A05();
    }

    public /* synthetic */ void AWt() {
    }

    public /* synthetic */ void AXd(List list) {
    }

    public /* synthetic */ void AYr(Timeline timeline, int i2) {
        C806544y.A00(this, timeline, i2);
    }

    public void AYs(Timeline timeline, Object obj, int i2) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A03();
        exoPlaybackControlView.A05();
    }

    public void AZ8(C93604jT r1, AnonymousClass4TI r2) {
    }

    public void onClick(View view) {
        AnonymousClass2PU r0;
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        AnonymousClass5N5 r02 = exoPlaybackControlView.A03;
        if (r02 != null) {
            AnonymousClass29C r1 = ((C1038552z) r02).A00;
            r1.A0K(r1.A0F());
        }
        if (exoPlaybackControlView.A0E == view && (r0 = exoPlaybackControlView.A01) != null) {
            int AF5 = r0.AF5();
            AnonymousClass2PU r2 = exoPlaybackControlView.A01;
            if (AF5 == 4) {
                r2.AdF(0);
            } else {
                r2.AeK(!r2.AF3());
            }
        }
        exoPlaybackControlView.A06(300);
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2) {
            ExoPlaybackControlView exoPlaybackControlView = this.A01;
            TextView textView = exoPlaybackControlView.A0L;
            StringBuilder sb = exoPlaybackControlView.A0Q;
            Formatter formatter = exoPlaybackControlView.A0R;
            long duration = exoPlaybackControlView.getDuration();
            textView.setText(C46212Cy.A00(sb, formatter, duration == -9223372036854775807L ? 0 : C13690nt.A09(duration * ((long) i2))));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0O);
        C108925Qa r0 = exoPlaybackControlView.A04;
        if (r0 != null) {
            r0.AXY();
        }
        AnonymousClass2PU r02 = exoPlaybackControlView.A01;
        if (r02 != null && r02.AF3()) {
            exoPlaybackControlView.A01.AeK(false);
            this.A00 = true;
        }
        exoPlaybackControlView.A0A = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A0A = false;
        AnonymousClass2PU r8 = exoPlaybackControlView.A01;
        if (r8 != null) {
            int progress = seekBar.getProgress();
            long duration = exoPlaybackControlView.getDuration();
            r8.AdF(duration == -9223372036854775807L ? 0 : C13690nt.A09(duration * ((long) progress)));
        }
        AnonymousClass2PU r1 = exoPlaybackControlView.A01;
        if (r1 != null && this.A00) {
            r1.AeK(true);
        }
        this.A00 = false;
        exoPlaybackControlView.A06(3000);
    }
}
