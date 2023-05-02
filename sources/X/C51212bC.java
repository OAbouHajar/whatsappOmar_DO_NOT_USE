package X;

import com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.2bC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51212bC implements AnonymousClass1WE {
    public final /* synthetic */ LinkedDevicesSharedViewModel A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C51212bC(LinkedDevicesSharedViewModel linkedDevicesSharedViewModel, String str) {
        this.A00 = linkedDevicesSharedViewModel;
        this.A01 = str;
    }

    public final void accept(Object obj) {
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A00;
        String str = this.A01;
        try {
            C19410yO r4 = linkedDevicesSharedViewModel.A0E;
            boolean z2 = true;
            if (r4.A07().size() != 1) {
                z2 = false;
            }
            DeviceJid deviceJid = DeviceJid.get(str);
            boolean z3 = false;
            if (!z2) {
                z3 = true;
            }
            r4.A0A(deviceJid, "user_initiated", false, z3);
        } catch (AnonymousClass1W4 e2) {
            StringBuilder sb = new StringBuilder("Invalid jid: ");
            sb.append(str);
            Log.e(sb.toString(), e2);
        }
    }
}
