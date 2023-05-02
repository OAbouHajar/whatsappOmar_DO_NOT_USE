package X;

import android.widget.ListView;
import androidx.fragment.app.ListFragment;

/* renamed from: X.0fY  reason: invalid class name and case insensitive filesystem */
public class C09460fY implements Runnable {
    public final /* synthetic */ ListFragment A00;

    public C09460fY(ListFragment listFragment) {
        this.A00 = listFragment;
    }

    public void run() {
        ListView listView = this.A00.A04;
        listView.focusableViewAvailable(listView);
    }
}
