package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.1ui  reason: invalid class name and case insensitive filesystem */
public class C40801ui {
    public final HashMap A00 = new HashMap();

    public synchronized void A00() {
        this.A00.clear();
    }

    public synchronized void A01(Object obj) {
        this.A00.remove(obj);
    }

    public synchronized boolean A02(Object obj) {
        boolean z2;
        HashMap hashMap = this.A00;
        Long l2 = (Long) hashMap.get(obj);
        if (l2 == null || l2.longValue() + 60000 <= SystemClock.elapsedRealtime()) {
            hashMap.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }
}
