package X;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0ZD  reason: invalid class name */
public class AnonymousClass0ZD implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView A00;

    public AnonymousClass0ZD(SearchView searchView) {
        this.A00 = searchView;
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.A00.A08();
        return true;
    }
}
