package X;

import android.widget.SeekBar;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.3DK  reason: invalid class name */
public class AnonymousClass3DK implements SeekBar.OnSeekBarChangeListener {
    public C94844lZ A00;
    public boolean A01;
    public final C19610yi A02;
    public final AudioPlayerView A03;
    public final AnonymousClass5QJ A04;
    public final AnonymousClass01D A05;

    public AnonymousClass3DK(C19610yi r1, AudioPlayerView audioPlayerView, AnonymousClass5QJ r3, C94844lZ r4, AnonymousClass01D r5) {
        this.A03 = audioPlayerView;
        this.A04 = r3;
        this.A02 = r1;
        this.A05 = r5;
        this.A00 = r4;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2) {
            C94844lZ r0 = this.A00;
            r0.onProgressChanged(seekBar, i2, z2);
            r0.A00(i2 / 1000);
            AudioPlayerView audioPlayerView = this.A03;
            audioPlayerView.setSeekbarContentDescription((long) audioPlayerView.A07.getProgress());
        }
        AudioPlayerView audioPlayerView2 = this.A03;
        if (audioPlayerView2.A03.isEnabled()) {
            audioPlayerView2.A03.setPlaybackPercentage((((float) i2) * 1.0f) / ((float) audioPlayerView2.A00));
        }
        AnonymousClass2DT.A01(this.A04.AC9(), audioPlayerView2.A07.getProgress());
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C38701rH AC9 = this.A04.AC9();
        this.A01 = false;
        C19610yi r2 = this.A02;
        AnonymousClass2DT A002 = r2.A00();
        if (r2.A0D(AC9) && r2.A0B() && A002 != null) {
            A002.A0F(true);
            this.A01 = true;
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C38701rH AC9 = this.A04.AC9();
        C94844lZ r2 = this.A00;
        r2.onStopTrackingTouch(seekBar);
        C19610yi r1 = this.A02;
        if (!r1.A0D(AC9) || r1.A0B() || !this.A01) {
            r2.A00(AC9.A00);
            int progress = this.A03.A07.getProgress();
            ((AnonymousClass1B7) this.A05.get()).AeS(AC9.A13, progress);
            AnonymousClass2DT.A01(AC9, progress);
            return;
        }
        int i2 = 0;
        this.A01 = false;
        AnonymousClass2DT A002 = r1.A00();
        if (A002 != null) {
            A002.A0A(this.A03.A07.getProgress());
            if (AC9.A1B()) {
                i2 = AnonymousClass2DT.A0x;
            }
            A002.A0B(i2, true, false);
        }
    }
}
