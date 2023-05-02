package com.obwhatsapp.payments;

import X.AnonymousClass4PY;
import X.C42821yj;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.obwhatsapp.conversation.ConversationListView;
import com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel;

public class IDxAObserverShape91S0100000_2_I0 extends AnonymousClass4PY {
    public Object A00;
    public final int A01;

    public IDxAObserverShape91S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        if (this.A01 != 0) {
            ((BusinessHubViewModel) this.A00).A06(false);
            return;
        }
        ConversationListView conversationListView = ((C42821yj) this.A00).A1n;
        conversationListView.post(new RunnableRunnableShape7S0100000_I0_6(conversationListView, 20));
    }
}
