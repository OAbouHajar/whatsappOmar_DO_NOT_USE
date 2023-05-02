package com.obwhatsapp.deviceauth;

import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass0Q8;
import X.AnonymousClass0V2;
import X.AnonymousClass5PX;
import X.C001000l;
import X.C05030Oy;
import X.C05240Pv;
import X.C05340Qi;
import X.C07080Zb;
import X.C16300so;
import X.C57042px;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import com.obwhatsapp.yo.autoschedreply.Receiver;
import com.whatsapp.util.Log;

public class DeviceCredentialsAuthPlugin extends DeviceAuthenticationPlugin {
    public AnonymousClass0V2 A00;
    public C05030Oy A01;
    public AnonymousClass0Q8 A02;
    public final int A03;
    public final C05340Qi A04;
    public final C001000l A05;
    public final AnonymousClass01V A06;

    public DeviceCredentialsAuthPlugin(C001000l r3, C16300so r4, AnonymousClass01V r5, AnonymousClass5PX r6, int i2) {
        this.A06 = r5;
        this.A05 = r3;
        this.A03 = i2;
        this.A04 = new C57042px(r4, r6, "DeviceCredentialsAuthPlugin");
        r3.A06.A00(this);
    }

    public void A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            C001000l r3 = this.A05;
            this.A02 = new AnonymousClass0Q8(this.A04, r3, AnonymousClass00T.A08(r3));
            this.A01 = A02();
        }
    }

    public boolean A01() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 || !A06()) {
            return false;
        }
        if (i2 >= 30) {
            return A05();
        }
        if (i2 == 29) {
            return this.A06.A0T("android.software.secure_lock_screen");
        }
        return true;
    }

    public final C05030Oy A02() {
        C05240Pv r2 = new C05240Pv();
        r2.A03 = this.A05.getString(this.A03);
        r2.A00 = 32768;
        return r2.A00();
    }

    public void A03() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            throw new IllegalStateException("DeviceCredentialsAuthPlugin/authenticate: SDK must be 23 or higher. Have you checked if you can authenticate?");
        } else if (i2 >= 30) {
            A04();
        } else {
            KeyguardManager A07 = this.A06.A07();
            if (A07 != null) {
                C001000l r2 = this.A05;
                Intent createConfirmDeviceCredentialIntent = A07.createConfirmDeviceCredentialIntent(r2.getString(this.A03), "");
                Log.i("DeviceCredentialsAuthPlugin/authentication-attempt-API29AndBelow");
                r2.startActivityForResult(createConfirmDeviceCredentialIntent, Receiver.REQUEST_CODE);
                return;
            }
            throw new IllegalStateException("DeviceCredentialsManager/authenticate: Cannot get KeyguardManager. Have you checked if you can authenticate?");
        }
    }

    public final void A04() {
        if (this.A02 == null || this.A01 == null) {
            throw new IllegalStateException("DeviceCredentialsAuthPlugin/authenticate: No prompt created. Have you checked if you can authenticate?");
        }
        Log.i("DeviceCredentialsAuthPlugin/authentication-attempt-API30AndAbove");
        this.A02.A01(this.A01);
    }

    public final boolean A05() {
        AnonymousClass0V2 r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass0V2(new C07080Zb(this.A05));
            this.A00 = r1;
        }
        return r1.A03(32768) == 0;
    }

    public final boolean A06() {
        KeyguardManager A07 = this.A06.A07();
        return A07 != null && A07.isDeviceSecure();
    }
}
