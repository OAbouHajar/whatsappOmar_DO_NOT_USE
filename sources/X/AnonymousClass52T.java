package X;

import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import java.util.Set;

/* renamed from: X.52T  reason: invalid class name */
public class AnonymousClass52T implements AnonymousClass1XZ {
    public final /* synthetic */ AnonymousClass02C A00;
    public final /* synthetic */ AnonymousClass2JC A01;

    public AnonymousClass52T(AnonymousClass02C r1, AnonymousClass2JC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A6p() {
        AnonymousClass02C r4 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0L;
        conversationsFragment.A2M.Ack(new AnonymousClass37R((DialogFragment) new ConversationsFragment.BulkDeleteConversationDialogFragment(), r4, conversationsFragment.A1Y, (Set) conversationsFragment.A2Q, true), new Object[0]);
    }

    public void AHG(boolean z2) {
        AnonymousClass02C r4 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0L;
        conversationsFragment.A2M.Ack(new AnonymousClass37R((DialogFragment) new ConversationsFragment.BulkDeleteConversationDialogFragment(), r4, conversationsFragment.A1Y, (Set) conversationsFragment.A2Q, z2), new Object[0]);
    }
}
