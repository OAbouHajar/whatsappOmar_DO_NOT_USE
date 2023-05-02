package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.4g4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91534g4 implements DialogInterface.OnShowListener {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FingerprintBottomSheet A01;

    public /* synthetic */ C91534g4(Bundle bundle, FingerprintBottomSheet fingerprintBottomSheet) {
        this.A01 = fingerprintBottomSheet;
        this.A00 = bundle;
    }

    public final void onShow(DialogInterface dialogInterface) {
        FingerprintBottomSheet.A02(dialogInterface, this.A00, this.A01);
    }
}
