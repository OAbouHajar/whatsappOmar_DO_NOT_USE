package X;

import android.content.Context;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.MediaController;
import com.facebook.redex.IDxPListenerShape328S0100000_2_I0;

/* renamed from: X.2PI  reason: invalid class name */
public class AnonymousClass2PI extends AnonymousClass2PJ implements MediaController.MediaPlayerControl {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = 0;
    public int A04;
    public int A05;
    public MediaPlayer.OnCompletionListener A06;
    public MediaPlayer.OnErrorListener A07;
    public MediaPlayer.OnPreparedListener A08;
    public MediaPlayer A09;
    public Surface A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Matrix A0I = new Matrix();
    public final /* synthetic */ C79183zL A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PI(Context context, C79183zL r4) {
        super(context);
        this.A0J = r4;
        A00();
    }

    public void A00() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A09 = mediaPlayer;
        mediaPlayer.setOnVideoSizeChangedListener(new C91904gg(this));
        this.A09.setOnErrorListener(new C91854gb(this));
        this.A09.setOnPreparedListener(new IDxPListenerShape328S0100000_2_I0(this, 1));
        this.A09.setOnCompletionListener(new C91824gY(this));
        setSurfaceTextureListener(new AnonymousClass2PH(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r3 = this;
            android.media.MediaPlayer r0 = r3.A09
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r1 = r3.A00
            r0 = -1
            if (r1 == r0) goto L_0x000f
            if (r1 == 0) goto L_0x000f
            if (r1 == r2) goto L_0x000f
            return r2
        L_0x000f:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PI.A01():boolean");
    }

    public boolean canPause() {
        return this.A0C;
    }

    public boolean canSeekBackward() {
        return this.A0D;
    }

    public boolean canSeekForward() {
        return this.A0E;
    }

    public int getAudioSessionId() {
        AnonymousClass00B.A0B("Not implemented", false);
        return 0;
    }

    public int getBufferPercentage() {
        AnonymousClass00B.A0B("Not implemented", false);
        return 0;
    }

    public int getCurrentPosition() {
        if (!A01()) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.A09;
        AnonymousClass00B.A06(mediaPlayer);
        return mediaPlayer.getCurrentPosition();
    }

    public int getDuration() {
        if (!A01()) {
            return -1;
        }
        MediaPlayer mediaPlayer = this.A09;
        AnonymousClass00B.A06(mediaPlayer);
        return mediaPlayer.getDuration();
    }

    public boolean isPlaying() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            AnonymousClass00B.A06(mediaPlayer);
            return mediaPlayer.isPlaying();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 4) {
            mediaPlayer.start();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 3) {
            mediaPlayer.pause();
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 4) {
            mediaPlayer.start();
        }
    }

    public void onMeasure(int i2, int i3) {
        float f2;
        super.onMeasure(i2, i3);
        if (this.A05 != 0 && this.A04 != 0) {
            int i4 = this.A01;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (i4 != 1) {
                int i5 = this.A05;
                int i6 = i5 * measuredHeight;
                int i7 = this.A04;
                int i8 = i7 * measuredWidth;
                if (i6 > i8) {
                    measuredHeight = i8 / i5;
                } else {
                    measuredWidth = i6 / i7;
                }
                setMeasuredDimension(measuredWidth, measuredHeight);
                return;
            }
            Matrix matrix = this.A0I;
            matrix.reset();
            int i9 = this.A05;
            int i10 = i9 * measuredHeight;
            int i11 = this.A04;
            int i12 = i11 * measuredWidth;
            float f3 = 1.0f;
            if (i10 > i12) {
                f3 = (((float) i9) * ((float) measuredHeight)) / ((float) i12);
                f2 = 1.0f;
            } else {
                f2 = (((float) i11) * ((float) measuredWidth)) / ((float) i10);
            }
            matrix.setScale(f3, f2, (float) (measuredWidth >> 1), (float) (measuredHeight >> 1));
            setTransform(matrix);
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 3) {
            mediaPlayer.pause();
        }
    }

    public void pause() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            AnonymousClass00B.A06(mediaPlayer);
            if (mediaPlayer.isPlaying()) {
                this.A09.pause();
                this.A00 = 4;
            }
        }
        this.A03 = 4;
    }

    public void seekTo(int i2) {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            AnonymousClass00B.A06(mediaPlayer);
            mediaPlayer.seekTo(i2);
            i2 = -1;
        }
        this.A02 = i2;
    }

    public void setLooping(boolean z2) {
        this.A0F = z2;
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z2);
        }
    }

    public void setMute(boolean z2) {
        this.A0G = z2;
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            float f2 = 1.0f;
            if (z2) {
                f2 = 0.0f;
            }
            mediaPlayer.setVolume(f2, f2);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A06 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A07 = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A08 = onPreparedListener;
    }

    public void setScaleType(int i2) {
        int i3 = this.A01;
        this.A01 = i2;
        if (i3 != i2) {
            requestLayout();
        }
    }

    public void setVideoPath(String str) {
        this.A0B = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r3.A0J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r3 = this;
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x000f
            X.3zL r1 = r3.A0J
            X.5Qf r0 = r1.A03
            if (r0 == 0) goto L_0x000f
            r0.AXT(r1)
        L_0x000f:
            boolean r2 = r3.A01()
            r1 = 3
            android.media.MediaPlayer r0 = r3.A09
            if (r2 == 0) goto L_0x0023
            X.AnonymousClass00B.A06(r0)
            r0.start()
            r3.A00 = r1
        L_0x0020:
            r3.A03 = r1
            return
        L_0x0023:
            if (r0 != 0) goto L_0x0020
            r3.A00()
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PI.start():void");
    }
}
