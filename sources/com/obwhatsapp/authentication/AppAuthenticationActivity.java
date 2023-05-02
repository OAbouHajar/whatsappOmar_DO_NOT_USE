package com.obwhatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass01S;
import X.AnonymousClass024;
import X.AnonymousClass0Q8;
import X.AnonymousClass15P;
import X.AnonymousClass18Z;
import X.AnonymousClass1NO;
import X.AnonymousClass2J2;
import X.C05030Oy;
import X.C05240Pv;
import X.C13680ns;
import X.C13690nt;
import X.C14550pN;
import X.C14570pP;
import X.C14620pU;
import X.C16150sX;
import X.C16620tM;
import X.C64373Oq;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.youbasha.ui.lockV2.LockBaseActivity;
import com.obwhatsapp.youbasha.ui.lockV2.LockOptions;
import com.whatsapp.util.Log;
import java.security.Signature;

public final class AppAuthenticationActivity extends C14550pN implements AnonymousClass2J2, C14620pU {
    public int A00;
    public int A01;
    public C05030Oy A02;
    public AnonymousClass0Q8 A03;
    public AnonymousClass024 A04;
    public AnonymousClass18Z A05;
    public AnonymousClass15P A06;
    public FingerprintView A07;
    public Runnable A08;
    public boolean A09;
    public boolean A0A;

    public AppAuthenticationActivity() {
        this(0);
        this.A01 = 1;
    }

    public AppAuthenticationActivity(int i2) {
        this.A09 = false;
        C13680ns.A1G(this, 13);
    }

    public static /* synthetic */ void A03(AppAuthenticationActivity appAuthenticationActivity) {
        appAuthenticationActivity.A01 = 2;
        appAuthenticationActivity.A03.A01(appAuthenticationActivity.A02);
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            C14550pN.A15(r1, this);
            this.A0A = C14550pN.A0v(r1);
            this.A05 = (AnonymousClass18Z) r1.ARC.get();
            this.A06 = (AnonymousClass15P) r1.A0b.get();
        }
    }

    public final void A2m() {
        if (this.A00 != 0) {
            this.A05.A01();
            Intent A092 = C13680ns.A09();
            A092.putExtra("appWidgetId", this.A00);
            setResult(-1, A092);
            return;
        }
        setResult(-1);
    }

    public final void A2n() {
        Log.i("AuthenticationActivity/start-listening");
        this.A07.removeCallbacks(this.A08);
        AnonymousClass024 r2 = new AnonymousClass024();
        this.A04 = r2;
        AnonymousClass15P r1 = this.A06;
        AnonymousClass00B.A0G(r1.A05());
        r1.A01.A5H(r2, this);
        FingerprintView fingerprintView = this.A07;
        fingerprintView.A02(fingerprintView.A06);
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void AMu(int i2, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-error");
        this.A06.A02(true);
        if (i2 == 7) {
            Log.i("AppAuthenticationActivity/fingerprint-error-too-many-attempts");
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 30, 0);
            charSequence = getString(R.string.str08f8, objArr);
            this.A07.removeCallbacks(this.A08);
            this.A07.postDelayed(this.A08, AnonymousClass1NO.A0L);
        }
        this.A07.A03(charSequence);
    }

    public void AMv() {
        Log.i("AppAuthenticationActivity/fingerprint-failed");
        FingerprintView fingerprintView = this.A07;
        fingerprintView.A04(fingerprintView.getContext().getString(R.string.str08f9));
    }

    public void AMx(int i2, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-help");
        this.A07.A04(charSequence.toString());
    }

    public void AMy(byte[] bArr) {
        Log.i("AppAuthenticationActivity/fingerprint-success");
        this.A06.A02(false);
        this.A07.A01();
        LockBaseActivity.auth_success_actions(this, (LockOptions) null);
    }

    public /* synthetic */ void AMz(Signature signature) {
    }

    public void onBackPressed() {
        if (LockBaseActivity.hasLockOptionsBundle(this)) {
            finish();
            return;
        }
        ActivityManager A032 = this.A08.A03();
        if (A032 == null || A032.getLockTaskModeState() != 2) {
            setResult(0);
            finishAffinity();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A0E = C13690nt.A0E(this);
        if (A0E != null) {
            this.A00 = A0E.getInt("appWidgetId", 0);
        }
        AnonymousClass15P r0 = this.A06;
        if (LockBaseActivity.hasLockOptionsBundle(this) || r0.A04()) {
            this.A0A = this.A06.A04.A0E(C16620tM.A02, 266);
            setContentView((int) R.layout.layout0032);
            C13680ns.A0N(this, R.id.auth_title).setText(R.string.str00f2);
            View findViewById = findViewById(R.id.app_unlock);
            this.A07 = (FingerprintView) findViewById(R.id.fingerprint_view);
            if (this.A0A) {
                findViewById.setVisibility(0);
                this.A07.setVisibility(8);
                this.A03 = new AnonymousClass0Q8(new C64373Oq(this), this, AnonymousClass00T.A08(this));
                C05240Pv r1 = new C05240Pv();
                r1.A03 = getString(R.string.str00f8);
                r1.A05 = true;
                r1.A04 = false;
                this.A02 = r1.A00();
                C13680ns.A1A(findViewById, this, 19);
                return;
            }
            findViewById.setVisibility(8);
            this.A07.setVisibility(0);
            this.A07.A00 = new IDxVListenerShape55S0100000_2_I1(this, 0);
            this.A08 = new RunnableRunnableShape17S0100000_I1((Object) this, 14);
            return;
        }
        Log.i("AppAuthenticationActivity/onCreate: setting not enabled");
        A2m();
        finish();
        overridePendingTransition(0, 17432577);
    }

    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A07;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    public void onPause() {
        super.onPause();
        if (!this.A0A) {
            Log.i("AuthenticationActivity/stop-listening");
            this.A07.removeCallbacks(this.A08);
            AnonymousClass024 r0 = this.A04;
            if (r0 != null) {
                try {
                    r0.A01();
                } catch (NullPointerException e2) {
                    e2.getMessage();
                } catch (Throwable th) {
                    this.A04 = null;
                    throw th;
                }
                this.A04 = null;
            }
        } else if (this.A01 == 3) {
            this.A01 = 1;
            this.A03.A00();
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.A0A) {
            A2n();
        }
    }

    public void onStart() {
        super.onStart();
        if (!this.A06.A03()) {
            Log.i("AppAuthenticationActivity/not-enrolled");
            C13690nt.A0q(this);
        } else if (this.A0A && this.A01 == 1) {
            this.A01 = 2;
            this.A03.A01(this.A02);
        }
    }
}
