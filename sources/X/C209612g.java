package X;

import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.obwhatsapp.conversation.ConversationListView;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.12g  reason: invalid class name and case insensitive filesystem */
public class C209612g extends C16580tI {
    public void A04() {
        for (C47212Ia r0 : A01()) {
            ConversationListView conversationListView = r0.A00.A1n;
            conversationListView.post(new RunnableRunnableShape7S0100000_I0_6(conversationListView, 17));
        }
    }

    public void A05() {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void A06(Set set) {
        if (!set.isEmpty()) {
            for (C47212Ia r0 : A01()) {
                ConversationListView conversationListView = r0.A00.A1n;
                conversationListView.post(new RunnableRunnableShape7S0100000_I0_6(conversationListView, 17));
            }
        }
    }
}
