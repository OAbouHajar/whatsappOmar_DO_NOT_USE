package com.obwhatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass0Q8;
import X.AnonymousClass18Z;
import X.C05030Oy;
import X.C05240Pv;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14770pj;
import X.C16150sX;
import X.C16620tM;
import X.C19380yL;
import X.C49132Rg;
import X.C57032pw;
import X.C59332x4;
import X.C70783hi;
import X.C93984k7;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.shp;
import com.whatsapp.util.Log;

public class AppAuthSettingsActivity extends C14530pL {
    public View A00;
    public View A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public SwitchCompat A05;
    public SwitchCompat A06;
    public C05030Oy A07;
    public AnonymousClass0Q8 A08;
    public AnonymousClass18Z A09;
    public FingerprintBottomSheet A0A;
    public C19380yL A0B;
    public C14770pj A0C;
    public boolean A0D;
    public final C70783hi A0E;

    public AppAuthSettingsActivity() {
        this(0);
        this.A0E = new C59332x4(this);
    }

    public AppAuthSettingsActivity(int i2) {
        this.A0D = false;
        C13680ns.A1G(this, 12);
    }

    public static /* synthetic */ void A02(AppAuthSettingsActivity appAuthSettingsActivity) {
        boolean z2 = !appAuthSettingsActivity.A06.isChecked();
        C13680ns.A0z(appAuthSettingsActivity.A09.A0K(), "privacy_fingerprint_show_notification_content", z2);
        appAuthSettingsActivity.A06.setChecked(z2);
        appAuthSettingsActivity.A0B.A03(1, (String) null);
        appAuthSettingsActivity.A0C.A08();
        appAuthSettingsActivity.A09.A01();
    }

    public static /* synthetic */ void A03(AppAuthSettingsActivity appAuthSettingsActivity) {
        if (!(!appAuthSettingsActivity.A05.isChecked())) {
            appAuthSettingsActivity.A35();
        } else if (appAuthSettingsActivity.A03.A03()) {
            Log.i("AppAuthSettingsActivity/show-bottom-sheet");
            if (appAuthSettingsActivity.A03.A04.A0E(C16620tM.A02, 266)) {
                appAuthSettingsActivity.A08.A01(appAuthSettingsActivity.A07);
                return;
            }
            FingerprintBottomSheet A012 = FingerprintBottomSheet.A01(R.string.str08f5, R.string.str08f4, 0, 0);
            appAuthSettingsActivity.A0A = A012;
            A012.A05 = appAuthSettingsActivity.A0E;
            appAuthSettingsActivity.Afc(A012);
        } else {
            Log.i("AppAuthSettingsActivity/setup");
            appAuthSettingsActivity.Afc(new SetupDeviceAuthDialog());
        }
    }

    public void A1q() {
        if (!this.A0D) {
            this.A0D = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A09 = (AnonymousClass18Z) r1.ARC.get();
            this.A0C = (C14770pj) r1.AF9.get();
            this.A0B = (C19380yL) r1.AQd.get();
        }
    }

    public final void A35() {
        Log.i("AppAuthSettingsActivity/disable-setting");
        this.A03.A02(true);
        C13680ns.A0z(this.A09.A0K(), "privacy_fingerprint_enabled", false);
        shp.setFingerprintEnabled(false);
        this.A0C.A08();
        A36(false);
        this.A05.setChecked(false);
        this.A09.A01();
        this.A03.A00(this);
    }

    public final void A36(boolean z2) {
        Log.i("AppAuthSettingsActivity/update-dependent-views");
        int i2 = 0;
        this.A01.setVisibility(C13680ns.A02(z2 ? 1 : 0));
        View view = this.A00;
        if (!z2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0071);
        C13690nt.A0N(this).A0N(true);
        TextView A0N = C13680ns.A0N(this, R.id.security_settings_title);
        TextView A0N2 = C13680ns.A0N(this, R.id.security_settings_desc);
        if (this.A03.A04.A0E(C16620tM.A02, 266)) {
            setTitle(R.string.str15b3);
            A0N.setText(R.string.str15a6);
            A0N2.setText(R.string.str15a7);
            this.A08 = new AnonymousClass0Q8(new C57032pw(this), this, AnonymousClass00T.A08(this));
            C05240Pv r1 = new C05240Pv();
            r1.A01 = getString(R.string.str0173);
            r1.A03 = getString(R.string.str0174);
            r1.A05 = false;
            r1.A04 = false;
            this.A07 = r1.A00();
        } else {
            setTitle(R.string.str15b4);
            A0N.setText(R.string.str15a9);
            A0N2.setText(R.string.str15aa);
            if (bundle != null) {
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) AGM().A0B(FingerprintBottomSheet.class.getName());
                this.A0A = fingerprintBottomSheet;
                if (fingerprintBottomSheet != null) {
                    fingerprintBottomSheet.A05 = this.A0E;
                }
            }
        }
        this.A01 = findViewById(R.id.timeout);
        this.A05 = (SwitchCompat) findViewById(R.id.app_auth_settings_switch);
        this.A00 = findViewById(R.id.notification_preference);
        this.A06 = (SwitchCompat) findViewById(R.id.notification_content_switch);
        C13680ns.A1A(findViewById(R.id.app_auth_settings_preference), this, 18);
        C13680ns.A1A(this.A00, this, 17);
        this.A02 = (RadioButton) findViewById(R.id.timeout_immediately);
        this.A03 = (RadioButton) findViewById(R.id.timeout_one_min);
        this.A04 = (RadioButton) findViewById(R.id.timeout_thirty_min);
        this.A02.setText(R.string.str00f7);
        RadioButton radioButton = this.A03;
        AnonymousClass013 r3 = this.A01;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1M(objArr, 1, 0);
        radioButton.setText(r3.A0J(objArr, R.plurals.plurals0004, 1));
        RadioButton radioButton2 = this.A04;
        AnonymousClass013 r4 = this.A01;
        Object[] objArr2 = new Object[1];
        AnonymousClass000.A1M(objArr2, 30, 0);
        radioButton2.setText(r4.A0J(objArr2, R.plurals.plurals0004, 30));
        this.A02.setOnClickListener(new C93984k7(this, 0));
        this.A03.setOnClickListener(new C93984k7(this, 60000));
        this.A04.setOnClickListener(new C93984k7(this, 1800000));
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0Q8 r0 = this.A08;
        if (r0 != null) {
            r0.A00();
            this.A08 = null;
        }
        FingerprintBottomSheet fingerprintBottomSheet = this.A0A;
        if (fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A05 = null;
            this.A0A = null;
        }
    }

    public void onResume() {
        super.onResume();
        Log.i("AppAuthSettingsActivity/update-ui");
        boolean A1h = this.A09.A1h();
        long j2 = C13680ns.A0B(this.A09).getLong("privacy_fingerprint_timeout", 60000);
        boolean z2 = C13680ns.A0B(this.A09).getBoolean("privacy_fingerprint_show_notification_content", true);
        A36(A1h);
        StringBuilder A0r = AnonymousClass000.A0r("AppAuthSettingsActivity/update-timeout: ");
        A0r.append(j2);
        C13680ns.A1V(A0r);
        boolean z3 = true;
        this.A02.setChecked(AnonymousClass000.A1P((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))));
        this.A03.setChecked(AnonymousClass000.A1P((j2 > 60000 ? 1 : (j2 == 60000 ? 0 : -1))));
        RadioButton radioButton = this.A04;
        if (j2 != 1800000) {
            z3 = false;
        }
        radioButton.setChecked(z3);
        this.A05.setChecked(A1h);
        this.A06.setChecked(z2);
    }
}
