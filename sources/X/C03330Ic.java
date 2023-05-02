package X;

import android.view.View;
import java.lang.ref.Reference;
import java.util.ListIterator;

/* renamed from: X.0Ic  reason: invalid class name and case insensitive filesystem */
public class C03330Ic extends C10670hV {
    public void run() {
        ListIterator listIterator = C007803p.A0A.listIterator();
        while (listIterator.hasNext()) {
            AnonymousClass09Z r0 = (AnonymousClass09Z) ((Reference) listIterator.next()).get();
            if (r0 != null) {
                ((View) r0).invalidate();
            } else {
                listIterator.remove();
            }
        }
    }
}
