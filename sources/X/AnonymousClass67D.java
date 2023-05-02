package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.67D  reason: invalid class name */
public class AnonymousClass67D implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C119005vl A01;
    public final /* synthetic */ AnonymousClass5zJ A02;
    public final /* synthetic */ AnonymousClass5xD A03;

    public AnonymousClass67D(CaptureRequest.Builder builder, C119005vl r2, AnonymousClass5zJ r3, AnonymousClass5xD r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = builder;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Builder builder;
        AnonymousClass5xD r3 = this.A03;
        if (r3 == null || (builder = this.A00) == null) {
            return this.A02;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, C13680ns.A0Y());
        CaptureRequest build = builder.build();
        AnonymousClass5zJ r1 = this.A02;
        r3.A04(build, r1);
        return r1;
    }
}
