package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.conversation.ConversationListView;

/* renamed from: X.4kt  reason: invalid class name and case insensitive filesystem */
public class C94424kt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ConversationListView A01;
    public final /* synthetic */ C55322jK A02;
    public final /* synthetic */ AnonymousClass1ZQ A03;

    public C94424kt(View view, ConversationListView conversationListView, C55322jK r3, AnonymousClass1ZQ r4) {
        this.A01 = conversationListView;
        this.A00 = view;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void onGlobalLayout() {
        C55322jK r0;
        ConversationListView conversationListView = this.A01;
        if (C23061Ai.A00(this.A00)) {
            AnonymousClass3K2.A0z(conversationListView, this);
            conversationListView.A05();
            AnonymousClass1ZQ r02 = this.A03;
            if (r02 != null && r02.ACn() && (r0 = this.A02) != null) {
                r0.requestLayout();
            }
        }
    }
}
