package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.4uK  reason: invalid class name and case insensitive filesystem */
public class C99624uK implements AnonymousClass5OS {
    public Object AIZ(AnonymousClass552 r4, C89314bx r5, Object obj, String str, List list) {
        int AK7;
        if (list != null && list.size() > 0) {
            C70303gR r1 = ((C90454eA) list.get(0)).A02.A00;
            boolean z2 = r1.A01 instanceof C70293gQ;
            AnonymousClass4XQ r12 = r1;
            if (!z2) {
                while (true) {
                    AnonymousClass4XQ r13 = r12.A01;
                    if (r13 == null) {
                        break;
                    }
                    AnonymousClass4XQ r0 = r13.A01;
                    r12 = r13;
                    if (r0 == null) {
                        r13.A01 = new C70273gO();
                        break;
                    }
                }
            }
            AnonymousClass4TN r02 = ((C90454eA) list.get(0)).A02;
            AnonymousClass4RV r14 = r5.A01;
            Object A00 = r02.A00(r14, obj, obj).A00();
            C109755Tl r15 = r14.A00;
            if (A00 instanceof List) {
                AK7 = r15.AK7(A00);
                return Integer.valueOf(AK7);
            }
        }
        C109755Tl r16 = r5.A01.A00;
        if (!(obj instanceof List) && !(obj instanceof Map)) {
            return null;
        }
        AK7 = r16.AK7(obj);
        return Integer.valueOf(AK7);
    }
}
