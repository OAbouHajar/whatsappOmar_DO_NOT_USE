package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.0tO  reason: invalid class name and case insensitive filesystem */
public class C16640tO {
    public final Handler A00;
    public final Runnable A01;
    public final WeakReference A02;
    public final /* synthetic */ C16660tQ A03;

    public C16640tO(C16660tQ r5, C16650tP r6, String str) {
        this.A03 = r5;
        Handler handler = new Handler();
        this.A00 = handler;
        this.A02 = new WeakReference(r6);
        RunnableRunnableShape0S1100000_I0 runnableRunnableShape0S1100000_I0 = new RunnableRunnableShape0S1100000_I0(3, str, this);
        this.A01 = runnableRunnableShape0S1100000_I0;
        handler.postDelayed(runnableRunnableShape0S1100000_I0, AnonymousClass1NO.A0L);
    }

    public final void A00(String str) {
        this.A00.removeCallbacks(this.A01);
        Map map = this.A03.A01.A01;
        if (map.containsKey(str)) {
            ((C16530tD) map.get(str)).A00.remove(this);
        }
    }
}
