package X;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.AlphaAnimation;
import com.obwhatsapp.camera.recording.RecordingView;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2DG  reason: invalid class name */
public class AnonymousClass2DG {
    public long A00;
    public final Handler A01 = new C56432nd(Looper.getMainLooper(), this);
    public final C15900s5 A02;
    public final C54802iH A03;
    public final RecordingView A04;
    public final C16440t3 A05;
    public final AnonymousClass013 A06;
    public final List A07;
    public final boolean A08;

    public AnonymousClass2DG(C15900s5 r3, C54802iH r4, RecordingView recordingView, C16440t3 r6, AnonymousClass013 r7, List list, boolean z2) {
        this.A03 = r4;
        this.A04 = recordingView;
        this.A07 = list;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A08 = z2;
        recordingView.A01(z2);
        recordingView.A00.setText(C28961Zl.A04(r7, 0));
    }

    public final String A00(long j2) {
        boolean z2 = this.A08;
        AnonymousClass013 r2 = this.A06;
        if (!z2) {
            return C28961Zl.A04(r2, (long) ((int) (j2 / 1000)));
        }
        Locale A002 = AnonymousClass013.A00(r2.A00);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(A002, "%02d:%02d", new Object[]{Long.valueOf(timeUnit.toMinutes(j2)), Long.valueOf(timeUnit.toSeconds(j2) % 60)});
    }

    public void A01(boolean z2, boolean z3, boolean z4) {
        RecordingView recordingView = this.A04;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        recordingView.setVisibility(i2);
        if (z2 && z4) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(220);
            recordingView.startAnimation(alphaAnimation);
        }
        recordingView.setSelected(z3);
        if (!z2 || !z3) {
            recordingView.A00.setText(A00(0));
            recordingView.A01.setProgress(0);
        }
    }

    public boolean A02() {
        return System.currentTimeMillis() - this.A00 > 1000;
    }
}
