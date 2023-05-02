package X;

import android.content.DialogInterface;
import com.obwhatsapp.settings.MultiSelectionDialogFragment;

/* renamed from: X.4g2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91514g2 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectionDialogFragment A00;

    public /* synthetic */ C91514g2(MultiSelectionDialogFragment multiSelectionDialogFragment) {
        this.A00 = multiSelectionDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i2, boolean z2) {
        this.A00.A04[i2] = z2;
    }
}
