package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;

/* renamed from: X.4Wn  reason: invalid class name and case insensitive filesystem */
public abstract class C87374Wn {
    public float A00;
    public AnonymousClass2Qx A01;

    public Object A00() {
        return this instanceof C73033nA ? ((C73033nA) this).A01.getSurfaceTexture() : ((C73023n9) this).A01.getHolder().getSurface();
    }

    public void A01() {
        AnonymousClass2Qx r0;
        if (this instanceof C73033nA) {
            C73033nA r02 = (C73033nA) this;
            TextureView textureView = r02.A01;
            TextureView.SurfaceTextureListener surfaceTextureListener = r02.A00;
            textureView.setSurfaceTextureListener(surfaceTextureListener);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture != null && r02.A01 != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, textureView.getWidth(), textureView.getHeight());
                return;
            }
            return;
        }
        C73023n9 r2 = (C73023n9) this;
        SurfaceView surfaceView = r2.A01;
        surfaceView.getHolder().addCallback(r2.A00);
        Surface surface = surfaceView.getHolder().getSurface();
        if (surface != null && surface.isValid() && (r0 = r2.A01) != null) {
            AnonymousClass00B.A06(surface);
            r0.A06(surface);
            r2.A01.setCornerRadius(r2.A00);
            r2.A01.A08(surface, surfaceView.getWidth(), surfaceView.getHeight());
        }
    }

    public void A02() {
        if (this instanceof C73033nA) {
            AnonymousClass2Qx r1 = this.A01;
            if (r1 != null) {
                r1.setCornerRadius(this.A00);
                return;
            }
            return;
        }
        C73023n9 r2 = (C73023n9) this;
        AnonymousClass2Qx r12 = r2.A01;
        if (r12 != null) {
            r12.setCornerRadius(r2.A00);
            C55352jN.A01(r2.A01, r2.A00);
        }
    }

    public void A03() {
        if (this instanceof C73033nA) {
            ((C73033nA) this).A01.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            return;
        }
        C73023n9 r2 = (C73023n9) this;
        r2.A01.getHolder().removeCallback(r2.A00);
    }
}
