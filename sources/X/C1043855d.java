package X;

import com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0;

/* renamed from: X.55d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1043855d implements Runnable {
    public final /* synthetic */ IDxDObserverShape76S0100000_1_I0 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C1043855d(IDxDObserverShape76S0100000_1_I0 iDxDObserverShape76S0100000_1_I0, String str, String str2) {
        this.A00 = iDxDObserverShape76S0100000_1_I0;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void run() {
        IDxDObserverShape76S0100000_1_I0 iDxDObserverShape76S0100000_1_I0 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = (LinkedDevicesSharedViewModel) iDxDObserverShape76S0100000_1_I0.A00;
        if (linkedDevicesSharedViewModel.A03) {
            linkedDevicesSharedViewModel.A03 = false;
            linkedDevicesSharedViewModel.A05.A0B(Boolean.FALSE);
            linkedDevicesSharedViewModel.A0N.A0B(new AnonymousClass01Q(str, str2));
        }
    }
}
