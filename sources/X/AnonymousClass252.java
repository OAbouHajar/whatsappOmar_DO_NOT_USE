package X;

import com.facebook.redex.RunnableRunnableShape0S0220000_I0;
import com.whatsapp.util.Log;

/* renamed from: X.252  reason: invalid class name */
public class AnonymousClass252 implements AnonymousClass253 {
    public final /* synthetic */ C19410yO A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass252(C19410yO r1, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A02 = z2;
        this.A01 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        if (r3 != null) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AQU(X.C17380uz r10, int r11) {
        /*
            r9 = this;
            java.lang.String r1 = "companion-device-manager/createDeviceRemoveRequestProtocolHelper/onError: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0023
            X.0yO r3 = r9.A00
            r2 = 0
            X.1WA r1 = r3.A0M
            com.facebook.redex.RunnableRunnableShape0S0220000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0220000_I0
            r0.<init>(r10, r3, r2)
            r1.execute(r0)
        L_0x0022:
            return
        L_0x0023:
            X.0yO r0 = r9.A00
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r8 = r0.iterator()
        L_0x002d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r4 = r8.next()
            X.1WC r4 = (X.AnonymousClass1WC) r4
            boolean r0 = r4 instanceof com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0
            if (r0 == 0) goto L_0x002d
            com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0 r4 = (com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0) r4
            int r0 = r4.A01
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r4.A00
            X.0yb r1 = (X.C19540yb) r1
            X.0sK r0 = r1.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "SyncdDeleteAllDataApiHandler/onDeviceLogoutError"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A01()
            goto L_0x002d
        L_0x005e:
            int r0 = r10.size()
            r7 = 1
            if (r0 != r7) goto L_0x00ac
            java.lang.Object r5 = r4.A00
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            X.0yO r2 = r5.A0E
            X.1Ub r0 = r10.iterator()
            java.lang.Object r0 = r0.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r0 = r0.getRawString()
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            X.AnonymousClass00B.A06(r1)
            X.16S r0 = r2.A0L
            X.0rz r0 = r0.A01
            boolean r0 = r0.A1d()
            if (r0 == 0) goto L_0x00ac
            X.0xd r0 = r2.A0I
            X.0vs r0 = r0.A00()
            java.lang.Object r0 = r0.get(r1)
            X.1WN r0 = (X.AnonymousClass1WN) r0
            if (r0 == 0) goto L_0x00ac
            java.lang.String r3 = r0.A08
            if (r3 == 0) goto L_0x00ac
            android.app.Application r6 = r5.A04
            r2 = 2131891750(0x7f121626, float:1.9418229E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 0
            r1[r0] = r3
            java.lang.String r3 = r6.getString(r2, r1)
            if (r3 != 0) goto L_0x00b9
        L_0x00ac:
            java.lang.Object r5 = r4.A00
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            android.app.Application r6 = r5.A04
            r0 = 2131889206(0x7f120c36, float:1.941307E38)
            java.lang.String r3 = r6.getString(r0)
        L_0x00b9:
            X.0wP r0 = r5.A0B
            boolean r1 = r0.A0A()
            r0 = 2131889602(0x7f120dc2, float:1.9413872E38)
            if (r1 == 0) goto L_0x00c7
            r0 = 2131889205(0x7f120c35, float:1.9413067E38)
        L_0x00c7:
            java.lang.String r2 = r6.getString(r0)
            X.0pt r1 = r5.A06
            X.55d r0 = new X.55d
            r0.<init>(r4, r3, r2)
            r1.A0K(r0)
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass252.AQU(X.0uz, int):void");
    }

    public void AY4(C17380uz r5) {
        Log.i("companion-device-manager/createDeviceRemoveRequestProtocolHelper/onSuccess");
        C19410yO r3 = this.A00;
        r3.A0M.execute(new RunnableRunnableShape0S0220000_I0(r5, r3, this.A02));
    }
}
