package X;

import android.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/* renamed from: X.5wp  reason: invalid class name and case insensitive filesystem */
public class C119275wp {
    public final C85874Qi A00 = new C85874Qi();
    public final HashMap A01 = AnonymousClass000.A0x();
    public final Stack A02 = new Stack();

    public static final void A00(HashMap hashMap) {
        Iterator A0j = C13690nt.A0j(hashMap);
        while (A0j.hasNext()) {
            ((AnonymousClass1Z7) AnonymousClass000.A0z(A0j).getValue()).A00 = false;
        }
        hashMap.clear();
    }

    public AnonymousClass1Z7 A01(C14960q4 r3, C14930q1 r4, String str) {
        AnonymousClass1Z7 r1 = new AnonymousClass1Z7(r3, r4, this.A00);
        this.A01.put(str, r1);
        return r1;
    }

    public void A02(Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Stack stack = this.A02;
            if (stack.peek() != null) {
                ((AbstractMap) stack.peek()).put(A0z.getKey(), A0z.getValue());
            }
        }
    }

    public void A03(boolean z2) {
        C85874Qi r3 = this.A00;
        StringBuilder A0r = AnonymousClass000.A0r("BloksCallbackQueue/setActive(");
        A0r.append(z2);
        A0r.append(")/queue size=");
        Queue queue = r3.A01;
        Log.d("Whatsapp", AnonymousClass000.A0l(A0r, queue.size()));
        r3.A00 = z2;
        if (z2) {
            while (!queue.isEmpty()) {
                Runnable runnable = (Runnable) queue.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    throw AnonymousClass000.A0W("");
                }
            }
        }
    }
}
