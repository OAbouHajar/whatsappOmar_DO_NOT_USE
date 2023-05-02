package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.view.View;
import com.facebook.redex.IDxCListenerShape294S0100000_2_I1;
import com.facebook.redex.IDxEListenerShape349S0100000_2_I1;

/* renamed from: X.3zL  reason: invalid class name and case insensitive filesystem */
public class C79183zL extends AnonymousClass29D {
    public final AnonymousClass2PI A00;

    public C79183zL(Context context, String str, boolean z2) {
        AnonymousClass2PI r2 = new AnonymousClass2PI(context, this);
        this.A00 = r2;
        r2.A0B = str;
        r2.A07 = new IDxEListenerShape349S0100000_2_I1(this, 1);
        r2.A06 = new IDxCListenerShape294S0100000_2_I1(this, 1);
        r2.setLooping(z2);
    }

    public int A03() {
        return this.A00.getCurrentPosition();
    }

    public int A04() {
        return this.A00.getDuration();
    }

    public Bitmap A05() {
        return this.A00.getBitmap();
    }

    public View A06() {
        return this.A00;
    }

    public void A07() {
        this.A00.pause();
    }

    public void A08() {
        this.A00.start();
    }

    public void A09() {
        AnonymousClass2PI r1 = this.A00;
        MediaPlayer mediaPlayer = r1.A09;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            r1.A09.release();
            r1.A09 = null;
            r1.A0H = false;
            r1.A00 = 0;
            r1.A03 = 0;
        }
    }

    public void A0A(int i2) {
        this.A00.seekTo(i2);
    }

    public void A0B(boolean z2) {
        this.A00.setMute(z2);
    }

    public boolean A0C() {
        return this.A00.isPlaying();
    }

    public boolean A0D() {
        return this.A00.A0H;
    }

    public boolean A0E() {
        return false;
    }
}
