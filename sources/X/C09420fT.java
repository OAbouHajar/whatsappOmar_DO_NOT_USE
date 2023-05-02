package X;

import android.content.Context;
import android.util.Log;
import androidx.biometric.FingerprintDialogFragment;
import com.obwhatsapp.R;

/* renamed from: X.0fT  reason: invalid class name and case insensitive filesystem */
public class C09420fT implements Runnable {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public C09420fT(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    public void run() {
        FingerprintDialogFragment fingerprintDialogFragment = this.A00;
        Context A0u = fingerprintDialogFragment.A0u();
        if (A0u == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        fingerprintDialogFragment.A04.A06(1);
        fingerprintDialogFragment.A04.A07(A0u.getString(R.string.str1ccb));
    }
}
