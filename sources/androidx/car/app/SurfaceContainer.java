package androidx.car.app;

import X.AnonymousClass000;
import android.view.Surface;

public final class SurfaceContainer {
    public final int mDpi = 0;
    public final int mHeight = 0;
    public final Surface mSurface = null;
    public final int mWidth = 0;

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        AnonymousClass000.A1H(this.mSurface, A0r);
        A0r.append(this.mWidth);
        A0r.append("x");
        A0r.append(this.mHeight);
        A0r.append(", dpi: ");
        A0r.append(this.mDpi);
        return AnonymousClass000.A0h("]", A0r);
    }
}
