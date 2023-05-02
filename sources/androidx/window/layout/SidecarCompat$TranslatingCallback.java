package androidx.window.layout;

import X.AnonymousClass0MG;
import X.AnonymousClass0X3;
import X.C05370Qr;
import X.C07940ck;
import X.C12560kb;
import X.C18450wi;
import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;

public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
    public final /* synthetic */ C07940ck A00;

    public SidecarCompat$TranslatingCallback(C07940ck r1) {
        this.A00 = r1;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface A01;
        C18450wi.A0H(sidecarDeviceState, 0);
        C07940ck r5 = this.A00;
        for (Activity activity : r5.A04.values()) {
            IBinder A002 = AnonymousClass0MG.A00(activity);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (!(A002 == null || (A01 = r5.A01()) == null)) {
                sidecarWindowLayoutInfo = A01.getWindowLayoutInfo(A002);
            }
            C12560kb r1 = r5.A00;
            if (r1 != null) {
                r1.AZo(activity, r5.A01.A04(sidecarDeviceState, sidecarWindowLayoutInfo));
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        SidecarDeviceState sidecarDeviceState;
        C18450wi.A0H(iBinder, 0);
        C18450wi.A0H(sidecarWindowLayoutInfo, 1);
        C07940ck r3 = this.A00;
        Activity activity = (Activity) r3.A04.get(iBinder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        AnonymousClass0X3 r1 = r3.A01;
        SidecarInterface A01 = r3.A01();
        if (A01 == null || (sidecarDeviceState = A01.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        C05370Qr A04 = r1.A04(sidecarDeviceState, sidecarWindowLayoutInfo);
        C12560kb r0 = r3.A00;
        if (r0 != null) {
            r0.AZo(activity, A04);
        }
    }
}
