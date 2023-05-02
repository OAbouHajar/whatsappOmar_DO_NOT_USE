package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.conversation.ConversationListView;

/* renamed from: X.3Ln  reason: invalid class name and case insensitive filesystem */
public class C63793Ln extends Handler {
    public final /* synthetic */ ConversationListView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63793Ln(Looper looper, ConversationListView conversationListView) {
        super(looper);
        this.A00 = conversationListView;
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            this.A00.A04();
        }
        this.A00.setTranscriptMode(0);
    }
}
