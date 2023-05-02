package X;

import android.os.Handler;
import android.os.Looper;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;

/* renamed from: X.2SX  reason: invalid class name */
public class AnonymousClass2SX {
    public ListAdapter A00;
    public ListView A01;
    public AnonymousClass1VC A02;
    public boolean A03 = false;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A05 = new RunnableRunnableShape2S0100000_I0_1(this, 23);

    public synchronized void A00(ListAdapter listAdapter) {
        if (this.A01 == null) {
            this.A02.setContentView(17367060);
        }
        this.A00 = listAdapter;
        ListView listView = this.A01;
        AnonymousClass00B.A04(listView);
        listView.setAdapter(listAdapter);
    }
}
