package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.674  reason: invalid class name */
public class AnonymousClass674 implements Callable {
    public final /* synthetic */ AnonymousClass5xW A00;
    public final /* synthetic */ List A01;

    public AnonymousClass674(AnonymousClass5xW r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass5xW r3 = this.A00;
        CameraDevice A002 = r3.A01;
        String str = "CameraDevice should not be null for createCaptureSession!";
        if (A002 != null) {
            str = "mPreviewSetupDelegate should not be null for createCaptureSession!";
            if (r3.A0A != null) {
                List list = this.A01;
                AnonymousClass5zO r0 = r3.A0K;
                AnonymousClass5xD.A01(A002, r0, list);
                return r0;
            }
        }
        throw AnonymousClass000.A0W(String.valueOf(str));
    }
}
