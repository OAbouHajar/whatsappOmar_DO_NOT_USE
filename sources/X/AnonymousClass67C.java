package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.67C  reason: invalid class name */
public class AnonymousClass67C implements Callable {
    public final /* synthetic */ AnonymousClass5xW A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass67C(AnonymousClass5xW r1, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A01 = z2;
        this.A02 = z3;
    }

    public /* bridge */ /* synthetic */ Object call() {
        try {
            this.A00.A0F(this.A01, this.A02);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e2) {
            throw new AnonymousClass67O(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Could not start preview: ")));
        }
    }
}
