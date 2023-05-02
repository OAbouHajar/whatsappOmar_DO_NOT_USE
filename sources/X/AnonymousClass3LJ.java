package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Arrays;

/* renamed from: X.3LJ  reason: invalid class name */
public class AnonymousClass3LJ extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ Surface A01;
    public final /* synthetic */ AnonymousClass2P8 A02;

    public AnonymousClass3LJ(CaptureRequest.Builder builder, Surface surface, AnonymousClass2P8 r3) {
        this.A02 = r3;
        this.A01 = surface;
        this.A00 = builder;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Surface surface = this.A01;
        if (!(surface == null || surface == this.A02.A04)) {
            surface.release();
        }
        AnonymousClass2P8 r1 = this.A02;
        r1.A08 = false;
        Log.i("voip/video/VoipCamera/ cameraDevice configure failed");
        r1.cameraEventsDispatcher.A02();
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass2P8 r2 = this.A02;
        r2.A08 = false;
        Surface surface = this.A01;
        if (!(surface == null || surface == r2.A04)) {
            surface.release();
        }
        if (r2.A02 == null) {
            Log.i("voip/video/VoipCamera/ cameraDevice configured, but device is null");
            r2.cameraEventsDispatcher.A02();
            return;
        }
        Log.i("voip/video/VoipCamera/ cameraDevice configured");
        CaptureRequest.Builder builder = this.A00;
        builder.set(CaptureRequest.CONTROL_MODE, C13680ns.A0Y());
        builder.set(CaptureRequest.CONTROL_AF_MODE, C13680ns.A0a());
        builder.set(CaptureRequest.FLASH_MODE, 0);
        Range[] rangeArr = (Range[]) r2.A0A.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            int i2 = Integer.MIN_VALUE;
            Range range = null;
            for (Range range2 : rangeArr) {
                int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(AnonymousClass000.A0D(range2.getLower()) * 1000, AnonymousClass000.A0D(range2.getUpper()) * 1000, r2.A0G.fps1000);
                StringBuilder A0r = AnonymousClass000.A0r("voip/video/VoipCamera/startOnCameraThread check fps [");
                A0r.append(range2.getLower());
                A0r.append(", ");
                A0r.append(range2.getUpper());
                Log.i(C13680ns.A0i("], score: ", A0r, fpsRangeScore));
                if (fpsRangeScore > i2) {
                    range = range2;
                    i2 = fpsRangeScore;
                }
            }
            if (range != null) {
                StringBuilder A0r2 = AnonymousClass000.A0r("voip/video/VoipCamera/startOnCameraThread with fps range [");
                A0r2.append(range.getLower());
                A0r2.append(", ");
                A0r2.append(range.getUpper());
                A0r2.append("], score: ");
                A0r2.append(i2);
                A0r2.append(", supported ranges : ");
                Log.i(AnonymousClass000.A0h(Arrays.toString(rangeArr), A0r2));
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            }
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), (CameraCaptureSession.CaptureCallback) null, r2.cameraThreadHandler);
            r2.startPeriodicCameraCallbackCheck();
        } catch (CameraAccessException unused) {
            Log.i("voip/video/VoipCamera/ failed to start preview");
            r2.cameraEventsDispatcher.A02();
        }
    }
}
