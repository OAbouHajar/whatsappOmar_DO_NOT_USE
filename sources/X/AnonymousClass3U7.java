package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3U7  reason: invalid class name */
public class AnonymousClass3U7 extends C96104nn {
    public final List A00 = new LinkedList();
    public final List A01 = new LinkedList();
    public final List A02 = new LinkedList();

    public AnonymousClass3U7(AnonymousClass5UN r3, List list) {
        super(r3);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0W("attach");
        }
    }
}
