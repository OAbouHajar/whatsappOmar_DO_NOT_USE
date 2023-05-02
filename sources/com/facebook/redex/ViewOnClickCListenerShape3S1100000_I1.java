package com.facebook.redex;

import X.C13680ns;
import X.C14530pL;
import X.C14750ph;
import X.C18450wi;
import X.C72203lj;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.obwhatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.obwhatsapp.spamwarning.SpamWarningActivity;

public class ViewOnClickCListenerShape3S1100000_I1 implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public ViewOnClickCListenerShape3S1100000_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        Intent A0A;
        SpamWarningActivity spamWarningActivity;
        switch (this.A02) {
            case 0:
                BlockReasonListFragment.A02((BlockReasonListFragment) this.A00, this.A01);
                return;
            case 1:
                String str = this.A01;
                C18450wi.A0H(str, 1);
                ((C72203lj) this.A00).A01.AIU(str);
                return;
            case 2:
                Activity activity = (Activity) this.A00;
                String str2 = this.A01;
                activity.finish();
                A0A = C13680ns.A0A(str2);
                spamWarningActivity = activity;
                break;
            case 3:
                C14530pL r3 = (C14530pL) this.A00;
                r3.A00.A06(r3, C14750ph.A0g(r3, this.A01, 6));
                return;
            default:
                SpamWarningActivity spamWarningActivity2 = (SpamWarningActivity) this.A00;
                String str3 = this.A01;
                A0A = new Intent("android.intent.action.VIEW", (str3 == null || str3.isEmpty()) ? spamWarningActivity2.A03.A04((String) null) : Uri.parse(str3));
                spamWarningActivity = spamWarningActivity2;
                break;
        }
        spamWarningActivity.startActivity(A0A);
    }
}
