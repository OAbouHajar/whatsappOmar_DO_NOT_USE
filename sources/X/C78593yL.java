package X;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusPlayer;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3yL  reason: invalid class name and case insensitive filesystem */
public final class C78593yL extends C30211bx {
    public final OpusPlayer A00;

    public C78593yL(File file, int i2) {
        this.A00 = new OpusPlayer(file.getAbsolutePath(), i2);
    }

    public int A02() {
        try {
            return (int) this.A00.getCurrentPosition();
        } catch (IOException e2) {
            Log.e((Throwable) e2);
            return 0;
        }
    }

    public int A03() {
        try {
            return (int) this.A00.getLength();
        } catch (IOException e2) {
            Log.e((Throwable) e2);
            return 0;
        }
    }

    public void A04() {
        try {
            this.A00.pause();
        } catch (IOException e2) {
            Log.e((Throwable) e2);
        }
    }

    public void A05() {
        this.A00.prepare();
    }

    public void A06() {
        this.A00.close();
    }

    public void A07() {
        this.A00.resume();
    }

    public void A08() {
        this.A00.start();
    }

    public void A09() {
        try {
            this.A00.stop();
        } catch (IOException e2) {
            Log.e((Throwable) e2);
        }
    }

    public void A0A(int i2) {
        this.A00.seek((long) i2);
    }

    public void A0B(MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void A0C(AnonymousClass4E4 r1) {
    }

    public boolean A0D() {
        try {
            return this.A00.isPlaying();
        } catch (IOException e2) {
            Log.e((Throwable) e2);
            return false;
        }
    }

    public boolean A0E(C16300so r2, float f2) {
        return false;
    }
}
