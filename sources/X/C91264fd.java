package X;

import android.content.DialogInterface;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4fd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91264fd implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChangeNumberNotificationDialogFragment A00;
    public final /* synthetic */ C16010sH A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C91264fd(ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment, C16010sH r2, boolean z2) {
        this.A00 = changeNumberNotificationDialogFragment;
        this.A02 = z2;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = this.A00;
        boolean z2 = this.A02;
        C16010sH r3 = this.A01;
        if (z2) {
            dialogInterface.dismiss();
            return;
        }
        C42781yf r1 = changeNumberNotificationDialogFragment.A01;
        if (r1 != null) {
            Jid A08 = r3.A08(UserJid.class);
            AnonymousClass00B.A06(A08);
            ((Conversation) r1).A00.A0c(r3, (C15830rv) A08, false);
        }
    }
}
