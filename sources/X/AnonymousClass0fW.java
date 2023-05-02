package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.0fW  reason: invalid class name */
public class AnonymousClass0fW implements Runnable {
    public final /* synthetic */ DialogFragment A00;

    public AnonymousClass0fW(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void run() {
        DialogFragment dialogFragment = this.A00;
        dialogFragment.A05.onDismiss(dialogFragment.A03);
    }
}
