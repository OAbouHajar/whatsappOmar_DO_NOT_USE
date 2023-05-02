package X;

import android.content.Context;
import com.obwhatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.3od  reason: invalid class name and case insensitive filesystem */
public class C73643od extends C64143Mx {
    public int A00;
    public final /* synthetic */ ConversationAttachmentContentView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73643od(Context context, ConversationAttachmentContentView conversationAttachmentContentView) {
        super(context);
        this.A01 = conversationAttachmentContentView;
    }

    public int getBaseHeightPx() {
        return this.A00;
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(1, this.A00 + this.A01.A05);
    }

    public void setBaseHeightPx(int i2) {
        this.A00 = i2;
    }
}
