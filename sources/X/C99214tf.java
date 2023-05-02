package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.4tf  reason: invalid class name and case insensitive filesystem */
public class C99214tf implements AnonymousClass5ON {
    public C14930q1 A00;
    public final String A01;

    public C99214tf(String str) {
        this.A01 = str;
    }

    public boolean Ahl(C31201dg r5) {
        LinkedList linkedList = r5.A04;
        if (linkedList == null) {
            return false;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C84624Lg r2 = (C84624Lg) it.next();
            String str = this.A01;
            String str2 = r2.A03;
            if (str2 != null && str2.equals(str)) {
                this.A00 = r2.A02;
                return true;
            }
        }
        return false;
    }
}
