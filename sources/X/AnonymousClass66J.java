package X;

import android.hardware.Camera;
import android.media.MediaRecorder;
import com.whatsapp.util.Log;

/* renamed from: X.66J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66J implements Runnable {
    public final /* synthetic */ AnonymousClass4HD A00;
    public final /* synthetic */ C119915zp A01;
    public final /* synthetic */ C117875th A02;

    public /* synthetic */ AnonymousClass66J(AnonymousClass4HD r1, C119915zp r2, C117875th r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        C119915zp r4 = this.A01;
        AnonymousClass4HD r3 = this.A00;
        C117875th r2 = this.A02;
        r4.A0C = true;
        try {
            MediaRecorder mediaRecorder = r4.A04;
            AnonymousClass00B.A06(mediaRecorder);
            mediaRecorder.stop();
        } catch (RuntimeException e2) {
            Log.w("WaBloksCameraViewBinder/stop-video-capture ", e2);
        }
        C119925zq.A02(r4);
        Camera camera = r4.A03;
        if (camera != null) {
            camera.lock();
        }
        r4.A0B = false;
        C119925zq.A01(r3, r4, r2);
    }
}
