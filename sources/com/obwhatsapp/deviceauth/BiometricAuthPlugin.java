package com.obwhatsapp.deviceauth;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass0Q8;
import X.AnonymousClass0V2;
import X.AnonymousClass5PX;
import X.C001000l;
import X.C05030Oy;
import X.C05240Pv;
import X.C07080Zb;
import X.C14710pd;
import X.C14870pt;
import X.C16300so;
import X.C16620tM;
import X.C57042px;
import android.app.KeyguardManager;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import com.facebook.redex.IDxAListenerShape289S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.util.Log;

public class BiometricAuthPlugin extends DeviceAuthenticationPlugin {
    public AnonymousClass0V2 A00;
    public C05030Oy A01;
    public AnonymousClass0Q8 A02;
    public final int A03;
    public final int A04;
    public final C001000l A05;
    public final C16300so A06;
    public final C14870pt A07;
    public final AnonymousClass01V A08;
    public final AnonymousClass5PX A09;
    public final DeviceCredentialsAuthPlugin A0A;
    public final C14710pd A0B;

    public BiometricAuthPlugin(C001000l r7, C16300so r8, C14870pt r9, AnonymousClass01V r10, AnonymousClass5PX r11, C14710pd r12, int i2, int i3) {
        this.A0B = r12;
        this.A07 = r9;
        this.A06 = r8;
        this.A08 = r10;
        this.A05 = r7;
        this.A04 = i2;
        this.A03 = i3;
        this.A09 = r11;
        this.A0A = new DeviceCredentialsAuthPlugin(r7, r8, r10, r11, i2);
        r7.A06.A00(this);
    }

    public void A00() {
        C001000l r5 = this.A05;
        this.A02 = new AnonymousClass0Q8(new C57042px(this.A06, new IDxAListenerShape289S0100000_2_I0(this, 1), "BiometricAuthPlugin"), r5, AnonymousClass00T.A08(r5));
        C05240Pv r1 = new C05240Pv();
        r1.A03 = r5.getString(this.A04);
        int i2 = this.A03;
        r1.A02 = i2 != 0 ? r5.getString(i2) : null;
        r1.A00 = 33023;
        r1.A04 = false;
        this.A01 = r1.A00();
    }

    public boolean A01() {
        return Build.VERSION.SDK_INT >= 23 && this.A0B.A0E(C16620tM.A02, 482) && A04() && A05();
    }

    public void A02() {
        if (this.A02 == null || this.A01 == null) {
            throw new IllegalStateException("BiometricAuthPlugin/authenticate: No prompt created. Have you checked if you can authenticate?");
        }
        Log.i("BiometricAuthPlugin/authentication-attempt");
        this.A02.A01(this.A01);
    }

    public final void A03(int i2) {
        if (Build.VERSION.SDK_INT != 29 && (i2 == 2 || i2 == 3)) {
            AnonymousClass0Q8 r0 = this.A02;
            AnonymousClass00B.A06(r0);
            r0.A00();
            this.A07.A0L(new RunnableRunnableShape9S0100000_I0_8(this.A0A, 0), 200);
        } else if (i2 == 2) {
            this.A09.AMw(4);
        } else {
            this.A09.AMw(i2);
        }
    }

    public final boolean A04() {
        AnonymousClass0V2 r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass0V2(new C07080Zb(this.A05));
            this.A00 = r1;
        }
        return r1.A03(MotionEventCompat.ACTION_MASK) == 0;
    }

    public final boolean A05() {
        String str;
        KeyguardManager A072 = this.A08.A07();
        if (A072 == null || !A072.isDeviceSecure()) {
            str = "BiometricAuthPlugin/NoDeviceCredentials";
        } else if (this.A0A.A01()) {
            return true;
        } else {
            str = "BiometricAuthPlugin/CannotAuthenticateWithDeviceCredentials";
        }
        Log.i(str);
        return false;
    }
}
