package X;

import android.database.DataSetObserver;

/* renamed from: X.0AN  reason: invalid class name */
public class AnonymousClass0AN extends DataSetObserver {
    public final /* synthetic */ AnonymousClass0ZW A00;

    public AnonymousClass0AN(AnonymousClass0ZW r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        AnonymousClass0ZW r1 = this.A00;
        if (r1.A0A.isShowing()) {
            r1.AfT();
        }
    }

    public void onInvalidated() {
        this.A00.dismiss();
    }
}
