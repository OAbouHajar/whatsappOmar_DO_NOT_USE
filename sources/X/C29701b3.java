package X;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1b3  reason: invalid class name and case insensitive filesystem */
public class C29701b3 {
    public static C14960q4 A00(C29661az r4, C14990q7 r5, Map map) {
        C88184a5 r42 = r4.A00;
        Map A04 = AnonymousClass2Wa.A04(r42.A01, map);
        C14910pz A03 = C62183Bz.A03(r5);
        if (A03.A09) {
            C29691b2.A00("BloksTreeManager", "Trying to add resources to a destroyed BloksTreeManager");
        } else {
            C62003Bg.A02("Tree operations are only supported from the UI Thread");
            A03.A00(Collections.singletonList(r42));
            HashMap hashMap = new HashMap(A03.A08);
            if (r42.A02 != null) {
                hashMap.putAll(A03.A04.A03);
            }
            hashMap.putAll(A04);
            if (!hashMap.isEmpty()) {
                A03.A08 = hashMap;
            }
        }
        return C14960q4.A00(r5, (List) null);
    }

    public static Object A01(C14990q7 r1, C31201dg r2, C14950q3 r3, C14930q1 r4) {
        return C14980q6.A00(C14960q4.A00(r1, r2.A05), r3, r4);
    }

    public static void A02(Context context, C29661az r6, C14950q3 r7, AnonymousClass22A r8, Map map) {
        C31201dg r4 = new C31201dg(-1);
        C14910pz r3 = new C14910pz(r6.A00, r4, AnonymousClass228.A00, C99324tq.A00);
        if (context instanceof Application) {
            C29691b2.A00("BloksInterpreterHelper", "Creating BloksContext with Application Context. This may break the ability to execute navigation actions correctly");
        }
        C14990q7 A01 = C62183Bz.A01(context, new SparseArray(), r3, r8, r6.A02);
        r3.A01(A01, new C99104tU(), Collections.emptyMap());
        C14980q6.A00(A00(r6, A01, map), r7, r6.A01);
    }
}
