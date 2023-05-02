package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.67A  reason: invalid class name */
public class AnonymousClass67A implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C119305ws A01;
    public final /* synthetic */ AnonymousClass5zI A02;

    public AnonymousClass67A(CaptureRequest.Builder builder, C119305ws r2, AnonymousClass5zI r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = builder;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass5xW r0 = this.A01.A02;
        if (r0 != null) {
            AnonymousClass5xD r2 = r0.A09;
            if (r2 != null) {
                CaptureRequest build = this.A00.build();
                AnonymousClass5zI r02 = this.A02;
                r2.A04(build, r02);
                return r02;
            }
            throw new AnonymousClass67O("Session closed while capturing photo.");
        }
        throw new AnonymousClass67O("Preview closed while capturing photo.");
    }
}
