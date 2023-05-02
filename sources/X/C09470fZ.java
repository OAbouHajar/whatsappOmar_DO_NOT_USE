package X;

import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0fZ  reason: invalid class name and case insensitive filesystem */
public class C09470fZ implements Runnable {
    public final /* synthetic */ PreferenceFragmentCompat A00;

    public C09470fZ(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A00 = preferenceFragmentCompat;
    }

    public void run() {
        RecyclerView recyclerView = this.A00.A03;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
