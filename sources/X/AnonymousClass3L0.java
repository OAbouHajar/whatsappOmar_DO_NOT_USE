package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.3L0  reason: invalid class name */
public class AnonymousClass3L0 extends BitmapDrawable {
    public final /* synthetic */ ConversationRowImage$RowImageView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3L0(Resources resources, Bitmap bitmap, ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        super(resources, bitmap);
        this.A00 = conversationRowImage$RowImageView;
    }

    public int getIntrinsicHeight() {
        return this.A00.A01.A06;
    }

    public int getIntrinsicWidth() {
        return this.A00.A01.A08;
    }
}
