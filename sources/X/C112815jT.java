package X;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;
import com.whatsapp.util.IDxATaskShape109S0100000_3_I1;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.5jT  reason: invalid class name and case insensitive filesystem */
public abstract class C112815jT extends AnonymousClass5ke implements C1222868z, AnonymousClass68R {
    public C35521m4 A00;
    public C112305iH A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final BroadcastReceiver A06 = new C110145da(this);
    public final AnonymousClass1Vo A07 = C110105dW.A0P("IndiaUpiBaseResetPinActivity");

    public static void A02(C112815jT r3) {
        Intent intent = new Intent();
        intent.putExtra("extra_bank_account", r3.A00);
        r3.setResult(-1, intent);
    }

    public void A2S(int i2) {
        if (i2 == R.string.str10df) {
            A3H();
            A02(this);
        } else {
            A3H();
        }
        finish();
    }

    public void A3a() {
        super.A3a();
        AhY(getString(R.string.str1179));
    }

    public void A3e() {
        Afq(R.string.str1179);
        super.A3e();
    }

    public final void A3j(C119265wo r4) {
        Ac1();
        if (r4.A00 == 0) {
            r4.A00 = R.string.str10d9;
        }
        if (this.A0R) {
            A3H();
            Intent A042 = C110105dW.A04(this, IndiaUpiOnboardingErrorEducationActivity.class);
            if (AnonymousClass000.A1V(r4.A01)) {
                A042.putExtra("error", r4.A01(this));
            }
            A042.putExtra("error", r4.A00);
            A3M(A042);
            A2X(A042, true);
            return;
        }
        Afh(r4.A01(this));
    }

    public void ASh(AnonymousClass2HJ r5, String str) {
        C35521m4 r0;
        C39901tF r1;
        this.A0E.A05(this.A00, r5, 1);
        if (!TextUtils.isEmpty(str) && (r0 = this.A00) != null && (r1 = r0.A08) != null) {
            this.A01.A01((C111805hR) r1, this);
        } else if (r5 != null && !C1200960h.A02(this, "upi-list-keys", r5.A00, true)) {
            if (this.A06.A07("upi-list-keys")) {
                this.A0C.A0E();
                this.A0A.A00();
                return;
            }
            AnonymousClass1Vo r3 = this.A07;
            StringBuilder A0r = AnonymousClass000.A0r("onListKeys: ");
            C39901tF r12 = null;
            A0r.append(str != null ? Integer.valueOf(str.length()) : null);
            A0r.append(" bankAccount: ");
            A0r.append(this.A00);
            A0r.append(" countrydata: ");
            C35521m4 r02 = this.A00;
            if (r02 != null) {
                r12 = r02.A08;
            }
            A0r.append(r12);
            r3.A06(AnonymousClass000.A0h(" failed; ; showErrorAndFinish", A0r));
            A3b();
        }
    }

    public void AWD(AnonymousClass2HJ r11) {
        this.A0E.A05(this.A00, r11, 16);
        if (r11 == null) {
            this.A05 = C111345g2.A1b(this);
            this.A06.A03("upi-get-credential");
            Ac1();
            String A0C = this.A0C.A0C();
            C35521m4 r0 = this.A00;
            A3g((C111805hR) r0.A08, A0C, r0.A0B, this.A05, (String) C110105dW.A0d(r0.A09), 1);
        } else if (!C1200960h.A02(this, "upi-generate-otp", r11.A00, true)) {
            this.A07.A06("onRequestOtp failed; showErrorAndFinish");
            A3j(new C119265wo(R.string.str10dc));
        }
    }

