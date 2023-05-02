package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.3KQ  reason: invalid class name */
public class AnonymousClass3KQ extends DialogFragment {
    public Dialog A00;
    public Dialog A01;
    public DialogInterface.OnCancelListener A02;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A02;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        Dialog dialog2 = this.A01;
        if (dialog2 != null) {
            return dialog2;
        }
        Activity activity = getActivity();
        C13710nw.A01(activity);
        AlertDialog create = new AlertDialog.Builder(activity).create();
        this.A01 = create;
        return create;
    }
}
