package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2C3  reason: invalid class name */
public class AnonymousClass2C3 extends HashMap<C28381Vw, C16730tY> {
    public final /* synthetic */ C209212c this$0;

    public AnonymousClass2C3(C209212c r1) {
        this.this$0 = r1;
    }

    /* renamed from: A00 */
    public C16730tY remove(Object obj) {
        C16750ta r0;
        C30701co A00;
        C16730tY r02 = (C16730tY) super.get(obj);
        if (!(r02 == null || (r0 = r02.A02) == null)) {
            C209212c r4 = this.this$0;
            AnonymousClass00B.A06(r0);
            AnonymousClass1P8 r1 = r4.A0W;
            C30701co A002 = r1.A00(r0);
            if (A002 != null) {
                A002.A0v = false;
                HashMap hashMap = r4.A0r;
                synchronized (hashMap) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        r4.A08((C38331qc) null, (C16730tY) entry.getKey(), 1, ((Long) entry.getValue()).longValue(), true, true);
                    }
                    hashMap.clear();
                }
                synchronized (r4.A0X) {
                    Iterator it = r4.A04().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r4.A01.open();
                            break;
                        }
                        C16750ta r03 = ((C16730tY) it.next()).A02;
                        if (r03 != null && (A00 = r1.A00(r03)) != null && A00.A0v) {
                            break;
                        }
                    }
                }
            }
        }
        return (C16730tY) super.remove(obj);
    }
}
