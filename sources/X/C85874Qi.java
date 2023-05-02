package X;

import android.util.Log;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.4Qi  reason: invalid class name and case insensitive filesystem */
public class C85874Qi {
    public boolean A00 = true;
    public final Queue A01 = new LinkedList();

    public void A00(Runnable runnable) {
        StringBuilder A0r = AnonymousClass000.A0r("BloksCallbackQueue/run/active=");
        A0r.append(this.A00);
        Log.d("Whatsapp", A0r.toString());
        if (this.A00) {
            runnable.run();
        } else {
            this.A01.add(runnable);
        }
    }
}