    public void AX5(AnonymousClass2HJ r5) {
        int i2;
        this.A0E.A05(this.A00, r5, 6);
        if (r5 == null) {
            this.A07.A06("onSetPin success; showSuccessAndFinish");
            C13680ns.A1U(new IDxATaskShape109S0100000_3_I1(this, 1), this.A05);
            return;
        }
        Ac1();
        if (!C1200960h.A02(this, "upi-set-mpin", r5.A00, true)) {
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("error_code", r5.A00);
            C35521m4 r0 = this.A00;
            if (!(r0 == null || r0.A08 == null)) {
                int i3 = r5.A00;
                if (i3 == 11460 || i3 == 11461) {
                    i2 = 14;
                } else if (i3 == 11456 || i3 == 11471) {
                    i2 = 13;
                } else if (i3 == 11458 || i3 == 11457) {
                    i2 = 17;
                } else {
                    i2 = 10;
                    if (i3 != 11459) {
                        i2 = 16;
                        if (i3 != 11496) {
                            if (i3 == 11499) {
                                i2 = 23;
                            } else {
                                this.A07.A06("onSetPin failed; showErrorAndFinish");
                            }
                        }
                    }
                }
                AnonymousClass29T.A02(this, A0D, i2);
                return;
            }
            A3b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14710pd r16 = this.A0C;
        C16040sK r15 = this.A01;
        C17190ug r14 = this.A0H;
        C18280wR r13 = this.A0C;
        C18290wS r12 = this.A0P;
        AnonymousClass175 r10 = this.A0I;
        C119365wy r9 = this.A0B;
        C18310wU r8 = this.A0M;
        C118805vH r7 = this.A08;
        AnonymousClass173 r6 = this.A02;
        AnonymousClass61W r5 = this.A0E;
        C18260wP r4 = this.A07;
        C18340wX r3 = this.A0K;
        C18280wR r29 = r13;
        C18310wU r24 = r8;
        C18290wS r25 = r12;
        AnonymousClass175 r22 = r10;
        C18340wX r23 = r3;
        C119365wy r20 = r9;
        AnonymousClass60V r21 = this.A0C;
        C14710pd r18 = r16;
        C17190ug r19 = r14;
        C18260wP r162 = r4;
        AnonymousClass173 r17 = r6;
        C14870pt r142 = this.A05;
        this.A01 = new C112305iH(this, r142, r15, r162, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r5, this.A0F, r29);
        C06450Vz A002 = C06450Vz.A00(getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.A06;
        IntentFilter intentFilter = new IntentFilter("TRIGGER_OTP");
        HashMap hashMap = A002.A04;
        synchronized (hashMap) {
            C05120Pj r52 = new C05120Pj(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) hashMap.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = C13690nt.A0i(1);
                hashMap.put(broadcastReceiver, arrayList);
            }
            arrayList.add(r52);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                HashMap hashMap2 = A002.A03;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = C13690nt.A0i(1);
                    hashMap2.put(action, arrayList2);
                }
                arrayList2.add(r52);
            }
        }
    }

    public Dialog onCreateDialog(int i2) {
        return onCreateDialog(i2, (Bundle) null);
    }

    public Dialog onCreateDialog(int i2, Bundle bundle) {
        if (i2 == 10) {
            return A3T(new AnonymousClass65W(this, this.A0C.A0C()), this.A03.A01(bundle, getString(R.string.str10db)), 10, R.string.str1ba6, R.string.str0de3);
        } else if (i2 == 23) {
            return A3T(new AnonymousClass640(this), this.A03.A01(bundle, getString(R.string.str10da)), 23, R.string.str1161, R.string.str0394);
        } else if (i2 == 13) {
            this.A0C.A0F();
            return A3T(new AnonymousClass641(this), this.A03.A01(bundle, getString(R.string.str10de)), 13, R.string.str1ba6, R.string.str0de3);
        } else if (i2 == 14) {
            return A3T(new AnonymousClass642(this), this.A03.A01(bundle, getString(R.string.str10dd)), 14, R.string.str1161, R.string.str0394);
        } else if (i2 != 16) {
            return i2 != 17 ? super.onCreateDialog(i2) : A3T((Runnable) null, this.A03.A01(bundle, C13680ns.A0d(this, 6, C13680ns.A1b(), 0, R.string.str1003)), 17, R.string.str1161, R.string.str0394);
        } else {
            return A3T(new AnonymousClass643(this), this.A03.A01(bundle, getString(R.string.str10d8)), 16, R.string.str1161, R.string.str0394);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C06450Vz A002 = C06450Vz.A00(getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.A06;
        HashMap hashMap = A002.A04;
        synchronized (hashMap) {
            ArrayList arrayList = (ArrayList) hashMap.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C05120Pj r7 = (C05120Pj) arrayList.get(size);
                    r7.A01 = true;
                    for (int i2 = 0; i2 < r7.A03.countActions(); i2++) {
                        String action = r7.A03.getAction(i2);
                        HashMap hashMap2 = A002.A03;
                        ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C05120Pj r1 = (C05120Pj) arrayList2.get(size2);
                                if (r1.A02 == broadcastReceiver) {
                                    r1.A01 = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                hashMap2.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0R = bundle.getBoolean("inSetupSavedInst");
        C35521m4 r0 = (C35521m4) bundle.getParcelable("bankAccountSavedInst");
        if (r0 != null) {
            this.A00 = r0;
            this.A00.A08 = (C39901tF) bundle.getParcelable("countryDataSavedInst");
        }
        if (bundle.containsKey("debitLast6SavedInst")) {
            this.A04 = bundle.getString("debitLast6SavedInst");
        }
        if (bundle.containsKey("debitExpiryMonthSavedInst")) {
            this.A02 = bundle.getString("debitExpiryMonthSavedInst");
        }
        if (bundle.containsKey("debitExpiryYearSavedInst")) {
            this.A03 = bundle.getString("debitExpiryYearSavedInst");
        }
        if (bundle.containsKey("seqNumSavedInst")) {
            this.A05 = bundle.getString("seqNumSavedInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C39901tF r1;
        super.onSaveInstanceState(bundle);
        if (this.A0R) {
            bundle.putBoolean("inSetupSavedInst", true);
        }
        C35521m4 r12 = this.A00;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        C35521m4 r0 = this.A00;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A04;
        if (str != null) {
            bundle.putString("debitLast6SavedInst", str);
        }
        String str2 = this.A02;
        if (str2 != null) {
            bundle.putString("debitExpiryMonthSavedInst", str2);
        }
        String str3 = this.A03;
        if (str3 != null) {
            bundle.putString("debitExpiryYearSavedInst", str3);
        }
        String str4 = this.A05;
        if (str4 != null) {
            bundle.putString("seqNumSavedInst", str4);
        }
    }
}
