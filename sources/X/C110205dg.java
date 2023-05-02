package X;

import android.hardware.camera2.CameraCaptureSession;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;

/* renamed from: X.5dg  reason: invalid class name and case insensitive filesystem */
public class C110205dg extends CameraCaptureSession.StateCallback {
    public AnonymousClass5xD A00;
    public final /* synthetic */ AnonymousClass5zO A01;

    public C110205dg(AnonymousClass5zO r1) {
        this.A01 = r1;
    }

    public static void A00(AnonymousClass5zO r1, AnonymousClass5xD r2, int i2, int i3) {
        if (i2 == i3) {
            r1.A03 = 0;
            r1.A05 = Boolean.TRUE;
            r1.A04 = r2;
            r1.A02.A01();
        }
    }

    public final AnonymousClass5xD A01(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass5xD r1 = this.A00;
        if (r1 != null && r1.A00 == cameraCaptureSession) {
            return r1;
        }
        AnonymousClass5xD r12 = new AnonymousClass5xD(cameraCaptureSession);
        this.A00 = r12;
        return r12;
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        AnonymousClass5zO r0 = this.A01;
        A01(cameraCaptureSession);
        C115805qL r1 = r0.A00;
        if (r1 != null) {
            r1.A00.A0N.A00(new C111115fM(), "camera_session_active", new IDxCallableShape150S0100000_3_I1(r1, 15));
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        AnonymousClass5zO r3 = this.A01;
        A00(r3, A01(cameraCaptureSession), r3.A03, 2);
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass5zO r2 = this.A01;
        A01(cameraCaptureSession);
        if (r2.A03 == 1) {
            r2.A03 = 0;
            r2.A05 = Boolean.FALSE;
            r2.A02.A01();
        }
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass5zO r3 = this.A01;
        A00(r3, A01(cameraCaptureSession), r3.A03, 1);
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        super.onReady(cameraCaptureSession);
        AnonymousClass5zO r3 = this.A01;
        A00(r3, A01(cameraCaptureSession), r3.A03, 3);
    }
}
