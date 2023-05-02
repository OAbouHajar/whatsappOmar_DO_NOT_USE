package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3lL  reason: invalid class name and case insensitive filesystem */
public class C71963lL extends C31301dt {
    public final List A00 = AnonymousClass000.A0u();

    public C71963lL(AnonymousClass3FI r5, List list) {
        super(AnonymousClass428.A0R);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A00.add(new C72333lx(r5, (C73563oM) it.next()));
        }
        this.A00.add(new C72323lw(r5));
    }
}
