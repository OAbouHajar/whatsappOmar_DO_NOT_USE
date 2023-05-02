package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Yi  reason: invalid class name and case insensitive filesystem */
public class C06900Yi implements View.OnKeyListener {
    public final /* synthetic */ SearchView A00;

    public C06900Yi(SearchView searchView) {
        this.A00 = searchView;
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        SearchView searchView = this.A00;
        if (searchView.A02 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    searchView.A0G(searchAutoComplete.getText().toString());
                    return true;
                }
            } else if (searchView.A02 == null || searchView.A0E == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            } else {
                if (i2 == 66 || i2 == 84 || i2 == 61) {
                    return searchView.A0K(searchAutoComplete.getListSelection());
                }
                int i3 = 0;
                if (i2 != 21) {
                    if (i2 == 22) {
                        i3 = searchAutoComplete.length();
                    } else if (i2 != 19) {
                        return false;
                    } else {
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                }
                searchAutoComplete.setSelection(i3);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.A00();
                return true;
            }
        }
        return false;
    }
}
