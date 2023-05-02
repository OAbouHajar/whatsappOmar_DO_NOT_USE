package X;

import android.media.MediaPlayer;
import android.os.Build;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1bx  reason: invalid class name and case insensitive filesystem */
public abstract class C30211bx {
    public static C30211bx A00(C16980tz r3, C14710pd r4, File file, int i2) {
        boolean A01 = r4 != null ? A01(r4) : false;
        if (r3 != null && A01 && file.getAbsolutePath().endsWith(".opus")) {
            return new C78603yM(r3.A00, r4, file, i2);
        }
        if (!file.getAbsolutePath().endsWith(".opus")) {
            AnonymousClass2PQ r2 = new AnonymousClass2PQ(i2);
            r2.A00.setDataSource(file.getAbsolutePath());
            return r2;
        }
        StringBuilder sb = new StringBuilder("AudioPlayer/create exoplayer enabled:");
        sb.append(A01);
        sb.append(" Build.MANUFACTURER:");
        sb.append(Build.MANUFACTURER);
        sb.append(" Build.DEVICE:");
        sb.append(Build.DEVICE);
        sb.append(" SDK_INT:");
        sb.append(Build.VERSION.SDK_INT);
        Log.e(sb.toString());
        return new C78593yL(file, i2);
    }

    public static boolean A01(C14710pd r2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C16620tM r1 = C16620tM.A02;
            return r2.A0E(r1, 751) && !C41971wz.A0B(r2.A06(r1, 2917));
        }
    }

    public int A02() {
        return ((AnonymousClass2PQ) this).A00.getCurrentPosition();
    }

    public int A03() {
        return ((AnonymousClass2PQ) this).A00.getDuration();
    }

    public void A04() {
        ((AnonymousClass2PQ) this).A00.pause();
    }

    public void A05() {
        ((AnonymousClass2PQ) this).A00.prepare();
    }

    public void A06() {
        AnonymousClass2PQ r1 = (AnonymousClass2PQ) this;
        r1.A01.postDelayed(new RunnableRunnableShape16S0100000_I0_15(r1, 6), 100);
    }

    public void A07() {
        ((AnonymousClass2PQ) this).A00.start();
    }

    public void A08() {
        ((AnonymousClass2PQ) this).A00.start();
    }

    public void A09() {
        ((AnonymousClass2PQ) this).A00.stop();
    }

    public void A0A(int i2) {
        ((AnonymousClass2PQ) this).A00.seekTo(i2);
    }

    public void A0B(MediaPlayer.OnErrorListener onErrorListener) {
        ((AnonymousClass2PQ) this).A00.setOnErrorListener(onErrorListener);
    }

    public void A0C(AnonymousClass4E4 r1) {
    }

    public boolean A0D() {
        return ((AnonymousClass2PQ) this).A00.isPlaying();
    }

    public abstract boolean A0E(C16300so r1, float f2);
}
