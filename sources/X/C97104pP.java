package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4pP  reason: invalid class name and case insensitive filesystem */
public class C97104pP implements C109725Ti {
    public final /* synthetic */ C96274o4 A00;

    public C97104pP(C96274o4 r1) {
        this.A00 = r1;
    }

    public List ABf(String str, boolean z2, boolean z3) {
        List<C90714eg> A03 = C90884f0.A03(str, z2, z3);
        if (!A03.isEmpty()) {
            if (!this.A00.A00) {
                LinkedList linkedList = new LinkedList();
                boolean z4 = false;
                for (C90714eg r2 : A03) {
                    if (z4 || !r2.A03.startsWith("OMX.google")) {
                        linkedList.add(r2);
                    } else {
                        z4 = true;
                        linkedList.add(0, r2);
                    }
                }
                return linkedList;
            }
            A03.get(0);
        }
        return A03;
    }
}
