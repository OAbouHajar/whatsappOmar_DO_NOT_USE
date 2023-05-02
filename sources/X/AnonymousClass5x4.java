package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.Map;

/* renamed from: X.5x4  reason: invalid class name */
public class AnonymousClass5x4 {
    public static final Map A00 = AnonymousClass000.A0x();

    public static float A00(CameraCharacteristics.Key key, CameraManager cameraManager, String str) {
        if (str != null) {
            return AnonymousClass000.A04(A01(cameraManager, str).get(key));
        }
        throw new AnonymousClass67O("Camera ID must be provided to check supported modes.");
    }

    public static CameraCharacteristics A01(CameraManager cameraManager, String str) {
        Map map = A00;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) map.get(str);
        if (cameraCharacteristics != null) {
            return cameraCharacteristics;
        }
        try {
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str);
            map.put(str, cameraCharacteristics2);
            return cameraCharacteristics2;
        } catch (CameraAccessException e2) {
            throw new AnonymousClass67O(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Could not get Camera Characteristics for Camera ID: ")), e2);
        }
    }
}
