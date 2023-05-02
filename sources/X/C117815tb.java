package X;

import com.obwhatsapp.camera.litecamera.LiteCameraView;

/* renamed from: X.5tb  reason: invalid class name and case insensitive filesystem */
public class C117815tb {
    public final /* synthetic */ C119575yh A00;

    public C117815tb(C119575yh r1) {
        this.A00 = r1;
    }

    public void A00() {
        C115995qe r0 = this.A00.A0A;
        if (r0 != null) {
            LiteCameraView liteCameraView = r0.A00;
            liteCameraView.A01.A01("LiteCamera");
            if (!liteCameraView.A09 || liteCameraView.AIs()) {
                liteCameraView.A0E.A00();
                return;
            }
            C119575yh r2 = liteCameraView.A0D;
            AnonymousClass5wU r1 = liteCameraView.A0E;
            r2.A0A(r1.A01);
            if (!r1.A08) {
                r1.A03.A01();
                r1.A08 = true;
            }
        }
    }
}
