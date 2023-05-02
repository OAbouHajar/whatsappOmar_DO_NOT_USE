package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.redex.IDxCListenerShape294S0100000_2_I1;
import com.facebook.redex.IDxEListenerShape349S0100000_2_I1;
import com.obwhatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.3zK  reason: invalid class name and case insensitive filesystem */
public class C79173zK extends AnonymousClass29D {
    public final VideoSurfaceView A00;

    public C79173zK(Context context, String str, boolean z2) {
        C79163zI r2 = new C79163zI(context, this);
        this.A00 = r2;
        r2.setVideoPath(str);
        r2.A0A = new IDxEListenerShape349S0100000_2_I1(this, 0);
        r2.A09 = new IDxCListenerShape294S0100000_2_I1(this, 0);
        r2.setLooping(z2);
    }

    public int A03() {
        return this.A00.getCurrentPosition();
    }

    public int A04() {
        return this.A00.getDuration();
    }

    public Bitmap A05() {
        return null;
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
        this.A00.A00();
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
        return C13700nu.A0g(this.A00.getCurrentPosition(), 50);
    }

    public boolean A0E() {
        return false;
    }
}
