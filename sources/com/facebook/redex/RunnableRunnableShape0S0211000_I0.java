package com.facebook.redex;

import X.AnonymousClass1HE;
import X.C16030sJ;
import X.C16730tY;
import X.C16740tZ;
import X.C16760tb;
import com.obwhatsapp.conversation.ConversationListView;
import java.util.Set;

public class RunnableRunnableShape0S0211000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 1;

    public RunnableRunnableShape0S0211000_I0(C16760tb r2, C16740tZ r3, int i2) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = true;
        this.A00 = i2;
    }

    public RunnableRunnableShape0S0211000_I0(AnonymousClass1HE r2, C16730tY r3, int i2, boolean z2) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i2;
        this.A03 = z2;
    }

    public RunnableRunnableShape0S0211000_I0(ConversationListView conversationListView, C16740tZ r4) {
        this.A01 = conversationListView;
        this.A02 = r4;
        this.A00 = -1;
        this.A03 = true;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                ((ConversationListView) this.A01).A0A((C16740tZ) this.A02, -1, true);
                return;
            case 1:
                ((C16760tb) this.A01).A0P((C16740tZ) this.A02, this.A00, true, false);
                return;
            default:
                AnonymousClass1HE r2 = (AnonymousClass1HE) this.A01;
                C16740tZ r4 = (C16740tZ) this.A02;
                int i2 = this.A00;
                boolean z2 = this.A03;
                Set A002 = r2.A08.A00(r4.A11);
                r2.A03.A0I(r4, i2, 1, C16030sJ.A0A(r2.A00, A002).size(), A002.size(), 0, 0, r2.A05.A00() - r4.A0I, z2, false, false, false);
                return;
        }
    }
}
