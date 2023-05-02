package com.obwhatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass024;
import X.AnonymousClass15P;
import X.AnonymousClass1NO;
import X.AnonymousClass2J2;
import X.C13680ns;
import X.C13690nt;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintView;
import com.obwhatsapp.authentication.IDxVListenerShape55S0100000_2_I1;
import com.whatsapp.util.Log;
import java.security.Signature;

public class AuthenticationActivity extends C14550pN implements AnonymousClass2J2 {
    public AnonymousClass024 A00;
    public AnonymousClass15P A01;
    public FingerprintView A02;
    public Runnable A03;
    public boolean A04;

    public AuthenticationActivity() {
        this(0);
    }

    public AuthenticationActivity(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 101);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            C14550pN.A15(r1, this);
            this.A0A = C14550pN.A0v(r1);
            this.A01 = (AnonymousClass15P) r1.A0b.get();
        }
    }

    public final void A2m() {
        Log.i("AuthenticationActivity/start-listening");
        this.A02.removeCallbacks(this.A03);
        AnonymousClass024 r2 = new AnonymousClass024();
        this.A00 = r2;
        AnonymousClass15P r1 = this.A01;
        AnonymousClass00B.A0G(r1.A05());
        r1.A01.A5H(r2, this);
        FingerprintView fingerprintView = this.A02;
        fingerprintView.A02(fingerprintView.A06);
    }

    public void AMu(int i2, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-error");
        if (i2 == 7) {
            Log.i("AuthenticationActivity/fingerprint-error-too-many-attempts");
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, 30, 0);
            charSequence = getString(R.string.str08f8, A1b);
            this.A02.removeCallbacks(this.A03);
            this.A02.postDelayed(this.A03, AnonymousClass1NO.A0L);
        }
        this.A02.A03(charSequence);
    }

    public void AMv() {
        Log.i("AuthenticationActivity/fingerprint-failed");
        FingerprintView fingerprintView = this.A02;
        fingerprintView.A04(fingerprintView.getContext().getString(R.string.str08f9));
    }

    public void AMx(int i2, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-help");
        this.A02.A04(charSequence.toString());
    }

    public void AMy(byte[] bArr) {
        Log.i("AuthenticationActivity/fingerprint-success");
        this.A02.A01();
    }

    public /* synthetic */ void AMz(Signature signature) {
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A01.A03()) {
            Log.i("AuthenticationActivity/onCreate: setting not enabled");
            C13690nt.A0q(this);
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView((int) R.layout.layout0032);
        C13680ns.A0N(this, R.id.auth_title).setText(getIntent().getStringExtra("extra_auth_title"));
        FingerprintView fingerprintView = (FingerprintView) findViewById(R.id.fingerprint_view);
        this.A02 = fingerprintView;
        fingerprintView.A00 = new IDxVListenerShape55S0100000_2_I1(this, 1);
        this.A03 = new RunnableRunnableShape19S0100000_I1_2(this, 17);
    }

    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A02;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    public void onPause() {
        super.onPause();
        Log.i("AuthenticationActivity/stop-listening");
        this.A02.removeCallbacks(this.A03);
        AnonymousClass024 r0 = this.A00;
        if (r0 != null) {
            try {
                r0.A01();
            } catch (NullPointerException e2) {
                e2.getMessage();
            } catch (Throwable th) {
                this.A00 = null;
                throw th;
            }
            this.A00 = null;
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.A01.A03()) {
            Log.i("AuthenticationActivity/not-enrolled");
            C13690nt.A0q(this);
            return;
        }
        A2m();
    }
}
