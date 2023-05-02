package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* renamed from: X.4jy  reason: invalid class name and case insensitive filesystem */
public class C93914jy implements SurfaceHolder {
    public final Surface A00;
    public final /* synthetic */ AnonymousClass5Ks A01;

    public C93914jy(Surface surface, AnonymousClass5Ks r2) {
        this.A01 = r2;
        this.A00 = surface;
    }

    public void addCallback(SurfaceHolder.Callback callback) {
    }

    public Surface getSurface() {
        return this.A00;
    }

    public Rect getSurfaceFrame() {
        return null;
    }

    public boolean isCreating() {
        return false;
    }

    public Canvas lockCanvas() {
        return null;
    }

    public Canvas lockCanvas(Rect rect) {
        return null;
    }

    public void removeCallback(SurfaceHolder.Callback callback) {
    }

    public void setFixedSize(int i2, int i3) {
    }

    public void setFormat(int i2) {
    }

    public void setKeepScreenOn(boolean z2) {
    }

    public void setSizeFromLayout() {
    }

    @Deprecated
    public void setType(int i2) {
    }

    public void unlockCanvasAndPost(Canvas canvas) {
    }
}
