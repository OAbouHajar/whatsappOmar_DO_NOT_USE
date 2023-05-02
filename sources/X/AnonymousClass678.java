package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.678  reason: invalid class name */
public class AnonymousClass678 implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C119005vl A01;
    public final /* synthetic */ AnonymousClass5zJ A02;

    public AnonymousClass678(CaptureRequest.Builder builder, C119005vl r2, AnonymousClass5zJ r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = builder;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C119005vl r3 = this.A01;
        r3.A0A.A00("Cannot schedule reset focus task, not prepared");
        if (r3.A03.A00.isConnected() && !r3.A0E && r3.A0D) {
            r3.A0C = false;
            r3.A02();
            r3.A09(C114875ok.CANCELLED, (float[]) null);
            AnonymousClass5zJ r1 = this.A02;
            r1.A06 = null;
            r1.A04 = null;
            try {
                r3.A05(this.A00, r1);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
