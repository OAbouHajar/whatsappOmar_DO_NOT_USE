package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.5yM  reason: invalid class name */
public class AnonymousClass5yM implements Camera.PictureCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Rect A02;
    public final /* synthetic */ AnonymousClass675 A03;
    public final /* synthetic */ C118835vK A04;

    public AnonymousClass5yM(Rect rect, AnonymousClass675 r2, C118835vK r3, int i2, int i3) {
        this.A03 = r2;
        this.A00 = i2;
        this.A02 = rect;
        this.A01 = i3;
        this.A04 = r3;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        byte[] bArr2 = bArr;
        if (C119015vm.A00()) {
            bArr2 = C119015vm.A01();
        } else if (this.A03.A01.A0W.get()) {
            Log.d("Camera1Device", "Photo capture took too long, not invoking photo capture callback");
            return;
        }
        Rect rect = null;
        if (bArr2 != null) {
            int A002 = C119025vn.A00(bArr2);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
            rect = new Rect(0, 0, options.outWidth, options.outHeight);
            C115115pA.A00(rect, this.A02, this.A00, A002);
        }
        Rect rect2 = this.A02;
        int i2 = this.A00;
        AnonymousClass675 r5 = this.A03;
        AnonymousClass5zC r9 = r5.A01;
        C118835vK r4 = new C118835vK(rect, rect2, i2, r9.A00);
        C115885qT r1 = C119185wg.A0f;
        AnonymousClass5wQ r12 = r5.A02;
        r4.A01(r1, r12.A00(AnonymousClass5wQ.A05));
        r4.A01(C119185wg.A0Z, bArr2);
        AnonymousClass5yJ r2 = r9.A0O;
        if (r2 != null) {
            r4.A01(C119185wg.A0g, Integer.valueOf(r2.A0B ? r2.A09 : 0));
        }
        r4.A01(C119185wg.A0e, Integer.valueOf(this.A01));
        C119185wg r8 = new C119185wg(r4);
        C118645v1 r11 = r5.A00;
        r9.A0T.A05(new AnonymousClass66B(r11, r9, r8), r9.A0S.A03);
        if (bArr2 != null) {
            C119205wi r7 = new C119205wi(new ByteArrayInputStream(bArr2));
            C118835vK r6 = this.A04;
            C115885qT r13 = C119185wg.A0U;
            Long l2 = null;
            double A012 = r7.A01("ExposureTime");
            if (A012 != -1.0d) {
                l2 = Long.valueOf((long) (A012 * Math.pow(10.0d, 9.0d)));
            }
            r6.A01(r13, l2);
            C115885qT r22 = C119185wg.A0b;
            Integer num = null;
            int A022 = r7.A02("PhotographicSensitivity");
            r6.A01(r22, A022 == -1 ? null : Integer.valueOf(A022));
            C115885qT r42 = C119185wg.A0P;
            double A013 = r7.A01("ApertureValue");
            r6.A01(r42, A013 == -1.0d ? null : Float.valueOf((float) A013));
            C115885qT r43 = C119185wg.A0W;
            double A014 = r7.A01("FocalLength");
            r6.A01(r43, A014 == -1.0d ? null : Float.valueOf((float) A014));
            C115885qT r23 = C119185wg.A0Q;
            int A023 = r7.A02("WhiteBalance");
            if (A023 != -1) {
                num = Integer.valueOf(A023);
            }
            r6.A01(r23, num);
        }
        AnonymousClass5zC.A01(r11, r9, r12, this.A04, r8);
        ((CountDownLatch) r9.A0N.A00.get()).countDown();
        if (rect != null) {
            rect.width();
            rect.height();
        } else {
            new IllegalStateException("JPEG byte array was null.");
        }
        AnonymousClass5xH.A00();
    }
}
