package X;

import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1iT  reason: invalid class name and case insensitive filesystem */
public abstract class C33371iT {
    public void A00(Collection collection) {
        if (this instanceof C34741kn) {
            C34741kn r0 = (C34741kn) this;
            C224818c r4 = r0.A01;
            synchronized (r4.A07) {
                int A01 = r0.A01(collection);
                Integer num = r4.A00;
                if (num != null) {
                    Integer valueOf = Integer.valueOf(num.intValue() - A01);
                    r4.A00 = valueOf;
                    StringBuilder sb = new StringBuilder();
                    sb.append("contact-mgr-db/onContactsRemoved individualContactCount = ");
                    sb.append(valueOf);
                    Log.i(sb.toString());
                }
            }
            return;
        }
        C33361iS r3 = (C33361iS) this;
        C16000sG r42 = r3.A00;
        r42.A00.post(new RunnableRunnableShape4S0200000_I0_2(r3, 33, collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C34821kv r2 = r42.A04;
            r2.A01.remove(((C16010sH) it.next()).A08(C15830rv.class));
        }
    }
}
