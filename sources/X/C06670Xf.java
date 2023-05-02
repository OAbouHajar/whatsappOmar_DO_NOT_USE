package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0Xf  reason: invalid class name and case insensitive filesystem */
public class C06670Xf implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment A00;

    public C06670Xf(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.A03;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
