package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4eA  reason: invalid class name and case insensitive filesystem */
public class C90454eA {
    public AnonymousClass41D A00;
    public AnonymousClass5OT A01;
    public AnonymousClass4TN A02;
    public Boolean A03 = Boolean.FALSE;
    public String A04;

    public C90454eA() {
    }

    public C90454eA(AnonymousClass4TN r2) {
        this.A02 = r2;
        this.A00 = AnonymousClass41D.PATH;
    }

    public C90454eA(String str) {
        this.A04 = str;
        this.A00 = AnonymousClass41D.JSON;
    }

    public static List A00(C89314bx r6, Class cls, List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((C90454eA) it.next()).A01.get();
            Class<String> cls2 = String.class;
            C109755Tl r1 = r6.A01.A00;
            if (obj instanceof List) {
                for (Object next : r1.Ago(obj)) {
                    if (next != null) {
                        if (cls.isAssignableFrom(next.getClass())) {
                            A0u.add(next);
                        } else if (cls == cls2) {
                            A0u.add(next.toString());
                        }
                    }
                }
            } else if (obj != null) {
                if (cls.isAssignableFrom(obj.getClass())) {
                    A0u.add(obj);
                } else if (cls == cls2) {
                    A0u.add(obj.toString());
                }
            }
        }
        return A0u;
    }
}
