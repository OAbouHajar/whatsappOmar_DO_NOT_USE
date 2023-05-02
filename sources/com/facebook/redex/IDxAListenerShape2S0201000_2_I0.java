package com.facebook.redex;

import X.AnonymousClass29T;
import X.AnonymousClass5OZ;
import X.C13680ns;
import X.C15860rz;
import android.app.Activity;
import android.content.SharedPreferences;

public class IDxAListenerShape2S0201000_2_I0 implements AnonymousClass5OZ {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxAListenerShape2S0201000_2_I0(Activity activity, C15860rz r2, int i2, int i3) {
        this.A03 = i3;
        this.A01 = activity;
        this.A00 = i2;
        this.A02 = r2;
    }

    public final void AVz() {
        boolean z2;
        SharedPreferences.Editor A0K;
        String str;
        if (this.A03 != 0) {
            int i2 = this.A00;
            C15860rz r3 = (C15860rz) this.A02;
            AnonymousClass29T.A00((Activity) this.A01, i2);
            z2 = false;
            C13680ns.A0z(r3.A0K(), "pref_revoke_sender_nux_v2", false);
            A0K = r3.A0K();
            str = "pref_revoke_admin_nux";
        } else {
            AnonymousClass29T.A00((Activity) this.A01, this.A00);
            z2 = false;
            A0K = ((C15860rz) this.A02).A0K();
            str = "pref_revoke_sender_nux_v2";
        }
        C13680ns.A0z(A0K, str, z2);
    }
}
