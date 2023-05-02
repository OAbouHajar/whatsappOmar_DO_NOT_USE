package X;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0bq  reason: invalid class name */
public class AnonymousClass0bq implements AnonymousClass023 {
    public final /* synthetic */ DialogFragment A00;

    public AnonymousClass0bq(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public /* bridge */ /* synthetic */ void AOH(Object obj) {
        if (obj != null) {
            DialogFragment dialogFragment = this.A00;
            if (dialogFragment.A0E) {
                View A06 = dialogFragment.A06();
                if (A06.getParent() != null) {
                    throw AnonymousClass000.A0V("DialogFragment can not be attached to a container view");
                } else if (dialogFragment.A03 != null) {
                    if (AnonymousClass02C.A01()) {
                        StringBuilder A0r = AnonymousClass000.A0r("DialogFragment ");
                        A0r.append(this);
                        A0r.append(" setting the content view on ");
                        Log.d("FragmentManager", AnonymousClass000.A0f(dialogFragment.A03, A0r));
                    }
                    dialogFragment.A03.setContentView(A06);
                }
            }
        }
    }
}
