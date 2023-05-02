package androidx.appcompat.app;

import X.C005802m;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    public Dialog A1B(Bundle bundle) {
        return new C005802m(A0u(), A19());
    }

    public void A1F(int i2, Dialog dialog) {
        if (dialog instanceof C005802m) {
            C005802m r2 = (C005802m) dialog;
            if (!(i2 == 1 || i2 == 2)) {
                if (i2 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            r2.A01();
            return;
        }
        super.A1F(i2, dialog);
    }
}
