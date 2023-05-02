package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass025;
import X.AnonymousClass2Xe;
import X.C13690nt;
import X.C16050sL;
import X.C18450wi;
import X.C34151jm;
import X.C56062kt;
import X.C72883mr;
import X.C72893ms;
import X.C72903mt;
import X.C89674ci;
import com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class IDxFunctionShape207S0100000_2_I1 implements AnonymousClass025 {
    public Object A00;
    public final int A01;

    public IDxFunctionShape207S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object apply(Object obj) {
        int i2;
        switch (this.A01) {
            case 0:
                C18450wi.A0C(obj);
                if (obj instanceof C72903mt) {
                    i2 = 0;
                } else if (obj instanceof C72893ms) {
                    i2 = 1;
                } else if (obj instanceof C72883mr) {
                    i2 = 2;
                } else {
                    throw new AnonymousClass2Xe();
                }
                return Integer.valueOf(i2);
            case 1:
                C56062kt r10 = (C56062kt) obj;
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) ((ViewOnClickCListenerShape1S0100000_I0_1) this.A00).A00;
                groupChatInfoActivity.Ac1();
                Set singleton = Collections.singleton(groupChatInfoActivity.A1M);
                int i3 = r10.A00;
                C16050sL r2 = r10.A01;
                int i4 = 0;
                if (r2 != null) {
                    i4 = 2;
                }
                groupChatInfoActivity.Afb(LeaveGroupsDialogFragment.A01(r2, (String) null, singleton, i3, i4, false, true), (String) null);
                return null;
            case 2:
                ExpressionSearchViewModel expressionSearchViewModel = (ExpressionSearchViewModel) this.A00;
                ArrayList A0u = AnonymousClass000.A0u();
                for (C34151jm r1 : expressionSearchViewModel.A05() != null ? C89674ci.A01(expressionSearchViewModel.A05(), expressionSearchViewModel.A06()) : C13690nt.A0i(0)) {
                    if (r1.A0H) {
                        A0u.add(r1);
                    }
                }
                return A0u;
            default:
                ExpressionSearchViewModel expressionSearchViewModel2 = (ExpressionSearchViewModel) this.A00;
                ArrayList A0u2 = AnonymousClass000.A0u();
                for (C34151jm r12 : expressionSearchViewModel2.A05() != null ? C89674ci.A01(expressionSearchViewModel2.A05(), expressionSearchViewModel2.A06()) : C13690nt.A0i(0)) {
                    if (!r12.A0H) {
                        A0u2.add(r12);
                    }
                }
                return A0u2;
        }
    }
}
