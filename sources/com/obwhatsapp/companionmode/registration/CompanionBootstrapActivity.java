package com.obwhatsapp.companionmode.registration;

import X.AnonymousClass00T;
import X.AnonymousClass11W;
import X.AnonymousClass1CB;
import X.AnonymousClass1RE;
import X.AnonymousClass1SS;
import X.AnonymousClass28A;
import X.AnonymousClass3oJ;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15450qv;
import X.C15480r5;
import X.C16150sX;
import X.C19110xm;
import X.C47132Hs;
import X.C49132Rg;
import X.C812447k;
import X.C82704Dv;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.obwhatsapp.R;

public class CompanionBootstrapActivity extends C14530pL {
    public ProgressBar A00;
    public AnonymousClass11W A01;
    public C15480r5 A02;
    public AnonymousClass1RE A03;
    public AnonymousClass1SS A04;
    public boolean A05;
    public final AnonymousClass28A A06;
    public final C82704Dv A07;

    public CompanionBootstrapActivity() {
        this(0);
        this.A06 = new AnonymousClass3oJ(this);
        this.A07 = new C82704Dv(this);
    }

    public CompanionBootstrapActivity(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 45);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r2 = A1T.A1s;
            C14550pN.A15(r2, this);
            C14530pL.A0b(A1T, r2, this, C14550pN.A0v(r2));
            this.A03 = (AnonymousClass1RE) r2.A4h.get();
            this.A01 = (AnonymousClass11W) r2.A4R.get();
            this.A02 = new C15480r5((C19110xm) A1T.A0E.get());
            this.A04 = (AnonymousClass1SS) r2.A4S.get();
        }
    }

    public final void A35(int i2) {
        boolean A052 = C15450qv.A05();
        ProgressBar progressBar = this.A00;
        if (A052) {
            progressBar.setProgress(i2, true);
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", new int[]{progressBar.getProgress(), i2});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C15480r5 r0 = this.A02;
        ((AnonymousClass1CB) r0.A00.A00(AnonymousClass1CB.class)).A06(this.A06);
        setContentView((int) R.layout.layout0117);
        if (this.A04.A00() == C47132Hs.PHONE) {
            ((ImageView) findViewById(R.id.header_image)).setImageResource(R.drawable.ic_linked_android_phone);
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_indicator);
        this.A00 = progressBar;
        C812447k.A00(progressBar, AnonymousClass00T.A00(this, R.color.color0659));
        A35((this.A01.A0A.get() * 100) / 3);
        this.A01.A02(this.A07);
    }

    public void onDestroy() {
        super.onDestroy();
        C15480r5 r0 = this.A02;
        ((AnonymousClass1CB) r0.A00.A00(AnonymousClass1CB.class)).A07(this.A06);
    }
}
