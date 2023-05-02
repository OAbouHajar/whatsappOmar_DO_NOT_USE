package X;

import android.content.DialogInterface;
import android.net.wifi.WifiManager;
import com.obwhatsapp.messaging.CaptivePortalActivity;

/* renamed from: X.4fm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91354fm implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WifiManager A01;
    public final /* synthetic */ CaptivePortalActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C91354fm(WifiManager wifiManager, CaptivePortalActivity captivePortalActivity, String str, int i2) {
        this.A02 = captivePortalActivity;
        this.A01 = wifiManager;
        this.A00 = i2;
        this.A03 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            com.obwhatsapp.messaging.CaptivePortalActivity r4 = r7.A02
            android.net.wifi.WifiManager r6 = r7.A01
            int r5 = r7.A00
            java.lang.String r3 = r7.A03
            java.lang.String r0 = "forgetting wifi network "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r5)
            java.lang.String r2 = " named "
            r0.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r6.removeNetwork(r5)
            if (r0 != 0) goto L_0x0056
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "remove network failed for wifi network "
        L_0x0029:
            r1.append(r0)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0039:
            boolean r0 = r6.disconnect()
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "failed to disconnect from wifi network "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0052:
            r4.finish()
            return
        L_0x0056:
            boolean r0 = r6.saveConfiguration()
            if (r0 != 0) goto L_0x0039
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "save configuration failed for wifi network "
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91354fm.onClick(android.content.DialogInterface, int):void");
    }
}
