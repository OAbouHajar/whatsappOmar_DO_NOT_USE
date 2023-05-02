package com.obwhatsapp.registration.accountdefence;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass12L;
import X.AnonymousClass130;
import X.AnonymousClass1BN;
import X.AnonymousClass1KQ;
import X.AnonymousClass2JN;
import X.AnonymousClass39H;
import X.C003401n;
import X.C003501o;
import X.C011405n;
import X.C1033751d;
import X.C15860rz;
import X.C15960sC;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C17130ua;
import X.C17220uj;
import X.C18990xa;
import X.C19380yL;
import X.C19760yx;
import X.C19950zG;
import X.C26841Pl;
import X.C30801cy;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.whatsapp.util.Log;

public class NewDeviceConfirmationRegistrationViewModel extends C003401n implements C003501o {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C16440t3 A05;
    public final C16980tz A06;
    public final C19380yL A07;
    public final C15860rz A08;
    public final C18990xa A09;
    public final AnonymousClass39H A0A;
    public final C19760yx A0B;
    public final C15960sC A0C;
    public final AnonymousClass12L A0D;
    public final C26841Pl A0E;
    public final AnonymousClass1BN A0F;
    public final AnonymousClass130 A0G;
    public final C30801cy A0H = new C30801cy();
    public final C30801cy A0I = new C30801cy();
    public final C16320sq A0J;

    public NewDeviceConfirmationRegistrationViewModel(C17130ua r8, C16440t3 r9, C16980tz r10, C19380yL r11, C15860rz r12, AnonymousClass013 r13, AnonymousClass1KQ r14, C19950zG r15, C18990xa r16, C19760yx r17, C15960sC r18, AnonymousClass12L r19, C26841Pl r20, AnonymousClass1BN r21, AnonymousClass130 r22, C17220uj r23, C16320sq r24) {
        this.A05 = r9;
        this.A06 = r10;
        C16320sq r6 = r24;
        this.A0J = r6;
        this.A0E = r20;
        this.A0F = r21;
        this.A09 = r16;
        this.A0B = r17;
        this.A08 = r12;
        this.A0D = r19;
        this.A07 = r11;
        this.A0G = r22;
        this.A0C = r18;
        this.A0A = new AnonymousClass39H(r8, r13, r14, r15, r23, r6);
    }

    public void A05() {
        C30801cy r1;
        int i2;
        Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration");
        this.A0E.A00();
        if (this.A03) {
            Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration/changenumber");
            C19760yx r12 = this.A0B;
            r12.A0A(3);
            r12.A0E();
            r1 = this.A0I;
            i2 = 5;
        } else {
            Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration/resetting registration");
            this.A0B.A08();
            r1 = this.A0I;
            i2 = 6;
        }
        r1.A09(Integer.valueOf(i2));
    }

    public final void A06() {
        this.A0B.A0A(7);
        this.A0F.A04("device_confirm", "successful");
        this.A0I.A09(3);
    }

    public final void A07(String str, String str2, String str3, boolean z2) {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onRegistrationVerified");
        this.A08.A1L(z2);
        C19760yx r3 = this.A0B;
        r3.A0C(str, str2, str3);
        if (this.A03) {
            r3.A0D();
            this.A0I.A09(1);
            return;
        }
        this.A0F.A04("device_confirm", "successful");
        r3.A0A(2);
        this.A09.A04(false);
        if (this.A02) {
            this.A0H.A09(8);
            this.A0J.Ad4(new RunnableRunnableShape13S0100000_I0_12((Object) this, 48), "navigate-to-registration-verified-flow", 1000);
            return;
        }
        AnonymousClass2JN.A0G(this.A06.A01(), this.A07, r3, this.A03);
    }

    @OnLifecycleEvent(C011405n.ON_PAUSE)
    public void onActivityPaused() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecyclePause");
        this.A02 = false;
        this.A0E.A01();
    }

    @OnLifecycleEvent(C011405n.ON_RESUME)
    public void onActivityResumed() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecycleResume");
        this.A02 = true;
        C26841Pl r3 = this.A0E;
        String str = this.A00;
        AnonymousClass00B.A06(str);
        String str2 = this.A01;
        AnonymousClass00B.A06(str2);
        r3.A02(new C1033751d(this), str, str2);
    }

    @OnLifecycleEvent(C011405n.ON_START)
    public void onActivityStarted() {
        this.A0F.A01("device_confirm");
    }

    @OnLifecycleEvent(C011405n.ON_STOP)
    public void onActivityStopped() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecycleStop");
        this.A0A.A00();
    }
}
