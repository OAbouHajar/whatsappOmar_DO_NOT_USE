package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass05g;
import X.AnonymousClass0YD;
import X.AnonymousClass3FJ;
import X.C108915Pz;
import X.C13680ns;
import X.C13700nu;
import X.C30801cy;
import X.C35541m6;
import X.C446524y;
import X.C85224Np;
import X.C87914Zd;
import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment;
import com.obwhatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel;
import com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment;
import com.obwhatsapp.migration.transfer.service.DonorDeviceTransferService;
import com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity;
import com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel;
import com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity;
import com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity;
import com.whatsapp.util.Log;
import java.util.Map;

public class IDxRCallbackShape215S0100000_2_I1 implements AnonymousClass05g {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape215S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AM3(Object obj) {
        C30801cy r1;
        LocationOptionPickerViewModel locationOptionPickerViewModel;
        switch (this.A01) {
            case 0:
                AnonymousClass3FJ r2 = (AnonymousClass3FJ) this.A00;
                if (((AnonymousClass0YD) obj).A00 == -1) {
                    r2.A07.Aha();
                    return;
                }
                return;
            case 1:
                LocationOptionPickerFragment locationOptionPickerFragment = (LocationOptionPickerFragment) this.A00;
                if (((AnonymousClass0YD) obj).A00 == -1) {
                    r1 = locationOptionPickerFragment.A03.A07;
                    break;
                } else {
                    return;
                }
            case 2:
                int i2 = ((AnonymousClass0YD) obj).A00;
                locationOptionPickerViewModel = ((LocationOptionPickerFragment) this.A00).A03;
                if (i2 != -1) {
                    locationOptionPickerViewModel.A02.A03(6, 1);
                    return;
                }
                break;
            case 3:
                LocationOptionPickerFragment locationOptionPickerFragment2 = (LocationOptionPickerFragment) this.A00;
                Boolean bool = (Boolean) ((Map) obj).get("android.permission.ACCESS_FINE_LOCATION");
                if (bool != null && bool.booleanValue()) {
                    locationOptionPickerViewModel = locationOptionPickerFragment2.A03;
                    break;
                } else {
                    return;
                }
                break;
            case 4:
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = (StatusPrivacyBottomSheetDialogFragment) this.A00;
                C35541m6 r0 = new C35541m6(statusPrivacyBottomSheetDialogFragment.A05.A08(), statusPrivacyBottomSheetDialogFragment.A05.A09(), statusPrivacyBottomSheetDialogFragment.A05.A02(), false);
                statusPrivacyBottomSheetDialogFragment.A04 = r0;
                statusPrivacyBottomSheetDialogFragment.A00.A00(r0.A00);
                statusPrivacyBottomSheetDialogFragment.A00.A01(statusPrivacyBottomSheetDialogFragment.A04.A01.size(), statusPrivacyBottomSheetDialogFragment.A04.A02.size());
                return;
            case 5:
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment2 = (StatusPrivacyBottomSheetDialogFragment) this.A00;
                AnonymousClass0YD r11 = (AnonymousClass0YD) obj;
                if (r11.A00 == -1) {
                    Intent intent = r11.A01;
                    AnonymousClass00B.A06(intent);
                    C35541m6 A002 = statusPrivacyBottomSheetDialogFragment2.A07.A00(intent.getExtras());
                    AnonymousClass00B.A06(A002);
                    statusPrivacyBottomSheetDialogFragment2.A04 = A002;
                    statusPrivacyBottomSheetDialogFragment2.A00.A01(A002.A01.size(), statusPrivacyBottomSheetDialogFragment2.A04.A02.size());
                }
                statusPrivacyBottomSheetDialogFragment2.A00.A00(statusPrivacyBottomSheetDialogFragment2.A04.A00);
                return;
            case 6:
                DeviceTransferActivity deviceTransferActivity = (DeviceTransferActivity) this.A00;
                AnonymousClass0YD r112 = (AnonymousClass0YD) obj;
                int i3 = r112.A00;
                if (i3 == 0) {
                    deviceTransferActivity.A0B.A08(0);
                    return;
                }
                if (i3 == -1) {
                    Intent intent2 = r112.A01;
                    if (intent2 == null) {
                        Log.e("fpm/DeviceTransferActivity/qr code scanner result is null but result code is ok");
                    } else {
                        String stringExtra = intent2.getStringExtra("qr_code_key");
                        if (stringExtra != null) {
                            DeviceTransferViewModel deviceTransferViewModel = deviceTransferActivity.A0B;
                            if (C87914Zd.A00(stringExtra) != null) {
                                Context context = deviceTransferViewModel.A08.A00;
                                Intent A02 = C13700nu.A02("com.obwhatsapp.migration.START");
                                A02.putExtra("details_key", stringExtra);
                                A02.setClass(context, DonorDeviceTransferService.class);
                                C446524y.A00(context, A02);
                                deviceTransferViewModel.A08(2);
                                return;
                            }
                            deviceTransferViewModel.A06.A09(new C85224Np(new IDxActionShape258S0100000_2_I1(deviceTransferViewModel, 6), (C108915Pz) null, R.string.str09fa, R.string.str1c72, R.string.str1831, 0));
                            return;
                        }
                        return;
                    }
                }
                deviceTransferActivity.A39(new C85224Np(new IDxActionShape258S0100000_2_I1(deviceTransferActivity, 0), (C108915Pz) null, R.string.str0581, R.string.str1c72, R.string.str0e87, R.string.str0394));
                return;
            case 7:
                IndiaUpiFcsAddPaymentMethodActivity.A02((IndiaUpiFcsAddPaymentMethodActivity) this.A00);
                return;
            default:
                IndiaUpiFcsConsumerOnboardingActivity.A02((IndiaUpiFcsConsumerOnboardingActivity) this.A00);
                return;
        }
        locationOptionPickerViewModel.A02.A03(5, 1);
        locationOptionPickerViewModel.A03.A00();
        r1 = locationOptionPickerViewModel.A07;
        C13680ns.A1O(r1, 2);
    }
}
