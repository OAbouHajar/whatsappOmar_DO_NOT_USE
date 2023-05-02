package com.obwhatsapp.migration.transfer.ui;

import X.AnonymousClass00T;
import X.AnonymousClass027;
import X.AnonymousClass07M;
import X.C006602z;
import X.C011105i;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16260sj;
import X.C32241fu;
import X.C49132Rg;
import X.C54932iV;
import X.C62323Dc;
import X.C85224Np;
import android.content.Intent;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxRCallbackShape215S0100000_2_I1;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.QrImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.RoundCornerProgressBar;

public class DeviceTransferActivity extends C14530pL {
    public View A00;
    public CircularProgressBar A01;
    public QrImageView A02;
    public WaButton A03;
    public WaButton A04;
    public WaImageView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public RoundCornerProgressBar A09;
    public C16260sj A0A;
    public DeviceTransferViewModel A0B;
    public boolean A0C;
    public final C011105i A0D;

    public DeviceTransferActivity() {
        this(0);
        this.A0D = A0O(new IDxRCallbackShape215S0100000_2_I1(this, 6), new AnonymousClass07M());
    }

    public DeviceTransferActivity(int i2) {
        this.A0C = false;
        C13680ns.A1G(this, 88);
    }

    public void A1q() {
        if (!this.A0C) {
            this.A0C = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0A = C16150sX.A0X(r1);
        }
    }

    public final Intent A35() {
        C54932iV r3 = new C54932iV(this);
        r3.A01 = R.drawable.permission_location;
        r3.A0K = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        r3.A0A = R.string.device_transfer_location_permission_request_title;
        r3.A06 = R.string.device_transfer_location_permission_request_explanation;
        r3.A09 = R.string.device_transfer_location_permission_denial_explanation;
        return r3.A00();
    }

    public final Intent A36() {
        C54932iV r3 = new C54932iV(this);
        r3.A01 = R.drawable.ic_action_search;
        r3.A0K = new String[]{"android.permission.NEARBY_WIFI_DEVICES"};
        r3.A0A = R.string.device_transfer_nearby_devices_permission_request_title;
        r3.A06 = R.string.device_transfer_nearby_devices_permission_request_explanation;
        r3.A09 = R.string.device_transfer_nearby_devices_permission_denial_explanation;
        return r3.A00();
    }

    public final void A37() {
        AnonymousClass027 r1;
        int i2;
        LocationManager locationManager = (LocationManager) AnonymousClass00T.A07(getApplicationContext(), LocationManager.class);
        if (locationManager == null || !locationManager.isProviderEnabled("gps")) {
            r1 = this.A0B.A05;
            i2 = 4;
        } else {
            r1 = this.A0B.A05;
            i2 = 5;
        }
        C13680ns.A1O(r1, i2);
    }

    public final void A38() {
        AnonymousClass027 r1;
        int i2;
        WifiManager wifiManager = (WifiManager) AnonymousClass00T.A07(getApplicationContext(), WifiManager.class);
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            r1 = this.A0B.A05;
            i2 = 6;
        } else {
            r1 = this.A0B.A05;
            i2 = 7;
        }
        C13680ns.A1O(r1, i2);
    }

    public final void A39(C85224Np r5) {
        C32241fu A002 = C32241fu.A00(this);
        A002.A02(r5.A03);
        A002.A01(r5.A00);
        C13680ns.A1H(A002, r5, 71, r5.A02);
        int i2 = r5.A01;
        if (i2 != 0) {
            A002.setNegativeButton(i2, r5.A04 != null ? new IDxCListenerShape128S0100000_2_I1(r5, 70) : null);
        }
        C13690nt.A1G(A002);
    }

    public void finish() {
        this.A0B.A07();
        super.finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r1.A03("android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r3.A0A.A06() != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r0 = r3.A0B
            X.027 r0 = r0.A05
            java.lang.Object r0 = r0.A01()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x002c
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L_0x002c
            boolean r0 = X.C15450qv.A0B()
            if (r0 == 0) goto L_0x002d
            X.0sj r0 = r3.A0A
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0048
        L_0x0024:
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r0 = r3.A0B
            X.027 r1 = r0.A05
            r0 = 3
        L_0x0029:
            X.C13680ns.A1O(r1, r0)
        L_0x002c:
            return
        L_0x002d:
            X.0sc r0 = r3.A04
            boolean r0 = r0.A0A()
            X.0sj r1 = r3.A0A
            if (r0 != 0) goto L_0x003f
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0048
            X.0sj r1 = r3.A0A
        L_0x003f:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x0048
            goto L_0x0024
        L_0x0048:
            if (r4 != r2) goto L_0x0066
            X.0sj r0 = r3.A0A
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0066
            X.0rz r0 = r3.A09
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            android.content.SharedPreferences$Editor r0 = r0.A0K()
            X.C13690nt.A0v(r0, r1)
            android.content.Intent r1 = r3.A35()
            r0 = 2
            r3.startActivityForResult(r1, r0)
            return
        L_0x0066:
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r0 = r3.A0B
            X.027 r1 = r0.A05
            r0 = 2
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.device_transfer_view);
        getWindow().addFlags(128);
        this.A05 = (WaImageView) AnonymousClass00T.A05(this, R.id.device_transfer_image_view);
        this.A00 = AnonymousClass00T.A05(this, R.id.device_transfer_qr_code_container);
        this.A02 = (QrImageView) AnonymousClass00T.A05(this, R.id.device_transfer_qr_code_image_view);
        this.A08 = (WaTextView) AnonymousClass00T.A05(this, R.id.device_transfer_title);
        this.A07 = (WaTextView) AnonymousClass00T.A05(this, R.id.device_transfer_subtitle);
        this.A01 = (CircularProgressBar) AnonymousClass00T.A05(this, R.id.device_transfer_progress_spinner);
        this.A06 = (WaTextView) AnonymousClass00T.A05(this, R.id.device_transfer_progress_description);
        this.A09 = (RoundCornerProgressBar) AnonymousClass00T.A05(this, R.id.device_transfer_progress_bar);
        this.A03 = (WaButton) AnonymousClass00T.A05(this, R.id.device_transfer_primary_btn);
        this.A04 = (WaButton) AnonymousClass00T.A05(this, R.id.device_transfer_secondary_btn);
        DeviceTransferViewModel deviceTransferViewModel = (DeviceTransferViewModel) new C006602z(this).A01(DeviceTransferViewModel.class);
        this.A0B = deviceTransferViewModel;
        deviceTransferViewModel.A0A(C13690nt.A0E(this));
        C13680ns.A1M(this, this.A0B.A07, 27);
        this.A0B.A05.A0A(this, new C62323Dc(this));
        C13680ns.A1L(this, this.A0B.A04, 101);
        C13680ns.A1L(this, this.A0B.A02, 100);
        C13680ns.A1L(this, this.A0B.A03, 103);
        C13680ns.A1L(this, this.A0B.A06, 102);
    }

    public void onResume() {
        super.onResume();
        Number number = (Number) this.A0B.A05.A01();
        if (number != null) {
            int intValue = number.intValue();
            if (intValue == 4) {
                A37();
            } else if (intValue == 6) {
                A38();
            }
        }
    }
}
