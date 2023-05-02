package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.67B  reason: invalid class name */
public class AnonymousClass67B implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C119305ws A01;
    public final /* synthetic */ AnonymousClass5zJ A02;

    public AnonymousClass67B(CaptureRequest.Builder builder, C119305ws r2, AnonymousClass5zJ r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = builder;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass5xD r4;
        C119305ws r1 = this.A01;
        AnonymousClass5xW r0 = r1.A02;
        if (r0 == null || !r0.A0Q || (r4 = r1.A02.A09) == null) {
            return this.A02;
        }
        CaptureRequest.Builder builder = this.A00;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        Integer A0X = C13680ns.A0X();
        builder.set(key, A0X);
        CaptureRequest build = builder.build();
        AnonymousClass5zJ r5 = this.A02;
        r4.A04(build, r5);
        builder.set(key, C13680ns.A0Y());
        r4.A04(builder.build(), r5);
        builder.set(key, A0X);
        r4.A05(builder.build(), r5);
        return r5;
    }
}
