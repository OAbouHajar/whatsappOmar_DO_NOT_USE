package X;

import android.database.DataSetObserver;

/* renamed from: X.3Kx  reason: invalid class name and case insensitive filesystem */
public class C63643Kx extends DataSetObserver {
    public final /* synthetic */ AnonymousClass3R5 A00;

    public C63643Kx(AnonymousClass3R5 r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        super.onChanged();
        AnonymousClass3R5 r1 = this.A00;
        r1.A03 = true;
        r1.A01();
    }

    public void onInvalidated() {
        super.onInvalidated();
        AnonymousClass3R5 r1 = this.A00;
        r1.A03 = false;
        r1.A01();
    }
}
