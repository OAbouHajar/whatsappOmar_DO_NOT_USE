package X;

import android.content.Intent;
import android.view.View;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxDListenerShape159S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Go  reason: invalid class name and case insensitive filesystem */
public class C63213Go implements C49602Uf {
    public final /* synthetic */ DevicePairQrScannerActivity A00;

    public C63213Go(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        this.A00 = devicePairQrScannerActivity;
    }

    public final void A00() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (!devicePairQrScannerActivity.AIm()) {
            C32241fu A002 = C32241fu.A00(devicePairQrScannerActivity);
            A002.A02(R.string.device_linking_failed_title);
            C13690nt.A1F(A002);
            A002.A0C(new IDxDListenerShape159S0100000_2_I1(this, 5));
            A002.A01(R.string.device_linking_failed_message);
            A002.A00();
        }
    }

    public void APg() {
        Log.i("QrScannerActivity/onDevicePairingRequested");
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        devicePairQrScannerActivity.Afq(R.string.str0c99);
        Runnable runnable = devicePairQrScannerActivity.A0A;
        if (runnable != null) {
            devicePairQrScannerActivity.A00.removeCallbacks(runnable);
        }
        View view = devicePairQrScannerActivity.A00;
        Runnable runnable2 = devicePairQrScannerActivity.A0A;
        if (runnable2 == null) {
            runnable2 = new RunnableRunnableShape12S0100000_I0_11((Object) devicePairQrScannerActivity, 44);
            devicePairQrScannerActivity.A0A = runnable2;
        }
        view.postDelayed(runnable2, DevicePairQrScannerActivity.A0F);
    }

    public void AQR(int i2) {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        devicePairQrScannerActivity.A04.AKQ(2, (long) i2);
        DevicePairQrScannerActivity.A02(devicePairQrScannerActivity);
        if (i2 != 403) {
            if (i2 == 419) {
                devicePairQrScannerActivity.A05.A09(R.string.str1c82, 1);
                devicePairQrScannerActivity.finish();
                return;
            } else if (i2 != 450) {
                if (i2 != 452) {
                    A00();
                    return;
                } else if (!devicePairQrScannerActivity.AIm()) {
                    AnonymousClass2T3 A01 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str0c48);
                    A01.A01(new IDxCListenerShape128S0100000_2_I1(devicePairQrScannerActivity, 88), R.string.str18b2);
                    IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(devicePairQrScannerActivity, 89);
                    A01.A04 = R.string.str0394;
                    A01.A07 = iDxCListenerShape128S0100000_2_I1;
                    A01.A00 = 1000;
                    C13680ns.A1J(A01.A00(), devicePairQrScannerActivity);
                    return;
                } else {
                    return;
                }
            }
        }
        devicePairQrScannerActivity.A05.AcJ();
        devicePairQrScannerActivity.A05.A0L(devicePairQrScannerActivity.A0E, DevicePairQrScannerActivity.A0G);
    }

    public void ASJ() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        devicePairQrScannerActivity.A04.AKP(1);
        DevicePairQrScannerActivity.A02(devicePairQrScannerActivity);
        devicePairQrScannerActivity.A05.A09(R.string.str0510, 1);
    }

    public void ASK() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        DevicePairQrScannerActivity.A02(devicePairQrScannerActivity);
        C32241fu A002 = C32241fu.A00(devicePairQrScannerActivity);
        A002.A02(R.string.str0bac);
        C13690nt.A1F(A002);
        A002.A0C(new IDxDListenerShape159S0100000_2_I1(this, 4));
        A002.A01(R.string.str0bab);
        A002.A00();
    }

    public void AW1() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        Intent A09 = C13680ns.A09();
        A09.putExtra("has_removed_all_devices", true);
        devicePairQrScannerActivity.setResult(-1, A09);
    }

    public void AYf() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        devicePairQrScannerActivity.A04.AKP(1);
        DevicePairQrScannerActivity.A02(devicePairQrScannerActivity);
        A00();
    }

    public void onSuccess() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (devicePairQrScannerActivity.A08.A00().A00 == null) {
            devicePairQrScannerActivity.A39();
        }
    }
}
