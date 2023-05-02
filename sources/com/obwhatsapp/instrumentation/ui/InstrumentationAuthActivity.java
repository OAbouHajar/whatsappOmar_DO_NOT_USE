package com.obwhatsapp.instrumentation.ui;

import X.AnonymousClass050;
import X.AnonymousClass10T;
import X.C108045Ml;
import X.C108055Mm;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C14770pj;
import X.C15890s4;
import X.C15910s6;
import X.C15940sA;
import X.C16020sI;
import X.C16150sX;
import X.C16980tz;
import X.C18900xR;
import X.C19090xk;
import X.C210712r;
import X.C46052Cd;
import X.C49132Rg;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import com.facebook.redex.IDxAListenerShape290S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.util.Log;

public class InstrumentationAuthActivity extends C14530pL implements C108045Ml, C108055Mm {
    public C18900xR A00;
    public C210712r A01;
    public C16980tz A02;
    public BiometricAuthPlugin A03;
    public C15890s4 A04;
    public ConfirmFragment A05;
    public PermissionsFragment A06;
    public C16020sI A07;
    public C15940sA A08;
    public AnonymousClass10T A09;
    public C19090xk A0A;
    public C14770pj A0B;
    public String A0C;
    public boolean A0D;

    public InstrumentationAuthActivity() {
        this(0);
    }

    public InstrumentationAuthActivity(int i2) {
        this.A0D = false;
        C13680ns.A1G(this, 79);
    }

    public void A1q() {
        if (!this.A0D) {
            this.A0D = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = (C18900xR) r1.ALD.get();
            this.A09 = (AnonymousClass10T) r1.AP9.get();
            this.A0A = (C19090xk) r1.AF1.get();
            this.A0B = (C14770pj) r1.AF9.get();
            this.A02 = C16150sX.A0V(r1);
            this.A01 = (C210712r) r1.A0V.get();
            this.A04 = (C15890s4) r1.ACZ.get();
            this.A08 = (C15940sA) r1.ACj.get();
            this.A07 = (C16020sI) r1.ACa.get();
        }
    }

    public final void A35(int i2) {
        if (i2 == -1 || i2 == 4) {
            AnonymousClass050 A0O = C13680ns.A0O(this);
            A0O.A0A(this.A05, R.id.fragment_container);
            A0O.A0I((String) null);
            A0O.A01();
        }
    }

    public final void A36(int i2, String str) {
        Intent A092 = C13680ns.A09();
        A092.putExtra("error_code", i2);
        A092.putExtra("error_message", str);
        setResult(0, A092);
        finish();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 12345) {
            A35(i3);
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        String A0h;
        super.onCreate(bundle);
        setTitle(R.string.str1ced);
        if (!this.A04.A00.A05(C15910s6.A11)) {
            i2 = 3;
            A0h = "Feature is disabled!";
        } else {
            ComponentName callingActivity = getCallingActivity();
            i2 = 8;
            if (callingActivity == null) {
                A0h = "Not started for result.";
            } else {
                String packageName = callingActivity.getPackageName();
                try {
                    if (this.A08.A01(packageName).A03) {
                        Intent intent = getIntent();
                        String str = null;
                        if (!(intent == null || getCallingPackage() == null)) {
                            str = intent.getStringExtra("request_token");
                        }
                        this.A0C = str;
                        if (!this.A09.A01(packageName, str)) {
                            Log.e("InstrumentationAuthActivity/onCreate no correct request token!");
                            i2 = 4;
                            A0h = "Request is not authorized!";
                        } else {
                            setContentView((int) R.layout.layout0355);
                            C14710pd r9 = this.A0C;
                            this.A03 = new BiometricAuthPlugin(this, this.A03, this.A05, this.A08, new IDxAListenerShape290S0100000_2_I1(this, 2), r9, R.string.str0c47, 0);
                            this.A06 = new PermissionsFragment();
                            this.A05 = new ConfirmFragment();
                            if (bundle == null) {
                                AnonymousClass050 A0O = C13680ns.A0O(this);
                                A0O.A09(this.A06, R.id.fragment_container);
                                A0O.A01();
                            }
                            if (this.A00.A03()) {
                                Log.w("InstrumentationAuthActivity/onCreate/clock-wrong");
                                C46052Cd.A02(this, this.A0A, this.A0B);
                            } else if (this.A00.A02()) {
                                Log.w("InstrumentationAuthActivity/onCreate/sw-expired");
                                C46052Cd.A03(this, this.A0A, this.A0B);
                            }
                            C14530pL.A0Y(this);
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                A0h = C13680ns.A0h("Untrusted caller: ", packageName);
            }
        }
        A36(i2, A0h);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.A05.A0c()) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass050 A0O = C13680ns.A0O(this);
        A0O.A0A(this.A06, R.id.fragment_container);
        A0O.A01();
        return true;
    }

    public void onResume() {
        super.onResume();
        AnonymousClass050 A0O = C13680ns.A0O(this);
        A0O.A0A(this.A06, R.id.fragment_container);
        A0O.A01();
    }
}
