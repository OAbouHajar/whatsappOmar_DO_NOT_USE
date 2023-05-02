package X;

import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import com.AssemMods.translator.Language;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.camera.overlays.ShutterOverlay;
import com.whatsapp.util.Log;

/* renamed from: X.2VC  reason: invalid class name */
public class AnonymousClass2VC {
    public final /* synthetic */ C29251aI A00;

    public AnonymousClass2VC(C29251aI r1) {
        this.A00 = r1;
    }

    public void A00() {
        C29251aI r3 = this.A00;
        C23161As r1 = r3.A0j;
        if (r1.A0B) {
            r1.A09.AL5(554240366, "on_shutter");
        }
        r3.A0d.A0K(new RunnableRunnableShape5S0100000_I0_4((Object) this, 14));
    }

    public void A01(byte[] bArr, boolean z2) {
        int i2;
        C29251aI r0 = this.A00;
        if (r0.A0A != null) {
            boolean z3 = r0.A0w;
            if (z3) {
                ShutterOverlay shutterOverlay = r0.A0I.A04;
                shutterOverlay.A02 = true;
                shutterOverlay.invalidate();
                shutterOverlay.postDelayed(new RunnableRunnableShape5S0100000_I0_4((Object) shutterOverlay, 20), 50);
            }
            Log.i("cameraui/picturetaken");
            boolean z4 = false;
            byte[] bArr2 = bArr;
            if (bArr == null) {
                z4 = true;
            }
            C23161As r12 = r0.A0j;
            AnonymousClass2Qt r5 = r0.A0C;
            Integer valueOf = Integer.valueOf(r5.getCameraApi());
            int cameraType = r5.getCameraType();
            boolean z5 = !r5.AIs();
            String flashMode = r5.getFlashMode();
            String l2 = Long.toString(r5.getPictureResolution());
            if (!flashMode.equals("on")) {
                i2 = 2;
                if (!flashMode.equals(Language.AUTO_DETECT)) {
                    i2 = 0;
                }
            } else {
                i2 = 1;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - r12.A00;
            C75363s2 r52 = new C75363s2();
            r52.A02 = Integer.valueOf(cameraType);
            r52.A00 = valueOf;
            r52.A01 = Integer.valueOf(z5 ? 1 : 0);
            r52.A03 = Integer.valueOf(i2);
            r52.A05 = l2;
            r52.A04 = Long.valueOf(elapsedRealtime);
            if (r12.A0A) {
                r12.A08.A06(r52);
            }
            if (r12.A0B) {
                r12.A03(valueOf, 554240366, cameraType);
                r12.A00(554240366, z5);
                C19500yX r53 = r12.A09;
                r53.AKi(554240366, "flash_mode", flashMode);
                r53.AKi(554240366, "requested_photo_resolution", l2);
                short s2 = 2;
                if (z4) {
                    s2 = 87;
                }
                r53.AKz(554240366, s2);
            }
            C23151Ar r54 = r0.A0i;
            AnonymousClass2Qt r2 = r0.A0C;
            r54.A02(r0.A0C.getFlashMode(), r2.getZoomLevel(), 1, 0, r2.AIs(), r0.A0Z());
            if (!z3) {
                r0.A0F.A07(true);
            }
            AnonymousClass2V5 r4 = r0.A0F;
            Window window = r0.A03().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            r4.A0B.setVisibility(4);
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
            if (z4) {
                r0.A0d.A09(R.string.str0388, 1);
                r0.A0z.ANy();
                return;
            }
            if (r0.A0A != null) {
                if (C42971z5.A01(r0.A0k, r0.A0r) < 2013) {
                    r0.A03().findViewById(R.id.save_progress).setVisibility(0);
                }
            }
            C16180sb r55 = r0.A0c;
            C17020u3 r6 = r0.A0r;
            AnonymousClass1XK r7 = AnonymousClass1XK.A0B;
            int i3 = 1;
            if (r0.A0p.A0E(C16620tM.A02, 401)) {
                i3 = 4;
            }
            r0.A0M = C17970vw.A0C(r55, r6, r7, ".jpeg", 0, i3);
            r0.A0s.Acn(new AnonymousClass36I(r0.A03(), new C82564Dh(r0), r0.A0M, bArr2, r0.A02(), z2), new Void[0]);
        }
    }
}
