package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.facebook.redex.RunnableRunnableShape0S1310000_I0;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.blocklist.BlockConfirmationDialogFragment;

/* renamed from: X.3C9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ C14550pN A01;
    public final /* synthetic */ BlockConfirmationDialogFragment A02;
    public final /* synthetic */ C16010sH A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass3C9(CheckBox checkBox, C14550pN r2, BlockConfirmationDialogFragment blockConfirmationDialogFragment, C16010sH r4, String str, boolean z2, boolean z3, boolean z4) {
        this.A02 = blockConfirmationDialogFragment;
        this.A00 = checkBox;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = z2;
        this.A06 = z3;
        this.A07 = z4;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A02;
        CheckBox checkBox = this.A00;
        C14550pN r5 = this.A01;
        C16010sH r10 = this.A03;
        String str = this.A04;
        boolean z2 = this.A05;
        boolean z3 = this.A06;
        boolean z4 = this.A07;
        if (checkBox == null || !checkBox.isChecked()) {
            if (z3) {
                C13700nu.A0W(new AnonymousClass377(r5, r5, blockConfirmationDialogFragment.A02, (AnonymousClass1ZI) null, blockConfirmationDialogFragment.A07, r10, (String) null, (String) null, str, true, false), blockConfirmationDialogFragment.A0A);
                return;
            }
            blockConfirmationDialogFragment.A04.A0G(r5, (AnonymousClass1ZI) null, r10, (String) null, (String) null, str, true, z4);
        } else if (blockConfirmationDialogFragment.A07.A02(r5)) {
            blockConfirmationDialogFragment.A00.A0E((C14600pS) null);
            C42771ye r0 = blockConfirmationDialogFragment.A03;
            if (r0 != null) {
                C34621kZ r02 = ((Conversation) r0).A00.A2C;
                r02.A0F();
                r02.A0D();
            }
            blockConfirmationDialogFragment.A0A.Acl(new RunnableRunnableShape0S1310000_I0(blockConfirmationDialogFragment, r5, r10, str, 1, z2));
        }
    }
}
