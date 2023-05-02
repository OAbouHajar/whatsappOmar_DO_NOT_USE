package X;

import android.view.View;
import com.obwhatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.4kV  reason: invalid class name and case insensitive filesystem */
public class C94184kV implements View.OnLongClickListener {
    public final /* synthetic */ ConversationAttachmentContentView A00;
    public final /* synthetic */ String A01;

    public C94184kV(ConversationAttachmentContentView conversationAttachmentContentView, String str) {
        this.A00 = conversationAttachmentContentView;
        this.A01 = str;
    }

    public boolean onLongClick(View view) {
        this.A00.A0D.A0D(this.A01, true);
        return true;
    }
}
