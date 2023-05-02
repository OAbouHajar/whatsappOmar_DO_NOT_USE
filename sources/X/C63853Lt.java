package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Locale;

/* renamed from: X.3Lt  reason: invalid class name and case insensitive filesystem */
public class C63853Lt extends Handler {
    public final /* synthetic */ VoipPhysicalCamera A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63853Lt(Looper looper, VoipPhysicalCamera voipPhysicalCamera) {
        super(looper);
        this.A00 = voipPhysicalCamera;
    }

    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            VoipPhysicalCamera voipPhysicalCamera = this.A00;
            AnonymousClass00B.A0B("last camera callback ts should not be 0", AnonymousClass000.A1Q((voipPhysicalCamera.lastCameraCallbackTs > 0 ? 1 : (voipPhysicalCamera.lastCameraCallbackTs == 0 ? 0 : -1))));
            long elapsedRealtime = SystemClock.elapsedRealtime() - voipPhysicalCamera.lastCameraCallbackTs;
            if (elapsedRealtime > 2000) {
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[1];
                C13690nt.A1Q(objArr, 0, elapsedRealtime);
                Log.e(String.format(locale, "%dms since last callback, will try restarting camera.", objArr));
                voipPhysicalCamera.stopOnCameraThread();
                if (voipPhysicalCamera.startOnCameraThread() != 0) {
                    voipPhysicalCamera.stopOnCameraThread();
                }
            }
            voipPhysicalCamera.startPeriodicCameraCallbackCheck();
        } else if (i2 == 2) {
            this.A00.onFrameAvailableOnCameraThread();
        }
    }
}
