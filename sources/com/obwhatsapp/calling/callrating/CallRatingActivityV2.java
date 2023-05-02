package com.obwhatsapp.calling.callrating;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1DV;
import X.AnonymousClass1OL;
import X.AnonymousClass2BO;
import X.AnonymousClass5DV;
import X.AnonymousClass5DW;
import X.AnonymousClass5DX;
import X.C008703y;
import X.C11010i3;
import X.C11360ie;
import X.C13680ns;
import X.C13690nt;
import X.C14570pP;
import X.C15220qW;
import X.C82544Df;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.HashSet;
import java.util.Iterator;

public class CallRatingActivityV2 extends C14570pP {
    public final C15220qW A00 = new AnonymousClass1DV(new AnonymousClass5DV(this));
    public final C15220qW A01 = new C11010i3(new AnonymousClass5DX(this), new AnonymousClass5DW(this), new C11360ie(), new AnonymousClass2BO(CallRatingViewModel.class));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A0E = C13690nt.A0E(this);
        if (A0E == null || !((CallRatingViewModel) this.A01.getValue()).A06(A0E)) {
            finish();
        }
        ((DialogFragment) this.A00.getValue()).A1G(AGM(), "CallRatingBottomSheet");
        C13680ns.A1L(this, ((CallRatingViewModel) this.A01.getValue()).A08, 48);
    }

    public void onStop() {
        super.onStop();
        if (!isChangingConfigurations()) {
            CallRatingViewModel callRatingViewModel = (CallRatingViewModel) this.A01.getValue();
            WamCall wamCall = callRatingViewModel.A04;
            if (wamCall != null) {
                HashSet hashSet = callRatingViewModel.A0E;
                boolean z2 = true;
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int A0D = AnonymousClass000.A0D(it.next());
                        C82544Df r2 = callRatingViewModel.A0B;
                        boolean z3 = false;
                        if (A0D <= 51) {
                            z3 = true;
                        }
                        AnonymousClass00B.A0C("MAX_PERMISSIBLE_INDEX to set is 51", z3);
                        r2.A00 |= 1 << A0D;
                    }
                    WamCall wamCall2 = callRatingViewModel.A04;
                    if (wamCall2 != null) {
                        wamCall2.userProblems = Long.valueOf(callRatingViewModel.A0B.A00);
                    }
                }
                String str = callRatingViewModel.A06;
                if (str == null || !(!C008703y.A0L(str))) {
                    z2 = false;
                }
                String str2 = null;
                wamCall.userDescription = z2 ? callRatingViewModel.A06 : null;
                StringBuilder A0r = AnonymousClass000.A0r("CallRatingViewModel/userRating: ");
                A0r.append(wamCall.userRating);
                A0r.append(", userDescription: ");
                A0r.append(wamCall.userDescription);
                A0r.append(", userProblem binary: ");
                Long l2 = wamCall.userProblems;
                if (l2 != null) {
                    str2 = Long.toBinaryString(l2.longValue());
                }
                A0r.append(str2);
                A0r.append(", timeSeriesDir: ");
                A0r.append(callRatingViewModel.A05);
                C13680ns.A1V(A0r);
                callRatingViewModel.A01.A02(wamCall, callRatingViewModel.A07);
                AnonymousClass1OL r1 = callRatingViewModel.A00;
                WamCall wamCall3 = callRatingViewModel.A04;
                C13680ns.A0y(r1.A01().edit(), "call_rating_last_call", wamCall3 == null ? null : wamCall3.callRandomId);
                String str3 = callRatingViewModel.A05;
                if (str3 != null) {
                    callRatingViewModel.A02.A02(wamCall, str3);
                }
            }
            finish();
        }
    }
}
