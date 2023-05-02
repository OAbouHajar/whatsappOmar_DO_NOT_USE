package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.3A4  reason: invalid class name */
public class AnonymousClass3A4 {
    public static void A00(DialogFragment dialogFragment, C16010sH r4) {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", C16030sJ.A03(r4.A0E));
        dialogFragment.A0T(A0D);
    }

    public static boolean A01(C16740tZ r6, C39531sd r7) {
        boolean z2 = false;
        if (r7 != null) {
            long j2 = r6.A0I;
            if (r6 instanceof C38831rU) {
                j2 = ((C38831rU) r6).A00;
            }
            if (r7.A01.A0I > j2) {
                z2 = true;
            }
        }
        if (z2) {
            if (r7 == null) {
                return true;
            }
            C38541qx r2 = r7.A01;
            if (!(r2 instanceof C39101rv)) {
                return true;
            }
            C39101rv r22 = (C39101rv) r2;
            return !TextUtils.isEmpty(r22.A01) && !"□".equals(r22.A01);
        }
    }
}
