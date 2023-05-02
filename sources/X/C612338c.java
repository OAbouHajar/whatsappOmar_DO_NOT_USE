package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.38c  reason: invalid class name and case insensitive filesystem */
public final class C612338c {
    public final Map A00 = Collections.synchronizedMap(new WeakHashMap());
    public final Map A01 = Collections.synchronizedMap(new WeakHashMap());

    public final void A00(Status status, boolean z2) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = this.A00;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = this.A01;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        Iterator A0j = C13690nt.A0j(hashMap);
        while (A0j.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0j);
            if (z2 || AnonymousClass000.A1X(A0z.getValue())) {
                ((BasePendingResult) A0z.getKey()).forceFailureUnlessReady(status);
            }
        }
        Iterator A0j2 = C13690nt.A0j(hashMap2);
        while (A0j2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass000.A0z(A0j2);
            if (z2 || AnonymousClass000.A1X(A0z2.getValue())) {
                ((C14370p3) A0z2.getKey()).A00(new AnonymousClass43Z(status));
            }
        }
    }
}
