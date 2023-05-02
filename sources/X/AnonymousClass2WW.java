package X;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.DevicePairQrScannerActivity;
import com.obwhatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;

/* renamed from: X.2WW  reason: invalid class name */
public abstract class AnonymousClass2WW extends AnonymousClass2WX {
    public View A00;
    public View A01;
    public TextView A02;
    public C17650vQ A03;
    public C16260sj A04;
    public WaQrScannerView A05;
    public String A06;
    public boolean A07 = true;
    public boolean A08;

    public void A35() {
        int A032 = this.A04.A03("android.permission.CAMERA");
        WaQrScannerView waQrScannerView = this.A05;
        if (A032 != 0) {
            waQrScannerView.setVisibility(8);
            this.A00.setVisibility(8);
            this.A01.setVisibility(0);
            C54932iV r5 = new C54932iV(this);
            r5.A01 = R.drawable.permission_cam;
            int[] iArr = {R.string.str1cf7};
            r5.A06 = R.string.str11ac;
            r5.A0I = iArr;
            int[] iArr2 = {R.string.str1cf7};
            r5.A09 = R.string.str11ab;
            r5.A0G = iArr2;
            r5.A0K = new String[]{"android.permission.CAMERA"};
            r5.A0D = true;
            A38(r5);
            startActivityForResult(r5.A00(), 1);
            return;
        }
        waQrScannerView.setVisibility(0);
        this.A00.setVisibility(0);
        this.A01.setVisibility(8);
    }

    public void A36() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this;
        devicePairQrScannerActivity.A05.A0J(devicePairQrScannerActivity.A0E);
        devicePairQrScannerActivity.A05.Acq(new RunnableRunnableShape12S0100000_I0_11((Object) devicePairQrScannerActivity, 45));
    }

    public void A37(C86844Uj r4) {
        String str = r4.A02;
        Log.i("QrScannerActivity/result");
        if (str == null || str.equals(this.A06)) {
            this.A05.AcJ();
        } else {
            this.A06 = str;
            A36();
        }
        this.A09.A0K().putBoolean("qr_education", false).apply();
    }

    public void A38(C54932iV r1) {
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == 0) {
            finish();
        } else {
            this.A05.setVisibility(0);
            this.A00.setVisibility(0);
            this.A01.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        A1X(5);
        super.onCreate(bundle);
        setTitle(R.string.str148a);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.layout04df, (ViewGroup) null, false));
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A07 = ((SharedPreferences) this.A09.A01.get()).getBoolean("qr_education", true);
        this.A00 = findViewById(R.id.overlay);
        this.A05 = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
        this.A01 = findViewById(R.id.shade);
        this.A02 = (TextView) findViewById(R.id.hint);
        this.A05.setQrScannerCallback(new AnonymousClass51R(this));
        View findViewById = findViewById(R.id.ok);
        View findViewById2 = findViewById(R.id.education);
        findViewById.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 44, findViewById2));
        if (this.A07) {
            findViewById2.setVisibility(0);
            this.A05.setVisibility(8);
            this.A00.setVisibility(8);
            this.A01.setVisibility(0);
            return;
        }
        findViewById2.setVisibility(8);
        A35();
    }

    public void onPause() {
        super.onPause();
        if (this.A05.getVisibility() == 0) {
            this.A05.setVisibility(4);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A05.getVisibility() == 4) {
            this.A05.setVisibility(0);
        }
    }
}
