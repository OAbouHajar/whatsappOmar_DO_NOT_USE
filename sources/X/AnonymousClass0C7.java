package X;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: X.0C7  reason: invalid class name */
public class AnonymousClass0C7 extends Filter {
    public AnonymousClass04C A00;

    public AnonymousClass0C7(AnonymousClass04C r1) {
        this.A00 = r1;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.A00.A6k((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor Acr = this.A00.Acr(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (Acr != null) {
            filterResults.count = Acr.getCount();
        } else {
            filterResults.count = 0;
            Acr = null;
        }
        filterResults.values = Acr;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AnonymousClass04C r2 = this.A00;
        Cursor cursor = ((AnonymousClass04B) r2).A02;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            r2.A65((Cursor) obj);
        }
    }
}
