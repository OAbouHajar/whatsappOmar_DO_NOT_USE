package com.facebook.redex;

import X.C14710pd;
import X.C16040sK;
import X.C204310c;
import X.C30341cC;
import X.C62043Bk;
import android.net.Uri;
import android.view.View;
import com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity;

public class ViewOnClickCListenerShape0S1110000_I1 implements View.OnClickListener {
    public Object A00;
    public String A01;
    public boolean A02;

    public ViewOnClickCListenerShape0S1110000_I1(GroupCallLogActivity groupCallLogActivity, String str, boolean z2) {
        this.A00 = groupCallLogActivity;
        this.A01 = str;
        this.A02 = z2;
    }

    public final void onClick(View view) {
        GroupCallLogActivity groupCallLogActivity = (GroupCallLogActivity) this.A00;
        Uri parse = Uri.parse(C62043Bk.A02(this.A01, this.A02));
        C14710pd r7 = groupCallLogActivity.A0C;
        C16040sK r4 = groupCallLogActivity.A01;
        C204310c r6 = groupCallLogActivity.A02;
        C30341cC.A0H(parse, groupCallLogActivity, groupCallLogActivity.A05, r4, groupCallLogActivity.A00, r6, r7, 13);
    }
}
