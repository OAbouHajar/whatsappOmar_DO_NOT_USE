package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3RF  reason: invalid class name */
public final class AnonymousClass3RF extends AnonymousClass07D {
    public final C14990q7 A00;
    public final C31201dg A01;

    public AnonymousClass3RF(C14990q7 r1, C31201dg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r8, RecyclerView recyclerView) {
        C02830Fk r1;
        List unmodifiableList;
        Rect rect2;
        C18450wi.A0H(rect, 0);
        C18450wi.A0J(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        C14990q7 r0 = this.A00;
        C31201dg r12 = this.A01;
        Object A05 = C62183Bz.A05(r0, r12);
        C18450wi.A0B(A05);
        List list = ((AnonymousClass39I) A05).A07;
        if (!(list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || (rect2 = (Rect) C003101j.A06(unmodifiableList, A002)) == null)) {
            rect.set(rect2);
        }
        Object obj = r12.A0L().get(A002);
        C18450wi.A0B(obj);
        C31201dg A0F = ((C31201dg) obj).A0F();
        boolean z2 = false;
        if (A0F != null && A0F.A01 == 16482) {
            z2 = A0F.A0P(36, false);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C02830Fk) && (r1 = (C02830Fk) layoutParams) != null) {
            r1.A01 = z2;
        }
    }
}
