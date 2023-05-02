package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.065  reason: invalid class name */
public class AnonymousClass065 {
    public AnonymousClass07K A00;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();

    public AnonymousClass01A A00(String str) {
        AnonymousClass01A A0B;
        for (AnonymousClass0WQ r0 : this.A02.values()) {
            if (r0 != null && (A0B = r0.A02.A0B(str)) != null) {
                return A0B;
            }
        }
        return null;
    }

    public List A01() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A02.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List A02() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A01;
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    public void A03(AnonymousClass01A r4) {
        ArrayList arrayList = this.A01;
        if (!arrayList.contains(r4)) {
            synchronized (arrayList) {
                arrayList.add(r4);
            }
            r4.A0U = true;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment already added: ");
        sb.append(r4);
        throw new IllegalStateException(sb.toString());
    }

    public void A04(AnonymousClass0WQ r4) {
        AnonymousClass01A r2 = r4.A02;
        String str = r2.A0T;
        HashMap hashMap = this.A02;
        if (hashMap.get(str) == null) {
            hashMap.put(r2.A0T, r4);
            if (AnonymousClass02C.A02(2)) {
                StringBuilder sb = new StringBuilder("Added fragment to active set ");
                sb.append(r2);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    public void A05(AnonymousClass0WQ r5) {
        AnonymousClass01A r3 = r5.A02;
        if (r3.A0i) {
            this.A00.A05(r3);
        }
        if (this.A02.put(r3.A0T, (Object) null) != null && AnonymousClass02C.A02(2)) {
            StringBuilder sb = new StringBuilder("Removed fragment from active set ");
            sb.append(r3);
            Log.v("FragmentManager", sb.toString());
        }
    }
}
