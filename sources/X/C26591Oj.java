package X;

import com.obwhatsapp.R;
import com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel;

/* renamed from: X.1Oj  reason: invalid class name and case insensitive filesystem */
public class C26591Oj extends C16590tJ {
    public void A04(int i2) {
        for (C103034zv AQR : A01()) {
            AQR.AQR(i2);
        }
    }

    public void A05(int i2) {
        for (C103034zv r0 : A01()) {
            DeviceTransferViewModel deviceTransferViewModel = r0.A00;
            boolean z2 = deviceTransferViewModel.A01;
            int i3 = R.string.str1d73;
            if (z2) {
                i3 = R.string.str1c7e;
            }
            deviceTransferViewModel.A09(i3, i2);
        }
    }
}
