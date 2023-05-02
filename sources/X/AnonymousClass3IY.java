package X;

import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.Surface;
import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.3IY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IY implements Callable {
    public final /* synthetic */ AnonymousClass2Qx A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass3IY(AnonymousClass2Qx r1, Object obj, boolean z2) {
        this.A00 = r1;
        this.A02 = z2;
        this.A01 = obj;
    }

    public final Object call() {
        boolean z2;
        AnonymousClass2Qx r3 = this.A00;
        boolean z3 = this.A02;
        Object obj = this.A01;
        if (z3) {
            r3.A05();
        }
        int i2 = 0;
        if (!r3.A09()) {
            HandlerThread handlerThread = r3.A07;
            AnonymousClass00B.A03(handlerThread);
            try {
                r3.A05();
                if (obj instanceof Surface) {
                    r3.A03.A0A((Surface) obj);
                } else if (obj instanceof SurfaceTexture) {
                    r3.A03.A09((SurfaceTexture) obj);
                }
                r3.A03.A06();
                if (r3.A04) {
                    AnonymousClass00B.A03(handlerThread);
                    AnonymousClass4V1 r0 = r3.A01;
                    if (r0 != null) {
                        r0.A01.updateTexImage();
                        AnonymousClass00B.A03(handlerThread);
                        r3.A04 = false;
                    }
                }
                if (r3.A0E.getAndSet(true) || r3.A0C.init(29, 0)) {
                    z2 = true;
                } else {
                    Log.e(AnonymousClass000.A0f(r3.A0B, AnonymousClass000.A0r("voip/CoreVideoPort/VideoRenderer.init() failed for ")));
                    r3.A04();
                    z2 = false;
                }
            } catch (RuntimeException e2) {
                Log.e((Throwable) e2);
                r3.A04();
                z2 = false;
            }
            if (!z2) {
                i2 = -6;
            }
        }
        return Integer.valueOf(i2);
    }
}
