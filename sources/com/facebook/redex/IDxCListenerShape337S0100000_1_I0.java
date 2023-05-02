package com.facebook.redex;

import X.AnonymousClass29T;
import X.AnonymousClass2KS;
import X.AnonymousClass2KU;
import X.AnonymousClass5SB;
import X.C13680ns;
import X.C19530ya;
import X.C76473ty;
import X.C79053z7;
import android.app.Activity;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;

public class IDxCListenerShape337S0100000_1_I0 implements AnonymousClass5SB {
    public Object A00;
    public final int A01;

    public IDxCListenerShape337S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ATt() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass29T.A00((Activity) obj, 1);
        } else {
            AnonymousClass29T.A00(((AnonymousClass2KS) obj).A03, 20);
        }
    }

    public void AUz(boolean z2) {
        boolean z3 = z2;
        if (this.A01 != 0) {
            Log.i("group_info/onclick_deleteGroup");
            GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
            if (!groupChatInfoActivity.A0C.A09(groupChatInfoActivity.A1M)) {
                C13680ns.A1U(new C79053z7(groupChatInfoActivity, groupChatInfoActivity.A01, groupChatInfoActivity.A1M, z2), groupChatInfoActivity.A05);
            } else if (groupChatInfoActivity.A07.A0A()) {
                groupChatInfoActivity.Afr(R.string.str0f22, R.string.str13db);
                groupChatInfoActivity.A1E.A05(new C76473ty(groupChatInfoActivity.A0q, groupChatInfoActivity, groupChatInfoActivity.A0H, groupChatInfoActivity.A1M));
            } else {
                groupChatInfoActivity.A05.A09(R.string.str08ca, 0);
            }
        } else {
            AnonymousClass2KS r2 = (AnonymousClass2KS) this.A00;
            AnonymousClass29T.A00(r2.A03, 20);
            long A002 = C19530ya.A00(r2.A06, r2);
            AnonymousClass2KU r3 = new AnonymousClass2KU(r2.A0A, r2.A0X, r2.A01, r2.A02, A002, false, z3);
            r2.A00 = r3;
            r2.A0b.Ack(r3, new Object[0]);
        }
    }
}
