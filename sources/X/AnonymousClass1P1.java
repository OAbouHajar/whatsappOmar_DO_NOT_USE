package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1P1  reason: invalid class name */
public class AnonymousClass1P1 extends C214614e {
    public final Map A00 = new AnonymousClass197(12);
    public final Map A01 = new AnonymousClass197(12);

    public AnonymousClass1P1(C214414c r3) {
        super(r3);
    }

    public static final long A00(UserJid userJid, String str, Map map) {
        AnonymousClass4VS r0 = (AnonymousClass4VS) map.get(userJid);
        if (r0 != null) {
            for (AnonymousClass4WG r2 : r0.A00) {
                Iterator it = r2.A03.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C35691mL) it.next()).A04.equals(str)) {
                            return r2.A00;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static final String A01(UserJid userJid, String str, Map map) {
        AnonymousClass4VS r0 = (AnonymousClass4VS) map.get(userJid);
        if (r0 != null) {
            for (AnonymousClass4WG r2 : r0.A00) {
                Iterator it = r2.A03.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C35691mL) it.next()).A04.equals(str)) {
                            return r2.A01;
                        }
                    }
                }
            }
        }
        return null;
    }
}
