package com.obwhatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass1DX;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16900tq;
import X.C17270uo;
import X.C23651Cv;
import X.C27661Sq;
import X.C49132Rg;
import X.C50412Zj;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class LauncherCameraActivity extends CameraActivity {
    public boolean A00;

    public LauncherCameraActivity() {
        this(0);
    }

    public LauncherCameraActivity(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 35);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r2 = A1T.A1s;
            C14550pN.A15(r2, this);
            C14530pL.A0b(A1T, r2, this, C14550pN.A0v(r2));
            this.A01 = (C23651Cv) r2.A1k.get();
            this.A06 = (C27661Sq) r2.AAP.get();
            this.A03 = (C50412Zj) A1T.A0A.get();
            this.A09 = A1T.A0d();
            this.A08 = (AnonymousClass1DX) r2.A3R.get();
            this.A07 = (WhatsAppLibLoader) r2.AR7.get();
            this.A05 = (C16900tq) r2.AFT.get();
            this.A04 = C16150sX.A0X(r2);
            this.A0D = AnonymousClass000.A1X(r2.AJx.get());
            this.A0A = C17270uo.A00(A1T.A1e);
        }
    }
}
