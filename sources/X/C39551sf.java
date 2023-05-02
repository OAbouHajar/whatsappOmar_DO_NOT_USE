package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1sf  reason: invalid class name and case insensitive filesystem */
public class C39551sf extends AnonymousClass03L {
    public final /* synthetic */ C39521sc A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39551sf(C39521sc r2) {
        super(250);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A07(Object obj, Object obj2, Object obj3, boolean z2) {
        if (z2) {
            C39521sc r1 = this.A00;
            Map map = r1.A02;
            map.put(obj, new WeakReference(obj2));
            int i2 = r1.A00 + 1;
            r1.A00 = i2;
            if (i2 % 200 == 0) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    if (((Reference) entry.getValue()).get() == null) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    map.remove(it.next());
                }
            }
        }
    }
}
