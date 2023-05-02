package X;

import android.content.DialogInterface;
import com.obwhatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4fe  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91274fe implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationRowContact$MessageSharedContactDialogFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C91274fe(ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment, String str, List list) {
        this.A00 = conversationRowContact$MessageSharedContactDialogFragment;
        this.A02 = list;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = this.A00;
        List list = this.A02;
        String str = this.A01;
        UserJid userJid = ((C88684av) list.get(i2)).A01;
        if (userJid != null) {
            conversationRowContact$MessageSharedContactDialogFragment.A00.A01(conversationRowContact$MessageSharedContactDialogFragment.A0u(), userJid, str);
        }
    }
}
