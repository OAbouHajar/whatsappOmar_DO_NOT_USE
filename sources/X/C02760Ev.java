package X;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0Ev  reason: invalid class name and case insensitive filesystem */
public class C02760Ev extends AnonymousClass062 {
    public final /* synthetic */ DialogFragment A00;
    public final /* synthetic */ AnonymousClass062 A01;

    public C02760Ev(DialogFragment dialogFragment, AnonymousClass062 r2) {
        this.A00 = dialogFragment;
        this.A01 = r2;
    }

    public View A00(int i2) {
        AnonymousClass062 r1 = this.A01;
        if (r1.A01()) {
            return r1.A00(i2);
        }
        Dialog dialog = this.A00.A03;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    public boolean A01() {
        return this.A01.A01() || this.A00.A0B;
    }
}
