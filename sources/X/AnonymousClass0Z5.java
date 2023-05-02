package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Z5  reason: invalid class name */
public class AnonymousClass0Z5 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ SearchView A00;

    public AnonymousClass0Z5(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        this.A00.A0D(i2);
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
