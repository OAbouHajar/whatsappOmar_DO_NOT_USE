package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.679  reason: invalid class name */
public class AnonymousClass679 implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C119005vl A01;
    public final /* synthetic */ AnonymousClass5zJ A02;

    public AnonymousClass679(CaptureRequest.Builder builder, C119005vl r2, AnonymousClass5zJ r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = builder;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C119005vl r2 = this.A01;
        r2.A0A.A00("Cannot schedule reset focus task, not prepared");
        if (!r2.A03.A00.isConnected() || r2.A0E) {
            return null;
        }
        this.A02.A04 = new C117855tf(this);
        return null;
    }
}
