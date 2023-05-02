package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;
import java.util.UUID;

/* renamed from: X.5yH  reason: invalid class name */
public class AnonymousClass5yH implements Camera.ErrorCallback {
    public final /* synthetic */ AnonymousClass5zC A00;

    public AnonymousClass5yH(AnonymousClass5zC r1) {
        this.A00 = r1;
    }

    public void onError(int i2, Camera camera) {
        String str;
        boolean z2 = false;
        if (i2 != 1) {
            if (i2 == 2) {
                str = "Camera evicted. Camera service was likely given to another customer. Camera resources will be released.";
            } else if (i2 != 100) {
                str = C13680ns.A0c(i2, "Unknown error code: ");
            } else {
                str = "Camera server died. Camera resources will be released.";
            }
            z2 = true;
        } else {
            str = "Unknown error";
        }
        AnonymousClass5zC r4 = this.A00;
        List list = r4.A0P.A00;
        UUID uuid = r4.A0S.A03;
        Log.e("Camera1Device", str);
        r4.A0T.A05(new C1216266f(r4, list, uuid, z2), uuid);
    }
}
