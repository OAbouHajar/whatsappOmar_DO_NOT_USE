package com.obwhatsapp.calling.callrating.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass027;
import X.AnonymousClass1OK;
import X.AnonymousClass1OL;
import X.AnonymousClass2OJ;
import X.AnonymousClass3n0;
import X.AnonymousClass425;
import X.C003401n;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14710pd;
import X.C16620tM;
import X.C18010w0;
import X.C18450wi;
import X.C816649g;
import X.C82544Df;
import android.os.Bundle;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.extension.WamCallExtended;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

public final class CallRatingViewModel extends C003401n {
    public AnonymousClass1OL A00;
    public C18010w0 A01;
    public AnonymousClass1OK A02;
    public C14710pd A03;
    public WamCall A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final AnonymousClass027 A08 = new AnonymousClass027(AnonymousClass3n0.A00);
    public final AnonymousClass027 A09 = C13690nt.A0O();
    public final AnonymousClass027 A0A = new AnonymousClass027(Boolean.FALSE);
    public final C82544Df A0B = new C82544Df();
    public final AnonymousClass2OJ A0C = new AnonymousClass2OJ(-1);
    public final ArrayList A0D = AnonymousClass000.A0u();
    public final HashSet A0E = C13680ns.A0o();

    public CallRatingViewModel(AnonymousClass1OL r3, C18010w0 r4, AnonymousClass1OK r5, C14710pd r6) {
        C18450wi.A0J(r6, r5);
        C18450wi.A0H(r3, 4);
        this.A03 = r6;
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = r3;
    }

    public final void A05(AnonymousClass425 r4, boolean z2) {
        HashSet hashSet = this.A0E;
        Integer valueOf = Integer.valueOf(r4.ordinal());
        if (z2) {
            hashSet.add(valueOf);
        } else {
            hashSet.remove(valueOf);
        }
        C13700nu.A0V(this.A0A, !hashSet.isEmpty());
    }

    public final boolean A06(Bundle bundle) {
        WamCall wamCallExtended = this.A03.A0E(C16620tM.A02, 1939) ? new WamCallExtended() : new WamCall();
        C18010w0.A01(bundle.getBundle("event"), wamCallExtended);
        wamCallExtended.newEndCallSurveyVersion = C816649g.A00;
        this.A04 = wamCallExtended;
        String A0E2 = C13700nu.A0E(this.A00.A01(), "call_rating_last_call");
        WamCall wamCall = this.A04;
        String str = wamCall == null ? null : wamCall.callRandomId;
        if (str == null || !str.equals(A0E2)) {
            this.A05 = bundle.getString("timeSeriesDir");
            this.A07 = bundle.getBoolean("uploadFieldStat", false);
            WamCall wamCall2 = this.A04;
            if (wamCall2 != null) {
                wamCall2.userRating = 0L;
            }
            return true;
        }
        Log.i("{CallRatingViewModel}/ignore duplicate ratings");
        return false;
    }
}
