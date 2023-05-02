package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.57q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1049757q implements Callable {
    public final Object call() {
        try {
            AnonymousClass4V1 r1 = new AnonymousClass4V1();
            if (r1.A00 != 0) {
                return r1;
            }
            Log.e("voip/video/SurfaceTextureHolder/createSurfaceTexture, failed to generate gl texture");
            r1.A00();
            return null;
        } catch (RuntimeException e2) {
            Log.e((Throwable) e2);
            return null;
        }
    }
}
