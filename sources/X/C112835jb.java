package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.redex.IDxCListenerShape30S0200000_3_I1;
import com.facebook.redex.IDxComparatorShape21S0000000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.obwhatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5jb  reason: invalid class name and case insensitive filesystem */
public abstract class C112835jb extends AnonymousClass5k8 implements C1222568w {
    public AnonymousClass173 A00;
    public AnonymousClass2HJ A01;
    public AnonymousClass4XO A02;
    public C112295iG A03;
    public C1200960h A04;
    public C113285ln A05;
    public boolean A06 = false;
    public final AnonymousClass1Vo A07 = C110115dX.A0S("IndiaUpiPaymentBankSetupActivity");

    public static boolean A02(C111775hO r3, AnonymousClass60V r4, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return ((C111805hR) arrayList.get(0)).A00 <= 1 || !TextUtils.isEmpty(r4.A08()) || !(arrayList2 == null || arrayList2.size() <= 0 || r3 == null);
    }

    public final void A3S() {
        ArrayList arrayList;
        boolean A0C = this.A0C.A0C(2746);
        boolean z2 = false;
        AnonymousClass60V r3 = this.A0C;
        if (!A0C) {
            C119365wy r0 = this.A0B;
            if (!A02(r0.A03, r3, r0.A05, r0.A07)) {
                return;
            }
            arrayList = this.A0B.A05;
        } else if (r3.A0P() || this.A0I.A0E()) {
            AnonymousClass60V r32 = this.A0C;
            C119365wy r02 = this.A0B;
            if (!A02(r02.A03, r32, r02.A05, r02.A07)) {
                AnonymousClass60V r33 = this.A0C;
                C119365wy r03 = this.A0B;
                if (A02(r03.A03, r33, r03.A06, r03.A07)) {
                    arrayList = this.A0B.A06;
                    z2 = true;
                } else {
                    return;
                }
            }
            arrayList = this.A0B.A05;
        } else {
            return;
        }
        A3V(arrayList, z2);
    }

    public final void A3T(AnonymousClass2HJ r7, boolean z2) {
        int i2;
        String str = z2 ? "upi-batch" : "upi-get-banks";
        if (!C1200960h.A02(this, str, r7.A00, false)) {
            AnonymousClass1Vo r4 = this.A07;
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(" failed with error: ");
            A0q.append(r7);
            r4.A06(AnonymousClass000.A0h("; showErrorAndFinish", A0q));
            int i3 = r7.A00;
            if (i3 == 21129) {
                AnonymousClass64I r5 = new AnonymousClass64I(this);
                C32241fu A002 = C32241fu.A00(this);
                A002.A02(R.string.str18df);
                A002.A01(R.string.str18de);
                A002.setPositiveButton(R.string.str0e87, new IDxCListenerShape30S0200000_3_I1(r5, 8, this));
                A002.A07(false);
                A002.A00();
                return;
            }
            C119265wo A042 = this.A04.A04(this.A02, i3);
            C111345g2.A1z(this.A05, 3);
            StringBuilder A0r = AnonymousClass000.A0r("showErrorAndFinish: ");
            A0r.append(A042.A00);
            C110105dW.A1L(r4, A0r);
            A3I();
            if (A042.A00 == 0) {
                A042.A00 = R.string.str10f2;
                String str2 = this.A02.A04;
                if ("upi-batch".equalsIgnoreCase(str2)) {
                    i2 = R.string.str1025;
                } else if ("upi-get-banks".equalsIgnoreCase(str2)) {
                    i2 = R.string.str1024;
                }
                A042.A00 = i2;
            }
            if (this.A0R) {
                A3H();
                Intent A043 = C110105dW.A04(this, IndiaUpiOnboardingErrorEducationActivity.class);
                if (A042.A01 != null) {
                    A043.putExtra("error_text", A042.A01(this));
                }
                A043.putExtra("error", A042.A00);
                A3M(A043);
                A2X(A043, true);
                return;
            }
            C111345g2.A1i(this, A042);
        }
    }

    public final void A3U(AnonymousClass2HJ r4, boolean z2) {
        AnonymousClass61W r1 = this.A0E;
        int i2 = 4;
        if (z2) {
            i2 = 3;
        }
        C53842gO A022 = r1.A02(r4, i2);
        A022.A0X = this.A0L;
        A022.A0a = "nav_bank_select";
        A022.A0Z = this.A0O;
        C111345g2.A1s(A022, this);
        this.A07.A06(AnonymousClass000.A0g("logBanksList: ", A022));
    }

