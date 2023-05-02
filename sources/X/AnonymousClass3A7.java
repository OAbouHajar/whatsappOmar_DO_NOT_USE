package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3A7  reason: invalid class name */
public class AnonymousClass3A7 {
    public static final AnonymousClass2OY A00 = new C101324x6();

    public static List A00(C16000sG r6, C16080sP r7, C37831po r8, ArrayList arrayList) {
        List<C38581r1> A04 = r8.A04();
        C35011lE r5 = r8.A0C;
        UserJid userJid = r5.A01;
        int i2 = 0;
        while (i2 < A04.size() && !((C38581r1) A04.get(i2)).A02.equals(userJid)) {
            i2++;
        }
        if (i2 != 0 && i2 < A04.size()) {
            Object obj = A04.get(i2);
            A04.remove(i2);
            A04.add(0, obj);
        }
        boolean z2 = !r5.A03;
        if (A04.size() > 0) {
            Collections.sort(A04.subList(z2 ? 1 : 0, A04.size()), new C72993n6(r6, r7, arrayList));
        }
        ArrayList A0u = AnonymousClass000.A0u();
        for (C38581r1 r0 : A04) {
            A0u.add(r0.A02);
        }
        return A0u;
    }
}
