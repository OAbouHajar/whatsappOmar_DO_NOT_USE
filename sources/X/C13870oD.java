package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0oD  reason: invalid class name and case insensitive filesystem */
public class C13870oD implements C13880oE {
    public static AtomicReference A00 = new AtomicReference();

    public void ANB(boolean z2) {
        synchronized (C13720nx.A09) {
            Iterator it = new ArrayList(C13720nx.A0A.values()).iterator();
            while (it.hasNext()) {
                C13720nx r2 = (C13720nx) it.next();
                if (r2.A07.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = r2.A05.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw new NullPointerException("onBackgroundStateChanged");
                    }
                }
            }
        }
    }
}
