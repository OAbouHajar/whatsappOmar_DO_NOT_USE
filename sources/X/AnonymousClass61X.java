package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.61X  reason: invalid class name */
public class AnonymousClass61X implements C28391Vx {
    public final String A00;
    public final List A01 = AnonymousClass000.A0u();

    public AnonymousClass61X(String str) {
        AnonymousClass00B.A05(str);
        this.A00 = str;
    }

    public C228919r AEp(String str) {
        C228919r r0;
        if (str == null || str.equals(((C35491m1) C35481m0.A06).A04)) {
            for (C117895tj r02 : this.A01) {
                Iterator it = C13680ns.A0n(r02.A00.values()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        C228919r r1 = (C228919r) it.next();
                        if (r1.AIh()) {
                            return r1;
                        }
                    }
                }
            }
            return null;
        }
        for (C117895tj r12 : this.A01) {
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase(Locale.US);
                Map map = r12.A00;
                if (map.containsKey(upperCase) && (r0 = (C228919r) map.get(upperCase)) != null) {
                    return r0;
                }
            }
        }
        return null;
    }
}
