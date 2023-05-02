package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.obwhatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.3Mh  reason: invalid class name and case insensitive filesystem */
public abstract class C63983Mh extends SurfaceView implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C63983Mh(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public C63983Mh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public C63983Mh(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public static C91894gf A00(VideoSurfaceView videoSurfaceView) {
        videoSurfaceView.A02 = 0;
        videoSurfaceView.A06 = 0;
        videoSurfaceView.A0E = null;
        videoSurfaceView.A0C = null;
        videoSurfaceView.A03 = -1;
        return new C91894gf(videoSurfaceView);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
