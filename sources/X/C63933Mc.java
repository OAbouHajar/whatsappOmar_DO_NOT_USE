package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import com.facebook.redex.IDxCallbackShape188S0100000_2_I1;
import com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel;

/* renamed from: X.3Mc  reason: invalid class name and case insensitive filesystem */
public class C63933Mc extends OrientationEventListener {
    public int A00 = -1;
    public final Handler A01 = new Handler(Looper.getMainLooper(), new IDxCallbackShape188S0100000_2_I1(this, 2));
    public final /* synthetic */ OrientationViewModel A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63933Mc(Context context, OrientationViewModel orientationViewModel) {
        super(context);
        this.A02 = orientationViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r4 >= (r1 + 270)) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r7) {
        /*
            r6 = this;
            r5 = -1
            if (r7 == r5) goto L_0x004a
            int r4 = r7 % 360
            com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel r1 = r6.A02
            int r2 = r1.A05
            int r0 = 360 - r2
            r3 = 1
            if (r4 >= r0) goto L_0x0060
            if (r4 < r2) goto L_0x0060
            int r1 = r1.A04
            int r0 = 90 - r1
            if (r4 < r0) goto L_0x004b
            int r0 = r1 + 90
            if (r4 >= r0) goto L_0x004b
            r2 = 1
        L_0x001b:
            int r0 = r6.A00
            if (r2 == r0) goto L_0x004a
            if (r2 == r5) goto L_0x004a
            java.lang.String r0 = "voip/OrientationViewModel/VideoOrientationListener/onOrientationChanged Degress =  "
            java.lang.String r0 = X.C13680ns.A0c(r4, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "voip/OrientationViewModel/VideoOrientationListener/onOrientationChanged from: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r6.A00
            r1.append(r0)
            java.lang.String r0 = " to: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A00 = r2
            android.os.Handler r2 = r6.A01
            r2.removeMessages(r3)
            r0 = 800(0x320, double:3.953E-321)
            r2.sendEmptyMessageDelayed(r3, r0)
        L_0x004a:
            return
        L_0x004b:
            int r0 = 180 - r2
            if (r4 < r0) goto L_0x0055
            int r0 = r2 + 180
            if (r4 >= r0) goto L_0x0055
            r2 = 2
            goto L_0x001b
        L_0x0055:
            int r0 = 270 - r1
            if (r4 < r0) goto L_0x005e
            int r0 = r1 + 270
            r2 = 3
            if (r4 < r0) goto L_0x001b
        L_0x005e:
            r2 = -1
            goto L_0x001b
        L_0x0060:
            r2 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63933Mc.onOrientationChanged(int):void");
    }
}
