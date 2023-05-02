package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.66y  reason: invalid class name and case insensitive filesystem */
public class C1218166y implements Callable {
    public final /* synthetic */ AnonymousClass5zD A00;

    public C1218166y(AnonymousClass5zD r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass5xW r2 = this.A00.A0Y;
        C118885vP r1 = r2.A0H;
        r1.A01("Can only check if is retrieving preview frames from the Optic thread");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00 && r2.A0R) {
            return null;
        }
        try {
            r2.A0F(true, false);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e2) {
            throw new AnonymousClass67O(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Could not start preview: ")));
        }
    }
}
