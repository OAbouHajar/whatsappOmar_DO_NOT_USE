package com.obwhatsapp.videoplayback;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1XI;
import X.C13680ns;
import X.C13700nu;
import X.C63983Mh;
import X.C91814gX;
import X.C91884ge;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import com.facebook.redex.IDxCListenerShape294S0100000_2_I1;
import com.facebook.redex.IDxCallbackShape335S0100000_2_I1;
import com.facebook.redex.IDxEListenerShape349S0100000_2_I1;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class VideoSurfaceView extends C63983Mh implements MediaController.MediaPlayerControl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public MediaPlayer.OnCompletionListener A09;
    public MediaPlayer.OnErrorListener A0A;
    public MediaPlayer.OnPreparedListener A0B;
    public MediaPlayer A0C;
    public Uri A0D;
    public SurfaceHolder A0E;
    public Map A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final MediaPlayer.OnBufferingUpdateListener A0L = new C91814gX(this);
    public final MediaPlayer.OnCompletionListener A0M = new IDxCListenerShape294S0100000_2_I1(this, 2);
    public final MediaPlayer.OnErrorListener A0N = new IDxEListenerShape349S0100000_2_I1(this, 2);
    public final MediaPlayer.OnPreparedListener A0O = new C91884ge(this);
    public final MediaPlayer.OnVideoSizeChangedListener A0P = C63983Mh.A00(this);
    public final SurfaceHolder.Callback A0Q = new IDxCallbackShape335S0100000_2_I1(this, 3);

    public VideoSurfaceView(Context context) {
        super(context);
        A01();
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
    }

    public void A00() {
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.A0C.release();
            this.A0C = null;
            this.A02 = 0;
            this.A06 = 0;
        }
    }

    public final void A01() {
        this.A08 = 0;
        this.A07 = 0;
        getHolder().addCallback(this.A0Q);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.A02 = 0;
        this.A06 = 0;
    }

    public final void A02() {
        Uri uri = this.A0D;
        if (uri != null && this.A0E != null) {
            File A032 = AnonymousClass1XI.A03(uri);
            if (A032 == null || !A032.exists() || !GifHelper.A01(A032)) {
                Intent A022 = C13700nu.A02("com.android.music.musicservicecommand");
                A022.putExtra("command", "pause");
                getContext().sendBroadcast(A022);
            }
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                this.A0C.release();
                this.A0C = null;
                this.A02 = 0;
            }
            try {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.A0C = mediaPlayer2;
                int i2 = this.A00;
                if (i2 != 0) {
                    mediaPlayer2.setAudioSessionId(i2);
                } else {
                    this.A00 = mediaPlayer2.getAudioSessionId();
                }
                if (this.A0K) {
                    this.A0C.setVolume(0.0f, 0.0f);
                }
                if (this.A0J) {
                    this.A0C.setLooping(true);
                }
                this.A0C.setOnPreparedListener(this.A0O);
                this.A0C.setOnVideoSizeChangedListener(this.A0P);
                this.A0C.setOnCompletionListener(this.A0M);
                this.A0C.setOnErrorListener(this.A0N);
                this.A0C.setOnBufferingUpdateListener(this.A0L);
                this.A01 = 0;
                this.A0C.setDataSource(getContext(), this.A0D, this.A0F);
                this.A0C.setDisplay(this.A0E);
                this.A0C.setAudioStreamType(3);
                this.A0C.setScreenOnWhilePlaying(true);
                this.A0C.prepareAsync();
                this.A02 = 1;
            } catch (IOException | IllegalArgumentException e2) {
                Log.w(AnonymousClass000.A0f(this.A0D, AnonymousClass000.A0r("videoview/ Unable to open content: ")), e2);
                this.A02 = -1;
                this.A06 = -1;
                this.A0N.onError(this.A0C, 1, 0);
            }
        }
    }

    public void A03(int i2, int i3) {
        StringBuilder A0r = AnonymousClass000.A0r("videoview/setVideoDimensions: ");
        A0r.append(i2);
        Log.i(C13680ns.A0i("x", A0r, i3));
        this.A08 = i2;
        this.A07 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r3 = this;
            android.media.MediaPlayer r0 = r3.A0C
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r1 = r3.A02
            r0 = -1
            if (r1 == r0) goto L_0x000f
            if (r1 == 0) goto L_0x000f
            if (r1 == r2) goto L_0x000f
            return r2
        L_0x000f:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.videoplayback.VideoSurfaceView.A04():boolean");
    }

    public boolean canPause() {
        return this.A0G;
    }

    public boolean canSeekBackward() {
        return this.A0H;
    }

    public boolean canSeekForward() {
        return this.A0I;
    }

    public int getAudioSessionId() {
        if (this.A00 == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.A00 = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.A00;
    }

    public int getBufferPercentage() {
        if (this.A0C != null) {
            return this.A01;
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (!A04()) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.A0C;
        AnonymousClass00B.A06(mediaPlayer);
        return mediaPlayer.getCurrentPosition();
    }

    public int getDuration() {
        if (!A04()) {
            return -1;
        }
        MediaPlayer mediaPlayer = this.A0C;
        AnonymousClass00B.A06(mediaPlayer);
        return mediaPlayer.getDuration();
    }

    public boolean isPlaying() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            AnonymousClass00B.A06(mediaPlayer);
            return mediaPlayer.isPlaying();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoSurfaceView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoSurfaceView.class.getName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r2 > r5) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A08
            int r2 = android.view.SurfaceView.getDefaultSize(r0, r8)
            int r0 = r7.A07
            int r4 = android.view.SurfaceView.getDefaultSize(r0, r9)
            int r0 = r7.A08
            if (r0 <= 0) goto L_0x0035
            int r0 = r7.A07
            if (r0 <= 0) goto L_0x0035
            int r6 = android.view.View.MeasureSpec.getMode(r8)
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 != r0) goto L_0x004b
            if (r2 != r0) goto L_0x004b
            int r3 = r7.A08
            int r2 = r3 * r4
            int r1 = r7.A07
            int r0 = r5 * r1
            if (r2 >= r0) goto L_0x007f
            int r2 = r2 / r1
        L_0x0035:
            java.lang.String r0 = "videoview/setMeasuredDimension: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = "x"
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r4)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.setMeasuredDimension(r2, r4)
            return
        L_0x004b:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r0) goto L_0x005c
            int r1 = r7.A07
            int r1 = r1 * r5
            int r0 = r7.A08
            int r1 = r1 / r0
            if (r2 != r3) goto L_0x005a
            if (r1 <= r4) goto L_0x005a
            goto L_0x0083
        L_0x005a:
            r4 = r1
            goto L_0x0083
        L_0x005c:
            if (r2 != r0) goto L_0x0069
            int r2 = r7.A08
            int r2 = r2 * r4
            int r0 = r7.A07
            int r2 = r2 / r0
            if (r6 != r3) goto L_0x0035
            if (r2 <= r5) goto L_0x0035
            goto L_0x0083
        L_0x0069:
            int r1 = r7.A08
            int r0 = r7.A07
            if (r2 != r3) goto L_0x007c
            if (r0 <= r4) goto L_0x007c
            int r2 = r4 * r1
            int r2 = r2 / r0
        L_0x0074:
            if (r6 != r3) goto L_0x0035
            if (r2 <= r5) goto L_0x0035
            int r0 = r0 * r5
            int r4 = r0 / r1
            goto L_0x0083
        L_0x007c:
            r2 = r1
            r4 = r0
            goto L_0x0074
        L_0x007f:
            if (r2 <= r0) goto L_0x0083
            int r4 = r0 / r3
        L_0x0083:
            r2 = r5
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.videoplayback.VideoSurfaceView.onMeasure(int, int):void");
    }

    public void pause() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            AnonymousClass00B.A06(mediaPlayer);
            if (mediaPlayer.isPlaying()) {
                this.A0C.pause();
                this.A02 = 4;
            }
        }
        this.A06 = 4;
    }

    public void seekTo(int i2) {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            AnonymousClass00B.A06(mediaPlayer);
            mediaPlayer.seekTo(i2);
            i2 = -1;
        }
        this.A03 = i2;
    }

    public void setLooping(boolean z2) {
        this.A0J = z2;
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z2);
        }
    }

    public void setMute(boolean z2) {
        this.A0K = z2;
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            float f2 = 1.0f;
            if (z2) {
                f2 = 0.0f;
            }
            mediaPlayer.setVolume(f2, f2);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A09 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A0A = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A0B = onPreparedListener;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str), (Map) null);
    }

    public void setVideoURI(Uri uri) {
        setVideoURI(uri, (Map) null);
    }

    public void setVideoURI(Uri uri, Map map) {
        this.A0D = uri;
        this.A0F = map;
        this.A03 = -1;
        A02();
        requestLayout();
        invalidate();
    }

    public void start() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            AnonymousClass00B.A06(mediaPlayer);
            mediaPlayer.start();
            this.A02 = 3;
        }
        this.A06 = 3;
    }
}
