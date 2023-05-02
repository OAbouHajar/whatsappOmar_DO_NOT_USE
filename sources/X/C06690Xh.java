package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0Xh  reason: invalid class name and case insensitive filesystem */
public class C06690Xh implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment A00;

    public C06690Xh(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.A03;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
