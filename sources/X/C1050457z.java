package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.57z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1050457z implements Callable {
    public final /* synthetic */ VoipPhysicalCamera A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C1050457z(VoipPhysicalCamera voipPhysicalCamera, boolean z2) {
        this.A00 = voipPhysicalCamera;
        this.A01 = z2;
    }

    public final Object call() {
        return this.A00.lambda$close$5(this.A01);
    }
}
