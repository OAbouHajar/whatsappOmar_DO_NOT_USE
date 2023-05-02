package X;

import android.view.View;

/* renamed from: X.55a  reason: invalid class name and case insensitive filesystem */
public class C1043655a implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C14990q7 A01;
    public final /* synthetic */ Object A02;

    public C1043655a(View view, C14990q7 r2, Object obj) {
        this.A02 = obj;
        this.A01 = r2;
        this.A00 = view;
    }

    public void run() {
        Object obj = this.A02;
        String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
        C14990q7 r2 = this.A01;
        AnonymousClass4O3 r0 = C62183Bz.A03(r2).A02;
        C31201dg A002 = AnonymousClass45Y.A00(r0 == null ? null : r0.A01, new C99314tp(valueOf));
        if (A002 != null) {
            View A0C = A002.A0C(r2);
            if (A0C == null) {
                C29691b2.A00("AccessibilityUtils", AnonymousClass000.A0h(valueOf, AnonymousClass000.A0r("No View found for component with id: ")));
                return;
            }
            int id = A0C.getId();
            if (id == -1) {
                id = View.generateViewId();
                A0C.setId(id);
            }
            C004601z.A0e(this.A00, id);
            return;
        }
        throw AnonymousClass000.A0V(String.format("Component does not exist in the hierarchy for id: %s. Is the component with this ID not yet rendered? If so, this will not work.", AnonymousClass000.A1a(valueOf)));
    }
}
