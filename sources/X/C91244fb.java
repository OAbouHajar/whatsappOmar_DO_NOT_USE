package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.obwhatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.4fb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91244fb implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DeleteAccountFeedback.ChangeNumberMessageDialogFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C91244fb(DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment, String str, int i2) {
        this.A01 = changeNumberMessageDialogFragment;
        this.A00 = i2;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = this.A01;
        int i3 = this.A00;
        String str = this.A02;
        C001000l A0C = changeNumberMessageDialogFragment.A0C();
        Intent A09 = C13680ns.A09();
        A09.setClassName(A0C.getPackageName(), "com.obwhatsapp.account.delete.DeleteAccountConfirmation");
        A09.putExtra("deleteReason", i3);
        A09.putExtra("additionalComments", str);
        changeNumberMessageDialogFragment.A0r(A09);
    }
}
