package X;

import com.obwhatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.51Q  reason: invalid class name */
public class AnonymousClass51Q implements C49602Uf {
    public final /* synthetic */ LinkedDevicesEnterCodeActivity A00;

    public AnonymousClass51Q(LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity) {
        this.A00 = linkedDevicesEnterCodeActivity;
    }

    public void APg() {
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onDevicePairingRequested");
    }

    public void AQR(int i2) {
        Log.i(C13680ns.A0c(i2, "LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onError errorCode: "));
    }

    public void ASJ() {
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onInvalidDeviceTime");
    }

    public void ASK() {
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onInvalidQrCode");
    }

    public void AW1() {
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onRemovedAllDevices");
    }

    public void AYf() {
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onSyncdDeleteAllError");
    }

    public void onSuccess() {
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onSuccess");
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = this.A00;
        linkedDevicesEnterCodeActivity.Ac1();
        linkedDevicesEnterCodeActivity.finish();
    }
}
