package X;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: X.4gC  reason: invalid class name and case insensitive filesystem */
public class C91604gC implements SQLiteTransactionListener {
    public final /* synthetic */ AnonymousClass1NT A00;

    public C91604gC(AnonymousClass1NT r1) {
        this.A00 = r1;
    }

    public void onBegin() {
    }

    public void onCommit() {
    }

    public void onRollback() {
        AnonymousClass1NT r1 = this.A00;
        synchronized (r1) {
            r1.A00 = null;
        }
    }
}
