package com.obwhatsapp;

import X.C000900k;
import X.C15830rv;
import X.C16030sJ;
import X.C23061Ai;
import X.C55472jf;
import android.content.Intent;
import android.view.View;

public final /* synthetic */ class epp implements View.OnClickListener {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ epp(Conversation conversation) {
        this.A00 = conversation;
    }

    public final void onClick(View view) {
        C55472jf pickT = this.A00.getPickT();
        C000900k r7 = pickT.A02;
        C23061Ai r1 = pickT.A0c;
        C15830rv r6 = pickT.A0T;
        View currentFocus = r7.getCurrentFocus();
        if (currentFocus != null) {
            r1.A01(currentFocus);
        }
        Intent intent = new Intent();
        intent.setClassName(r7.getPackageName(), "com.obwhatsapp.polls.PollCreatorActivity");
        intent.putExtra("jid", C16030sJ.A03(r6));
        r7.startActivityForResult(intent, 858);
    }
}
