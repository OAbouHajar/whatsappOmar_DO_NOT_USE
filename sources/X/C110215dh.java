package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.UUID;

/* renamed from: X.5dh  reason: invalid class name and case insensitive filesystem */
public class C110215dh extends CameraDevice.StateCallback implements C1221668n {
    public CameraDevice A00;
    public C117835td A01;
    public C115775qI A02;
    public AnonymousClass67O A03;
    public Boolean A04;
    public final AnonymousClass5vT A05;

    public C110215dh(C117835td r4, C115775qI r5) {
        this.A01 = r4;
        this.A02 = r5;
        AnonymousClass5vT r2 = new AnonymousClass5vT();
        this.A05 = r2;
        r2.A02(0);
    }

    /* renamed from: A00 */
    public CameraDevice AFb() {
        Boolean bool = this.A04;
        if (bool == null) {
            throw AnonymousClass000.A0V("Open Camera operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            return this.A00;
        } else {
            throw this.A03;
        }
    }

    public void A5c() {
        this.A05.A00();
    }

    public void onClosed(CameraDevice cameraDevice) {
        super.onClosed(cameraDevice);
        this.A00 = null;
        C117835td r0 = this.A01;
        if (r0 != null) {
            r0.A00(cameraDevice);
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        if (this.A00 == null) {
            this.A04 = Boolean.FALSE;
            this.A03 = new AnonymousClass67O("Could not open camera. Operation disconnected.");
            this.A05.A01();
            return;
        }
        C115775qI r0 = this.A02;
        if (r0 != null) {
            AnonymousClass5zD r4 = r0.A00;
            List list = r4.A0a.A00;
            UUID uuid = r4.A0c.A03;
            r4.A0d.A05(new AnonymousClass66D(r4, list, uuid), uuid);
        }
    }

    public void onError(CameraDevice cameraDevice, int i2) {
        if (this.A00 == null) {
            this.A04 = Boolean.FALSE;
            this.A03 = new AnonymousClass67O(C13680ns.A0c(i2, "Could not open camera. Operation error: "));
            this.A05.A01();
            return;
        }
        C115775qI r0 = this.A02;
        if (r0 != null) {
            AnonymousClass5zD r4 = r0.A00;
            List list = r4.A0a.A00;
            UUID uuid = r4.A0c.A03;
            r4.A0d.A05(new AnonymousClass66D(r4, list, uuid), uuid);
        }
    }

    public void onOpened(CameraDevice cameraDevice) {
        this.A04 = Boolean.TRUE;
        this.A00 = cameraDevice;
        this.A05.A01();
    }
}
