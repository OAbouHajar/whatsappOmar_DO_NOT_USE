package X;

import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.4lK  reason: invalid class name and case insensitive filesystem */
public abstract class C94694lK implements AdapterView.OnItemClickListener {
    public long A00;
    public final C16440t3 A01;

    public C94694lK(C16440t3 r1) {
        this.A01 = r1;
    }

    public abstract void A00(AdapterView adapterView, View view, int i2, long j2);

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A00(adapterView, view, i2, j2);
        }
    }
}
