package X;

import android.hardware.Camera;
import android.text.TextUtils;
import com.obwhatsapp.bloks.BloksCameraOverlay;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.5yL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5yL implements Camera.PictureCallback {
    public final /* synthetic */ C12380kI A00;
    public final /* synthetic */ C119915zp A01;
    public final /* synthetic */ C119925zq A02;

    public /* synthetic */ AnonymousClass5yL(C12380kI r1, C119915zp r2, C119925zq r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C119925zq r5 = this.A02;
        C119915zp r4 = this.A01;
        C12380kI r6 = this.A00;
        byte[] bArr2 = bArr;
        if (bArr == null) {
            r5.A01.A0K(new AnonymousClass63X(r5));
            return;
        }
        C117875th r8 = r5.A02;
        String str = r4.A07;
        if (TextUtils.isEmpty(str)) {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            StringBuilder A0r = AnonymousClass000.A0r("IMG_");
            A0r.append(format);
            str = AnonymousClass000.A0h(".png", A0r);
        }
        File A002 = r8.A00(str);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(r4.A00, cameraInfo);
        C16320sq r1 = r5.A03;
        boolean A1R = AnonymousClass000.A1R(cameraInfo.facing, 1);
        String str2 = r4.A07;
        int i2 = r4.A01;
        int i3 = r4.A02;
        BloksCameraOverlay bloksCameraOverlay = r4.A05;
        AnonymousClass00B.A04(bloksCameraOverlay);
        r1.Acn(new C114545nw(r6, bloksCameraOverlay, r8, A002, str2, bArr2, i2, i3, A1R), new Void[0]);
    }
}
