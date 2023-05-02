package com.obwhatsapp.qrcode;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass15X;
import X.AnonymousClass1NA;
import X.AnonymousClass1NB;
import X.AnonymousClass1NC;
import X.AnonymousClass1WC;
import X.AnonymousClass1ZW;
import X.AnonymousClass2Rf;
import X.AnonymousClass2WW;
import X.C006602z;
import X.C101264wz;
import X.C101274x0;
import X.C109555Sp;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17250um;
import X.C18260wP;
import X.C18890xQ;
import X.C19410yO;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C208411u;
import X.C23061Ai;
import X.C23071Aj;
import X.C49132Rg;
import X.C49602Uf;
import X.C53982gc;
import X.C63213Go;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.obwhatsapp.R;
import com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0;
import java.util.concurrent.TimeUnit;

public class DevicePairQrScannerActivity extends AnonymousClass2WW {
    public static final long A0F;
    public static final long A0G;
    public C208411u A00;
    public C18890xQ A01;
    public AnonymousClass1NA A02;
    public AnonymousClass1NB A03;
    public C109555Sp A04;
    public AnonymousClass1NC A05;
    public C19410yO A06;
    public AnonymousClass15X A07;
    public C53982gc A08;
    public DevicePairQrScannerViewModel A09;
    public Runnable A0A;
    public boolean A0B;
    public final AnonymousClass1WC A0C;
    public final C49602Uf A0D;
    public final Runnable A0E;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0F = timeUnit.toMillis(6) + 32000;
        A0G = timeUnit.toMillis(4);
    }

    public DevicePairQrScannerActivity() {
        this(0);
        this.A0E = new RunnableRunnableShape12S0100000_I0_11((Object) this, 46);
        this.A0D = new C63213Go(this);
        this.A0C = new IDxDObserverShape77S0100000_2_I0(this, 3);
    }

    public DevicePairQrScannerActivity(int i2) {
        this.A0B = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 71));
    }

    public static /* synthetic */ void A02(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        Runnable runnable = devicePairQrScannerActivity.A0A;
        if (runnable != null) {
            devicePairQrScannerActivity.A00.removeCallbacks(runnable);
        }
        devicePairQrScannerActivity.Ac1();
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A03 = C16150sX.A0J(r1);
            this.A04 = (C16260sj) r1.AQe.get();
            this.A01 = (C18890xQ) r1.APS.get();
            this.A07 = (AnonymousClass15X) r1.AMk.get();
            this.A06 = (C19410yO) r1.A4T.get();
            this.A02 = (AnonymousClass1NA) r1.AMj.get();
            this.A03 = (AnonymousClass1NB) r1.AFw.get();
            this.A05 = (AnonymousClass1NC) r1.A6m.get();
            this.A00 = (C208411u) r1.A8z.get();
        }
    }

    public void A2S(int i2) {
        if (i2 == R.string.str0dc3 || i2 == R.string.str0dc2 || i2 == R.string.str084b) {
            this.A05.AcJ();
        } else if (i2 == 1000) {
            finish();
        }
    }

    public final void A39() {
        Runnable runnable = this.A0A;
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
        }
        Ac1();
        Vibrator A0K = this.A08.A0K();
        AnonymousClass00B.A06(A0K);
        A0K.vibrate(75);
        finish();
    }

    public void onCreate(Bundle bundle) {
        C109555Sp r0;
        super.onCreate(bundle);
        AnonymousClass1NC r1 = this.A05;
        if (r1.A02.A0L.A01.A1d()) {
            C16440t3 r4 = r1.A01;
            C16320sq r3 = r1.A04;
            r0 = new C101274x0(r1.A00, r4, r1.A03, r3);
        } else {
            r0 = new C101264wz();
        }
        this.A04 = r0;
        this.A08 = this.A00.A00(this.A0D);
        this.A02.setText(AnonymousClass1ZW.A01(getString(R.string.str132c, new Object[]{"web.whatsapp.com"}), new Object[0]));
        this.A02.setVisibility(0);
        this.A06.A02(this.A0C);
        synchronized (this.A03.A02) {
        }
        getIntent().getIntExtra("entry_point", 1);
        getIntent().getStringExtra("agent_id");
        DevicePairQrScannerViewModel devicePairQrScannerViewModel = (DevicePairQrScannerViewModel) new C006602z(this).A01(DevicePairQrScannerViewModel.class);
        this.A09 = devicePairQrScannerViewModel;
        devicePairQrScannerViewModel.A05.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 215));
        this.A09.A06.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 216));
    }

    public void onDestroy() {
        this.A06.A03(this.A0C);
        synchronized (this.A03.A02) {
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }
}
