package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.60r  reason: invalid class name and case insensitive filesystem */
public class C1201960r implements C46042Cc {
    public ArrayList AaD(AnonymousClass173 r5, C28371Vv r6) {
        String str;
        ArrayList A0u = AnonymousClass000.A0u();
        String str2 = r6.A00;
        if (str2.equals("card-update")) {
            try {
                C28371Vv A0K = r6.A0K("card");
                C111815hS r0 = new C111815hS();
                r0.A01(r5, A0K, 0);
                A0u.add(r0);
                return A0u;
            } catch (AnonymousClass1W9 unused) {
                str = "PAY: BrazilProtoParser/parse: no card node for card-update notification";
                Log.w(str);
                return A0u;
            }
        } else {
            if (str2.equals("merchant-update")) {
                try {
                    C28371Vv A0K2 = r6.A0K("merchant");
                    C111825hT r02 = new C111825hT();
                    r02.A01(r5, A0K2, 0);
                    A0u.add(r02);
                    return A0u;
                } catch (AnonymousClass1W9 unused2) {
                    str = "PAY: BrazilProtoParser/parse: no merchant node for merchant-update notification";
                    Log.w(str);
                    return A0u;
                }
            }
            return A0u;
        }
    }
}
