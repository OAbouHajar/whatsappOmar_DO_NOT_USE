package X;

import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragmentCompat;
import java.util.Set;

/* renamed from: X.0Xi  reason: invalid class name and case insensitive filesystem */
public class C06700Xi implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectListPreferenceDialogFragmentCompat A00;

    public C06700Xi(MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
        this.A00 = multiSelectListPreferenceDialogFragmentCompat;
    }

    public void onClick(DialogInterface dialogInterface, int i2, boolean z2) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = this.A00;
        boolean z3 = multiSelectListPreferenceDialogFragmentCompat.A01;
        Set set = multiSelectListPreferenceDialogFragmentCompat.A00;
        String charSequence = multiSelectListPreferenceDialogFragmentCompat.A03[i2].toString();
        multiSelectListPreferenceDialogFragmentCompat.A01 = (z2 ? set.add(charSequence) : set.remove(charSequence)) | z3;
    }
}
