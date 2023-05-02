package com.obwhatsapp.calling.avatar;

import X.AnonymousClass023;
import X.AnonymousClass0M1;
import X.AnonymousClass1UG;
import X.AnonymousClass1UK;
import X.AnonymousClass2OJ;
import X.AnonymousClass5B7;
import X.C003401n;
import X.C004001t;
import X.C05730St;
import X.C18450wi;
import X.C448926b;
import X.C72903mt;
import com.facebook.redex.IDxFunctionShape207S0100000_2_I1;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.obwhatsapp.calling.avatar.data.FetchAvatarEffectUseCase;
import com.whatsapp.util.Log;

public final class CallAvatarViewModel extends C003401n {
    public C004001t A00;
    public final AnonymousClass023 A01;
    public final FetchAvatarEffectUseCase A02;
    public final C448926b A03;
    public final AnonymousClass2OJ A04;

    public CallAvatarViewModel(FetchAvatarEffectUseCase fetchAvatarEffectUseCase, C448926b r6) {
        C18450wi.A0H(r6, 1);
        this.A03 = r6;
        this.A02 = fetchAvatarEffectUseCase;
        AnonymousClass2OJ r2 = new AnonymousClass2OJ(new C72903mt((AnonymousClass5B7) null, 7, false));
        this.A04 = r2;
        IDxObserverShape116S0100000_2_I1 iDxObserverShape116S0100000_2_I1 = new IDxObserverShape116S0100000_2_I1(this, 42);
        this.A01 = iDxObserverShape116S0100000_2_I1;
        C05730St.A01(C05730St.A00(new IDxFunctionShape207S0100000_2_I1(this, 0), r2)).A07(iDxObserverShape116S0100000_2_I1);
    }

    public void A04() {
        C05730St.A01(C05730St.A00(new IDxFunctionShape207S0100000_2_I1(this, 0), this.A04)).A08(this.A01);
    }

    public final void A05() {
        Object A012 = this.A04.A01();
        C18450wi.A0B(A012);
        if (!(A012 instanceof C72903mt)) {
            Log.e(C18450wi.A06("voip/CallAvatarViewModel/onSwitchToAvatarTapped Unexpected state=", A012));
            return;
        }
        this.A00 = AnonymousClass1UK.A00(new CallAvatarViewModel$onSwitchToAvatarTapped$1(this, (AnonymousClass1UG) null), AnonymousClass0M1.A00(this));
    }
}
