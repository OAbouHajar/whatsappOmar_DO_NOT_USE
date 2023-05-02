package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1CO  reason: invalid class name */
public class AnonymousClass1CO {
    public C19440yR A00;
    public final C16300so A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public AnonymousClass1CO(C16300so r2) {
        this.A01 = r2;
    }

    public void A00(C30641ci r6, C34421kE r7) {
        Map map = this.A02;
        synchronized (map) {
            if (map.containsKey(r6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("added duplicate ackable stanza: ");
                sb.append(r6);
                Log.e(sb.toString());
                this.A01.AcB("MessageCallbacksManager/addAckCallback", "duplicate_ackable_stanza", true);
            }
            map.put(r6, r7);
        }
    }

    public void A01(Exception exc) {
        Map map = this.A03;
        synchronized (map) {
            for (Map.Entry value : map.entrySet()) {
                ((C34421kE) value.getValue()).A01(exc);
            }
            map.clear();
        }
    }
}
