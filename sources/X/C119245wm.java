package X;

import android.hardware.Camera;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5wm  reason: invalid class name and case insensitive filesystem */
public class C119245wm {
    public static int A02 = -1;
    public static volatile Camera.CameraInfo[] A03;
    public final C118945vf A00;
    public final C119355wx A01;

    public C119245wm(C118945vf r1, C119355wx r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A00() {
        if (A03 == null) {
            int i2 = A02;
            if (i2 == -1) {
                i2 = Camera.getNumberOfCameras();
                A02 = i2;
            }
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[i2];
            for (int i3 = 0; i3 < A02; i3++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i3, cameraInfo);
                cameraInfoArr[i3] = cameraInfo;
            }
            A03 = cameraInfoArr;
        }
    }

    public int A01(int i2) {
        int A022 = A02(i2);
        if (A022 != -1) {
            Camera.CameraInfo cameraInfo = A03[A022];
            if (cameraInfo != null) {
                return cameraInfo.orientation;
            }
            return 0;
        }
        throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Could not load CameraInfo for CameraFacing: "));
    }

    public final int A02(int i2) {
        if (A03 == null) {
            A04();
        }
        if (A03 != null) {
            int i3 = 1;
            if (i2 != 1) {
                i3 = 0;
            }
            for (int i4 = 0; i4 < A02; i4++) {
                if (A03[i4].facing == i3) {
                    return i4;
                }
            }
            AnonymousClass5xH.A01("CameraInventory", C13680ns.A0c(i3, "Could not get CameraInfo for CameraFacing id: "));
        }
        return -1;
    }

    public int A03(int i2, int i3) {
        if (A03 == null) {
            if (!AnonymousClass5xT.A02()) {
                AnonymousClass5xH.A01("CameraInventory", "Loading camera info on the UI thread");
            }
            A04();
        }
        if (i3 != -1) {
            int A022 = A02(i2);
            if (A022 >= A03.length) {
                AnonymousClass5xH.A01("CameraInventory", C13680ns.A0c(A022, "No CameraInfo found for camera id: "));
            } else {
                Camera.CameraInfo cameraInfo = A03[A022];
                int i4 = ((i3 + 45) / 90) * 90;
                int i5 = cameraInfo.facing;
                int i6 = cameraInfo.orientation;
                return (i5 == 1 ? (i6 - i4) + 360 : i6 + i4) % 360;
            }
        }
        return 0;
    }

    public final void A04() {
        if (A03 == null) {
            C119355wx r2 = this.A01;
            if (r2.A09()) {
                A00();
                return;
            }
            try {
                r2.A01(new C111115fM(), new IDxCallableShape150S0100000_3_I1(this, 6)).get();
            } catch (InterruptedException | ExecutionException e2) {
                AnonymousClass5xH.A01("CameraInventory", AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("failed to load camera infos: ")));
            }
        }
    }
}
