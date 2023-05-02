package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1L3;
import X.AnonymousClass1L4;
import X.C13680ns;
import X.C17750va;
import X.C17800vf;
import android.app.Activity;
import android.view.View;

public class ViewOnClickCListenerShape2S0500000_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;

    public ViewOnClickCListenerShape2S0500000_I1(Activity activity, AnonymousClass1L3 r2, AnonymousClass1L4 r3, C17750va r4, C17800vf r5) {
        this.A00 = r2;
        this.A01 = r5;
        this.A02 = activity;
        this.A03 = r4;
        this.A04 = r3;
    }

    public final void onClick(View view) {
        Activity activity = (Activity) this.A02;
        C17750va r3 = (C17750va) this.A03;
        ((AnonymousClass1L3) this.A00).A00(activity, (AnonymousClass1L4) this.A04, r3, (C17800vf) this.A01, C13680ns.A0Z(), AnonymousClass000.A0u());
    }
}