    public void A3V(List list, boolean z2) {
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) this;
        int i2 = 0;
        if (list.isEmpty() || z2) {
            int i3 = 0;
            do {
                indiaUpiBankPickerActivity.A01.addView(View.inflate(indiaUpiBankPickerActivity, R.layout.layout032e, (ViewGroup) null), new LinearLayout.LayoutParams(-1, -2));
                i3++;
            } while (i3 < 25);
            indiaUpiBankPickerActivity.A02.setVisibility(8);
            indiaUpiBankPickerActivity.A03.setVisibility(8);
            indiaUpiBankPickerActivity.A04.setVisibility(0);
            indiaUpiBankPickerActivity.A04.A01();
            View view = indiaUpiBankPickerActivity.A00;
            if (z2) {
                view.setVisibility(0);
                C110855ew r0 = indiaUpiBankPickerActivity.A0A;
                r0.A00 = list;
                r0.A01();
                indiaUpiBankPickerActivity.A05.setVisibility(8);
                indiaUpiBankPickerActivity.A05.A00();
                return;
            }
            view.setVisibility(8);
            indiaUpiBankPickerActivity.A05.setVisibility(0);
            indiaUpiBankPickerActivity.A05.A01();
            return;
        }
        indiaUpiBankPickerActivity.A00.setVisibility(0);
        indiaUpiBankPickerActivity.A03.setVisibility(0);
        indiaUpiBankPickerActivity.A05.setVisibility(8);
        indiaUpiBankPickerActivity.A04.setVisibility(8);
        indiaUpiBankPickerActivity.A02.setVisibility(8);
        indiaUpiBankPickerActivity.A05.A02();
        indiaUpiBankPickerActivity.A04.A02();
        indiaUpiBankPickerActivity.A01.removeAllViews();
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C111805hR r1 = (C111805hR) it.next();
            if (r1.A0I) {
                A0u.add(r1);
            }
        }
        ArrayList A0u2 = AnonymousClass000.A0u();
        Character ch = null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C39911tG r4 = (C39911tG) it2.next();
            String A0A = r4.A0A();
            AnonymousClass00B.A05(A0A);
            char charAt = A0A.charAt(0);
            if (ch == null || ch.charValue() != charAt) {
                ch = Character.valueOf(charAt);
                A0u2.add(ch.toString());
            }
            A0u2.add(r4);
        }
        AnonymousClass01Q r12 = new AnonymousClass01Q(A0u, A0u2);
        indiaUpiBankPickerActivity.A0G = (List) r12.A00;
        List list2 = (List) r12.A01;
        indiaUpiBankPickerActivity.A0H = list2;
        C110855ew r02 = indiaUpiBankPickerActivity.A0B;
        r02.A00 = list2;
        r02.A01();
        if (indiaUpiBankPickerActivity.A0A.A00.size() != indiaUpiBankPickerActivity.A0G.size()) {
            C110855ew r13 = indiaUpiBankPickerActivity.A0A;
            r13.A00 = indiaUpiBankPickerActivity.A0G;
            r13.A01();
        }
        View view2 = indiaUpiBankPickerActivity.A00;
        if (indiaUpiBankPickerActivity.A0G.isEmpty()) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        indiaUpiBankPickerActivity.A05.A00.A09("bankPickerShown");
    }

    public void ANU(AnonymousClass2HJ r3, boolean z2, boolean z3, boolean z4) {
        if (this.A0C.A0C(2746)) {
            if (z3) {
                z3 = true;
            } else if (z4) {
                return;
            } else {
                if (this.A01 == null) {
                    this.A01 = r3;
                    this.A06 = false;
                    return;
                }
                if (!z2) {
                    this.A0C.A0O(false);
                }
                A3U(r3, false);
                if (!this.A0T) {
                    A3T(r3, false);
                    return;
                }
                this.A06 = false;
                this.A01 = r3;
            }
        }
        if (!z2 && !z3) {
            this.A0C.A0O(false);
        }
        A3U(r3, z3);
        if (!this.A0T) {
            A3T(r3, z3);
            return;
        }
        this.A06 = z3;
        this.A01 = r3;
    }

    public void ANV(C111775hO r5, ArrayList arrayList, ArrayList arrayList2, boolean z2, boolean z3, boolean z4) {
        C119365wy r3;
        ArrayList arrayList3;
        if (this.A0C.A0C(2746)) {
            if (z2) {
                this.A0C.A0O(true);
                PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0X;
                if (paymentIncentiveViewModel != null) {
                    paymentIncentiveViewModel.A07.Acl(new C1212864x(paymentIncentiveViewModel));
                }
            }
            if (A02(r5, this.A0C, arrayList, arrayList2)) {
                r3 = this.A0B;
                arrayList3 = C13680ns.A0n(arrayList);
                Collections.sort(arrayList3, new IDxComparatorShape21S0000000_3_I1(0));
                if (z3) {
                    r3.A06 = arrayList3;
                }
                r3.A05 = arrayList3;
                Log.i(AnonymousClass000.A0g("PAY: IndiaUpiPaymentSetup#setBanksList got banks: ", arrayList3));
            }
            this.A07.A05("Invalid Banks Data, throwing error");
            ANU(C110115dX.A0N(), false, z2, z4);
            return;
        }
        if (z2) {
            this.A0C.A0O(true);
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0X;
            if (paymentIncentiveViewModel2 != null) {
                paymentIncentiveViewModel2.A07.Acl(new C1212864x(paymentIncentiveViewModel2));
            }
        }
        if (A02(r5, this.A0C, arrayList, arrayList2)) {
            r3 = this.A0B;
            arrayList3 = C13680ns.A0n(arrayList);
            Collections.sort(arrayList3, new IDxComparatorShape21S0000000_3_I1(0));
            r3.A05 = arrayList3;
            Log.i(AnonymousClass000.A0g("PAY: IndiaUpiPaymentSetup#setBanksList got banks: ", arrayList3));
        }
        this.A07.A05("Invalid Banks Data, throwing error");
        ANU(C110115dX.A0N(), false, z2, z4);
        return;
        C119365wy r0 = this.A0B;
        r0.A07 = arrayList2;
        r0.A03 = r5;
        Log.i(AnonymousClass000.A0g("PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: ", arrayList2));
        Log.i(AnonymousClass000.A0g("PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: ", r5));
        AnonymousClass1Vo r2 = this.A07;
        StringBuilder A0r = AnonymousClass000.A0r("banks returned: ");
        A0r.append(arrayList.size());
        C110105dW.A1L(r2, A0r);
        A3U((AnonymousClass2HJ) null, z2);
        if (!this.A0T) {
            A3S();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        AnonymousClass1Vo r2 = this.A07;
        StringBuilder A0r = AnonymousClass000.A0r("onActivityResult: request: ");
        A0r.append(i2);
        A0r.append(" result: ");
        r2.A0A(AnonymousClass000.A0l(A0r, i3), (Throwable) null);
        if (i2 != 1000) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 != -1) {
            A3H();
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = this.A0B.A04;
        this.A0X = C110105dW.A0R(this);
        C14710pd r4 = this.A0C;
        C14870pt r2 = this.A05;
        C17190ug r5 = this.A0H;
        C18290wS r9 = this.A0P;
        this.A03 = new C112295iG(this, r2, this.A00, r4, r5, this.A0B, this.A0K, this.A0M, r9, this, this.A0E, this.A0F);
        onConfigurationChanged(C13700nu.A03(this));
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.A00 = null;
    }

    public void onResume() {
        super.onResume();
        if (!isFinishing()) {
            AnonymousClass1Vo r2 = this.A07;
            StringBuilder A0r = AnonymousClass000.A0r("bank setup onResume states: ");
            A0r.append(this.A02);
            C110105dW.A1L(r2, A0r);
            if (!this.A0C.A0C(2746)) {
                ArrayList arrayList = this.A0B.A05;
                if (arrayList == null) {
                    if (!this.A0C.A0P() && !this.A0I.A0E()) {
                        this.A03.A00(false);
                    }
                    this.A03.A01(false, false);
                } else {
                    A3V(arrayList, false);
                    return;
                }
            } else if (this.A0C.A0P() || this.A0I.A0E()) {
                C119365wy r22 = this.A0B;
                ArrayList arrayList2 = r22.A05;
                if (arrayList2 != null) {
                    A3V(arrayList2, false);
                } else {
                    ArrayList arrayList3 = r22.A06;
                    if (arrayList3 != null) {
                        A3V(arrayList3, true);
                    } else {
                        this.A03.A01(true, false);
                    }
                    this.A03.A01(false, false);
                }
            } else {
                this.A03.A00(true);
                if (this.A0B.A05 == null) {
                    this.A03.A01(false, true);
                }
            }
            this.A0E.AgB();
        }
    }
}
