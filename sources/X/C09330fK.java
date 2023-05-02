package X;

import android.database.Cursor;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0fK  reason: invalid class name and case insensitive filesystem */
public class C09330fK implements Runnable {
    public final /* synthetic */ SearchView A00;

    public C09330fK(SearchView searchView) {
        this.A00 = searchView;
    }

    public void run() {
        AnonymousClass04B r1 = this.A00.A0E;
        if (r1 instanceof C02640Eg) {
            r1.A65((Cursor) null);
        }
    }
}
