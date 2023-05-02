package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1mi  reason: invalid class name and case insensitive filesystem */
public class C35921mi {
    public final List A00 = new CopyOnWriteArrayList();

    public void A00(C35931mj r3) {
        AnonymousClass00B.A06(r3);
        List list = this.A00;
        if (!list.contains(r3)) {
            list.add(r3);
            return;
        }
        StringBuilder sb = new StringBuilder("Observer ");
        sb.append(r3);
        sb.append(" is already registered.");
        throw new IllegalStateException(sb.toString());
    }

    public void A01(Object obj) {
        for (C35931mj AQk : this.A00) {
            AQk.AQk(obj);
        }
    }
}
