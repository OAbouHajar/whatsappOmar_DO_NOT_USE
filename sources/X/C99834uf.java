package X;

import com.obwhatsapp.mediaview.DeleteMessagesDialogFragment;
import com.obwhatsapp.mediaview.RevokeNuxDialogFragment;

/* renamed from: X.4uf  reason: invalid class name and case insensitive filesystem */
public class C99834uf implements AnonymousClass5RM {
    public final /* synthetic */ DeleteMessagesDialogFragment A00;

    public C99834uf(DeleteMessagesDialogFragment deleteMessagesDialogFragment) {
        this.A00 = deleteMessagesDialogFragment;
    }

    public void AVz() {
        this.A00.A1C();
    }

    public void AXE(int i2) {
        DeleteMessagesDialogFragment deleteMessagesDialogFragment = this.A00;
        if (deleteMessagesDialogFragment.A0c()) {
            new RevokeNuxDialogFragment(i2).A1G(deleteMessagesDialogFragment.A0F(), (String) null);
        }
    }
}
