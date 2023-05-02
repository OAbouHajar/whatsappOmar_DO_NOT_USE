package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3gT  reason: invalid class name and case insensitive filesystem */
public class C70323gT extends AnonymousClass4XQ {
    public static final AnonymousClass5OU A00 = new C99664uO();

    public static void A00(AnonymousClass552 r14, C89314bx r15, AnonymousClass4XQ r16, AnonymousClass5OU r17, Object obj, String str) {
        C89314bx r11 = r15;
        C109755Tl r9 = r15.A01.A00;
        Object obj2 = obj;
        AnonymousClass4XQ r12 = r16;
        AnonymousClass5OU r13 = r17;
        String str2 = str;
        if (obj2 instanceof Map) {
            if (r13.ALN(obj2)) {
                r12.A02(r14, r15, obj2, str2);
            }
            Iterator it = r9.AFG(obj2).iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                StringBuilder A0q = AnonymousClass000.A0q(str2);
                A0q.append("['");
                A0q.append(A0m);
                String A0h = AnonymousClass000.A0h("']", A0q);
                Map map = (Map) obj2;
                Object obj3 = !map.containsKey(A0m) ? C109755Tl.A00 : map.get(A0m);
                if (obj3 != C109755Tl.A00) {
                    A00(new C70043g1(obj2, A0m), r11, r12, r13, obj3, A0h);
                }
            }
        } else if (obj2 instanceof List) {
            int i2 = 0;
            if (r13.ALN(obj2)) {
                if (r12.A01 == null) {
                    r12.A02(r14, r15, obj2, str2);
                } else {
                    AnonymousClass4XQ A002 = r12.A00();
                    int i3 = 0;
                    for (Object next : r9.Ago(obj2)) {
                        StringBuilder A0q2 = AnonymousClass000.A0q(str2);
                        A0q2.append("[");
                        A0q2.append(i3);
                        String A0h2 = AnonymousClass000.A0h("]", A0q2);
                        A002.A00 = i3;
                        A002.A02(r14, r15, next, A0h2);
                        i3++;
                    }
                }
            }
            for (Object next2 : r9.Ago(obj2)) {
                StringBuilder A0q3 = AnonymousClass000.A0q(str2);
                A0q3.append("[");
                A0q3.append(i2);
                A00(new C70053g2(obj2, i2), r11, r12, r13, next2, AnonymousClass000.A0h("]", A0q3));
                i2++;
            }
        }
    }
}
