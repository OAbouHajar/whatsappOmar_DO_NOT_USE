package X;

import com.facebook.redex.IDxActionShape258S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel;

/* renamed from: X.4zv  reason: invalid class name and case insensitive filesystem */
public class C103034zv implements AnonymousClass5T7, C108885Pw {
    public final /* synthetic */ DeviceTransferViewModel A00;

    public C103034zv(DeviceTransferViewModel deviceTransferViewModel) {
        this.A00 = deviceTransferViewModel;
    }

    public void AO6() {
    }

    public void AO7() {
    }

    public void AOq() {
    }

    public void AQR(int i2) {
        C85224Np r3;
        AnonymousClass027 r2;
        if (!(i2 == 0 || i2 == 1 || i2 == 2 || i2 == 301 || i2 == 302 || i2 == 600)) {
            switch (i2) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                case 107:
                    DeviceTransferViewModel deviceTransferViewModel = this.A00;
                    r2 = deviceTransferViewModel.A06;
                    r3 = new C85224Np(new IDxActionShape258S0100000_2_I1(deviceTransferViewModel, 3), new IDxActionShape258S0100000_2_I1(deviceTransferViewModel, 7), R.string.str09fa, R.string.str1c83, R.string.str1831, R.string.str1da7);
                    break;
                default:
                    switch (i2) {
                        case 200:
                        case 201:
                        case 202:
                            break;
                        default:
                            switch (i2) {
                                case 501:
                                case 502:
                                case 503:
                                    break;
                                default:
                                    return;
                            }
                    }
            }
        }
        DeviceTransferViewModel deviceTransferViewModel2 = this.A00;
        r2 = deviceTransferViewModel2.A06;
        r3 = deviceTransferViewModel2.A05();
        r2.A09(r3);
    }

    public void AQp() {
    }

    public void AS8(int i2, int i3) {
        this.A00.A09(R.string.str1d71, (i2 * 100) / i3);
    }

    public void AVL(int i2) {
        this.A00.A09(R.string.str1c79, i2);
    }
}
