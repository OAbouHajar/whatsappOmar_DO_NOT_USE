package X;

import android.hardware.Camera;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.whatsapp.util.Log;

/* renamed from: X.4gG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91644gG implements Camera.PictureCallback {
    public final /* synthetic */ AnonymousClass2VC A00;
    public final /* synthetic */ C49062Qp A01;

    public /* synthetic */ C91644gG(AnonymousClass2VC r1, C49062Qp r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C49062Qp r4 = this.A01;
        AnonymousClass2VC r3 = this.A00;
        StringBuilder A0r = AnonymousClass000.A0r("cameraview/take-picture taken ");
        A0r.append(r4.A0N);
        C13680ns.A1V(A0r);
        try {
            r4.A07.stopPreview();
            r4.A0M = false;
        } catch (Exception e2) {
            Log.w("cameraview/take-picture error stopping camera preview", e2);
        }
        r4.A0R = false;
        r4.A0T.post(new RunnableRunnableShape0S0300000_I0(r4, r3, bArr, 24));
    }
}
