package X;

import android.database.DataSetObserver;

/* renamed from: X.0AO  reason: invalid class name */
public class AnonymousClass0AO extends DataSetObserver {
    public final /* synthetic */ AnonymousClass04B A00;

    public AnonymousClass0AO(AnonymousClass04B r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        AnonymousClass04B r1 = this.A00;
        r1.A07 = true;
        r1.notifyDataSetChanged();
    }

    public void onInvalidated() {
        AnonymousClass04B r1 = this.A00;
        r1.A07 = false;
        r1.notifyDataSetInvalidated();
    }
}
