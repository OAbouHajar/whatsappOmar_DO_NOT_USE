package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0YN  reason: invalid class name */
public class AnonymousClass0YN implements TextWatcher {
    public final /* synthetic */ SearchView A00;

    public AnonymousClass0YN(SearchView searchView) {
        this.A00 = searchView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SearchView searchView = this.A00;
        Editable text = searchView.A0k.getText();
        searchView.A0H = text;
        boolean z2 = !TextUtils.isEmpty(text);
        searchView.A0H(z2);
        boolean z3 = !z2;
        int i5 = 8;
        if (searchView.A0P && !searchView.A0J() && z3) {
            searchView.A0g.setVisibility(8);
            i5 = 0;
        }
        searchView.A0i.setVisibility(i5);
        searchView.A0A();
        searchView.A0C();
        if (searchView.A0B != null && !TextUtils.equals(charSequence, searchView.A0F)) {
            searchView.A0B.AVa(charSequence.toString());
        }
        searchView.A0F = charSequence.toString();
    }
}
