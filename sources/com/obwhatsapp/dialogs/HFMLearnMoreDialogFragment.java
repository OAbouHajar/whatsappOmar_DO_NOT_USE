package com.obwhatsapp.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import com.obwhatsapp.R;

public class HFMLearnMoreDialogFragment extends Hilt_HFMLearnMoreDialogFragment {
    public Dialog A1B(Bundle bundle) {
        String string = A02().getString(R.string.str0b27);
        return FAQLearnMoreDialogFragment.A02(A02(), this.A00, this.A01, this.A02, string, "26000253", (String) null, (String) null);
    }
}
