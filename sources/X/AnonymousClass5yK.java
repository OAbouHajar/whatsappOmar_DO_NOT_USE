package X;

import android.hardware.Camera;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.5yK  reason: invalid class name */
public class AnonymousClass5yK implements Camera.PictureCallback {
    public final /* synthetic */ AnonymousClass675 A00;
    public final /* synthetic */ C118835vK A01;

    public AnonymousClass5yK(AnonymousClass675 r1, C118835vK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        C118835vK r4 = this.A01;
        r4.A01(C119185wg.A0d, bArr);
        AnonymousClass675 r0 = this.A00;
        AnonymousClass5zC r3 = r0.A01;
        AnonymousClass5zC.A01(r0.A00, r3, r0.A02, r4, (C119185wg) null);
        ((CountDownLatch) r3.A0N.A00.get()).countDown();
    }
}
