package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.camera.mode.CameraModeTabLayout;

/* renamed from: X.3ET  reason: invalid class name */
public final class AnonymousClass3ET implements AnonymousClass2FZ {
    public final /* synthetic */ CameraModeTabLayout A00;

    public AnonymousClass3ET(CameraModeTabLayout cameraModeTabLayout) {
        this.A00 = cameraModeTabLayout;
    }

    public void AYi(C47812Kr r3) {
        CameraModeTabLayout cameraModeTabLayout = this.A00;
        C41631wI.A01(cameraModeTabLayout, cameraModeTabLayout.getSystemServices());
    }

    public void AYj(C47812Kr r10) {
        C18450wi.A0H(r10, 0);
        CameraModeTabLayout cameraModeTabLayout = this.A00;
        C54792iF r1 = cameraModeTabLayout.A00;
        if (r1 != null) {
            Object obj = r10.A06;
            if (obj != null) {
                int A0D = AnonymousClass000.A0D(obj);
                C29251aI r7 = ((C54782iE) r1).A00;
                if (r7.A0w) {
                    r7.A0D.A00 = A0D;
                    r7.A0J.A01(AnonymousClass000.A1R(A0D, 2), false, false);
                    AnonymousClass2V5 r5 = r7.A0F;
                    boolean A1R = AnonymousClass000.A1R(r7.A0D.A00, 2);
                    if (r5.A0L) {
                        r5.A08 = A1R;
                        int i2 = R.drawable.shutter_button_background;
                        if (A1R) {
                            i2 = R.drawable.recording_button_background;
                        }
                        WaImageView waImageView = r5.A0I;
                        Context context = r5.A09;
                        C13700nu.A0L(context, waImageView, i2);
                        float f2 = 1.0f;
                        float f3 = 0.6f;
                        if (A1R) {
                            f3 = 1.0f;
                            f2 = 0.6f;
                        }
                        r5.A03(f3, f2, false);
                        boolean z2 = r5.A08;
                        int i3 = R.string.str1622;
                        if (z2) {
                            i3 = R.string.str1623;
                        }
                        C13680ns.A0t(context, waImageView, i3);
                    }
                    r7.A0C();
                }
            } else {
                throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.Int");
            }
        }
        C41631wI.A01(cameraModeTabLayout, cameraModeTabLayout.getSystemServices());
    }
}
