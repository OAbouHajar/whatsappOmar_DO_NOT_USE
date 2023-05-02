package X;

import android.hardware.Camera;
import com.facebook.redex.RunnableRunnableShape1S0101000_I1;
import com.whatsapp.util.Log;

/* renamed from: X.4gF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91634gF implements Camera.ErrorCallback {
    public final /* synthetic */ C56542np A00;

    public /* synthetic */ C91634gF(C56542np r1) {
        this.A00 = r1;
    }

    public final void onError(int i2, Camera camera) {
        C56542np r4 = this.A00;
        Log.w(C13680ns.A0c(i2, "qrview/startcamera camera error:"));
        if (i2 == 100) {
            AnonymousClass3K4.A0m(r4.A04, r4, 23);
            AnonymousClass3K4.A0m(r4.A04, r4, 19);
        } else if (i2 == 2) {
            r4.A03 = null;
            if (r4.A08 != null) {
                r4.A0H.post(new RunnableRunnableShape1S0101000_I1((Object) r4, 2, 12));
            }
        }
    }
}
