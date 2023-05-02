package X;

import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1iU  reason: invalid class name and case insensitive filesystem */
public class C33381iU extends C16590tJ {
    public void A04(Collection collection) {
        Integer valueOf;
        for (C33371iT r5 : A01()) {
            if (r5 instanceof C34741kn) {
                C34741kn r52 = (C34741kn) r5;
                C224818c r4 = r52.A01;
                synchronized (r4.A07) {
                    int A01 = r52.A01(collection);
                    Integer num = r4.A00;
                    if (num == null) {
                        valueOf = Integer.valueOf(A01);
                        r4.A00 = valueOf;
                    } else {
                        valueOf = Integer.valueOf(num.intValue() + A01);
                        r4.A00 = valueOf;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("contact-mgr-db/onContactsAddedOrUpdated individualContactCount = ");
                    sb.append(valueOf);
                    Log.i(sb.toString());
                }
            } else {
                C33361iS r53 = (C33361iS) r5;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C34821kv r2 = r53.A00.A04;
                    r2.A01.remove(((C16010sH) it.next()).A08(C15830rv.class));
                }
                r53.A00.A00.post(new RunnableRunnableShape4S0200000_I0_2(r53, 34, collection));
            }
        }
    }
}
