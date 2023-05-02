package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.55Z  reason: invalid class name */
public class AnonymousClass55Z implements Runnable {
    public final /* synthetic */ C14990q7 A00;
    public final /* synthetic */ C31201dg A01;
    public final /* synthetic */ List A02;

    public AnonymousClass55Z(C14990q7 r1, C31201dg r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        Iterator it = this.A02.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            Object next = it.next();
            C31201dg A002 = AnonymousClass45Y.A00(this.A01, new C99314tp(next == null ? null : next instanceof String ? (String) next : String.valueOf(next)));
            if (A002 != null) {
                View A0C = A002.A0C(this.A00);
                if (A0C != null) {
                    A0C.setFocusable(true);
                    if (A0C.getId() == -1) {
                        A0C.setId(View.generateViewId());
                    }
                    if (i2 != -1) {
                        A0C.setAccessibilityTraversalAfter(i2);
                    }
                    i2 = A0C.getId();
                } else {
                    return;
                }
            } else {
                throw AnonymousClass000.A0V(AnonymousClass000.A0g("Component does not exists in this hierarchy for id: ", next));
            }
        }
    }
}
