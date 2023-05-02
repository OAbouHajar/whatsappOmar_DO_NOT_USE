package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0VE;
import X.AnonymousClass2AS;
import X.AnonymousClass5MG;
import X.C109635Sz;
import X.C13680ns;
import X.C15830rv;
import X.C98934tD;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.community.CommunitySpamReportDialogFragment;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.obwhatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.util.Log;

public class RunnableRunnableShape1S0210000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public RunnableRunnableShape1S0210000_I1(Object obj, Object obj2, int i2, boolean z2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z2;
    }

    public void run() {
        AnonymousClass5MG r2;
        switch (this.A03) {
            case 0:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A00;
                AnonymousClass0VE r0 = swipeDismissBehavior.A03;
                if (r0 == null || !r0.A0A()) {
                    if (this.A02 && (r2 = swipeDismissBehavior.A04) != null) {
                        ((View) this.A01).setVisibility(8);
                        ((C98934tD) r2).A00.A04(0);
                        return;
                    }
                    return;
                }
                break;
            case 1:
                boolean z2 = this.A02;
                AnonymousClass2AS r3 = (AnonymousClass2AS) this.A01;
                ((CommunitySpamReportDialogFragment) this.A00).A00.A09(R.string.str0590, 1);
                if (z2) {
                    C13680ns.A1P(r3.A0t, 1);
                    return;
                }
                return;
            case 2:
                C15830rv r4 = (C15830rv) this.A01;
                boolean z3 = this.A02;
                Log.i(AnonymousClass000.A0g("conversations/group/toggleGroupProgressbar/:", r4));
                ConversationsFragment conversationsFragment = (ConversationsFragment) ((IDxCObserverShape72S0100000_2_I0) this.A00).A00;
                View A1C = conversationsFragment.A1C(r4);
                if (A1C != null) {
                    A1C.findViewById(R.id.progressbar_small).setVisibility(C13680ns.A02(z3 ? 1 : 0));
                    return;
                }
                StringBuilder A0r = AnonymousClass000.A0r("conversations/refresh: no view for ");
                A0r.append(r4);
                A0r.append(" ");
                A0r.append(conversationsFragment.A09.getFirstVisiblePosition());
                A0r.append("-");
                A0r.append(conversationsFragment.A09.getLastVisiblePosition());
                A0r.append(" (");
                A0r.append(conversationsFragment.A09.getCount());
                Log.w(AnonymousClass000.A0h(")", A0r));
                return;
            default:
                VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = (VerticalSwipeDismissBehavior) this.A00;
                AnonymousClass0VE r02 = verticalSwipeDismissBehavior.A04;
                if (r02 == null || !r02.A0A()) {
                    C109635Sz r22 = verticalSwipeDismissBehavior.A05;
                    if (r22 != null) {
                        boolean z4 = this.A02;
                        View view = (View) this.A01;
                        if (z4) {
                            r22.APs(view);
                            return;
                        } else {
                            r22.AX7(view);
                            return;
                        }
                    } else {
                        return;
                    }
                }
        }
        ((View) this.A01).postOnAnimation(this);
    }
}
