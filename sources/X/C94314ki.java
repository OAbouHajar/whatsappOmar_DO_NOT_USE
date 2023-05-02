package X;

import android.view.ViewTreeObserver;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.4ki  reason: invalid class name and case insensitive filesystem */
public class C94314ki implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ MessageDetailsActivity A00;

    public C94314ki(MessageDetailsActivity messageDetailsActivity) {
        this.A00 = messageDetailsActivity;
    }

    public void onGlobalLayout() {
        MessageDetailsActivity messageDetailsActivity = this.A00;
        AnonymousClass3K3.A16(messageDetailsActivity.A02, this);
        messageDetailsActivity.A02.setSelectionFromTop(1, messageDetailsActivity.getResources().getDimensionPixelSize(R.dimen.dimen0002) * 3);
    }
}
