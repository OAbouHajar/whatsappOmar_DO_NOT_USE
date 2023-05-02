package X;

import android.content.Context;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageButton;

/* renamed from: X.4xJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101434xJ implements AnonymousClass5PI {
    public final /* synthetic */ InteractiveMessageButton A00;
    public final /* synthetic */ C16740tZ A01;
    public final /* synthetic */ C35181lV A02;
    public final /* synthetic */ C16880tn A03;

    public /* synthetic */ C101434xJ(InteractiveMessageButton interactiveMessageButton, C16740tZ r2, C35181lV r3, C16880tn r4) {
        this.A00 = interactiveMessageButton;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void ANr(int i2) {
        InteractiveMessageButton interactiveMessageButton = this.A00;
        C35181lV r0 = this.A02;
        C16880tn r1 = this.A03;
        C16740tZ r4 = this.A01;
        if (!r0.A00) {
            int size = r1.A03.A00.size();
            C52912ee r12 = interactiveMessageButton.A02;
            Context context = interactiveMessageButton.getContext();
            if (size > 1) {
                r12.A01(context, r4, i2);
            } else {
                r12.A00(context, r4);
            }
        }
    }
}
