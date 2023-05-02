package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.obwhatsapp.R;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.util.Log;

/* renamed from: X.2oj  reason: invalid class name and case insensitive filesystem */
public final class C56852oj extends FrameLayout implements AnonymousClass006 {
    public int A00;
    public AnonymousClass2PR A01;
    public ExoPlaybackControlView A02;
    public AnonymousClass4WY A03;
    public AnonymousClass530 A04;
    public C52662eE A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final View A09;
    public final View A0A;
    public final AspectRatioFrameLayout A0B;
    public final SubtitleView A0C;
    public final AnonymousClass3E0 A0D;
    public final boolean A0E;

    public C56852oj(Context context, boolean z2) {
        super(context);
        if (!this.A08) {
            this.A08 = true;
            generatedComponent();
        }
        this.A00 = -1;
        this.A07 = false;
        LayoutInflater.from(context).inflate(R.layout.layout0608, this);
        this.A0D = new AnonymousClass3E0(this);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.video_frame);
        this.A0B = aspectRatioFrameLayout;
        this.A09 = findViewById(R.id.shutter);
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.subtitles);
        this.A0C = subtitleView;
        subtitleView.A00();
        subtitleView.A01();
        this.A0E = z2;
        View surfaceView = z2 ? new SurfaceView(context) : new C63993Mi(context);
        this.A0A = surfaceView;
        surfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aspectRatioFrameLayout.addView(surfaceView, 0);
        this.A04 = new AnonymousClass530(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ExoPlaybackControlView exoPlaybackControlView = this.A02;
        return exoPlaybackControlView != null ? exoPlaybackControlView.dispatchKeyEvent(keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A05;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public Bitmap getCurrentFrame() {
        try {
            View view = this.A0A;
            int width = view.getWidth() / 4;
            int height = view.getHeight() / 4;
            if (!this.A0E) {
                return ((TextureView) view).getBitmap(width, height);
            }
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(true);
            }
            view.buildDrawingCache(true);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(view.getDrawingCache(), width, height, true);
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(false);
            }
            view.destroyDrawingCache();
            return createScaledBitmap;
        } catch (OutOfMemoryError e2) {
            Log.e("ExoPlayerView/getCurrentFrame/", e2);
            return null;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        ExoPlaybackControlView exoPlaybackControlView = this.A02;
        if (exoPlaybackControlView == null) {
            return false;
        }
        exoPlaybackControlView.A01();
        return true;
    }

    public void setController(ExoPlaybackControlView exoPlaybackControlView) {
        this.A02 = exoPlaybackControlView;
        if (exoPlaybackControlView != null) {
            exoPlaybackControlView.A05 = this.A04;
            AnonymousClass2PR r0 = this.A01;
            if (r0 != null) {
                exoPlaybackControlView.setPlayer(r0);
            }
        }
    }

    public void setExoPlayerErrorActionsController(AnonymousClass4WY r1) {
        this.A03 = r1;
    }

    public void setLayoutResizingEnabled(boolean z2) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.A0B;
        int i2 = 3;
        if (z2) {
            i2 = 0;
        }
        aspectRatioFrameLayout.setResizeMode(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPlayer(X.AnonymousClass2PR r7) {
        /*
            r6 = this;
            X.2PR r0 = r6.A01
            if (r0 == 0) goto L_0x0027
            X.3E0 r1 = r6.A0D
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A0W
            r0.remove(r1)
            X.2PR r0 = r6.A01
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A0X
            r0.remove(r1)
            X.2PR r0 = r6.A01
            r0.Aby(r1)
            X.2PR r2 = r6.A01
            r1 = 0
            r2.A03()
            r2.A02()
            r0 = 0
            r2.A07(r1, r0)
            r2.A05(r0, r0)
        L_0x0027:
            r6.A01 = r7
            r2 = 0
            if (r7 == 0) goto L_0x00de
            boolean r0 = r6.A0E
            android.view.View r5 = r6.A0A
            if (r0 == 0) goto L_0x0092
            android.view.SurfaceView r5 = (android.view.SurfaceView) r5
            r7.A03()
            if (r5 != 0) goto L_0x008d
            r4 = 0
        L_0x003a:
            r7.A03()
            r7.A02()
            r3 = 0
            if (r4 == 0) goto L_0x0049
            r1 = 2
            r0 = 8
            r7.A09(r3, r1, r0)
        L_0x0049:
            r7.A06 = r4
            if (r4 == 0) goto L_0x0089
            X.3Dz r0 = r7.A0O
            r4.addCallback(r0)
            android.view.Surface r1 = r4.getSurface()
            if (r1 == 0) goto L_0x0089
            boolean r0 = r1.isValid()
            if (r0 == 0) goto L_0x0089
            r7.A07(r1, r2)
            android.graphics.Rect r0 = r4.getSurfaceFrame()
            int r1 = r0.width()
            int r0 = r0.height()
        L_0x006d:
            r7.A05(r1, r0)
        L_0x0070:
            X.3E0 r1 = r6.A0D
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0X
            r0.add(r1)
            r7.A4a(r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0W
            r0.add(r1)
            com.obwhatsapp.videoplayback.ExoPlaybackControlView r0 = r6.A02
            if (r0 == 0) goto L_0x0086
            r0.setPlayer(r7)
        L_0x0086:
            r6.A07 = r2
            return
        L_0x0089:
            r7.A07(r3, r2)
            goto L_0x00da
        L_0x008d:
            android.view.SurfaceHolder r4 = r5.getHolder()
            goto L_0x003a
        L_0x0092:
            android.view.TextureView r5 = (android.view.TextureView) r5
            r7.A03()
            r7.A02()
            r4 = 0
            if (r5 == 0) goto L_0x00a3
            r1 = 2
            r0 = 8
            r7.A09(r4, r1, r0)
        L_0x00a3:
            r7.A07 = r5
            r3 = 1
            if (r5 == 0) goto L_0x00d7
            android.view.TextureView$SurfaceTextureListener r0 = r5.getSurfaceTextureListener()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = "SimpleExoPlayer"
            java.lang.String r0 = "Replacing existing SurfaceTextureListener."
            android.util.Log.w(r1, r0)
        L_0x00b5:
            X.3Dz r0 = r7.A0O
            r5.setSurfaceTextureListener(r0)
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto L_0x00d7
            android.graphics.SurfaceTexture r1 = r5.getSurfaceTexture()
            if (r1 == 0) goto L_0x00d7
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r1)
            r7.A07(r0, r3)
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            goto L_0x006d
        L_0x00d7:
            r7.A07(r4, r3)
        L_0x00da:
            r7.A05(r2, r2)
            goto L_0x0070
        L_0x00de:
            android.view.View r0 = r6.A09
            r0.setVisibility(r2)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56852oj.setPlayer(X.2PR):void");
    }
}
