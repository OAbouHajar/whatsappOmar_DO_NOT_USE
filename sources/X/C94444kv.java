package X;

import android.view.ViewTreeObserver;
import com.obwhatsapp.conversation.ConversationListView;

/* renamed from: X.4kv  reason: invalid class name and case insensitive filesystem */
public class C94444kv implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C48952Qa A01;
    public final /* synthetic */ ConversationListView A02;
    public final /* synthetic */ AnonymousClass4VE A03;
    public final /* synthetic */ C33741j5 A04;

    public C94444kv(C48952Qa r1, ConversationListView conversationListView, AnonymousClass4VE r3, C33741j5 r4, int i2) {
        this.A02 = conversationListView;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i2;
        this.A04 = r4;
    }

    public void onGlobalLayout() {
        ConversationListView conversationListView = this.A02;
        AnonymousClass3K3.A16(conversationListView, this);
        C48952Qa r2 = this.A01;
        AnonymousClass4VE r4 = this.A03;
        r2.A0W.add(r4.A08.A11);
        conversationListView.A02();
        conversationListView.A0B(this.A04, this.A00, r4.A05, r4.A01);
    }
}
